import classes.*;
import utility.HeroAbstract;
import utility.SpaceCataclysmInterface;
import utility.SpaceThingInterface;

public class Story {
    public static void main(String[] args) {
        Ponchik ponchikObj = new Ponchik("Пончик");
        ponchikObj.goUp();
        Dunno dunnoObj = new Dunno("Незнайка");
        Crew[] crewMembers = new Crew[]{ponchikObj, dunnoObj};
        Moon moonObj = new Moon ("Луна");
        Stars starsObj = new Stars("Яркие звездочки");
        SpaceThingInterface[] spaceThings = new SpaceThingInterface[]{moonObj, starsObj}; 
        Illuminator illuminator = new Illuminator("Иллюминатор ракеты", spaceThings);
        for (Crew crewMember : crewMembers) {
            crewMember.watch(illuminator);
        }
        Rocket rocketObj = new Rocket("Ракета", crewMembers);
        rocketObj.rotate(moonObj);
        for (Crew crewMember : crewMembers) {
            crewMember.watch(illuminator);
        }
        //Анонимный класс, который используется единожды и его метод влияет на героя
        SpaceCataclysmInterface spaceCataclysm = new SpaceCataclysmInterface() {
            @Override
            public void affectOnHero(HeroAbstract hero) {
                System.out.println("Зрелище катаклизма потрясло героя: '" + hero.getName() + "'");
                hero.reactOnCataclysm();
            }
        };
        spaceCataclysm.affectOnHero(ponchikObj);
        starsObj.shine();
        rocketObj.land();
    }
}
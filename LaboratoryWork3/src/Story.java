import classes.*;
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
        CentrifugalForce centrifugalForceObj = new CentrifugalForce("Центробежная сила");
        rocketObj.rotate(centrifugalForceObj, moonObj);
        for (Crew crewMember : crewMembers) {
            crewMember.watch(illuminator);
        }
        starsObj.shine();
    }
}
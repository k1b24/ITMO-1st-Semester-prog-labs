package classes;

import utility.*;

public class Rocket implements ThingInterface {
    private String name;
    private Crew[] crewMembers;
    RotateEngine rotateEngineObj = new RotateEngine("Двигатель поворота");
    LandEngine landEngineObj = new LandEngine("Основной двигатель");

    //---------------------------------------------------------------------------

    //Статичный enum класс отвечающий за тип двигателя
    private static enum EngineType {
        ROTATE,
        FORWARD,
        LAND
    }

    //Внутренний класс двигателя поворота 
    public class RotateEngine implements EngineInterface {
        private String name;
        private final EngineType TYPE = EngineType.ROTATE;

        public RotateEngine(String name) {
            if ((name == null) || (name.isEmpty())) {
                throw new IllegalArgumentException("Некорректное имя ");
            }
            this.name = name;
        }

        //Реализация checked исключения, двигатель поворота не запускается с вероятностью 10%
        public void startEngine() throws EngineLaunchFailException {
            final double SUCCESS_RATE = 0.9; //Вероятность успешного запуска ракеты

            System.out.println("Запуск: '" + name + "'");
            /* Локальный класс центробежной силы, т.к. она появляется 
            только в результате запуска двигателя поворота 
            соответственно и используется только в этом методе
            и влияет на членов экипажа ракеты*/
            class CentrifugalForce { 
                private String name;
            
                public CentrifugalForce(String name) {
                    this.name = name;
                }
            
                private void affectToHeroes(Crew [] crewMembers) {
                    System.out.println("'" + name + "' начала воздействовать на героев");
                    for (Crew crewMember : crewMembers) {
                        crewMember.snuggleUpAgainstTheCabinWall();
                        System.out.println("'" + crewMember.getName() + "' : Позиция - " + crewMember.position.getPosition());
                        crewMember.scream();
                    }
                }
            }
            if (Math.random() > SUCCESS_RATE) {
                throw new EngineLaunchFailException("Ракета не начала поворачивать, запуск " + name + " провален" );                
            }
            System.out.println("Чаф-чаф-чаф-чаф! - запустился " + name);
            CentrifugalForce centrifugalForceObj = new CentrifugalForce("Центробежная сила");
            centrifugalForceObj.affectToHeroes(crewMembers);
        }

        public void stopEngine() {
            System.out.println(name + " отключился");
        }
    }

    //Внутренний класс двигателя посадки 
    public class LandEngine implements EngineInterface {
        private String name;
        private final EngineType TYPE = EngineType.LAND;
    
        public LandEngine(String name) {
            this.name = name;
        }
    
        public void startEngine() {
            System.out.println("Чаф-чаф-чаф-чаф! - запустился " + name);
        }

        public void stopEngine() {
            System.out.println(this.name + " остановился");
        }
    }

    //---------------------------------------------------------------------------


    public Rocket(String name, Crew [] crewMembers) {
        this.name = name;
        getInStory();
        this.crewMembers = crewMembers;
    }

    private void getInStory() {
        System.out.println("'" + name + "' присоединилась к истории");
    }

    public void rotate(SpaceThingInterface spaceThing) {
        try {
            rotateEngineObj.startEngine();
            spaceThing.setVisibility(false);
            spaceThing.shake();
            rotateEngineObj.stopEngine(); 
        } catch (EngineLaunchFailException engineLaunchFailException) {
            System.out.println(engineLaunchFailException.getMessage());
        }
    }

    public void land() {
        landEngineObj.startEngine();
        System.out.println("'" + name + "' начала приземление");
    }
        
    @Override
    public String getName() {
        return name;
    }
}
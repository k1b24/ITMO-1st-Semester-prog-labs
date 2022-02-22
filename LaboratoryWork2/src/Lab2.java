import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Lab2 {

    public static void main (String[] args){
        Battle b = new Battle();

        Arcanine pokemon1 = new Arcanine("мечник света", 1);
        Dugtrio pokemon2 = new Dugtrio("дальник света", 1);
        Houndoom pokemon3 = new Houndoom("катапульта света", 1);
        Meowth pokemon4 = new Meowth("мечник тьмы", 1);
        Nidorino pokemon5 = new Nidorino ("дальник тьмы", 1);
        Shiftry pokemon6 = new Shiftry("катапульта тьмы", 1);

        b.addAlly(pokemon1);
        b.addAlly(pokemon2);
        b.addAlly(pokemon3);

        b.addFoe(pokemon4);
        b.addFoe(pokemon5);
        b.addFoe(pokemon6);
        
        b.go();
    }

}
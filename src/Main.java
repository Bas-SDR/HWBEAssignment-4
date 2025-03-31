import pokemon.*;

public class Main {
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon(5, 20, 10, "Charmander", 150, 4);
        WaterPokemon squirtle = new WaterPokemon(22, 55, 83, "Squirtle", true, 22);
        GrassPokemon bulbasaur = new GrassPokemon(9, 23, 23, "Bulbasaur", 12, 999);
        ElectricPokemon pikachu = new ElectricPokemon(46, 322, 223, "Pikachu", 1000000, 285, true);
        FightingPokemon riolu = new FightingPokemon(100, 333, 215, "Riolu", 400, "Leppa Berry");
        FightingSteelPokemon lucario = new FightingSteelPokemon(100, 2167, 3611, "Lucario", 800, "Lucarionite", 999, 75);

        System.out.println("-----------------------------");
        System.out.println("Your first choice is the " + charmander.getType() + " type Pokemon " + charmander.getName());
        charmander.statsOfPokemon();
        charmander.signatureMove();
        charmander.additionalEffect();
        charmander.attackerOrDefender();

        System.out.println("-----------------------------");
        System.out.println("Your second choice is the " + squirtle.getType() + " type Pokemon " + squirtle.getName());
        squirtle.statsOfPokemon();
        squirtle.whereToFind();
        squirtle.additionalEffect();
        squirtle.attackerOrDefender(); //Override to always be defender

        System.out.println("-----------------------------");
        System.out.println("Your third choice is the " + bulbasaur.getType() + " type Pokemon " + bulbasaur.getName());
        bulbasaur.statsOfPokemon();
        bulbasaur.Smell();
        bulbasaur.signatureMove(); //Override based on amount of leaves.
        bulbasaur.attackerOrDefender();

        System.out.println("-----------------------------");
        System.out.println("Your fourth choice is the " + pikachu.getType() + " type Pokemon " + pikachu.getName());
        pikachu.statsOfPokemon();
        pikachu.signatureMove(); //Overridden with Zmove.
        pikachu.nameZMove(); //Change name to Raichu to get different Zmove
        pikachu.VoltTackle(); //Calculation added for level 50.
        pikachu.attackerOrDefender();

        System.out.println("-----------------------------");
        System.out.println("Your fifth choice is the " + riolu.getType() + " type Pokemon " + riolu.getName());
        riolu.statsOfPokemon();
        riolu.signatureMove();
        System.out.println(); //To create an enter.
        riolu.megaEvolve();
        riolu.attackerOrDefender(); //Overridden with punching power

        System.out.println("-----------------------------");
        System.out.println("Your last choice is the " + lucario.getType() + " type Pokemon " + lucario.getName());
        lucario.statsOfPokemon();
        lucario.signatureMove();
        System.out.println(); //To create an enter.
        lucario.megaEvolve();
        lucario.attackerOrDefender();//Overridden with punching power
        lucario.heavyness();
        lucario.strength();
    }
}
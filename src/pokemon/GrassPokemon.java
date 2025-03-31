package pokemon;

import org.w3c.dom.ls.LSOutput;

public class GrassPokemon extends Pokemon {
    private int amountOfFlowers;
    private int amountOfLeaves;

    public GrassPokemon(int level, int attack, int defense, String name, int amountOfFlowers, int amountOfLeaves) {
        super(level, attack, defense, name);
        this.amountOfFlowers = amountOfFlowers;
        this.amountOfLeaves = amountOfLeaves;
    }

    public void Smell(){
        if(amountOfFlowers > 4){
            System.out.println("This pokemon smells like a garden");
        }else System.out.println("This pokemon smells like daisies");;
    }

    public void LeafStorm(){
        super.signatureMove();
        if(amountOfLeaves > 500){
            System.out.println(" that creates a leafstorm");
        }
    }
}

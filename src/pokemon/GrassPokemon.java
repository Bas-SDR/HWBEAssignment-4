package pokemon;

import org.w3c.dom.ls.LSOutput;

public class GrassPokemon extends Pokemon {
    private int amountOfFlowers;
    private int amountOfLeaves;

    public GrassPokemon(int level, int attack, int defense, String name, int amountOfFlowers, int amountOfLeaves) {
        super(level, attack, defense, name);
        super.setType("Grass");
        this.amountOfFlowers = amountOfFlowers;
        this.amountOfLeaves = amountOfLeaves;
    }

    public void Smell(){
        if(amountOfFlowers > 4){
            System.out.println("This pokemon smells like a garden");
        }else System.out.println("This pokemon smells like daisies");;
    }

    @Override
    public void signatureMove(){
        if(amountOfLeaves > 500){
            System.out.print(" This pokemon can create a leafstorm");
        } else super.signatureMove();
        System.out.println(" that blows all Pokemon away");
    }
}

package pokemon;

public class FightingSteelPokemon extends FightingPokemon{
    int toughness;
    int weight;

    public FightingSteelPokemon(int level, int attack, int defense, String name, int punchingPower, String heldItem, int toughness, int weight) {
        super(level, attack, defense, name, punchingPower, heldItem);
        super.setType("Fighting and Steel");
        this.toughness = toughness;
        this.weight = weight;
    }

    public void heavyness(){
        if(weight > 200) {
            System.out.println("This pokemon cannot be moved from its place");
        }  else System.out.println("This pokemon is as light as a feather");
    }

    public void strength(){
        if(toughness > 200) {
            System.out.println("This pokemon cannot be hurt");
        }  else System.out.println("This pokemon can be hurt");
    }
}

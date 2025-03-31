package pokemon;

public class WaterPokemon extends Pokemon {
    private boolean breatheUnderWater;
    private int amountOfWater;

    public WaterPokemon(int level, int attack, int defense, String name, boolean breatheUnderWater, int amountOfWater) {
        super(level, attack, defense, name);
        super.setType("Water");
        this.breatheUnderWater = breatheUnderWater;
        this.amountOfWater = amountOfWater;
    }

    public void whereToFind() {
        if (breatheUnderWater) {
            System.out.println(getName() + " can be found in the ocean");
        } else System.out.println(getName() + " can be found on land");
    }

    public void additionalEffect() {
        super.signatureMove();
        if (amountOfWater > 10) {
            System.out.println(" which soaks the target completely");
        }
    }

    @Override
    public void attackerOrDefender() {
        System.out.println("This pokemon is always a defender");
    }
}

package pokemon;

public class FirePokemon extends Pokemon{
    private int temperature;
    private double numberOfFlames;

    public FirePokemon(int level, int attack, int defense, String name, int temperature, double numberOfFlames) {
        super(level, attack, defense, name);
        super.setType("Fire");
        this.temperature = temperature;
        this.numberOfFlames = numberOfFlames;
    }

    public void burn() {
        if(temperature > 100){
            System.out.println("He first learned the move: Ember");
        }
    }

    public void additionalEffect() {
        super.signatureMove();
        if (numberOfFlames > 2) {
            System.out.println(" which can burn the target");
        }
    }
}

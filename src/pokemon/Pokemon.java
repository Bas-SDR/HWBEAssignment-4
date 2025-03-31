package pokemon;
//Can be made abstract because no object is being created in main for Pokemon.
public abstract class Pokemon {
    private int level;
    private int attack;
    private int defense;
    private String name;
    private String type;

    public Pokemon(int level, int attack, int defense, String name) {
        this.level = level;
        this.attack = attack;
        this.defense = defense;
        this.name = name;
    }

    public void attackerOrDefender() {
        if(attack > defense){
            System.out.println("This pokemon is an attacker");
        } else if(defense == attack) {
            System.out.println("This pokemon is balanced");
        } else System.out.println("This pokemon is a defender");
    }

    public void signatureMove() {
        System.out.print(name + " can learn his signature move");
    }

    public void statsOfPokemon() {
        System.out.println(name + " is level " + level + " with " + attack + " attack and " + defense + " defense.");
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

package pokemon;

public class ElectricPokemon extends Pokemon {
    private int voltage;
    private int speedStat;
    private boolean zMove;

    public ElectricPokemon(int level, int attack, int defense, String name, int voltage, int speedStat, boolean zMove) {
        super(level, attack, defense, name);
        setType("Electric");
        this.voltage = voltage;
        this.speedStat = speedStat;
        this.zMove = zMove;
    }

    @Override
    public void signatureMove() {
        if (zMove) {
            System.out.print(getName() + " can use its ultimate Z-Move");
        }
    }

    public void nameZMove(){
        switch (getName()){
            case "Pikachu":
                System.out.println(" which is called 10.000.000 Volt Thunderbolt");
                break;
            case "Raichu":
                System.out.println(" which is called Stoked Sparksurfer");
                break;
            default:
                System.out.println(" which is called Gigavolt Havoc");
        }
    }

    public void VoltTackle() {
        int voltTackleLevel = 50;
        if (voltTackleLevel > getLevel()) {
            System.out.println(super.getName() + " learns Volt Tackle in " + (voltTackleLevel - super.getLevel()) + " levels");
        } else System.out.println(super.getName() + " has learned Volt Tackle already.");
    }
}

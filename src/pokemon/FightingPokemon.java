package pokemon;

import java.util.Objects;

public class FightingPokemon extends Pokemon {
    int punchingPower;
    String heldItem;

    public FightingPokemon(int level, int attack, int defense, String name, int punchingPower, String heldItem) {
        super(level, attack, defense, name);
        setType("Fighting");
        this.punchingPower = punchingPower;
        this.heldItem = heldItem;
    }

    @Override
    public void attackerOrDefender() {
        if (punchingPower > 500) {
            System.out.println("This pokemon is an attacker");
        } else super.attackerOrDefender();
    }

    public void megaEvolve() {
        if (Objects.equals(heldItem, "Lucarionite")) {
            System.out.println(getName() + " can mega evolve into Mega " + getName());
        } else System.out.println(getName() + " can not mega evolve");
    }
}

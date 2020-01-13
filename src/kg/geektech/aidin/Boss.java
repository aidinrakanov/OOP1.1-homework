package kg.geektech.aidin;

import java.util.Random;

public class Boss {
    public int health;
    public int damage;
    public int typeDefense;
    public static String bossDefenceType = "";
    public static String[] heroesAttackType = {"Physical",
            "Magical", "Mental", "Heal"};


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getTypeAbility(int i) {
        return typeDefense;
    }

    public void setTypeAbility(int typeAbility) {
        this.typeDefense = typeAbility;
    }


    public static void changeBossDefence() {
        Random r = new Random();
        int randomIndex = r.nextInt(heroesAttackType.length); //0, 1, 2
        bossDefenceType = heroesAttackType[randomIndex];
    }
}


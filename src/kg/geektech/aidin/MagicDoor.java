package kg.geektech.aidin;

public class MagicDoor {
    public Hero[] heroesType() {


        Hero[] heroes = new Hero[4];
        Hero warior = new Hero(500, 100, "Physical");
        heroes[0] = warior;

        Hero magic = new Hero(350,100,"Magic");
        heroes[1]= magic;

        Hero kinetic = new Hero(400,50,"mental");
        heroes[2]= kinetic;

        Hero doctor = new Hero(400,20,"heal");
        heroes [3]= doctor;
        return heroes;

    }
}
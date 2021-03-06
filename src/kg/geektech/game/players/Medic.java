package kg.geektech.game.players;

public class Medic extends Hero{
    private int healPoints;
    public Medic(int health, int damage,int healPoints) {
        super(health, damage, SuperPower.HEAL);
        this.healPoints=healPoints;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i] && heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() + healPoints);
            }
        }

    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
}

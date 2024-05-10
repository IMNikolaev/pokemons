package rest_example.entity;


public class Whimsicott implements Pokemon{
    private double hp;
    private double attack;
    private double defense;
    private double specialAttack;
    private String name;

    public Whimsicott(String name) {
        this.hp = 60.0;
        this.attack = 67.0;
        this.defense = 85.0;
        this.specialAttack = 77.0;
        this.name = name;
    }

    @Override
    public double getHp() {
        return hp;
    }

    @Override
    public double getAttack() {
        return attack;
    }

    @Override
    public double getDefense() {
        return defense;
    }

    @Override
    public double getSpecialAttack() {
        return specialAttack;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fight() {
    }

    @Override
    public void sleep() {
    }
}

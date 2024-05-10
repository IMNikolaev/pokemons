package rest_example.entity;


public class Nuzleaf implements Pokemon{
    private double hp;
    private double attack;
    private double defense;
    private double specialAttack;
    private String name;

    public Nuzleaf(String name) {
        this.hp = 70.0;
        this.attack = 70.0;
        this.defense = 40.0;
        this.specialAttack = 60.0;
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

package rest_example.entity;


public class Passimian implements Pokemon{
    private double hp;
    private double attack;
    private double defense;
    private double specialAttack;
    private String name;

    public Passimian(String name) {
        this.hp = 100.0;
        this.attack = 120.0;
        this.defense = 90.0;
        this.specialAttack = 40.0;
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

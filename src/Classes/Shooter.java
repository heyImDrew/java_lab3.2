package Classes;
import Classes.Interfaces.Object;
import Classes.Interfaces.Game;

public class Shooter implements Game, Object {
    private int year;
    private double rating;
    private String os;
    private int levels;
    private String weapon;

    public Shooter(int year, double rating, String os, int levels, String weapon) {
        this.year = year;
        this.rating = rating;
        this.os = os;
        this.levels = levels;
        this.weapon = weapon;

        System.out.println("** Шутер создан.");
        System.out.println("Год: " + this.get_year() + ". Рейтинг: " +
                this.get_rating() + ". ОС: " + this.get_os() +
                ". Кол-во уровней: " + this.get_levels() + ". Оружие: " + this.get_weapon() + ".");
        System.out.println();
    }

    public void set_year(int year) { this.year = year; }
    public void set_rating(double rating) { this.rating = rating; }
    public void set_os(String os) { this.os = os; }
    public int get_year() { return this.year; }
    public double get_rating() { return this.rating; }
    public String get_os() { return this.os; }
    public int get_levels() {
        return this.levels;
    }
    public String get_weapon() { return this.weapon; }
    public void print() { System.out.println("** Shooter"); }
}

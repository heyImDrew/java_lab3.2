package Classes;

import Classes.Interfaces.Game;
import Classes.Interfaces.Object;

public class Quest implements Game, Object {
    private int year;
    private double rating;
    private String os;
    private int age;

    public Quest(int year, double rating, String os, int age) {
        this.year = year;
        this.rating = rating;
        this.os = os;
        this.age = age;

        System.out.println("** Квест создан.");
        System.out.println("Год: " + this.get_year() + ". Рейтинг: " +
                this.get_rating() + ". ОС: " + this.get_os() +
                    ". Возраст: " + this.get_age() + ".\n");
    }

    public int get_age() {
        return this.age;
    }
    public int get_year() { return this.year; }
    public double get_rating() { return this.rating; }
    public String get_os() { return this.os; }
    public void print() { System.out.println("** Quest"); }
}

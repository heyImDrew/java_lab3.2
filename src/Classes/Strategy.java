package Classes;
import Classes.Interfaces.Game;
import Classes.Interfaces.Object;

abstract class Strategy implements Game, Object {
    public Strategy() {
        System.out.println("** Стратегия создана.");
    }
    private int year;
    private double rating;
    private String os;
    private int max_unit;
    public static int amount_of_maps = 0;
    public abstract void create_map();
    public void set_year(int year) { this.year = year; }
    public void set_rating(double rating) { this.rating = rating; }
    public void set_os(String os) { this.os = os; }
    public void set_max_units(int units) { this.max_unit = units; }
    public int get_year() { return this.year; }
    public double get_rating() { return this.rating; }
    public String get_os() { return this.os; }
    public int get_max_units() {
        return this.max_unit;
    }
    public int get_amount_of_maps() {
        return amount_of_maps;
    }
}

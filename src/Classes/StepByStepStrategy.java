package Classes;

public class StepByStepStrategy extends Strategy {
    int steps;

    public StepByStepStrategy(int year, double rating, String os, int max_unit, int steps) {
        this.set_year(year);
        this.set_rating(rating);
        this.set_os(os);
        this.set_max_units(max_unit);
        this.steps = steps;

        System.out.println("** Пошаговая стратегия создана.");
        System.out.println("Год: " + this.get_year() + ". Рейтинг: " +
                this.get_rating() + ". ОС: " + this.get_os() +
                ". Юнитов: " + this.get_max_units() + ". Макс. шагов: " + this.get_steps() + ".\n");
    }

    public void create_map() { amount_of_maps++; }
    public void print() { System.out.println("** Пошаговая стратегия"); }
    public int get_steps() { return this.steps; }
}
package Classes;

public class CardStrategy extends Strategy {
    int cards;

    public CardStrategy(int year, double rating, String os, int max_unit, int cards) {
        this.set_year(year);
        this.set_rating(rating);
        this.set_os(os);
        this.set_max_units(max_unit);
        this.cards = cards;

        System.out.println("** Карточная стратегия создана.");
        System.out.println("Год: " + this.get_year() + ". Рейтинг: " +
                this.get_rating() + ". ОС: " + this.get_os() +
                ". Юнитов: " + this.get_max_units() + ". Карт: " + this.get_cards() + ".\n");
    }

    public void create_map() { amount_of_maps++; }
    public void print() { System.out.println("** Карточная стратегия"); }
    public int get_cards() { return this.cards; }
}

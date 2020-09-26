package Classes.Main;
import Classes.*;

public class Main {
    public static void main(String[] args) {
        Shooter shooter = new Shooter(2005, 9.55, "Linux", 3, "AK");
        Quest quest = new Quest(2010, 8.4, "Windows", 18);
        CardStrategy cardStrategy = new CardStrategy(2000, 5.5, "Linux", 10, 36);
        StepByStepStrategy stepByStepStrategy = new StepByStepStrategy(2005, 7.8, "MacOS", 5, 50);

        shooter.print();
        quest.print();
        cardStrategy.print();
        stepByStepStrategy.print();
    }
}

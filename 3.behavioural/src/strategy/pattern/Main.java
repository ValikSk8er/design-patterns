package strategy.pattern;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Discounter christmasDiscounter = new ChristmasDiscounter();
        Discounter easterDiscounter = new EasterDiscounter();

        BigDecimal amount = BigDecimal.valueOf(100);

        BigDecimal christmasAmount = christmasDiscounter.applyDiscount(amount);
        System.out.println(christmasAmount);

        BigDecimal easterAmount = easterDiscounter.applyDiscount(amount);
        System.out.println(easterAmount);
    }
}

package template.method;

import template.method.core.Chess;
import template.method.core.MortalCombat;
import template.method.core.v2.LengthCounter;

/**
 * https://www.javatpoint.com/template-pattern
 */
public class Main {
    public static void main(String[] args) {
        new Chess().play();
        new MortalCombat().play();

        //test with lambdas
        new LengthCounter().play("hi gamer", "test message");

    }
}

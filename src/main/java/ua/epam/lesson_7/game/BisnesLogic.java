package ua.epam.lesson_7.game;

import java.util.Random;

public class BisnesLogic {
    private int number;
    private int min = 0;
    private int max = 100;

    public BisnesLogic() {
        number = new Random().nextInt(min, max);
    }

    public boolean findNumber(int number) {
        if (number > max || number < min) {
            throw new ExceptionInInitializerError();
        }

        if (number == this.number) {
            return true;
        }

        if (number > this.number) {
            max = number - 1;
        } else {
            min = number + 1;
        }
        return false;
    }

    public int[] giveMinMax() {
        return new int[]{min, max};
    }
}

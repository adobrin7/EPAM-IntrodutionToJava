package ua.epam.lesson_7.game;

import java.util.InputMismatchException;


public class Program {
    public static void main(String[] args) {
        BisnesLogic logic = new BisnesLogic();

        while (true) {
            View.showMinMax(logic.giveMinMax());
            View.showPrintMes();
            try {
                int number = Controler.getNumberInConsole();
                boolean flag = logic.findNumber(number);
                if (flag) {
                    View.showCongratulations();
                    break;
                }
            } catch (ExceptionInInitializerError exception) {
                View.showErrMessage("Wrong number");
            } catch (InputMismatchException exception){
                View.showErrMessage("This isn't number");
            }
        }
    }
}

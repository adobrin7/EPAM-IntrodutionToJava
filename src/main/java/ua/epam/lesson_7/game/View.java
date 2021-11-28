package ua.epam.lesson_7.game;

import java.util.Arrays;

public class View {
    public static void showErrMessage(String mess){
        System.out.println("\033[1;31m" + mess + "\033[0m");
    }
    public static void showMinMax(int[] mass){
        System.out.println("\033[0;32m" + Arrays.toString(mass) + "\033[0m");
    }
    public static void showPrintMes(){
        System.out.println("Write number");
    }
    public static void showCongratulations(){
        System.out.println("\033[0;32m" + "You win" + "\033[0m");
    }
}

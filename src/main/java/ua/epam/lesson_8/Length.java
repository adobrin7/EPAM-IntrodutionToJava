package ua.epam.lesson_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Length {
    private Scanner file;
    private ArrayList<String> text;

    public Length() throws FileNotFoundException {
        file = new Scanner(new File("D:\\Devasted\\PRO\\EPAM_IntroToJava\\src\\main\\java\\ua\\epam\\lesson_8\\task.txt"));
        String str = file.nextLine();
        text = new ArrayList<String>(Arrays.asList(str.split("[,.\s\n]")));
    }

    public String Length() {
        text.sort((first, second) -> Integer.compare(second.length(), first.length()));

        String result =
                text.get(0) + " ==> " + text.get(0).length() + "\n" +
                text.get(1) + " ==> " + text.get(1).length() + "\n" +
                text.get(2) + " ==> " + text.get(2).length() + "\n";
        return result;
    }
}
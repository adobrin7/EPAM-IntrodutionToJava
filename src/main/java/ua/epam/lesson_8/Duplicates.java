package ua.epam.lesson_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Duplicates {
    Scanner file;
    private ArrayList<String> text;
    private ArrayList<StringBuilder> duplicates = new ArrayList<>();

    public Duplicates() throws FileNotFoundException {
        file = new Scanner(new File("D:\\Devasted\\PRO\\EPAM_IntroToJava\\src\\main\\java\\ua\\epam\\lesson_8\\task.txt"));
        String str = file.nextLine();
        text = new ArrayList<String>(Arrays.asList(str.split("[;\s\n]")));
    }

    public String Duplicates() {
        HashSet<String> hashText = new HashSet<>(text);
        for (String string : hashText) {
            StringBuilder builder = new StringBuilder(string.toUpperCase());
            duplicates.add(builder.reverse());
    }
        String result =
                duplicates.get(1) + "\n" +
                duplicates.get(2) + "\n" +
                duplicates.get(3);

        return result;
    }
}
package ua.epam.lesson_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Frequency {
    private String[] text;
    private Scanner file;

    public Frequency() throws FileNotFoundException {
        file = new Scanner(new File("D:\\Devasted\\PRO\\EPAM_IntroToJava\\src\\main\\java\\ua\\epam\\lesson_8\\task.txt"));
        String string = file.nextLine();
        text = string.split("[\s\n]");
    }
    public void Frequency() {
        List<String> list = Arrays.asList(text);
        list.stream().collect(Collectors.toMap(key -> key, val -> 1, Integer::sum))
            .entrySet().stream().sorted((e1, e2) -> {
                int val = e1.getValue().compareTo(e2.getValue()) * -1;
                return val;
            }).limit(3).forEach(e -> System.out.println(e.getKey() + " ==> " + e.getValue()));
    }
}
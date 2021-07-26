package org.example;

public class RasbitbStroku {
    public static void main(String[] args) {
        String str = "разбить строку на слова";
        String[] words = str.split("\\s");
        for (String subStr : words) {
            System.out.println(subStr);
        }
    }
}

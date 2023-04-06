package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        testUser();
        test();


        int a = 10;
        Random r = new Random();
        int c = 0;
        for (int i = 0; i < 100; i++) {
            int b = r.nextInt(-20,20);
            try {
                System.out.println(a / b);

            } catch (ArithmeticException e){
                e.getStackTrace();
//                System.out.println("oops");
//                ++c;
                throw new RuntimeException();
            }
        }
        System.out.println(c + " проблем было обнаружено");
        System.out.println("asadsf");
    }

    public static void test() {
        Path of = Path.of("test.txt");
        List<String> strings = null;
        try {
            strings = Files.readAllLines(of);


        } catch (IOException e) {
            System.out.println("Ошибка доступа к файлу. Такого файла нет");
        } catch (Exception e){
            System.out.println("Какое то непонятное ислючение. К такому меня не готовили");
        }

        for (String string : strings) {
            System.out.println(string);
        }

    }

    public static void testUser() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age;

        try {
            age = scanner.nextInt();
        } catch (Exception e){
            age = 0;
            System.out.println("test");
        }

        User user = new User(name, age);
        System.out.println(user);
    }


}
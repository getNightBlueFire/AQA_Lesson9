package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = scanner.nextLine();



        try {
            age = scanner.nextInt();
        } catch (UserAgeException e){

        }

//        User user = new User(name, age);
//        System.out.println(user);


//        try {
//            test();
//        } catch (Exception e) {
//            System.out.println("Ошибка в вычислениях");
//        }

    }

    public static void test() throws Exception {
        ///
        ///
        System.out.println(10/0);

        ///
    }
}

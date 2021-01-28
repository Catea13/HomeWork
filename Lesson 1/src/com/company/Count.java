package com.company;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        String vowels = "aeouieyAEOUIEY";
        String constant = "wrqtpsdfghklvbnmWRTPSDFGHJKLZXCVBNM";
        int counVowels = 0;
        int countConstant = 0;
        Scanner string = new Scanner(System.in);
        System.out.println("Enter string");
        String str = string.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char curent = str.charAt(i);

            if (vowels.indexOf(curent) > 0)
                counVowels++;
            else if (constant.indexOf(curent) > 0)
                countConstant++;

        }

        System.out.println(countConstant + "Constant");


        System.out.println(counVowels + "Vowels");

    }
}




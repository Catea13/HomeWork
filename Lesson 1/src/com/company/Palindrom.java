package com.company;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nr");
        String nrr = scanner.nextLine();
String b=new StringBuffer(nrr).reverse().toString();

        if(nrr.equals(b)){
            System.out.println("Palindrom");
        }
        else {
            System.out.println("No Palindrom");
        }
    }
}

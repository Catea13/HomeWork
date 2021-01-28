package com.company;

import java.util.Scanner;

public class Celsius {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter celsius");
        int celsius=sc.nextInt();
      double fartheist=(9/5)*celsius+32;
        System.out.println(fartheist);

    }
}

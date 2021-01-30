package com.company;

import java.util.Scanner;

public class Bucket {

        public void getBucketCount(double width,double height,double areaBucket,int exytraBucket){
            if(width<=0||height<=0||areaBucket<=0){
                System.out.println("-1");
            }
            else  {
               double area=  (width*height);
                double count=  (exytraBucket*areaBucket);
                double rest=area-count;
                double bucketneed=  (rest/areaBucket);
                double result=Math.ceil(bucketneed);
                System.out.println(result);

            }

    }
    public static class Main extends Bucket{
        public static void main(String[] args) {
            Main main=new Main();
            main.getBucketCount(3.4,2.1,1.5,2);
        }
    }
}

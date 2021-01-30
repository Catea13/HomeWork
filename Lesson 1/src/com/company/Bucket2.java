package com.company;

public class Bucket2 {
    public void getBucketCount(double width,double height,double areaBucke){
if(width<=0||height<=0||areaBucke<=0) {
            System.out.println("-1");
        }
    else{
        double area=width*height;
        double bucketneeds=area/areaBucke;
        double result=Math.ceil(bucketneeds);
    System.out.println(result);
    }
    }
public static class Main extends Bucket2{
    public static void main(String[] args) {
        Main main=new Main();
        main.getBucketCount(3.4,2.1,1.5);

    }
}
}

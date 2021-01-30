package com.company;

public class Bucket3 {
    public void getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            System.out.println("-1");
        } else {
            double needs = area / areaPerBucket;
            double result = Math.ceil(needs);
            System.out.println(result);
        }
    }

        public static class Main extends Bucket3 {
            public static void main(String[] args) {
                Main main = new Main();
                main.getBucketCount(3.4, 1.5);
            }
        }
    }



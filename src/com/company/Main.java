package com.company;



public class Main {

    public static void main(String[] args) {
        double [][] a  = new double[][]{
                {-7, -6, -5, -4, -3, -2, -1, 0},
                {1, 2, 3, 4, 5, 6, 7}
        };

        double sum = 0;
        for (double element: a[1]){
            sum = sum + element;
        }

        System.out.println(sum / a[1].length);

    }

}




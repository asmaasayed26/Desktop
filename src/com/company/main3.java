package com.company;
import java.util.Random;
import java.util.Scanner;

public class main3 {
    public static void main (String[] args ){
        Random random =new Random();
        int x = random.nextInt(10)+1;
        int y = random.nextInt(10)+1;
        int z;
        z = x+y ;
        System.out.println(x +" + "+ y+" = " );
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();
        if (sum == z )
            System.out.println("correct :)");
        else
            System.out.println( "not correct :( ");
    }
}

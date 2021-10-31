package com.company;
import java.util.Random;
import java .util.Scanner ;
// ايجاد موقع نقطة فوق الخط ام لا
// اذا كان الـ y اكبر من الميل والمقطع والنقطة
public class main2 {
    public static void main (String[]args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" enter X and Y or enter your point ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double a = -0.5813953488;
        double b = 51.16;
        double ab =((a*x)+b);
        if (y > ab)
               System.out.println(" above ");
        else
               System.out.println(" not above ");
        }
    }



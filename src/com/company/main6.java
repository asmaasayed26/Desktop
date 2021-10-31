package com.company;

import java.util.Scanner;

public class main6 {
    public static void main (String[]args ){
        Scanner input = new Scanner(System.in);
        System.out.println(" pls enter 3 number !");
        int a = input.nextInt();
                int b = input.nextInt();
                        int c = input.nextInt();
                        if (a>b&&a>c)
                        {
                            System.out.println(a);
                            if ( b>c)
                                System.out.println(b +"\n"+ c );
                            else
                                System.out.println(c +"\n"+ b );
                        }
                        else if (b>a && b>c)
                        {
                            System.out.println(b);
                            if (a>c)
                                System.out.println(a +"\n"+ c );
                            else
                                System.out.println(c +"\n"+ a );
                        }

                        else if ( c>a && c>b)
                        {
                            System.out.println(c);
                            if (a>b)
                                System.out.println(a +"\n"+ b );
                            else
                                System.out.println(b +"\n"+ a );
                        }

    }
}

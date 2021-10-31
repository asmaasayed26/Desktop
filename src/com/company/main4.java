package com.company;
import java .util.Random;
public class main4 {
    public static void main (String[]args ){


            boolean A, B;

            System.out.println( "R\tS\t AND \t OR \t XOR \t NOT" );

            A = true; B = true;
            System.out.print(B + "\t" + B + "\t");
            System.out.print((B&B) + "\t" + (B|B) + "\t");
            System.out.println((B^B) + "\t" + (!B));

            A = true; B = false;
            System.out.print(A + "\t" + B + "\t");
            System.out.print((A &B) + "\t" + (A |B) + "\t");
            System.out.println((A ^B) + "\t" + (!A ));

            A = false; B = true;
            System.out.print(A + "\t" + B + "\t");
            System.out.print((A &B) + "\t" + (A|B) + "\t");
            System.out.println((A^B) + "\t" + (!A));

            A  = false; B = false;
            System.out.print(A + "\t" + B + "\t");
            System.out.print((A &B) + "\t" + (A|B) + "\t");
            System.out.println((A ^B) + "\t" + (!A));

    }


}


package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int lightspeed;
     long days;
     long seconds;
     long distance;

     // пріблизительная скорость света, миль в секунду

     lightspeed = 186000;
     System.out.println("Сколько дней идет свет?");
     Scanner day = new Scanner(System.in);
     days = day.nextInt();
     /*
     указать колічество дней
      */

     seconds = days * 24 * 60 * 60;
     distance = lightspeed * seconds;
     // вычісліть расстоняніе

     System.out.print("За " + days);
     System.out.print(" дней свет пройдет около ");
     System.out.println(distance + " миль. ");


     int a = 1000;
     byte b;
     double c = 12.68;

     b = (byte) a;
     a = (int) c;

     System.out.println("C in INT: " + a);
     System.out.println("A in BYTE : " + b);

    int[] arr = new int[]{1,2,3,};
    float[] arr1 = {12.3f, 12.4f};

    System.out.println(arr1[1] + " " + arr[2]);

    int post_inc = 43, pref_inc = 43, pref_num, post_num;
    pref_num = ++pref_inc;
    post_num = post_inc++;

    System.out.println("Pref NUM and INC : " + pref_num + " " + pref_inc);
    System.out.println("Post NUM and INC : " + post_num + " " + post_inc);

    int number = 97;
    System.out.println(number<<2);
    }



}


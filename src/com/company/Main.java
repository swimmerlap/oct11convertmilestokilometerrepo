package com.company;
import java.util.Scanner;

public class Main {


            public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                System.out.print("Enter number in miles: ");
                int mile = keyboard.nextInt();

                System.out.printf("%.2f", convertToMiles(mile));




            }


            public static double convertToMiles (int mile){
                double kilom = mile * 1.6;
                return kilom;

            }
        }


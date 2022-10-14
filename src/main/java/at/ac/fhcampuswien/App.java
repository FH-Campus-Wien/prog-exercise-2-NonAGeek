package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    private long y;

    //todo Task 1
    public void largestNumber() {
        Scanner scan = new Scanner(System.in);
        int x = 1;
        double in;
        double out = 0;
        System.out.print("Number 1: ");
        in = scan.nextDouble();


        while (in > 0) {
            x++;
            if (in > out)
            {
                out = in;
            }
            System.out.print("Number " + x + ": ");
            in = scan.nextDouble();

        }
        if (out <= 0)
        {
            System.out.println("No number entered.");
        }
        else {
            System.out.printf("The largest number is %.2f", out);
            System.out.println();
        }
    }


    //todo Task 2
    public void stairs(){
        System.out.print("n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i1 = 1;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i1 + " ");
                    i1++;
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number!");
        }

    }

    //todo Task 3
    public void printPyramid(){
        {
            for (int row = 1; row <= 6; row++) {
                for (int count = row; count < 6; count++) {
                    System.out.print(" ");
                }
                for (int i = 1; i < (row * 2); i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }



    //todo Task 4
    public void printRhombus(){
        Scanner scan = new Scanner(System.in);
        int x = 0;
        System.out.print("h: ");
        int y = scan.nextInt();
        int z = y / 2;
        int nrofspace = z;
        int a = z + 1;
        System.out.print("c: ");
        char c = scan.next().charAt(0);
        int l1 = c;
        int start;
        int l2 = c - z;
        int count = 1;

        if (y % 2 == 1) {
            for (int i = 0; i < y; i++) {

                if (i < a) {
                    start = l1 - i;
                } else {
                    start = l2 + count;
                    count++;
                }

                for (int j = 1; j <= nrofspace; j++) {
                    System.out.print(" ");
                }
                if (i < z) {
                    nrofspace = nrofspace - 1;
                } else {
                    nrofspace = nrofspace + 1;
                }


                for (int j = 0; j <= x; j++) {
                    int middleColumn = (x / 2);
                    System.out.print((char) (start));

                    if (j < middleColumn) {
                        start++;                //StartLetter vor H
                    } else {
                        start--;                 //StartLetter nach H
                    }

                }
                System.out.println();
                if (i < z) {
                    x = x + 2;
                } else {
                    x = x - 2;
                }

            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 5
    public void marks(){
        Scanner scan = new Scanner(System.in);
        int nr = 1;
        double grade = 1;
        double sum = 0;
        double average;
        int countGrade = 0;
        int countNegativeMarks = 0;


        while (grade > 0) {
            System.out.print("Mark " + nr + ": ");
            nr++;

            grade = scan.nextInt();

            if ((nr == 2) && (grade == 0)) {
                System.out.println("Average: 0,00");
                System.out.println("Negative marks: 0");

            } else if ((grade > 5) && (grade != 0)) {
                System.out.println("Invalid mark!");
                nr--;

            } else if ((grade > 0) && (grade < 6)) {
                sum = sum + grade;
                countGrade++;

                if (grade == 5) {
                    countNegativeMarks++;
                }

            } else if (grade == 0) {
                average = sum / (countGrade);
                System.out.println("Average: " + String.format("%.2f", average));
                System.out.println("Negative marks: " + countNegativeMarks);
            }

        }
    }

    //todo Task 6
    public void happyNumbers(){
        //Hilfestellung durch Tutorium: 14.10.20


        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int number = scan.nextInt();
        int sum_2;
        int digit3;
        int digit2;
        int digit1;

        while (number > 0) {

            if (number != 1 && number != 4) {
                digit3 = number % 10;
                digit2 = (number / 10) % 10;
                digit1 = (number / 100) % 10;

                sum_2 = (int) (Math.pow(digit1, 2) + Math.pow(digit2, 2) + Math.pow(digit3, 2));
                number = sum_2;

            } else if (number == 1) {
                System.out.println("Happy number!");
                break;

            } else if (number == 4) {
                System.out.println("Sad number!");
                break;
            }
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}
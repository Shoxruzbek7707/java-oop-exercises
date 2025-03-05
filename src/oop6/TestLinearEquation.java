package oop6;

import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a= ");
        double a = scanner.nextDouble();

        System.out.print("b= ");
        double b = scanner.nextDouble();

        System.out.print("c= ");
        double c = scanner.nextDouble();

        System.out.print("d= ");
        double d = scanner.nextDouble();

        System.out.print("e= ");
        double e = scanner.nextDouble();

        System.out.print("f= ");
        double f = scanner.nextDouble();

        LinearEquation equation = new LinearEquation(a,b,c,d,e,f);

        if (equation.isSolvavle()){
            System.out.println("x = " + equation.getX());
            System.out.println("y = " + equation.getY());
        }else {
            System.out.println("Tenglama yechimga emas");
        }
    }
}

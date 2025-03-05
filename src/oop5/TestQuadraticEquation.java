package oop5;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a= ");
        double a = scanner.nextDouble();

        System.out.print("b= ");
        double b = scanner.nextDouble();

        System.out.print("c= ");
        double c = scanner.nextDouble();

        QuadraticEquation equation1 = new QuadraticEquation(a,b,c);

         double discriminat = equation1.getDiscriminat();

         if (discriminat > 0){
             System.out.println("Birinchi ildiz: " + equation1.getRoot1() + " ikkinchi ildiz: " + equation1.getRoot2());
         } else if (discriminat == 0) {
             System.out.println("Birinchi ildiz: " + equation1.getRoot1());
         }else {
             System.out.println("Tenglamaning ildizlari yo'q");
         }
    }
}

package oop5;
class QuadraticEquation {
    double a;
    double b;
    double c;

    QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getDiscriminat(){
        return Math.pow(b,2) - (4 * a * c);
    }

    double getRoot1(){
        double d = getDiscriminat();
        if (d < 0) return 0;
        return (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
    }

    double getRoot2(){
        double d = getDiscriminat();
        if (d < 0) return  0;
        return  (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
    }
}

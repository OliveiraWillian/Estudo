package entities;

public class Triangulo {
    public Double a;
    public Double b;
    public Double c;

    public Double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double _area = Math.sqrt(p *(p - a) * (p - b) * (p - c));
        return _area ;

    }

    public static void max(double x, double y) {
        System.out.print((x>y) ? "X": "Y");

    }
}

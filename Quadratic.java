public class Quadratic {
    public static void main(String[] args) {
        System.out.println("A: " + args[0]);
        System.out.println("B: " + args[1]);
        System.out.println("C: " + args[2]);

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        System.out.println("The equation is: " + a + "x^2 + " + b + "x + " + c + " = 0");

        double s1 = ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a));
        double s2 = ((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a));

        System.out.println("The solution to the equation is: x = " + s1 + ", " + s2);
    }
}

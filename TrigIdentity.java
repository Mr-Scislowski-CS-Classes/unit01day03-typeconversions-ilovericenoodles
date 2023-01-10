public class TrigIdentity {
    public static void main(String[] args) {
        System.out.println("The first argument provided was: " + args[0]);

        System.out.println("sin^2(" + args[0] + ") + cos^2(" + args[0] + ") = " + (Math.pow(Math.sin(Double.parseDouble(args[0])),2) + Math.pow(Math.cos(Double.parseDouble(args[0])), 2)));
    }
}

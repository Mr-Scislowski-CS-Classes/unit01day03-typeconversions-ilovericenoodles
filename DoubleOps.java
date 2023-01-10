class DoubleOps {
    public static void main(String[] args) {
        System.out.println("The first argument provided was: " + args[0]);
        System.out.println("The second argument provided was: " + args[1]);

        System.out.println("The absolute value of a int is: " + Math.abs(Integer.parseInt(args[0])));
        System.out.println("The absolute value of a double is: " + Math.abs(Double.parseDouble(args[0])));
        System.out.println("The power of a double to another double is: " + Math.pow(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
        System.out.println("The square rout of a double is: " + Math.sqrt(Double.parseDouble(args[0])));
        System.out.println("The absolute value of a double is: " + Math.random());
    }
}
class exp4q3 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        exp4q3 calc = new exp4q3();
        System.out.println("Addition of two integers: " + calc.add(3, 4));
        System.out.println("Addition of two doubles: " + calc.add(3.5, 4.2));
        System.out.println("Addition of three integers: " + calc.add(1, 2, 3));
    }
}
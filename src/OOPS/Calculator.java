public class Calculator {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2, 3, 4));
        System.out.println(calc.add(2.5, 3.5));
    }
}

class Calculate {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}



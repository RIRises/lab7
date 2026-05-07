import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int testsPassed = 0;
        int totalTests = 0;

        totalTests++;
        try {
            assert calc.add(2, 3) == 5;
            assert calc.add(-5, 5) == 0;
            assert calc.add(-7, -3) == -10;
            assert calc.add(42, 0) == 42;
            assert calc.add(0, 42) == 42;
            System.out.println(" add() done");
            testsPassed++;
        } catch (AssertionError e) {
            System.out.println(" add() error");
        }

        totalTests++;
        try {
            assert calc.dif(10, 5) == 5;
            assert calc.dif(7, 7) == 0;
            assert calc.dif(-5, -3) == -2;
            assert calc.dif(-3, -5) == 2;
            assert calc.dif(7, 0) == 7;
            assert calc.dif(0, 7) == -7;
            System.out.println(" dif() done");
            testsPassed++;
        } catch (AssertionError e) {
            System.out.println(" dif() error");
        }


        totalTests++;
        try {
            assert calc.div(20, 5) == 4;
            assert calc.div(10, 3) == 3;
            assert calc.div(20, -5) == -4;
            assert calc.div(-20, -5) == 4;
            assert calc.div(0, 5) == 0;
            try {
                calc.div(10, 0);
                throw new AssertionError();
            } catch (ArithmeticException e) {
            }
            System.out.println(" div() done");
            testsPassed++;
        } catch (AssertionError e) {
            System.out.println(" div() error");
        }
        
        totalTests++;
        try {
            assert calc.times(3, 4) == 12;
            assert calc.times(100, 0) == 0;
            assert calc.times(0, 100) == 0;
            assert calc.times(4, -5) == -20;
            assert calc.times(-4, -5) == 20;
            assert calc.times(42, 1) == 42;
            System.out.println("times() done");
            testsPassed++;
        } catch (AssertionError e) {
            System.out.println(" times() error");
        }
        
        totalTests++;
        try {
            List<Integer> roots1 = calc.solver(1, -5, 6);
            assert roots1.size() == 2;
            assert roots1.contains(2) && roots1.contains(3);

            List<Integer> roots2 = calc.solver(1, -4, 4);
            assert roots2.size() == 1;
            assert roots2.get(0) == 2;

            List<Integer> roots3 = calc.solver(1, 1, 1);
            assert roots3.size() == 1;
            assert roots3.get(0) == -1;

            System.out.println("solver() done");
            testsPassed++;
        } catch (AssertionError e) {
            System.out.println("solver() error");
        }

        System.out.println("Результат: " + testsPassed + "/" + totalTests + " done");
        if (testsPassed == totalTests) {
            System.out.println("Done");
        } else {
            System.out.println("Error");
            System.exit(1);
        }
    }
}

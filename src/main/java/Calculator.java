import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int add(int a, int b){

        //TODO inser your realisation in method add
        return a + b;
    }
    public int dif(int a, int b){
        //TODO inser your realisation in method dif
        return a - b;
    }
    public int div(int a, int b){
        //TODO inser your realisation in method div
        if (b == 0) {
            throw new ArithmeticException("Error 0");
        }
        return a / b;
    }
    public int times(int a, int b){
        //TODO inser your realisation in method times
        return a * b;
    }
    public List<Integer> solver(int a, int b, int c){
        List<Integer> roots = new ArrayList<>();
        int discriminant = b*b - 4*a*c;

        if (discriminant < 0) {
            roots.add(-1);
        } else if (discriminant == 0) {
            roots.add(-b / (2*a));
        } else {
            roots.add((int)((-b + Math.sqrt(discriminant)) / (2*a)));
            roots.add((int)((-b - Math.sqrt(discriminant)) / (2*a)));
        }
        return roots;

        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){

        if (b == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }

        if (b == 0) return 0; // Базовая проверка на ноль

        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }

    public int solver(){

        int step1 = add(5, 3);
        int step2 = times(step1, 2);
        int step3 = div(4, 2);
        int result = dif(step2, step3);
        return result;

        int step1 = add(10, 5);      // 15
        int step2 = times(step1, 2);  // 30
        int step3 = div(20, 4);      // 5
        return dif(step2, step3);    // 25

    }
}
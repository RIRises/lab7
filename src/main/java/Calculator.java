import java.util.List;
import java.util.ArrayList;

public class Calculator {
    
    // Арифметические методы
    public int add(int a, int b) {
        return a + b;
    }
    
    public int sub(int a, int b) {
        return a - b;
    }
    
    public int mul(int a, int b) {
        return a * b;
    }
    
    public int div(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }
    
    // Исправленный метод (возвращает int, а не List)
    public int sum(int a, int b) {
        return a + b;
    }
    
    // Исправленный метод solver (без дублирования переменных)
    public void solver() {
        int step1 = add(10, 5);      // 15
        int step2 = mul(step1, 2);   // 30
        int step3 = div(20, 4);      // 5
        int step4 = sub(step2, step3); // 30 - 5 = 25
        
        System.out.println("Result: " + step4);
    }
}

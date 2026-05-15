import java.util.List;
import java.util.ArrayList;

public class Calculator {
    
    // 1. Сложение
    public int add(int a, int b) {
        return a + b;
    }
    
    // 2. Вычитание
    public int dif(int a, int b) {   // <-- ДОБАВИТЬ
        return a - b;
    }
    
    // 3. Умножение
    public int times(int a, int b) { // <-- ДОБАВИТЬ
        return a * b;
    }
    
    // 4. Деление
    public int div(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }
    
    // 5. Решение квадратного уравнения ax² + bx + c
    public List<Integer> solver(int a, int b, int c) { // <-- ИЗМЕНИТЬ СИГНАТУРУ
        List<Integer> roots = new ArrayList<>();
        
        int discriminant = b * b - 4 * a * c;
        
        if (discriminant < 0) {
            return roots; // пустой список, корней нет
        } else if (discriminant == 0) {
            int root = -b / (2 * a);
            roots.add(root);
        } else {
            int root1 = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));
            int root2 = (int) ((-b - Math.sqrt(discriminant)) / (2 * a));
            roots.add(root1);
            roots.add(root2);
        }
        
        return roots;
    }
}

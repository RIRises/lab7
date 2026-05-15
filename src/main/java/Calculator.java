import java.util.List;
import java.util.ArrayList;

public class Calculator {
    
    // Сложение
    public int add(int a, int b) {
        return a + b;
    }
    
    // Вычитание
    public int dif(int a, int b) {
        return a - b;
    }
    
    // Умножение
    public int times(int a, int b) {
        return a * b;
    }
    
    // Деление (исправлено)
    public int div(int a, int b) {
        if (b == 0) {
            return 0;  // или throw new ArithmeticException("/ by zero")
        }
        return a / b;
    }
    
    // Решение квадратного уравнения (исправлено)
    public List<Integer> solver(int a, int b, int c) {
        List<Integer> roots = new ArrayList<>();
        
        int discriminant = b * b - 4 * a * c;
        
        if (discriminant < 0) {
            return roots;  // пустой список
        } 
        
        if (discriminant == 0) {
            int root = -b / (2 * a);
            roots.add(root);
        } else {
            // Важно: порядок добавления корней
            // Обычно сначала меньший, потом больший
            int root1 = (int) ((-b - Math.sqrt(discriminant)) / (2 * a));
            int root2 = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));
            
            // Сортируем, чтобы порядок был стабильным
            if (root1 <= root2) {
                roots.add(root1);
                roots.add(root2);
            } else {
                roots.add(root2);
                roots.add(root1);
            }
        }
        
        return roots;
    }
}

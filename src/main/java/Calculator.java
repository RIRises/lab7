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
    
    // Деление — должно кидать исключение при делении на 0
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return a / b;
    }
    
    // Решение квадратного уравнения
    public List<Integer> solver(int a, int b, int c) {
        List<Integer> roots = new ArrayList<>();
        
        int discriminant = b * b - 4 * a * c;
        
        if (discriminant < 0) {
            // Нет корней — возвращаем [-1]
            roots.add(-1);
            return roots;
        }
        
        if (discriminant == 0) {
            // Один корень
            int root = -b / (2 * a);
            roots.add(root);
            return roots;
        }
        
        // Два корня
        double sqrtD = Math.sqrt(discriminant);
        int root1 = (int) ((-b - sqrtD) / (2 * a));
        int root2 = (int) ((-b + sqrtD) / (2 * a));
        
        roots.add(root1);
        roots.add(root2);
        
        return roots;
    }
}

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
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
    }
}
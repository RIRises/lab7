public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) return 0; // Базовая проверка на ноль
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }

    public int solver(){
        int step1 = add(10, 5);      // 15
        int step2 = times(step1, 2);  // 30
        int step3 = div(20, 4);      // 5
        return dif(step2, step3);    // 25
    }
}

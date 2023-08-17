package exsamples;

public class MyMath {

    private static final double PI = 3.14;   //не изменяется

    public static double length(double radius) {
    return 2 * PI * radius;
} //радиус окружности
    public static double area(double radius) {
    return  PI * radius * radius;
    }
    public static int sum(int... numbers) {         // метод возвращает сумму всех аргументов (... )
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static int multiply (int a, int b){
        return a * b;
    }

    public static  double multiply (double a, double b){               //перегрузка метода
        return a * b;
    }
    public static  int multiply (int a){
        return a * a;
    }
}

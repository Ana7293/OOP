public class MyMath {
   static int multiply (int a, int b){
        return a * b;
    }

   static double multiply (double a, double b){               //перегрузка метода
        return a * b;
    }
    static int multiply (int a){
        return a * a;
    }
}

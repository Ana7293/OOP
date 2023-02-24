public class Box {
    double length;          // описываем объект: длина, ширина, высота
    double width;
    double height;

   double getVolume() {                         //   метод вычисляет объем и возвращает значение типа double
        return length * width * height;
    }

   void showVolume(){                           // метод ничего не возвращает, а только вычисляет и выводит на консоль объем
     double volume =  getVolume();              // один метод можно вызывать в другом
       System.out.println(volume);

       // System.out.println(getVolume()); - еще можно сразу здесь вызвать метод, не создавая дополнит.перем.

   }

}

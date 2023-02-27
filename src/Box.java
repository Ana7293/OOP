public class Box {
    double length;          // описываем объект: длина, ширина, высота
    double width;
    double height;

    Box(){             // создаем конструктор с параметрами
        this(10);
    }
    Box(double length,double width, double height){             // создаем конструктор с параметрами
        this.length = length;
        this.width = width;
        this.height = height;
    }
   Box(double size) {                                           //конструктор, который создает куб
       this(size, size,size);
   }

    double getVolume() {                         //   метод вычисляет объем и возвращает значение типа double
        return length * width * height;
    }

   void showVolume() {                           // метод ничего не возвращает, а только вычисляет и выводит на консоль объем
       double volume = getVolume();              // один метод можно вызывать в другом
       System.out.println(volume);

       // System.out.println(getVolume()); - еще можно сразу здесь вызвать метод, не создавая дополнит.перем.
   }
  /* void setDimens(double length,double width, double height) {
    this.length = length;                                           //чтобы имена переменных не путались можно
    this.width = width;                                             //использовать разные имена, например length1
    this.height = height;  */                                         //или же ключевое слово this, чтобы локальные перем. и перем. класса не путались

   }



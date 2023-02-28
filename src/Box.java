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
    Box (Box another) {                                         //в качестве параметра конструктора ссылочный тип
        this (another.length, another.width, another.height);
    }


    double getVolume() {                         //   метод вычисляет объем и возвращает значение типа double
        return length * width * height;
    }

   void showVolume() {                           // метод ничего не возвращает, а только вычисляет и выводит на консоль объем
       double volume = getVolume();              // один метод можно вызывать в другом
       System.out.println(volume);

   }
    void setDimens(double length,double width, double height) {
        this.length = length;                                           //чтобы имена переменных не путались можно
        this.width = width;                                             //использовать разные имена, например length1
        this.height = height;
    }
        int compare (Box another){                                  // в качестве параметра метода ссылочный тип
       double currentVolume = getVolume();
       double anotherVolume = another.getVolume();
      // if(currentVolume > anotherVolume) {        Первый  способ
      //     return 1;
      // } else if (currentVolume < anotherVolume) {
      //     return -1;
      // } else {
      //     return 0;
      // }
     int result;                                    // Второй способ, здесь return использован всего 1 раз
        if(currentVolume > anotherVolume) {
            result = 1;
        } else if (currentVolume < anotherVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
        Box copy() {                                    // в качестве возвращаемого типа указан ссылочный тип
            return new Box(length, width, height);
    }

        Box increase () {
        return new Box(length * 2, width * 2, height * 2);
    }


   }



package box;

public class Box {
    private double length;
   private double width;
  private   double height;

    public Box() {
        // this.length = 10; //здесь тоже вместо того, чтобы 3 раза прописывать одно и тоже значение
        // this.width = 10;  //мы может вызвать др.конструктор где уже заданы одник.значения
        // this.height = 10; у нас будет size со значениями 10. и избегаем дублирование кода
        this(10);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) { //создает куб
        //this.length = size;  //здесь вместо того, чтобы использовать три поля, можно в этом же конструкторе
        //this.width = size;   //вызвать другой конструктор этого же класса
        //this.height = size;   //и передать параметры, у нас три раза size
        this(size, size, size);
    }

    public Box(Box another) {                                   //создаем копию коробки - второй(новый) объект,
        this(another.length, another.width, another.height);     //но с такими параметрами
    }

    public double getVolume() {                         //   метод вычисляет объем и возвращает значение типа double
        return length * width * height;
    }

    private void showVolume() {
        double volume = getVolume();  //прямо в новом методе вызываем метод ждя вычисление объема
        System.out.println(volume);
    }

   private void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    private void compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        //int result;
        if (currentVolume > anotherVolume) {
            System.out.println("Коробка current больше, чем коробка another");
        } else if (currentVolume < anotherVolume) {
            System.out.println("Коробка current меньше, чем коробка another");
        } else {
            System.out.println("Коробка current равна коробке another");
        }
    }

  /*  public int compare(box.Box another) {          //такой возвращаемый метод используют часто,
        double currentVolume = getVolume();      // когда результат полученный в методе (итог)
        double anotherVolume = another.getVolume();  //нужно применять где то еще в расчетах и т.д
        int result;                                  //сохраню себе как шаблон
        if (currentVolume > anotherVolume) {
            result = 1;
        } else if (currentVolume < anotherVolume) {
           result = -1;
        } else {
            result = 0;
        }
        return result;
    }
 */


    private Box copy () {  //создаем метод, который возвращает новый объект - копию текущего объекта (или указанного)
        return new Box(this.length, this.width, this.height);

    }

    private Box increase () {  //создаем метод, который возвращает новый объект
        return new Box(length * 2, width * 2, height * 2); // только размеры в 2 раза больше, чем у текущего объекта

    }


}


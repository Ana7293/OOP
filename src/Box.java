public class Box {
     double length;
     double width;
     double height;

   /* public Box(){
        this(10);
    }
    public Box(double length,double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
   public Box(double size) {
       this(size, size,size);
   }
    public Box (Box another) {
        this (another.length, another.width, another.height);
    }
*/

    double getVolume() {                         //   метод вычисляет объем и возвращает значение типа double
        return length * width * height;
    }

   public void showVolume() {
       double volume = getVolume();  //прямо в новом методе вызываем метод ждя вычисление объема
       System.out.println(volume);
   }
   /*
    public void setDimens(double length,double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public int compare (Box another){
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
      int result;
        if(currentVolume > anotherVolume) {
            result = 1;
        } else if (currentVolume < anotherVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
       public Box copy() {                                    // в качестве возвращаемого типа указан ссылочный тип
            return new Box(length, width, height);
    }

        public Box increase () {
        return new Box(length * 2, width * 2, height * 2);
    }
*/

   }



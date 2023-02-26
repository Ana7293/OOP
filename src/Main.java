public class Main {
    public static void main(String[] args) {

        Box box1 = new Box();             //здесь параметры не указаны, поэтому данные заполняются из конструктора без параметров
        //box1.setDimens(10, 10, 10 ); теперь этот метод не нужен, т.к.есть конструктор
        box1.showVolume();                  // здесь используем метод, который ничего не возвращает(просто выводит на консоль)


        System.out.println("----------");

        Box box2 = new Box(17,16,15);               // создаем 2-й объект класса Box, экземпляр класса
        //box2.setDimens(17, 16, 14 );                               // данный метод с параметрами уже не нужен
        double volume2 = box2.getVolume();                          //здесь возвращает тип double
        System.out.println(volume2);

        System.out.println("----------");

        Human human1 = new Human();                     // создаем 3 объекта класса Human, экземпляр класса
        human1.name = "Василий";
        human1.age = 50;
        human1.weight = 86.8;

        Human human2 = new Human();
        human2.name = "Иван";
        human2.age = 40;
        human2.weight = 75.4;

        Human human3 = new Human();
        human3.name = "Николай";
        human3.age = 25;
        human3.weight = 59.3;
        double averageAge = (human1.age + human2.age + human3.age) / 3.0;
        System.out.println(averageAge);

        System.out.println("----------");

        Dog myPet = new Dog();                              // создаем объект класса Dog
        myPet.nameDog = "Тобик";
        myPet.breedDog = "Такса";
        myPet.weightDog = 3.4;
        myPet.speed = 6;
      //  String petId = myPet.getMyDog();                  // выводим на консоль информацию о питомце
      //  System.out.println(petId);
        System.out.println(myPet.getMyDog());               // можно не создавать переменную, а сразу передать метод
        myPet.getRun();

        System.out.println("----------");

    Test test = new Test();
        System.out.println(test.square(20));        //вызываем метод square(), в качестве параметра указывает любое число

        System.out.println("----------");

   Rectangle rectangle = new Rectangle();
   rectangle.setRectangleDimens(20,10);     //вызываем метод с параметрами
        System.out.println(rectangle.rectangleArea());

        System.out.println("----------");

       Worker worker = new Worker("Максим","инженер", 30_000);
       worker.showInfo();

    }
}


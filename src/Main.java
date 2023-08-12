public class Main {

    public static void main(String[] args) {
     /*    System.out.println(MyMath.length(10));
        System.out.println(MyMath.area(10));
        System.out.println(MyMath.sum(4, 5, 6, 7, 8, 0, 5, 4, 3, 9));
 */

        Box boxOne = new Box();  //создаем новый объект классв Box
        boxOne.height = 10;     //обращаемся к полям класса и присваиваем значения
        boxOne.width = 10;
        boxOne.length = 10;
       double valueOne = boxOne.getVolume();  // вместо выражения boxOne.height * boxOne.width * boxOne.length;
        // создали метод для вычисления объема коробки и просто его вызовем

        System.out.println(valueOne);

        System.out.println("----------");

        Box boxTwo = new Box();  //создаем новый объект классв Box
        boxTwo.height = 20;     //обращаемся к полям класса и присваиваем значения
        boxTwo.width = 20;
        boxTwo.length = 20;
       // double valueTwo = boxTwo.height * boxTwo.width * boxTwo.length;
       // System.out.println(valueTwo);
        boxTwo.showVolume(); //здесь мы уже создали еще один метод невозращаемый (void) и просто его вызвали


        Box box3 = boxTwo;   //здесь мы не создали новый объект,
        // а просто указали что переменная box3 будет ссылаться на тот же объект, что и box2
        box3.width = 0;  //здесь мы работаеv все равно с объектом box2!
        //поэтому здесь и объем коробки2 будет =0.

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

        Dog bobik = new Dog();
        bobik.nameDog = "Бобик";
        bobik.breedDog = "Такса";
        bobik.ageDog = 2;
        bobik.weightDog = 3.6;
        String info = bobik.getMyDog();
        System.out.println(info);

        System.out.println("----------");

     Dog tobik = new Dog();
     tobik.speedDog = 5;
     tobik.getRun();

     System.out.println("----------");


    }

}

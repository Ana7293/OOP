package test;
import box.*;
import test.*;
import exsamples.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(exsamples.MyMath.length(10));
        System.out.println(exsamples.MyMath.area(10));
        System.out.println(exsamples.MyMath.sum(4, 5, 6, 7, 8, 0, 5, 4, 3, 9));

        System.out.println("----------");

       box.Box boxOne = new box.Box(34,67,55);  //создаем новый объект классв box.Box
       // boxOne.height = 10;     //обращаемся к полям класса и присваиваем значения
       // boxOne.width = 10;
      // boxOne.length = 10;
      double valueOne = boxOne.getVolume();  // вместо выражения boxOne.height * boxOne.width * boxOne.length;
                                               // создали метод для вычисления объема коробки и просто его вызовем
        System.out.println(valueOne);

     //   System.out.println("----------");

     //   box.Box boxTwo = new box.Box(10,5,7 );  //создаем новый объект классв box.Box
     //   boxTwo.height = 20;     //обращаемся к полям класса и присваиваем значения
      //  boxTwo.width = 20;
      //  boxTwo.length = 20;
       // double valueTwo = boxTwo.height * boxTwo.width * boxTwo.length;
       // System.out.println(valueTwo);
       // boxTwo.showVolume(); //здесь мы уже создали еще один метод невозращаемый (void) и просто его вызвали


      //  box.Box box3 = boxTwo;   //здесь мы не создали новый объект,
        // а просто указали что переменная box3 будет ссылаться на тот же объект, что и box2
     //   box3.width = 0;  //здесь мы работаеv все равно с объектом box2!
        //поэтому здесь и объем коробки2 будет =0.

      //  System.out.println("----------");

     /*   exsamples.Human human1 = new exsamples.Human();                     // создаем 3 объекта класса exsamples.Human, экземпляр класса
        human1.name ="Василий";
        human1.age = 50;
        human1.weight = 86.8;

        exsamples.Human human2 = new exsamples.Human();
        human2.name = "Иван";
        human2.age = 40;
        human2.weight = 75.4;

        exsamples.Human human3 = new exsamples.Human();
        human3.name = "Николай";
        human3.age = 25;
        human3.weight = 59.3;
        double averageAge = (human1.age + human2.age + human3.age) / 3.0;
        System.out.println(averageAge);

      System.out.println("----------");

        exsamples.Dog bobik = new exsamples.Dog();
        bobik.nameDog = "Бобик";
        bobik.breedDog = "Такса";
        bobik.ageDog = 2;
        bobik.weightDog = 3.6;
        String info = bobik.getMyDog();
        System.out.println(info);

        System.out.println("----------");

     exsamples.Dog tobik = new exsamples.Dog();
     tobik.speedDog = 5;
     tobik.getRun();

     System.out.println("----------");

     exsamples.Test test1 = new exsamples.Test ();
     int t1= test1.square(25);
     int t1a = test1.square10();
     System.out.println(t1);
     System.out.println(t1a);

     System.out.println("----------");

     exsamples.Test test2 = new exsamples.Test ();
     int t2 = test2.square10();
     System.out.println(t2);

     System.out.println("----------");

      box.Box boxThree = new box.Box(4,7,8);
     //boxThree.setDimens(19,25,47);
     boxThree.showVolume();

     System.out.println("----------");

     exsamples.Rectangle rectangleOne = new exsamples.Rectangle();
     rectangleOne.setRectangleDimens(12,45);
     double squareOne = rectangleOne.rectangleArea();
     System.out.println(squareOne);

     System.out.println("----------");

     exsamples.Worker workerOne = new exsamples.Worker("Настя", "Фармацевт", 30_000.0);
     workerOne.showInfo();

     System.out.println("----------");

    // exsamples.MyMath mathOne = new exsamples.MyMath(); //т.к методы статические нам не нужен объект класса
     int nasty = exsamples.MyMath.multiply(14,45);  //НазваниеКласса.названиеМетода(параметры);
     System.out.println(nasty);
     double tihon =exsamples.MyMath.multiply(34.0, 67.7);
     System.out.println(tihon);
     int andrew = exsamples.MyMath.multiply(5);
     System.out.println(andrew);

     System.out.println("----------");

     exsamples.Monster zurg1 = new exsamples.Monster();
     zurg1.getMonsterVoice();
     System.out.println(zurg1.hands + " " + zurg1.eyes + " " + zurg1.legs);

     System.out.println("----------");

     exsamples.Monster zurg2 = new exsamples.Monster(4,7,9);
     zurg2.getMonsterVoice(5);

     System.out.println("----------");

     exsamples.Monster zurg3 = new exsamples.Monster(8);
     zurg3.getMonsterVoice(3, "ХАХАХАААА");

     System.out.println("----------");

    box.Box current = new box.Box(10);
    box.Box anothertwo= new box.Box(3,7,5);
    current.compare(anothertwo);

     System.out.println("----------");

     box.Box surprise = new box.Box(6);
     box.Box mySurprise = new box.Box(surprise);
     surprise.showVolume();
     mySurprise.showVolume();

     System.out.println("----------");

     box.Box twin1 = new box.Box(5,7,4);   //создаем новую коробку с параметрами
     box.Box twin2 = twin1.copy();                        //и создаем копию этой коробки с помощью метода копи
     twin1.showVolume();                             //здесь new не указан, тк он уже есть в самом методе копи
     twin2.showVolume();

     System.out.println("----------");

     box.Box upp = new box.Box(7,5,2);   //создаем новую коробку с параметрами
     box.Box uppTwice = upp.increase();                        //и создаем еще одну, размеры только в 2 раза больше, чем у первой
     upp.showVolume();                             //здесь new не указан, тк он уже есть в самом методе копи
     uppTwice.showVolume();
*/
    System.out.println("----------");

   exsamples.Person onePers = new exsamples.Person("Настя", 34);
     onePers.setAgePers(-40); //тк значение <0 то возраст здесь не изменится, это прописано в методе в классе Персон
     System.out.println("Участник Марафона + " + onePers.getNamePers() + ", возраст " + onePers.getAgePers());




    }
}




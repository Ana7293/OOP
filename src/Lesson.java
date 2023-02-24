public class Lesson {
    public static void main(String[] args) {

        Box box1 = new Box();               // создаем объект класса Box, экземпляр класса
        box1.height = 10;
        box1.length = 10;
        box1.width = 10;
        double volume = box1.height * box1.length * box1.width;
        System.out.println(volume);

        System.out.println("----------");

        Box box2 = new Box();               // создаем 2-й объект класса Box, экземпляр класса
        box2.height = 9;
        box2.length = 9;
        box2.width = 9;
        double volume2 = box2.height * box2.length * box2.width;
        System.out.println(volume2);

        System.out.println("----------");

        Human human1 = new Human();
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
    }
}

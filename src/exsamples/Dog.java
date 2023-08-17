package exsamples;

public class Dog {
    String nameDog;
    String breedDog;
    double weightDog;
    int speedDog;
    int ageDog;
    String getMyDog () {
        return "Имя собаки: " + nameDog + ",\nПорода: " + breedDog + ",\nВозраст: " + ageDog + ",\nВес: " + weightDog + " кг.";
    }

   void getRun(){         //метод выводит слово бегу = скорости собаки
        String voice = "Бегу!";
        for (int i = 0; i < speedDog; i++) {
        System.out.println(voice);
    }
}
}
public class Dog {
    String nameDog;
    String breedDog;
    double weightDog;
    int speed;

    String getMyDog () {
        return "Имя собаки: " + nameDog + ", порода: " + breedDog + ", вес: " + weightDog + " кг.";
    }

    void getRun(){
        String voice = "Бегу!";
        for (int i = 0; i < speed; i++) {
        System.out.println(voice);
    }
}
}
public class Main {
    public static void main(String[] args) {

        Human person = new Human("Иван", 56);
        person.setAge(-40);
        System.out.println("Имя - " + person.getName()  + ". Возраст - " + person.getAge());

    }
}


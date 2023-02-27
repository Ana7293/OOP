public class Monster {
    int eyes;
    int hands;
    int legs;

    Monster() {
        this(2);
    }
    Monster(int quantity){
        this(quantity, quantity, quantity);
    }
    Monster(int eyes, int hands, int legs){
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }
 void getMonsterVoice() {
     getMonsterVoice(1);
 }
 void getMonsterVoice(int repet) {
     getMonsterVoice(repet, "Бууууу!!!");
 }
    void getMonsterVoice(int repet, String sound) {
        for (int i = 0; i < repet; i++) {
            System.out.println(sound);
        }
    }


}

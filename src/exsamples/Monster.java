package exsamples;

public class Monster {
    int eyes;
    int hands;
    int legs;

    Monster(int eyes, int hands, int legs){
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }
    Monster(int crazy){
        this(crazy, crazy, crazy);
    }
    Monster() {
        this(2);
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

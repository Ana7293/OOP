package exsamples;

public class Person {
   private String namePers;
   private int agePers;

    public Person(String namePers, int agePers) {
        this.namePers = namePers;
        this.agePers = agePers;
    }

    public void setAgePers( int agePers) {           //set - чтобы можно было установить значения приватным полям
        if(agePers >= 0) {
            this.agePers = agePers;
        }

    }

    public String getNamePers() {                  //get - чтобы можно было получить значения приватных полей (возращают значение)
        return namePers;
    }

    public int getAgePers() {
        return agePers;
    }
}

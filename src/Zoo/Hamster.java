package Zoo;

/**
 * Created by Gvozd on 29.11.2015.
 */
public class Hamster extends DomesticAnimal {
    public Hamster(int age, int weight, String color, String name, boolean isVatinated) {
        super(age, weight, color, name, isVatinated);
    }

    public String getType(){
        return "hamster"+super.getType();
    }
}

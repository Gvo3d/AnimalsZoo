package Zoo;

/**
 * Created by Gvozd on 29.11.2015.
 */
public class Giraffe extends WildAnimal {
    public Giraffe(int age, int weight, String color) {
        super(age, weight, color, false);
    }

    public String getType(){
        return "giraffe"+super.getType();
    }
}

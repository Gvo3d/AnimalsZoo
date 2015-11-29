package Zoo;

/**
 * Created by Gvozd on 29.11.2015.
 */
public class Wolf extends WildAnimal {
    public Wolf(int age, int weight, String color) {
        super(age, weight, color, true);
    }

    public String getType(){
        return "wolf"+super.getType();
    }
}

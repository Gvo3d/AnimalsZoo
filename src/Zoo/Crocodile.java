package Zoo;

/**
 * Created by Gvozd on 29.11.2015.
 */
public class Crocodile extends WildAnimal {
    public Crocodile(int age, int weight, String color) {
        super(age, weight, color, true);
    }

    @Override
    public String getVoice(){
        return "I'm a crocodile, so piss off!";
    }

    public String getType(){
        return "crocodile"+super.getType();
    }
}

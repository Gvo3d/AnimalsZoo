package Zoo;

/**
 * Created by Gvozd on 29.11.2015.
 */
public class Lion extends WildAnimal {
    public Lion(int age, int weight, String color) {
        super(age, weight, color, true);
    }

    @Override
    public String getVoice(){
        return "Ar-r-r-r-r-r-r-r!!!";
    }

    public String getType(){
        return "lion"+super.getType();
    }
}

package Zoo;

/**
 * Created by Gvozd on 29.11.2015.
 */
public class Fish extends DomesticAnimal{
    public Fish(int age, int weight, String color, String name, boolean isVatinated) {
        super(age, weight, color, name, isVatinated);
    }
    
    @Override
    public String getVoice(){
        return "....";
    }

    public String getType(){
        return "fish"+super.getType();
    }
}

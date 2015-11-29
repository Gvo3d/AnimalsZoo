package Zoo;

/**
 * Created by Gvozd on 29.11.2015.
 */
public class Dog extends DomesticAnimal{
    public Dog(int age, int weight, String color, String name, boolean isVatinated) {
        super(age, weight, color, name, isVatinated);
    }

    @Override
    public String getVoice(){
        return super.getVoice()+", Woof!";
    }

    public String getType(){
        return "dog"+super.getType();
    }
}

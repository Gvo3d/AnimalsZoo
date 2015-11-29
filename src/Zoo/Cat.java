package Zoo;

/**
 * Created by Gvozd on 29.11.2015.
 */
public class Cat extends DomesticAnimal {
    public Cat(int age, int weight, String color, String name, boolean isVatinated) {
        super(age, weight, color, name, isVatinated);
    }

    @Override
    public String getVoice(){
        return super.getVoice()+", Meow!";
    }

    public String getType(){
        return "cat"+super.getType();
    }
}

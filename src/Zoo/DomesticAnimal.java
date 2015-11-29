package Zoo;

/**
 * Created by Gvozd on 29.11.2015.
 */
public abstract class DomesticAnimal extends Animal{
    private String name;
    private boolean isVatinated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVatinated() {
        return isVatinated;
    }

    public void setIsVatinated(boolean isVatinated) {
        this.isVatinated = isVatinated;
    }

    public DomesticAnimal(int age, int weight, String color, String name, boolean isVatinated) {
        super(age, weight, color);
        this.name = name;
        this.isVatinated = isVatinated;
    }

    @Override
    public String getVoice(){
        return super.getVoice()+"my name is "+name;
    }

    public String getType(){
        return " by name "+name+" is (Domestic)";
    }
}

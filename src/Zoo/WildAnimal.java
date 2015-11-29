package Zoo;

/**
 * Created by Gvozd on 29.11.2015.
 */
public abstract class WildAnimal extends Animal{
    private boolean isPredator;

    public WildAnimal(int age, int weight, String color, boolean isPredator) {
        super(age, weight, color);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setIsPredator(boolean isPredator) {
        this.isPredator = isPredator;
    }

    @Override
    public String getVoice() {
        String predator=".";
        if (isPredator) {
            predator = " and I am angry.";
        }
        return super.getVoice()+"i am a wild animal"+ predator;
    }

    public String getType(){
        return " is (Wild)";
    }
}

package Zoo;

/**
 * Created by Gvozd on 29.11.2015.
 */
public class GuideDog extends Dog {
    private boolean isTrained;

    public GuideDog(int age, int weight, String color, String name, boolean isVatinated, boolean isTrained) {
        super(age, weight, color, name, isVatinated);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setIsTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }

    @Override
    public String getVoice(){
        return super.getVoice()+" I can take you home!";
    }

    public void getHome(){
        System.out.println("I'm taking you home!");
    }

    public String getType(){
        return "guide "+super.getType();
    }
}

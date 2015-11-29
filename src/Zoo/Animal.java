package Zoo;

/**
 * Created by Gvozd on 29.11.2015.
 */
public abstract class Animal {
    private static int idCounter;
    private int id;
    private int age;
    private int weight;
    private String color;

    public Animal(int age, int weight, String color) {
        this.id=idCounter;
        idCounter++;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVoice(){
        return "Hello, ";
    }

    public abstract String getType();

}

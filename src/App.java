import Zoo.*;
/**
 * Created by Gvozd on 29.11.2015.
 */
public class App {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        Cat an1 = new Cat(5,4,"Green","Petrosyan", false);
        GuideDog an2 = new GuideDog(8,10,"Brown","Mishka", true, true);
        Fish an3 = new Fish(2,1,"Red","ZigmundFreude", false);
        Lion an4 = new Lion(8,2000,"Yellow");
        Crocodile an5 = new Crocodile(7,140,"Green");
        Wolf an6 = new Wolf (15,400,"Blue");

        myZoo.addAnimal(an1);
        myZoo.addAnimal(an2);
        myZoo.addAnimal(an3);
        myZoo.addAnimal(an4);
        myZoo.addAnimal(an5);
        myZoo.addAnimal(an6);

        myZoo.animalsToString();
        System.out.println();
        myZoo.getAllVoices();
    }

}

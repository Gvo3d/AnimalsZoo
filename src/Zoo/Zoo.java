package Zoo;

/**
 * Created by Gvozd on 29.11.2015.
 */
public class Zoo {
    private Animal[] animals;

    public Zoo() {
        animals = new Animal[0];
    }

    public void getAllVoices(){
        for (int i=0; i<animals.length; i++) System.out.println(animals[i].getVoice());
    }

    public void animalsToString(){
        for (int i=0; i<animals.length; i++) System.out.println("N "+animals[i].getId()+" "+animals[i].getType());
    }

    public boolean isTrimmed (){
        int zooCapacity=0;
        for (int i=0; i<animals.length; i++) {
            if (animals[i]!=null) zooCapacity++;
        }
        if (zooCapacity==animals.length) return true;
        return false;
    }

    private void trimZoo(){
        int newZooCapacity=0;
        for (int i=0; i<animals.length; i++) {
            if (animals[i]!=null) newZooCapacity++;
        }
        Animal[] newZoo = new Animal[newZooCapacity];
        int newZooIdVariable =0;
        for (int i=0; i<animals.length; i++) {
            if (animals[i]!=null) {
                newZoo[newZooCapacity]=animals[i];
                newZooIdVariable++;
            }
        }
        animals=newZoo;
    }

    private void zooChangeCapacity(int newcapacity){
        Animal[] newZoo = new Animal[newcapacity];
        System.arraycopy(animals, 0, newZoo, 0, animals.length);
        animals=newZoo;
    }

    public void addAnimal (Animal newanimal){
    zooChangeCapacity(animals.length+1);
        animals[animals.length-1]= newanimal;
    }

    public void deleteAnimalById (int animalId){
        animals[animalId]=null;
        trimZoo();
    }

    public void deleteAnimalByType (String animalType){
        for (int i=0; i<animals.length; i++){
            if (animals[i].getType().equals(animalType)) animals[i]=null;
        }
        trimZoo();
    }

}

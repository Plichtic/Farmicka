import java.util.ArrayList;

public class Farm {
    private int flowerArea;
    private int aktualArea;
private ArrayList <Animal> zviratka;
private ArrayList <Flower> rostlinky;
public void addAnimal(Animal animal){
    zviratka.add(animal);
}
public void removeAnimal(Animal animal){
    zviratka.remove(animal);
}
public void addRostlinka(Flower flower){
    if (flower.getNeededArea()+aktualArea<=flowerArea) {
        rostlinky.add(flower);
    } else {
        System.out.println("Not enough flower area ");
    }
}
public void removeRostlinka(Flower flower){
    rostlinky.remove(flower);
}


}

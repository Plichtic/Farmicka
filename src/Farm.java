import java.util.ArrayList;

public class Farm {
private ArrayList <Animal> zviratka;
private ArrayList <Flower> rostlinky;
public void addAnimal(Animal animal){
    zviratka.add(animal);
}
public void removeAnimal(Animal animal){
    zviratka.remove(animal);
}
public void addRostlinka(Flower flower){
    rostlinky.add(flower);
}
public void removeRostlinka(Flower flower){
    rostlinky.remove(flower);
}

}

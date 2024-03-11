import java.util.ArrayList;

public class Barn {
        ArrayList <Animal> bigDogs;
        ArrayList <Animal> smallDogs;

        public void addBigDog(Animal animal){
            if (animal.getSize()==Size.BIG||bigDogs.size()<10){
                bigDogs.add(animal);
            }else{
                System.out.println("not big or full ");
            }
        }
    public void addSmallDog(Animal animal){
        if (animal.getSize()==Size.SMALL||smallDogs.size()<10){
            smallDogs.add(animal);
        }else{
            System.out.println("not small or full ");
        }
    }
}

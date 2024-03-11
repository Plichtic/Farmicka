import java.util.ArrayList;

public class Barn {
        ArrayList <Animal> bigDogs;
        ArrayList <Animal> smallDogs;

        public void addBigDog(Animal animal){
            if (animal.getSize()==Size.BIG){
                bigDogs.add(animal);
            }else{
                System.out.println("not big ");
            }
        }
}

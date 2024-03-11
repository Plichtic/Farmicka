public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;
    protected String zvuk;

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
    public void pohladit(Animal animal){
        System.out.println(animal.zvuk);
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public String getSpecialCare() {
        return specialCare;
    }
    public void sell(Animal animal,Farm farm){
        farm.removeAnimal(animal);
    }
    public void buy(Farm farm, Animal animal){
        farm.addAnimal(animal);
    }
}

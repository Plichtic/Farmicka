public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

    public void water(Flower f){
        f.chanceOfGrowth += 5;
    }
    public void seed(Farm farm,Flower flower){
        farm.addRostlinka(flower);
    }
    public void harvest(Flower flower,Farm farm){
        farm.removeRostlinka(flower);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getNeededArea() {
        return neededArea;
    }

    public double getChanceOfGrowth() {
        return chanceOfGrowth;
    }
}

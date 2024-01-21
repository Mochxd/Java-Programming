package Chapter10;

public class Apple extends Fruit{
    public Apple(){
        setCalories(95);
    }
    public void removeSeeds(){
        System.out.print("Apple is removed from seeds!");
    }

    @Override
    public void makeJuice(){
        System.out.print("Apple juice is the best juice in the world!");
    }
}

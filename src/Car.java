public class Car {
    private String model;
    private double weight;
    private int wheels;
    private String engine;

    public Car(String model, double weight, int wheels, String engine) {
        this.model = model;
        this.weight = weight;
        this.wheels = wheels;
        this.engine = engine;
    }

    public String getModel(){
        return model;
    }
    public double getWeight (){
        return weight;
    }
    public int getWheels (){
        return wheels;
    }
    public String getEngine(){
        return engine;
    }

    public void  setModel(String model){
        this.model = model;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }


}
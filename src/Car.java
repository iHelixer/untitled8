public class Car implements Drivable {
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

    public void start(){
        System.out.println("The car is starting");
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

    public void increaseWeight(double amount){
        this.weight += amount;
        if(this.weight > 160.5){
            System.out.println("Болід заважкий");
        }else {
            System.out.println("Вага боліду припустима");
        }
    }


    public Car(String model){
        this.model=model;
    }

    @Override
    public void drive(){
        System.out.println("the car " + model + "is driving");
    }




}


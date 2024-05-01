public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(26, "Charles Leclerc", 184, false);
        Team team = new Team("Ferrari", "Italy", 4988, "Enzo Ferrari");
        Car car = new Car("SF-24", 150.1, 4, "V6");


        driver.setCar(car);
        team.setDriver(driver);


        System.out.println("Driver: " + driver.getName() + ", Age: " + driver.getAge() + ", Height: " + driver.getHeight() + " cm, Champion: " + driver.isChampion());
        System.out.println("Team: " + team.getName() + ", Country: " + team.getCountry() + ", People: " + team.getPeople() + ", Founder: " + team.getFounder());
        System.out.println("Car: " + car.getModel() + ", Weight: " + car.getWeight() + " kg, Wheels: " + car.getWheels() + ", Engine: " + car.getEngine());
    }
}
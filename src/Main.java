public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(26, "Charles Leclerc", 184, false);
        Team team = new Team("Ferrari", "Italy", 4988, "Enzo Ferrari");
        Car car = new Car("SF-24", 150.1, 4, "V6");


        driver.setCar(car);
        team.setDriver(driver);

        if(team.isWinner()){
            System.out.println("Команда переможець");
        }else{
            System.out.println("Команда не є переможцем");
        }

        car.increaseWeight(10.5);


        driver.setTeamName("Ferrari");
        if("Ferrari".equals(driver.getTeamName())){
            System.out.println("Гонщик в команді Ferrari");
        }else{
            System.out.println("Гонщик не в команді в Ferrari");
        }


        RaceCar raceCar =  new RaceCar("F1", 700, 4, "V8", true);
        raceCar.start();
        raceCar.useTurbo();




        System.out.println("Driver: " + driver.getName() + ", Age: " + driver.getAge() + ", Height: " + driver.getHeight() + " cm, Champion: " + driver.isChampion());
        System.out.println("Team: " + team.getName() + ", Country: " + team.getCountry() + ", People: " + team.getPeople() + ", Founder: " + team.getFounder());
        System.out.println("Car: " + car.getModel() + ", Weight: " + car.getWeight() + " kg, Wheels: " + car.getWheels() + ", Engine: " + car.getEngine());
    }
}
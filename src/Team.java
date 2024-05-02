public class Team {
    private String name;
    private String country;
    private int people;
    private String founder;
    private Driver driver;

    public Team(String name, String country, int people, String founder) {
        this.name = name;
        this.country = country;
        this.people = people;
        this.founder = founder;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }


    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }
    public int getPeople(){
        return people;
    }
    public String getFounder(){
        return founder;
    }


    public void  setName(String name){
        this.name = name;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public void setPeople(int people){
        this.people = people;
    }
    public void setFounder(String founder){
        this.founder = founder;
    }

    public boolean isWinner(){
        return people > 5000;
    }



}
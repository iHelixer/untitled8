public class Driver {
    private int age;
    private String name;
    private int height;
    private boolean champion;
    private Car car;
    private String teamName;


    public Driver(int age, String name, int height, boolean champion) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.champion = champion;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public Car getCar() {
        return car;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setChampion(boolean champion) {
        this.champion = champion;
    }


    public boolean isChampion() {
        return champion;
    }


    public String getTeamName(){
        return teamName;
    }

    public void setTeamName(String  teamName){
        this.teamName = teamName;
    }


}
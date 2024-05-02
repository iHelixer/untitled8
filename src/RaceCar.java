public class RaceCar extends Car {
    private boolean turbo;

        public RaceCar(String model, double weight, int wheels, String engine, boolean turbo){
            super(model, weight, wheels, engine);
            this.turbo = turbo;
        }

        public void useTurbo(){
            if(turbo){
                System.out.println("DRS is activated ");
            }else{
                System.out.println("DRS is not activated ");
            }
        }




}

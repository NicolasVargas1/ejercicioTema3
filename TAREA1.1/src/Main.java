public class Main {
    public static void main(String[] args){

        Car myCar = new Car();
        
        System.out.println(myCar.numberOfDoors);

    }
    static class Car {
        public int numberOfDoors = 4;
        public void incrementDoors() {
            this.numberOfDoors++;
        }
    }
}
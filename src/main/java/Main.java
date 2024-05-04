public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        int neueVariable = 1;

        Car car1 = new Car("red", "BMW", 5);
        Car car2 = new Car("green", "Audi", 3);
        Car car3 = new Car("blue", "VW", 3);

        Car car4 = new Car("yellow", "Renault", 4);

<<<<<<< HEAD
        factory.buildCar(car1); 
=======
        //An dieser Stelle befindet sich nun ein Array
        //Dieses Array wird mit einem Sortieralgorithmus sortiert
        //Optimaler Code Yippie

        factory.buildCar(car1);
>>>>>>> c0bc0a4acbb3726d7d2d0af0f8dd298c966fd356
        factory.buildCar(car2);

    }
}


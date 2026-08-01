// a constructor where a parameter name shadows a field, fixed using this.

public class ThisKeyword {
    public static void main(String[] args) {
        System.out.println("Demonstrating the use of 'this' keyword");
        
        // The constructor parameter 'carModel' will shadow the instance field 'carModel'.
        Car car = new Car("Pagani Zonda R");
        car.display();
    }

    static class Car { 
        String carModel; // instance field

        public Car(String carModel) {  //The parameter 'carModel' SHADOWS the instance field 'carModel'.
        System.out.println("-> Constructor called with parameter name = \"" + carModel + "\"");
        System.out.println("   Before assignment, instance field this.carModel = \"" + this.carModel + "\"");

        // If we did "carModel = carModel;", we would be assigning the parameter to itself.
        // The instance field would remain null.

        // CORRECT: Use 'this.carModel' to refer to the instance field.
        // 'carModel' on the right side refers to the parameter.
        this.carModel = carModel;

        System.out.println("After assignment, instance field this.carModel = \"" + this.carModel + "\"");
        }

        public void display() { 
            System.out.println("Car Model: " + this.carModel);
        }
    }
}
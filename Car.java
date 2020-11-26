public class Car {
    double carprice;
    String carcolor;
    Car(double carprice, String carColor){
        this.carprice=carprice;
        this.carcolor=carColor;
    }
    public double calculateSalePrice(){
        return carprice;
    }
}
class Truck extends Car {
    double weight;

    Truck(double carprice, String carColor, double weight) {
        super(carprice, carColor);
        this.weight = weight;
    }

    public double calculateSalePrice() {
        if (weight > 2000) {
            return carprice - (carprice * 0.1);
        } else {
            return carprice - (carprice + 0.2);
        }
    }
}
    class Sedan extends Car{
        double length;
        Sedan(double carprice, String carColor,double length) {
            super(carprice, carColor);
            this.length=length;
        }
        @Override
        public double calculateSalePrice() {
            if(this.length>20){
                return carprice-(carprice*0.05);
            }else{
                return carprice-(carprice*0.1);
            }
        }
        public static void main(String[] args) {
            Car Truck=new Truck(350000,"White",16000);
            System.out.println("The new price of the truck with discount is "+Truck.calculateSalePrice());
            Car Sedan=new Sedan(100,"Blue",190);
            System.out.println("The new price of Sedan with discount is "+Sedan.calculateSalePrice());
        }

    }


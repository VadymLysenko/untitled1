package day_46_encapsulation;

public class Car {

        private String model;
        private int year;
        private int  mileage;
        private int price;

        //setter method
        public void setModel(String carModel) {
            model = carModel;
        }

        // getter method for model
        public String  getModel() {
           return   model;
        }
        // setter for year
        public void setYear(int year) {
                this.year = year;
        }
        public int getCarYear() {
                return year;
        }
        public int getMileage() {
                return mileage;
        }
        public void setMileage(int mileage) {
                this.mileage = mileage;
        }
        public int getPrice() {
                return price;
        }
        public void setPrice(int price) {
                this.price = price;
        }
        public String toString() {
                return "Car{"+ "model="+model+""+",year="+year+
                        ",mileage="+mileage+'}';
        }
}

class Cardealership {
    public static void main(String[] args) {
        Car c = new Car();
        c.setPrice(2000.0);
        c.printPrice();
    }
}

// make this a double as a homework
class Car {
    double price;

    // void class doesn't have return
    void setPrice(double newPrice) {
        price = newPrice;
    }

    // this. something is the referring to the first variable
    // don't have to use this. and make a new variable, some people do because they
    // don't want to make a new variable
    void printPrice() {
        System.out.println(this.price);
    }
}
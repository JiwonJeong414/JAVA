class questions {
    public static void main(String[] args) {
        Car c = new Car();
        c.setName("Ford");
        c.setPrice(2000.0);

        c.print();
        c.printwithDiscount(10);
    }
}

class Car {
    String name;
    double price;

    void setName(String name) {
        this.name = name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void print() {
        System.out.println(this.name + " - $" + this.price);
    }

    void printwithDiscount(int discount) {
        System.out.println(this.name + " - $" + this.price + " -> " + (this.price - this.price / discount));
    }
}
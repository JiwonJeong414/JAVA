class test {
    public static void main(String[] args) {
        Car c = new Car();
        c.setName("Ford");
        c.setprice(2000);

        c.print();
        c.printwithDiscount(10);
    }
}

class Car {
    double price;
    String name;

    void setName(String name) {
        this.name = name;
    }

    void setprice(double price) {
        this.price = price;
    }

    void print() {
        System.out.println(name + " - $" + price);
    }

    void printwithDiscount(int Discount) {
        System.out.println(name + " - $" + price + " --> " + (price - (price / Discount)));
    }
}
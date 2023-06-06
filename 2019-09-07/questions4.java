class questions4 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat(); // ham-ham

        p.play(); // woof-woof
        p.play(); // woof-woof
        p.play(); // woof-woof
        p.play(); // too hungry

        p.eat(); // ham-ham
        p.eat(); // not hungry

        p.play(); // woof-woof
        p.play(); // woof-woof
        p.play(); // woof-woof
        p.play(); // too hungry
    }
}

class Puppy {
    int hungerlevel;

    void eat() {
        if (hungerlevel < 1) {
            hungerlevel = hungerlevel + 3;
            System.out.println("ham-ham");
        } else {
            System.out.println("not hungry");
        }
    }

    void play() {
        if (hungerlevel == 0) {
            System.out.println("too hungry");
        } else {
            hungerlevel--;
            System.out.println("woofwoof");
        }
    }
}

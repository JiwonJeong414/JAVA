class questions3 {
    public static void main(String[] args) {
        Team t = new Team();

        t.log(5, 3); // 5-3 win
        t.log(2, 2); // 2-2 draw
        t.log(1, 2); // 1-2 loss

        t.printRecord();
    }
}

class Team {
    int win;
    int draw;
    int loss;

    void log(int a, int b) {
        if (a > b) {
            win++;
        }
        if (b > a) {
            loss++;
        }
        if (a == b) {
            draw++;
        }
    }

    void printRecord() {
        System.out.println(win + "W" + loss + "L" + draw + "D");
        System.out.println("Winning% = " + (double) win / (win + loss) * 100);
    }
}
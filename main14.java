class Superclass{
    int number = 56;
}

class subclass extends Superclass {
    int number = 96;

    void printnumber() {
        System.out.println(super.number);
    }
}

class main14 {
    public static void main(String[] args) {
        subclass obj = new subclass();
        obj.printnumber();
    }
}
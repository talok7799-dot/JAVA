class Mammals {
    void mam() {
       System.out.println( "Inside Mammals Class");
    }
}

class Lionl extends Mammals {
    void roar() {
        System.out.println( "Inside Lion class ");
    }
}

class Human extends Mammals {
    void hum() {
        System.out.println("Inside Human");
    }
}

class Main10 {
     public static void main(String args[]) {
        Lionl obj = new Lionl();
      
        obj.roar();
        obj.mam();
     }
    }

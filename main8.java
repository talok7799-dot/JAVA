class Parent {
    int age, id;
    String name;

    void naming(String name) {
        System.out.println("Name:" + name);
    }
}
class child extends Parent {
     void ageN(int age) {
         System.out.println("Age of student is:" + age);
     }
}
class Main8 {
    public static void main(String[] er) {
           child s = new child();
           s.naming( "Alok");
           s.ageN( 15);
    }
}

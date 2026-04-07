class parent{
    public void sayHello(){
        System.out.println("Hello from parent class");
    }
}

class child extends parent{
    public void sayHello(){
        System.out.println("Hello from child class");
    }
}

class main13{
    public static void main(String[] args) {
        parent p = new child();
        p.sayHello(); 
           }
}
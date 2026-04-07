class parent {
    protected void protect() {
        System.out.println("This is a protected method in the parent class");
    }
}

class child extends parent {
    private void privateMethod() {
        System.out.println("This is a private method in the child class");
    }
}

class main15{
    public static void main(String[] args){
        parent obj = new parent();
        obj.protect();
    }
}
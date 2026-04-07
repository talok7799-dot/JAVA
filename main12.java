class student
{
    int id;
    String name;
    float stipend;

    student(){}

    student(int id, String name){
        this.id=id;
        this.name=name;
    }
    student(int id, String name, float stipend)
    {
        this.id=id;
        this.name=name;
        this.stipend=stipend;
    }

    void DisplayDetails(){
        System.out.println(this.id + " | " + this.name + " | " + this.stipend);
    }
}

class main12
{
    public static void main(String[] args)
    {
        student s1 = new student(1, "Alice", 1000.0f);
        student s2 = new student(2, "Bob");
        student s3 = new student();

        s1.DisplayDetails();
        s2.DisplayDetails();
        s3.DisplayDetails();
    }
}
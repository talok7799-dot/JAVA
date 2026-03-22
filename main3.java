import java.util.Scanner;

class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello User please Enter your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter your unlucky number");
        int lucky = sc.nextInt();

        System.out.println("Hello " + name + ", Your unlucky number " + lucky + " shows you are really hardworking. Keep it up!");
    }
}
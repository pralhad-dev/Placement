package OOPs;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Pralhad", 26, 75);
        student.displayInfo();

        Rectangle rectangle = new Rectangle(4,5);
        Rectangle square = new Rectangle(5);

        System.out.println("Rectangle:"+rectangle.getArea());
        System.out.println("Square:"+square.getArea());



        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.makeSound();
        dog.makeSound();


        Shape circle = new Circle(5);
        Shape c = new Rectangle1(4,5);

        System.out.println("Circle:" + circle.calculateArea());
        System.out.println("Rectangle:" + c.calculateArea());

        System.out.println("================");

        CreditCards cards = new CreditCards();
        Paypal paypal = new Paypal();
        cards.makePayment(5000);
        paypal.makePayment(45700);
        System.out.println("================");

        BankAccount bankAccount = new BankAccount("Pralhad",5000);
        bankAccount.deposit(5000);
        bankAccount.withdraw(2000);


    }
}

 class Animal {
    static void eat () {
        System.out.println("Aniaml eat");
    }
}
class Dog extends Animal{
    static void eat() {
        System.out.println("Dog bark");
    }
}
 class SingleInheritance {
     public static void main(String[] args) {
         Animal  d = new Dog();
         d.eat();
     }
}


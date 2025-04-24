package OOPs;

 class Animal {
     void makeSound() {
         System.out.println("Animal sounds");
     }
 }

 class Dog extends Animal {

     @Override
     void makeSound() {
         System.out.println("Dog barking!!");
     }
 }



package practice;

public abstract class Animal {
    abstract void soundOfAnimal();
}
class Cat extends Animal{
    void soundOfAnimal(){
        System.out.println("Cat sounds: Meoh Meoh");
    }
}
class Dog extends Animal {
    void soundOfAnimal(){
        System.out.println("Dog sounds: Bow Bow");
    }
}
class Main{
    public static void main(String ar[]){
        Animal am;
        am= new Cat();
        am.soundOfAnimal();
        am= new Dog();
        am.soundOfAnimal();
    }
}

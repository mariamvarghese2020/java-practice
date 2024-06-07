package java_design_pattern;

interface Animal{
  void sound();
}
class Dog implements Animal{
  Dog Dog(){
    return new Dog();
  }
  @Override
  public void sound() {
    System.out.println("woof");
  }

}
class Lion implements Animal{
  @Override
  public void sound(){
    System.out.println("roar");
  }
}
interface AnimalFactory {
  Animal createAnimal();
}

class DogFactory implements AnimalFactory {
  @Override public Animal createAnimal()
  {
    return new Dog();
  }
}

class LionFactory implements AnimalFactory {
  @Override public Animal createAnimal()
  {
    return new Lion();
  }
}
public class D2Factory {
  public static void main(String[] args) {
    AnimalFactory dogFactory = new DogFactory();
    Animal dog = dogFactory.createAnimal();
    dog.sound();

    AnimalFactory LionFactory = new LionFactory();
    Animal cat = LionFactory.createAnimal();
    cat.sound();
  }
}

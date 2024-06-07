package java_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class D3Observer {
  // Observer interface
  interface Observer {
    void update(int value);
  }

  // Subject interface
  interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
  }

  // Concrete Observer class
  static class ConcreteObserver implements Observer {
    @Override
    public void update(int value) {
      System.out.println("Value changed to " + value);
    }
  }

  // Concrete Subject class
  static class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int value;

    public void setValue(int value) {
      this.value = value;
      notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
      observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
      observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
      for (Observer observer : observers) {
        observer.update(value);
      }
    }
  }

  // Client code

    public static void main(String[] args) {
      ConcreteSubject subject = new ConcreteSubject();

      // Create observers and register them
      Observer observer1 = new ConcreteObserver();
      subject.registerObserver(observer1);

      Observer observer2 = new ConcreteObserver();
      subject.registerObserver(observer2);

      // Modify the value of the subject, which triggers notifications to all observers
      subject.setValue(10);

      // Remove one observer and modify the value again
      subject.removeObserver(observer1);
      subject.setValue(20);
    }
  }


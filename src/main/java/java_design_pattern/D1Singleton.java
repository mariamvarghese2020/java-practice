package java_design_pattern;

class Singleton {
  private static Singleton singleton;
  Singleton()
  {

  }
  public static Singleton getInstance(){
    if(singleton==null){
      singleton=new Singleton();
    }
    return singleton;
  }

}

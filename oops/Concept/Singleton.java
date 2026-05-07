//singleton is a class which can be used to create only one object
//so therefore we need to stop people from calling the constructor

public class Singleton {
  private Singleton() {

  }

  private static Singleton instance;

  public static Singleton getInstance() {
    // check if one obj only is created or not
    if (instance == null) {
      instance = new Singleton();
    }

    return instance;
  }
}

package headfirst.strategy;

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  public Duck() {
    
  }
  public void setFyBehavior(FlyBehavior fb) {
    flyBehavior=fb;
    
  }
  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior=qb;
  }
  
  abstract void display();
  public void performFly(){
    flyBehavior.fly();
  }
  public void perfomQuack(){
    quackBehavior.quack();
  }
  public void swim() {
     System.outprintln("All ducks swim");
  }
  
}
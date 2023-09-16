public class Person {
  private double strength;
  private double intelligence;
  private double energy;
  private GameItem carriedItem;
  
  public Person(double strength, double intelligence, double energy) {
    this.strength = strength;
    this.intelligence = intelligence;
    this.energy = energy;
  }
  
  public double getStrength() {
    return strength;
  }
  
  public double getIntelligence() {
    return intelligence;
  }
  
  public double getEnergy() {
    return energy;
  }
  
  public boolean pickup(GameItem item) {
    if (item.getWeight() < this.strength) {
      this.carriedItem = item;
      return true;
    }
    return false;
  }
  
  public GameItem drop() {
    GameItem droppedItem = this.carriedItem;
    this.carriedItem = null;
    return droppedItem;
  }
  
  public void eat(Food food) {
    this.energy += food.getCalories();
  }
}
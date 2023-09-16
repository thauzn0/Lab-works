public abstract class Food extends GameItem {
  private int calories;
  
  public Food(String name, double weight, int calories) {
    super(name, weight);
    this.calories = calories;
  }
  
  public int getCalories() {
    return calories;
  }
}

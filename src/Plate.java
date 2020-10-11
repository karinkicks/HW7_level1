public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n, boolean satiety) {
        if ((food - n)<0){
            System.out.println("В тарелке недостаточно еды");
        }else {
            food -= n;
            satiety=true;
        }
        return satiety;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void addFood(int n){
        food+=n;
    }

}

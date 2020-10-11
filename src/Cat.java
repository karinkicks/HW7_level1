public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety=false;
    }
    public void eat(Plate p) {
        System.out.println(this.name + " начинает есть из тарелки");
        satiety=p.decreaseFood(appetite, satiety);
        if (satiety==true){
            System.out.println(this.name+" сыт");
        }
        else {
            System.out.println(this.name +" голоден");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}

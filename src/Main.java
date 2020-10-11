public class Main {

    public static void main(String[] args) {

        Cat cat[] = new Cat[]{new Cat("Barsik", 20),
                    new Cat("Rizhik", 10),
                    new Cat("Ponchik",30),
                    new Cat("Pushok",60)};
        Plate plate = new Plate(100);
        for(int i=0;i<cat.length;i++){
        plate.info();
        cat[i].eat(plate);
        plate.info();}
        plate.addFood(100);
        plate.info();

    }
}

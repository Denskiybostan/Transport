public class Truck extends Transport implements ChangingTires {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Truck() {

    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void updateTyre(Car[] cars) {

    }

    @Override
    public void updateTyre(Truck[] trucks) {

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

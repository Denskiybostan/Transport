public class Car extends Transport implements ChangingTires {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car() {
        super();
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
}

public class Bicycle extends Transport implements ChangingTires {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Bicycle() {

    }

    @Override
    public void updateTyre(Car[] cars) {

    }

    @Override
    public void updateTyre(Truck[] trucks) {

    }
}


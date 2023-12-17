public interface ChangingTires {
    public default void updateTyre() {
        System.out.println("Меняем покрышку");
}
    void updateTyre(Car[] cars);
    void updateTyre (Truck[] trucks);
}



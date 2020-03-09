public class Audi extends Car {
    @Override
    public void colour() {
        String colour="Black";
    }

    @Override
    public void wheels() {
        int wheels = 4;
    }

    public void ride() {
        System.out.println(this.equipment2);
    }
}
public class Volkswagen extends Car {
    @Override
    public void colour() {
        String colour = "Blue";
    }

    public void ride() {
        System.out.println(this.equipment);
    }

    @Override
    public void wheels() {
        System.out.println(this.wheels);
    }
}

public class Electra extends Bicycle {
    @Override
    public void wheels(){
        System.out.println(this.wheels);
    }
    public void ride(){
        System.out.print(this.diameter1);
        System.out.print(" - diameter of wheels");

    }
    @Override
    public void colour() {
        String colour="silver";
    }
}
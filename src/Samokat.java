public class Samokat extends Bicycle {
    @Override
    public void colour() {

    }
    @Override
    public void ride(){
        System.out.print(this.diameter);
        System.out.print(" - diameter of wheels");
    }
    public void wheels(){
        System.out.println(this.wheels);
    }
}

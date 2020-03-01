public abstract class Railway implements Riding {
    @Override
    public void Ride() {

    }
    public class Cart extends Railway {
        @Override
        public void Ride() {
            super.Ride();
        }
    }

}

public abstract class Railway implements Riding {
    @Override
    public void ride() {

    }
    public class Cart extends Railway {
        @Override
        public void ride() {
            super.ride();
        }
    }

}

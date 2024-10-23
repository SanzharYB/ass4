public class CancelledOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order has been cancelled and can't be paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order has been cancelled and can't be shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order has been cancelled and can't be delivered.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order has already been cancelled.");
    }
}

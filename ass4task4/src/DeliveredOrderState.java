public class DeliveredOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order has already been paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order has already been shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order has already been delivered.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order can't be cancelled after delivery.");
    }
}

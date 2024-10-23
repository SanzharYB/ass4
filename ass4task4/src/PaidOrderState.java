public class PaidOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order has already been paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order has been shipped.");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order can't be delivered. It needs to be shipped first.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order can't be cancelled after payment.");
    }
}

public class NewOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order has been paid.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order can't be shipped. It needs to be paid first.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order can't be delivered. It needs to be paid first.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order has been cancelled.");
        order.setState(new CancelledOrderState());
    }
}

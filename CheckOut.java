public class CheckOut {
    private Order order;

    public CheckOut(Order order) {
        this.order = order;
    }

    public void payWithVoucher() {
        // pay with voucher method
    }

    public void payWithSmartWallet() {
        // pay with smart wallet method
    }

    public void payWithLoyaltyPoints() {
        // pay with loyalty points method
    }

    public void payWithCashOnDelivery() {
        System.out.println("Order payed with cash !");
        System.out.println("Total price after cash fees : " + (order.calculateTotal() + 20));

    }
}
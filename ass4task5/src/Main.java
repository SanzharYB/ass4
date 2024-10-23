public class Main {
    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();

        ExpenseRequest request1 = new ExpenseRequest(500, "Team lunch");
        approvalChain.processRequest(request1);

        ExpenseRequest request2 = new ExpenseRequest(2000, "Conference fees");
        approvalChain.processRequest(request2);

        ExpenseRequest request3 = new ExpenseRequest(8000, "New laptops");
        approvalChain.processRequest(request3);

        ExpenseRequest request4 = new ExpenseRequest(15000, "Office renovation");
        approvalChain.processRequest(request4);
    }
}

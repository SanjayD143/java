class CustomerRunner {
    public static void main(String[] args) {
        MobileNumber mobileNumber = new MobileNumber(9123456780L, "UK");
        Customer customer = new Customer("Sanjay", 303, mobileNumber);
        customer.displayCustomerDetails();
    }
}
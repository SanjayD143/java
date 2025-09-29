class MobileNumber {
    public long number;
    public String region;

    public MobileNumber(long number, String region) {
        this.number = number;
        this.region = region;
    }
}

class Customer {
    public String customerName;
    public int customerId;
    public MobileNumber mobileNumber;

    public Customer(String customerName, int customerId, MobileNumber mobileNumber) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.mobileNumber = mobileNumber;
    }

    public void displayCustomerDetails() {
        System.out.println(customerName);
        System.out.println(customerId);
        System.out.println(mobileNumber.number);
        System.out.println(mobileNumber.region);
    }
}



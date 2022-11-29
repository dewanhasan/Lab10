package ie.atu.week10;

public class Customer extends Person{
    private String customerNumber;
    private boolean mailinglist;

    public Customer() {
    }

    public Customer(String name, String address, String telephone, String customerNumber, boolean mailinglist) {
        super(name, address, telephone);
        this.customerNumber = customerNumber;
        this.mailinglist = mailinglist;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailinglist() {
        return mailinglist;
    }

    public void setMailinglist(boolean mailinglist) {
        this.mailinglist = mailinglist;
    }

    @Override
    public String toString() {
        return super.toString() + " \n" + "customerNumber= " + customerNumber + " \n" + "mailinglist= " + mailinglist;
    }
}

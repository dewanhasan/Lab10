package ie.atu.week10;

public class PreferredCustomer extends Customer{
    private int customerPurchase;
    private int CustomerDiscount;

    public PreferredCustomer() {
    }



    public PreferredCustomer(String name, String address, String telephone, String customerNumber, boolean mailinglist,
                             int customerPurchase) {
        super(name, address, telephone, customerNumber, mailinglist);
        this.customerPurchase = customerPurchase;

        if ( customerPurchase >= 2000){
            CustomerDiscount = 10;
        }
        else if ( customerPurchase >= 1500){
            CustomerDiscount = 7;
        }
        else if ( customerPurchase >= 1000){
            CustomerDiscount = 6;
        }
        else if( customerPurchase >= 500){
            CustomerDiscount = 5;
        }
        else{
            CustomerDiscount = 0;
        }
    }

    public int getCustomerPurchase() {
        return customerPurchase;
    }

    public void setCustomerPurchase(int customerPurchase) {
        this.customerPurchase = customerPurchase;
        if ( customerPurchase >= 2000){
            setCustomerDiscount(10);
        }
        else if ( customerPurchase >= 1500){
            setCustomerDiscount(7);
        }
        else if ( customerPurchase >= 1000){
            setCustomerDiscount(6);
        }
        else if( customerPurchase >= 500){
            setCustomerDiscount(5);
        }
        else{
            setCustomerDiscount(0);
        }
    }

    public int getCustomerDiscount() {
        return CustomerDiscount;
    }

    public void setCustomerDiscount(int customerDiscount) {
        CustomerDiscount = customerDiscount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCustomerPurchase=" +
                 + customerPurchase + "\nCustomerDiscount =" + CustomerDiscount ;
    }
}

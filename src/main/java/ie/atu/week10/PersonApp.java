package ie.atu.week10;

public class PersonApp {
    public static void main(String[] args) {
        Person Patrick = new Person("Patrick", "Atu", "54321");
        System.out.println(Patrick.toString());
        Customer Lucas = new Customer("Lucas", "GMIT", "12345", "01", true);
        System.out.println(Lucas.toString());

        Customer Dewan = new Customer();
        Dewan.setName("Dewan");
        Dewan.setAddress("CG");
        Dewan.setTelephone("08963");
        Dewan.setCustomerNumber("11111");
        Dewan.setMailinglist(false);

        System.out.println("\nName:" + Dewan.getName() + "\nAddress:" + Dewan.getAddress()
                +"\nPhone:" + Dewan.getTelephone() +
                "\nCustomer Num:" + Dewan.getCustomerNumber() +
                "\nMailing List:" + Dewan.isMailinglist());

        PreferredCustomer dewan = new PreferredCustomer("Dewan", "CG", "123479", "696969", true, 600);
        System.out.println(dewan.toString());

        PreferredCustomer paddy = new PreferredCustomer();
        paddy.setCustomerPurchase(2069);
        System.out.println(paddy.toString());
    }
}

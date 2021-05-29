package day_47_constructors;

public class AddressList {

    public static void main(String[] args) {
    Address SpaceXAddress = new Address();
    SpaceXAddress.setStreet("13728 S Amherst Ct");
    SpaceXAddress.setCity("Plainfield");
    SpaceXAddress.setState("IL");
    SpaceXAddress.setZipCode("60544");

    System.out.println("SpaceXAddress address: " + SpaceXAddress.toString());
    SpaceXAddress.setStreet("1 Rocket Road in the East Hawthorne neighborhood, CA, Hawthorne, 90250.");

        System.out.println("address updated = " + SpaceXAddress);
        System.out.println("street info = " + SpaceXAddress.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("13728 S Amherst Ct Plainfield IL 60544");
        newAddress.setCity("Plainfield");
        newAddress.setState("IL");
        newAddress.setZipCode("60544");
        System.out.println(newAddress.toString());

        Address papaJones = new Address("8501 Tyco Rd Ste 1A", "Vienna", "VA", "22182");
        System.out.println("Papa John pizza = " + papaJones.toString());

    }
}

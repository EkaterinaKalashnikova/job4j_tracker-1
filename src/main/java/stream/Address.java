package stream;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int home;
    private int apartment;

    public Address() {
    }

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public String toString( ) {
        return "Address{"+
                "city='"+city+'\''+
                ", street='"+street+'\''+
                ", home="+home+
                ", apartment="+apartment+
                '}';
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Address address = (Address) o;
        return getHome() == address.getHome() &&
                getApartment() == address.getApartment() &&
                Objects.equals(getCity() ,address.getCity()) &&
                Objects.equals(getStreet() ,address.getStreet());
    }

    @Override
    public int hashCode( ) {
        return Objects.hash(getCity() ,getStreet() ,getHome() ,getApartment());
    }
}

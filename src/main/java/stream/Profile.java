package stream;

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public static <Address>Profiles getAddress(Profiles profiles) {
        return profiles;
    }
}

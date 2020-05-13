package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    private Address address;

    public Address getAddress( ) {
        return address;
    }

    public List <Profiles> collect( List<Profiles> profiles) {
       List<Profiles> profilesList = profiles.stream()
               .map(Profiles::getAddress)
               .distinct()
               .sorted(Comparator.naturalOrder().)
               .collect(Collectors.toList());


        return profilesList;
    }
}



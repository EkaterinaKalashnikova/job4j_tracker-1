package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
     List<Address>  collect( List<Profile> profiles) {
         List <Address> profilesList=profiles.stream()
                 .map(Profile::getAddress)
                 .collect(Collectors.toList());

        System.out.println(
                profiles.stream()
                        .map(Profile::getAddress)
                        .sorted(Comparator.comparing(Address::getCity))
                        .distinct()
                        .collect(Collectors.toList())
        );
        return profilesList;
     }
}



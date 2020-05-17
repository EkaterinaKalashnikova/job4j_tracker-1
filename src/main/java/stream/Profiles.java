package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
     List <Profile> collect( List<Profile> profiles) {
         List <Address> profilesList = profiles.stream()
                 .map(Profile::getAddress)
                 .collect(Collectors.toList());
         return profiles;
     }

    List <Profile> collectUnique (List<Profile> profiles) {
        List <Address> list = profiles.stream()
                        .map(Profile::getAddress)
                        .sorted(Comparator.comparing(Address::getCity))
                        .distinct()
                        .collect(Collectors.toList());
        return profiles;
     }
}



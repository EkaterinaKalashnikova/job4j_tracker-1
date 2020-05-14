package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List <Profiles> collect( List<Profiles> profiles) {
       List<Profiles> profilesList = profiles.stream()
               .map(Profiles::getAddress)
               .collect(Collectors.toList());

        return profilesList;
    }

    private static <Address> Profiles getAddress(Profiles profiles) {
        return profiles;
    }
}



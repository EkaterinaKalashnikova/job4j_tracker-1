package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List <Profiles> collect(List<Profiles> profiles) {
        List <Profiles> profilesList=profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
        return profilesList;

        System.out.println(
                profiles.stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList())
        );
    }
}



package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List <Profiles> collect(List<Profiles> profiles) {
       List<Profiles> profilesList = profiles.stream()
               .map(Profile::getAddress)
               .collect(Collectors.toList());
        return profilesList;
    }
}



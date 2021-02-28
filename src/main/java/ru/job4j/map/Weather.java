package ru.job4j.map;

import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (Info obj : list) {
            map.put(obj.getCity(),obj.getRainfall());
        }

        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext ()) {
          String m =  iterator.next();
          int rainfall = 0;
            for(Map.Entry<String, Integer> item : map.entrySet()) {
                if (m.equals(item.getKey())) {
                    rainfall += item.getValue();
                }
            }
         rsl = new ArrayList<>(map.get(rainfall));
          // rsl.add(map.get());
          // rsl = Collections.list(Collections.enumeration (map.size ()));
           //rsl =Collections.singletonList ((Info) map.values ().stream ().collect (Collectors.toList ()));
        }
       // List<Info> rsl = new ArrayList<>(map.get(rainfall));
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall &&
                    Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}

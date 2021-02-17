package ru.job4j.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int sum = data.get(0);
        for(int i = 1; i < data.size() - 1; i ++) {
           // if (data.get(i) == data.get(i + 1)*2 - data.get(i +2)) {
            if (data.get(i) == (data.get(i - 1) + data.get(i + 1))/2) {
                sum += data.get(i);
            } else {
               sum = 0;
               break;
            }
        }
        return (sum == 0) ? 0 : sum + data.get(data.size() - 1);
    }
}

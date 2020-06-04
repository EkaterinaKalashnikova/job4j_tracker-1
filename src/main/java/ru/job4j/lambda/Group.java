package ru.job4j.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {
    public static Map <String, Set <String>> sections(List <StudentsGroup> students) {
            return students.stream()
                    .flatMap(x -> x.getUnits().stream().map(unit -> new Holder(unit, x.getName())))
                              // собираем объект Holder с unit и name
                    .collect( // собираем карту
                            Collectors.groupingBy(t -> t.key, // определяем группировку
                                    Collector.of(HashSet::new , // аккумулятор.
                                            (set, el) -> set.add(el.value), // как добавлять данные.
                                            (left, right) -> {
                                                left.addAll(right);
                                                return left;
                                            } // для агрегации.
                                    )
                            )
                    );
        }
    }




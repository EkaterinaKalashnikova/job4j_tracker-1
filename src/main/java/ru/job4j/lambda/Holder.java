package ru.job4j.lambda;

import java.util.Objects;

public class Holder {
    String key, value;

    Holder(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Holder)) return false;
        Holder holder = (Holder) o;
        return Objects.equals(key, holder.key) &&
                Objects.equals(value, holder.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key ,value);
    }

    @Override
    public String toString() {
        return "Holder{"+
                "key='"+key+'\''+
                ", value='"+value+'\''+
                '}';
    }
}


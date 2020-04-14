package ru.jobj4.bank;

import java.util.Objects;

public class User {
    private String passport;
    private String username;

    public User() {
        this.passport = passport;
        this.username = username;
    }

    public User(String passport, String username) {
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public String toString( ) {
        return "User{"+
                "passport='"+passport+'\''+
                ", username='"+username+'\''+
                '}';
    }
}

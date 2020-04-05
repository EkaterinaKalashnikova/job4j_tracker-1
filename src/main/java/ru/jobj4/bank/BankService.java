package ru.jobj4.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    /** Method of adding a bank client to the system
     * default: an empty list of bank accounts at the beginning
     *
     * @param user - a bank client
     */
    public void addUser(User user) {
        if (this.users.putIfAbsent(user, new ArrayList <>())!= null) {
        }
    }

    /** Method of adding to a new account of a bank client
     *
     * @param passport - passport
     * @param account - bank account
     */
    public void addAccount(String passport, Account account) {
        List <Account> accounts = this.users.get(findByPassport(passport));
        if (accounts.indexOf(account) != -1) {
        }
        accounts.add(account);
    }

    public User findByPassport(String passport) {
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {

        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl=false;
        return rsl;
    }

    public static void main(String[] args) {
            List<Account> accounts = new ArrayList <>();
            String requisite = "3fdsbb9";
            accounts.add(new Account("3fdsbb9", 140));
            int index = accounts.indexOf(new Account(requisite, -1));
            Account find = accounts.get(index);
            System.out.println(find.getRequisite() + " -> " + find.getBalance());
    }
}

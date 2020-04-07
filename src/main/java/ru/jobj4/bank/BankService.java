package ru.jobj4.bank;

import java.util.*;

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

    /** Method search for a bank client by passport number
     *
     * @param passport - passport
     * @return user.getPassport()
     */
    public User findByPassport( String passport) {
        HashMap<String, User> map = new HashMap();
        Set <String> collection = map.keySet();
        User user = new User(); //
        for(String key : collection) {
            User users = map.get(key);
            if (key != null) {
                if (user.equals(users)) { //
                    return key;
                }
            }
        }
        return user;
    }

    /** Method search account requisite
     *
     * @param passport
     * @param requisite
     * @return
     */
    public Account findByRequisite(String passport, String requisite) {
      List<Account> accounts = findByPassport(passport);
      int index = accounts.indexOf(new Account(requisite, 0));
      if (index < 0) {
      }
      return accounts.get(index);
    }

    /** Method transfers from one account to another
     *
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param dеstRequisite
     * @param amount
     * @return rsl
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, dеstRequisite);
         if (src != null && dest != null) {
             if (amount > 0 && src.getBalance() != 0 && src.getBalance() > amount) {
                src.setBalance(amount);
                dest.setBalance(amount);
                rsl = true;
             }
         }
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

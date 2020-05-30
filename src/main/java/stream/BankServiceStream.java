package stream;

import ru.jobj4.bank.Account;
import ru.jobj4.bank.User;

import java.util.*;

public class BankServiceStream {
    private Map <User, List <Account>> users = new HashMap <>(); //создаем обьект

    /** Method of adding a bank client to the system
     * default: an empty list of bank accounts at the beginning
     *
     * @param user - a bank client
     */
    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList <>());
    }

    /** Method of adding to a new account of a bank client
     *  @param passport - passport a bank client
     * @param account - bank account
     */
    public void addAccount( String passport,Account account) {
        List <Account> accounts = this.users.get(findByPassport(passport));
        if (accounts != null) {
            int index = accounts.indexOf(account);
            if (index == -1){ //есть ли счета у клиента нет
                accounts.add(account); //добавляем
            }
        }
    }

    /** Method search for a bank client by passport number
     *
     * @param passport - passport a bank client
     * @return user
     */
    public User findByPassport(String passport) {
        return this.users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /** Method search account requisite
     *
     * @param passport - passport a bank client
     * @param requisite - requisite a bank client
     * @return received list of accounts by index
     */
    public Account findByRequisite(String passport, String requisite) {
        return this.users.get(findByPassport(passport)).stream()
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst()
                .orElse(null);
    }

    /** Method transfers from one account to another
     *
     * @param srcPassport - Passport data of the client account pull
     * @param srcRequisite - Requisite data of the client account pull
     * @param destPassport - Passport data of the client account put
     * @param dеstRequisite - Requisite data of the client account put
     * @param amount - amount of money transferred
     * @return rsl
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite); //определяем счет снятия
        Account dest = findByRequisite(destPassport, dеstRequisite); //определяем счет
         if (src != null && dest != null) {
             if (amount > 0 && amount <= src.getBalance()){ //проверяем что существуют счета
                 src.setBalance(src.getBalance()-amount);
                 dest.setBalance(dest.getBalance()+amount);
             }
         }
        return rsl;
    }

    public static void main(String[] args) {
        List <Account> accounts = new ArrayList <>();
        String requisite = "3fdsbb9";
        accounts.add(new Account("3fdsbb9", 140));
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());
    }
}



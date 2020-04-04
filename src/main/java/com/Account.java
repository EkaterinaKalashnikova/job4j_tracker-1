package com;

/**
 * Class
 * @author Petr
 * @since
 * @version
 */
public class Account {
   private double values; // отмечаем подя private, делаем обьект неизиеняемым
   private String reqs;

    public Account(double values, String requisites) {
        this.values = values;
        this.reqs = requisites;
    }

    public double getValues() {
        return this.values;
    }

    public String getReqs() {
        return this.reqs;
    }

    public void setValues(double values) { //добавляем сеттеры для инкапсуляции
        this.values = values;
    }

    public void setReqs(String reqs) {
        this.reqs = reqs;
    }

    /**
     * Доставка в пункт назначения
     * @param destination
     * @param amount
     * @return результат доставки
     */
    boolean transfer(Account destination, double amount) {
        boolean success = false;
               if (amount > 0 && amount < this.values && destination != null){
            success=true;
            this.values-=amount;
            destination.values+=amount;
        }
        return success;
    }

    public String toString() {
        String otvet;
        otvet = "Account{" + "values=" + values + ", reqs='" + reqs + "\\" + "}";
        return otvet;
    }

  @Override
    public boolean equals(Object o) { //сравниваем с созданным account
                                      //переопределяем метод суперкласса object
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return this.reqs.equals(account.reqs);
    }

    @Override
    public int hashCode() { // и соответственно переопределяем вместе с equals
        return this.reqs.hashCode();
    }
}
package bank;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client<T extends Comparable<T>> {
    private String fio;
    private String idNumber;
    private List<Account<T>> accounts;

    public Client(String fio, String idNumber, List<Account<T>> accounts) {
        this.fio = fio;
        this.idNumber = idNumber;
        this.accounts = accounts;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public List<Account<T>> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account<T>> accounts) {
        this.accounts = accounts;
    }

    public float calculateSum() {
        float sum = 0;
        for (Account<T> account: accounts) {
            if (!account.isBlocked()) {
                sum += account.getSum();
            }
        }
        return sum;
    }

    public float calculatePositiveSum() {
        float sum = 0;
        for (Account<T> account: accounts) {
            if (!account.isBlocked() && account.getSum() > 0) {
                sum += account.getSum();
            }
        }
        return sum;
    }

    public float calculateNegativeSum() {
        float sum = 0;
        for (Account<T> account: accounts) {
            if (!account.isBlocked() && account.getSum() < 0) {
                sum += account.getSum();
            }
        }
        return sum;
    }

    public boolean findAccount(T accountId) {
        for (Account<T> account: accounts) {
            if (account.getId().equals(accountId)) {
                return true;
            }
        }
        return false;
    }

    public void sortBySum(List<Account<T>> accounts) {
        Collections.sort(accounts, Comparator.comparing(Account::getSum));
    }

    public void sortById(List<Account<T>> accounts) {
        Collections.sort(accounts, Comparator.comparing(Account::getId));
    }
}

import bank.Account;
import bank.Client;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Account<Integer>> accounts = new ArrayList<>();
        accounts.add(new Account<>(487441, 500.17f, false));
        accounts.add(new Account<>(468841, 1509.64f, false));
        accounts.add(new Account<>(687315, -581.23f, true));
        accounts.add(new Account<>(189167, -27.81f, false));
        accounts.add(new Account<>(156849, -89.84f, false));

        Client<Integer> client = new Client<>("Zhilinsky Yury Nikolaevich",
                "3311288C023PB1", accounts);

        System.out.println(client.calculateSum());
        System.out.println(client.calculatePositiveSum());
        System.out.println(client.calculateNegativeSum());
        System.out.println(client.findAccount(468841));
        System.out.println(client.findAccount(468840));
        System.out.println();

        client.sortBySum(accounts);
        for (Account<Integer> account : accounts) {
            System.out.println(account.getSum());
        }
        System.out.println();

        client.sortById(accounts);
        for (Account<Integer> account : accounts) {
            System.out.println(account.getId());
        }
    }
}

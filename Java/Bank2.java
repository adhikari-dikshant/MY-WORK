import java.util.Scanner;

class Bank {
    private String accno;
    private String name;
    private long balance;

    Scanner KB = new Scanner(System.in);

    // method to open an account
    void openAccount() {
        System.out.print("ENTER ACCOUNT NO: ");
        accno = KB.next();
        System.out.print("ENTER NAME: ");
        name = KB.next();
        System.out.print("ENTER BALANCE: ");
        balance = KB.nextLong();
    }

    // method to display account details
    void showAccount() {
        System.out.println(accno + "," + name + "," + balance);
    }

    // method to deposit money
    void deposit() {
        long amt;
        System.out.println("ENTER AMOUNT U WANT TO DEPOSIT : ");
        amt = KB.nextLong();
        balance = balance + amt;
    }

    // method to withdraw money
    void withdrawal() {
        long amt;
        System.out.println("ENTER AMOUNT YOU WANT TO WITHDRAW : ");
        amt = KB.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("LESS BALANCE..TRANSACTION FAILED..");
        }
    }

    // method to search an account number
    boolean search(String acn) {
        if (accno.equals(acn)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}

public class Bank2 {
    public static void main(String[] args) {
        Scanner KB = new Scanner(System.in);

        // create initial accounts
        System.out.print("HOW MANY CUSTOMER U WANT TO INPUT : ");
        int n = KB.nextInt();
        Bank C[] = new Bank[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new Bank();
            C[i].openAccount();
        }

        // run loop until menu 5 is not pressed
        int ch;
        do {
            System.out.println(
                    "MAIN MENU\n1-> DISPLAY ALL\n2-> SEARCH BY ACCOUNT\n3-> DEPOSIT\n4-> WITHDRAWAL\n5-> EXIT ");
            System.out.println("YOUR CHOICE :");
            ch = KB.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    break;

                case 2:
                    System.out.print("ENTER ACCOUNT NO U WANT TO SEARCH...: ");
                    String acn = KB.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(acn);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("SEARCH FAILED..ACCOUNT NOT EXIST..");
                    }
                    break;

                case 3:
                    System.out.print("ENTER ACCOUNT NO : ");
                    acn = KB.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(acn);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("SEARCH FAILED..ACCOUNT NOT EXIST..");
                    }
                    break;

                case 4:
                    System.out.print("ENTER ACCOUNT NO : ");
                    acn = KB.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(acn);
                        if (found) {
                            C[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("SEARCH FAILED..ACCOUNT NOT EXIST..");
                    }
                    break;

                case 5:
                    System.out.println("GOOD BYE..");
                    break;
            }
        } while (ch != 5);
    }
}

package Email;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity = 500;
    private String AlternateEmail;
    private int defaultpasswordlength = 12;
    private String companySuffix = "SDtech.com";


    Scanner scanner = new Scanner(System.in);

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();

        this.password = setPassword(defaultpasswordlength);
        System.out.println("Your Paswword is " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }

    private String setDepartment() {
        System.out.println(
                "Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none\n Enter Department code : ");
        
        int deptChoice = scanner.nextInt();
        if (deptChoice == 1) {
            return "sales";
        } else if (deptChoice == 2) {
            return "development";
        } else if (deptChoice == 3) {
            return "accounting";
        } else {
            return "None";
        }

    }

    private String setPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setmailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setalternateEmail(String altEmail) {
        this.AlternateEmail = altEmail;
    }

    public void setchangePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return AlternateEmail;
    }

    public String getchangedPassword() {
        return password;
    }

    public String showInfo() {
        return " Display Name : " + firstName + " " + lastName +
                "\n Company Email : " + email +
                "\n Mailbox Capacity : " + mailboxCapacity + "mb";
    }
        
}

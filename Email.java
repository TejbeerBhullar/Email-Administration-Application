
//package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity;
    private String alternateEmail;



    // Constructor to recieve the first and the last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: "+ this.firstName + " " + this.lastName);

        // Call a meathod asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department:"+ this.department);

        // Call a meathod that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is "+ this.password);

        // Combine elements to generate email

    }



    // Ask for the department
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "sales";}
        else if (depChoice == 2){return "dev";}
        else if (depChoice == 3){return "acct";}
        else{return "";}
        }

    // Generate a random passeord
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i =0 ; i< length ; i++){
            // We need to generate a random number
            // Math.random gives a number b/w 0 and 1 and then cast it as a int then multiply with the password set
            // then store that in the rand
            int rand = (int)(Math.random()* passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    // Set the mailbox capacity

    // Set the altername email

    // Change the password


}

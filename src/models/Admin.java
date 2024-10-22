package models;

import java.util.Scanner;

public class Admin {
    Scanner sc=new Scanner(System.in);
    String defaultEmail="satyalsamriddha@gmail.com";
    int defaultPin=1000;
    String adminEmail;
    int adminPin;

    public Admin()
    {
        adminCustomFunc();
    }

    public String getAdminEmail() {
        return adminEmail;
    }
    public int getAdminPin() {
        return adminPin;
    }

    public void adminCustomFunc()
    {
        int attempts=3;
        while(attempts!=0)
        {
            System.out.println("Enter admin email:");
            this.adminEmail=sc.next();
            System.out.println("Enter admin pin:");
            this.adminPin=sc.nextInt();
            if(!defaultEmail.equals(this.adminEmail) || defaultPin!=this.adminPin)
            {
                System.out.println("Email or Pin Incorrect");
                attempts-=1;
                if(attempts==0)
                {
                    System.out.println("Max Attempts! Try again Later");
                    System.exit(0);
                }
            }
            else
            {
                System.out.println("Login Successful!");
                break;
            }
        }
    }
}

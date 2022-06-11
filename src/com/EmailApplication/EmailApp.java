package com.EmailApplication;

public class EmailApp {
    public static void main(String[] args) {
       EmployeeEmail em1 = new EmployeeEmail("Bala", "Gangadhar");

        //Use setters to pass values into the dependency class to change them or supply them if the dependency class does not have those values defined.
        em1.setMailboxCapacity(500);
        em1.setPassword("BalaBhuma");
        em1.setAltEmail("bgrbhuma@gmail.com");
        em1.setPhoneNumber(219402456);
        em1.accountDetails();
    }

}

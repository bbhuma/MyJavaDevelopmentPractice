package com.BankingApplication;

import java.util.List;

import utilities.CSV;


public class BankingApplication {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        String file = "c:/Users/bgrbh/IdeaProjects/MyDevelopmentPractice/src/utilities/CSV.csv";
        //Read a CSV file by calling.
        List<String[]> newAccountHolders = CSV.read(file);
        for (String[] accountholder :newAccountHolders) {    //FoeEach String[] in List
            if(accountholder[2].equals("Savings")){
                SavingsAccount savingAccount = new SavingsAccount(accountholder[0], accountholder[1], Double.parseDouble(accountholder[3]));
                savingAccount.showInfo();
                savingAccount.calculateCompoundInterest(12);
                System.out.println("***********************************");
            }
            else if(accountholder[2].equals("Checking")){
                CheckingAccount checkingAccount = new CheckingAccount(accountholder[0], accountholder[1], Double.parseDouble(accountholder[3]));
                checkingAccount.showInfo();
                checkingAccount.calculateCompoundInterest(12);
            }
            else {
                System.out.println("Not able to read the account type");
            }

        }



        //Read a CSV file then create new accounts based on that data by calling either checking or saving class.

    }
}

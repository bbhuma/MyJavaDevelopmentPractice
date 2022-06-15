package com.BankingApplication;

public interface IBaseRate {
    default double getBaseRate() {    //Interface abstract methods can not have a body, but default methods of the interface can have a body.
        return 2.50;
    }
}

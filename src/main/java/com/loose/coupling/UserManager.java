package com.loose.coupling;

public class UserManager {
    // Creates variable for the interface
    public DatabaseProvider databaseProvider;

    // Whatever be the db tech using will be passed into the constructor
    public UserManager(DatabaseProvider databaseProvider) {
        this.databaseProvider = databaseProvider;
    }

    public String getUserDetails() {
        return databaseProvider.getUserDetails();
    }
}

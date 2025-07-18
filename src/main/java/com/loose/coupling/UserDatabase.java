package com.loose.coupling;

public class UserDatabase implements DatabaseProvider {

    @Override
    public String getUserDetails() {
        return "Getting user details from db1";
    }
}

package com.loose.coupling;

public class MongoDatabase implements DatabaseProvider {

    @Override
    public String getUserDetails() {
        return "Getting user details from db2";
    }
}

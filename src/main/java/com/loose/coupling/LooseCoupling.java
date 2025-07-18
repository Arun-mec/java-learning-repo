package com.loose.coupling;

public class LooseCoupling {
    public static void main(String[] args) {
        DatabaseProvider userDatabase = new UserDatabase();
        UserManager userManager = new UserManager(userDatabase);
        System.out.println(userManager.getUserDetails());

        DatabaseProvider mongoDatabase = new MongoDatabase();
        UserManager userManager1 = new UserManager(mongoDatabase);
        System.out.println(userManager1.getUserDetails());
    }
}

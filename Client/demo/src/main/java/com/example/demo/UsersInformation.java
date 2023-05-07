package com.example.demo;

public class UsersInformation {
    private static String[] userNames = {"Hager", "Hamdy", "Youssef"};
    private static String[] passwords = {"123456", "123123", "456456"};

    private static int id = -1;

    public static String getUsername(){
        return userNames[id];
    }

    public static boolean isUser(String user) {
        boolean isUsername = false;
        for (int idx = 0; idx < userNames.length; idx++) {
            if(user.equals(userNames[idx])){
                isUsername = true;
                id = idx;
                break;
            }
        }
        return isUsername;
    }


    public static boolean isPassword(String password) {
        boolean isPass = false;

        return password.equals(passwords[id]);
    }
}

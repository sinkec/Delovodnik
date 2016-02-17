package com.example.matejjazbinek.delovodnik;

/**
 * Created by Matej Jazbinšek on 17. 02. 2016.
 * Hello to all :D
 */
public class DelovodnikData {
    public static class User{

        private String Name;
        private String Surname;
        private String Username;
        private String Password;
        private String UserImg;

        private boolean Loged = false;
        private boolean UserCreated = false;

        //CONSTRUCTOR WITH NO IMAGE
        public User(String name, String surname, String username, String password)
        {
            Name = name;
            Surname = surname;
            Username = username;
            Password = password;
            UserImg = "default";
        }
        //CONSTRUCTOR WITH IMAGE
        public User(String name, String surname, String username, String password, String userImg)
        {
            Name = name;
            Surname = surname;
            Username = username;
            Password = password;
            UserImg = userImg;
        }


        // GET/SET - NAME
        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        // GET/SET - SURNAME
        public String getSurname() {
            return Surname;
        }

        public void setSurname(String surname) {
            Surname = surname;
        }

        // GET/SET - USERNAME
        public String getUsername() {
            return Username;
        }

        public void setUsername(String username) {
            Username = username;
        }

        // GET/SET - PASSWORD
        public String getPassword() {
            return Password;
        }

        public void setPassword(String password) {
            Password = password;
        }

        // GET/SET - USER IMAGE
        public String getUserImg() {
            return UserImg;
        }

        public void setUserImg(String userImg) {
            UserImg = userImg;
        }

        public boolean isUserCreated()
        {
            return true;
        }

    }
}

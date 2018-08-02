package pl.KamilF.miniSelfProject.model;

import javax.persistence.*;

@Entity
public class User {
           @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String userName;
        private String userSurname;
        private int cash;
        private int phoneNumber;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", cash=" + cash +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

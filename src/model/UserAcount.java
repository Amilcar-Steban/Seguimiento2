/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class UserAcount {
    private String name;
    private String password;
    private String genre;
    private String career;
    private String birthday;
    private String f_Browser;

    public UserAcount(String name, String password, String genre, String career, String birthday, String f_Browser) {
        this.name = name;
        this.password = password;
        this.genre = genre;
        this.career = career;
        this.birthday = birthday;
        this.f_Browser = f_Browser;
    }
    
    //getters

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getGenre() {
        return genre;
    }

    public String getCareer() {
        return career;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getF_Browser() {
        return f_Browser;
    }
    
    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setF_Browser(String f_Browser) {
        this.f_Browser = f_Browser;
    }
    
    
}


package model;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    
    private List<UserAcount>list;

    public Classroom() {
        list = new ArrayList<>();
    }
    
    public void addUser(String name, String password, String genre, String career, String birthday, String f_Browser){
        list.add(new UserAcount(name, password, genre, career, birthday, f_Browser));
    }
    
    //getter and setter

    public List<UserAcount> getList() {
        return list;
    }

    public void setList(List<UserAcount> list) {
        this.list = list;
    }
    
}

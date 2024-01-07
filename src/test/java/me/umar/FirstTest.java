package me.umar;

import me.umar.dao.AutoDAO;
import me.umar.dao.UserDAO;
import me.umar.dbclasses.Auto;
import me.umar.dbclasses.User;
import org.junit.Test;

public class FirstTest {

    @Test
    public void saveUserTest(){
        User user = new User("Popov", 20);
        new UserDAO().saveUser(user);
    }

    @Test
    public void getUserTest(){
        System.out.println(new UserDAO().findById(1));
    }

    /**
     * Update happens on the primary key, so you can create new User with specific id
     * and update other fields, but you cannot update the primary key field.
     */
    @Test
    public void updateUserTest(){
        User user1 = new UserDAO().findById(1);
        user1.setAge(100);
        new UserDAO().updateUser(user1);
    }

    @Test
    public void updateUserTestV2(){
        User user2 = new User("asd", 23);
        user2.setId(2);
        new UserDAO().updateUser(user2);
    }

    @Test
    public void saveAutoTest(){
        User user1 = new UserDAO().findById(1);
        Auto auto = new Auto(2,"Car", "Yellow", 3);
        auto.setUser(user1);
        new AutoDAO().saveAuto(auto);
    }
}

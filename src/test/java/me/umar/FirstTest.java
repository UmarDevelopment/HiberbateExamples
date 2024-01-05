package me.umar;

import me.umar.dao.UserDAO;
import me.umar.dbclasses.User;
import org.junit.Test;

public class FirstTest {

    @Test
    public void tc1(){
        User user = new User(1, "Donald", 20);
        new UserDAO().saveUser(user);
    }
}

package me.umar.dao;

import me.umar.HibernateSessionFactoryUtil;
import me.umar.dbclasses.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDAO {

    public User findById(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }

    public void saveUser(User user){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        System.out.println(user);
        session.save(user);
        tx1.commit();
        session.close();
    }
}

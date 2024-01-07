package me.umar.dao;

import me.umar.HibernateSessionFactoryUtil;
import me.umar.dbclasses.Auto;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class AutoDAO {

    public void saveAuto(Auto auto){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(auto);
        tx1.commit();
        session.close();
    }
}

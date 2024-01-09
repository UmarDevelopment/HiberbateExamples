package me.umar.dao;

import me.umar.HibernateSessionFactoryUtil;
import me.umar.dbclasses.Color;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ColorDAO {

    public void saveColor(Color color){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(color);
        tx1.commit();
        session.close();
    }

    public Color getColorById(String id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Color color = session.get(Color.class, id);
        session.close();
        return color;
    }
}

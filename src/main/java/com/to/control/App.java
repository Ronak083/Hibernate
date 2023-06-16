package com.to.control;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.to.player;

public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(player.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            player p1 = new player("ashwin","India",30);
            session.beginTransaction();

            session.save(p1);

            session.getTransaction().commit();
            System.out.println("Row added!");

        }
        finally{
            session.close();
            factory.close();
        }
    }

}


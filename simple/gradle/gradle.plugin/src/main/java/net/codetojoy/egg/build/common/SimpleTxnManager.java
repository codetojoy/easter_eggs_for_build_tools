package net.codetojoy.egg.build.common;

import org.hibernate.*;
import org.hibernate.cfg.*;

// Only an example! Don't do this in a real project
public class SimpleTxnManager {
    
    private static SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
    
    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }
    
    public Session openTransaction() {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();    
        return session;    
    }
    
    public void commitTransaction() {
        transaction.commit();
        session.close();        
    }
    
    public Session getSession() { 
        return session;
    }

    public void shutdown() { 
        sessionFactory.close(); 
    }

}

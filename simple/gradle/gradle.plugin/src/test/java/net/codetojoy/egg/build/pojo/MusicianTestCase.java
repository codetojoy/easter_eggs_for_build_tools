
package net.codetojoy.egg.build.pojo;

import net.codetojoy.egg.build.common.*;

import java.util.*;
import junit.framework.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class MusicianTestCase extends TestCase {

    private SimpleTxnManager txnManager = new SimpleTxnManager();
    
	public void setUp() throws Exception {
	    txnManager.openTransaction();
		
            String[] names = { "Mozart", "Elvis", "Jimi Hendrix", "Ani DiFranco" };

            for (String name : names) {
                Musician musician = new Musician();
                musician.setName(name);
                txnManager.getSession().save(musician);            
            }
        
            txnManager.commitTransaction();
	}
	
	public void tearDown() throws Exception {
            txnManager.shutdown();
	}
	
	public void testMe() {

            txnManager.openTransaction();
                        
            List<Musician> musicians = (List<Musician>) txnManager.getSession().createQuery("from Musician").list();

            assertEquals(4, musicians.size());

            for (Musician musician : musicians) {
                System.err.println("found musician: " + musician.getName());
            }

            txnManager.commitTransaction();
	} 
}

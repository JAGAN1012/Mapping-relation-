package Studentlapdoc.Studentlapdoc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
   
    	 public static void main(String[] args) {
    	        System.out.println("student lap record");
    	        Student std=new Student();
    	        Laptop lt=new Laptop();
    	        lt.setId(101);
    	        lt.setLapname("DELL");
    	        
    	        std.setId(1);
    	        std.setName("jagan");
    	        std.setSec("A"); 
    	        std.getLaptop().add(lt);
    	        lt.getStudent().add(std);
    	    
    	        
    	 

    	        // Setting up Hibernate session
    	        Configuration con = new Configuration().configure("hibernate.cfg.xml")  // Configuring Hibernate
    	                                               .addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);  // Add your entity class
    	       
    	        SessionFactory sf = con.buildSessionFactory();
    	        Session session = sf.openSession();

    	        try {
    	            // Start a transaction
    	            session.beginTransaction();

    	            // Save the Alien object
    	            //session.save(obj);// hibernate which is convert the java code to sql.
    	           
    	           session.save(std);
    	           session.save(lt);
    	             // used to get from data base
    	           std=(Student)session.get(Student.class,1);
    	           lt=(Laptop)session.get(Laptop.class,1);
    	         System.out.println(std);
    	           System.out.println(lt);
    	            session.getTransaction().commit();
    
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        } finally {
    	            // Close the session
    	            session.close();
    	            sf.close();
    	        }
    	       
    	   
    	    }
    	}
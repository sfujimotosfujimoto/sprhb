package com.sfujimoto.hibernate.demo;

import com.sfujimoto.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by sfujimoto on 2017/03/14.
 */
public class PrimaryKeyEmployeeDemo {

    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration()
                                    .configure("hibernate.cfg.xml")
                                    .addAnnotatedClass(Employee.class)
                                    .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create 3 student objects
            System.out.println("Creating 3 employee objects...");
            Employee tempEmployee1 = new Employee("John", "Doe", "IBM");
            Employee tempEmployee2 = new Employee("Mary", "Public", "Tosca");
            Employee tempEmployee3 = new Employee("Kentaro", "Suzuki", "JELLYBEAN");
            // start a transaction
            session.beginTransaction();

            // save the student object
            System.out.println("Saving the employees...");
            session.save(tempEmployee1);
            session.save(tempEmployee2);
            session.save(tempEmployee3);

            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done saving - Employee!!");

        }
        finally {
            factory.close();
        }

    }
}

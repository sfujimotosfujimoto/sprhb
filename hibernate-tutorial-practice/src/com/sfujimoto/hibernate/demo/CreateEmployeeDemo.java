package com.sfujimoto.hibernate.demo;

import com.sfujimoto.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by sfujimoto on 2017/03/14.
 */

public class CreateEmployeeDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                                    .configure("hibernate.cfg.xml")
                                    .addAnnotatedClass(Employee.class)
                                    .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create a student object
            System.out.println("Creating new employee object...");
            Employee tempEmployee = new Employee("John", "Gray", "Cojext");
            // start a transaction
            session.beginTransaction();

            // save the student object
            System.out.println("Saving the employee...");
            session.save(tempEmployee);

            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done - Employee!!");

        }
        finally {
            factory.close();
        }


    }
}

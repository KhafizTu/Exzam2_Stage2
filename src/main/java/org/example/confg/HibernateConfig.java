package org.example.confg;

import jakarta.persistence.EntityManager;
import org.example.classes.Category;
import org.example.classes.Company;
import org.example.classes.Product;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;

import static org.hibernate.cfg.AvailableSettings.*;

public class HibernateConfig {
    public static EntityManager getEntityManager() {
        Configuration configuration = new Configuration();
        configuration.setProperty(DRIVER, "org.postgresql.Driver");
        configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/postgres");
        configuration.setProperty(USER, "postgres");
        configuration.setProperty(PASS, "postgres");
        configuration.setProperty(HBM2DDL_AUTO, "update");
        configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        configuration.setProperty(SHOW_SQL, "true");
        System.out.println("Successfully create table...");
        configuration.addAnnotatedClass(Product.class);
        configuration.addAnnotatedClass(Company.class);
        configuration.addAnnotatedClass(Category.class);

        return configuration.buildSessionFactory().createEntityManager();
    }

}

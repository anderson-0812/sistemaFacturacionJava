/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author alex
 */
public class Conexion {

    private static EntityManagerFactory emf;
    private static EntityManager em;
    private Connection conn;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public void conectar() throws ClassNotFoundException, SQLException {

        try {
            /*
            Properties properties = new Properties();
            properties.setProperty("user", "root");
            properties.setProperty("password", "");
            properties.setProperty("useSSL", "false");
            */

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/facturacionJeans2", "admin", "");

        } finally {

        }
    }
    
    private static void iniciar() {
        if (Conexion.em == null) {
            Conexion.emf = Persistence.createEntityManagerFactory("facturacion4toCicloPU");          
        }
        Conexion.em = Conexion.emf.createEntityManager();
    }

    public Conexion() {
        Conexion.iniciar();
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static void setEmf(EntityManagerFactory emf) {
        Conexion.emf = emf;
    }

    public static EntityManager getEm() {
        Conexion.iniciar();
        return em;
    }

    public static void setEm(EntityManager em) {
        Conexion.em = em;
    }

    public static void main(String[] args) {
        new Conexion();
    }
}

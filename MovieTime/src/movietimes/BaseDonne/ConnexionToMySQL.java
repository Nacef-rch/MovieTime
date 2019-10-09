/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package movietimes.BaseDonne;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Administrateur
 */
public class ConnexionToMySQL {
    Connection c =null;
    Statement stmt =null;
    
    public ConnexionToMySQL() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bibliotheque";
        c = DriverManager.getConnection(url,"root","");
        
        System.out.println("tester l'écriture des données :");
        stmt = c.createStatement();
        String requete = "insert into livres values ('107','A','B','C','D','F')";
        int nb = stmt.executeUpdate(requete);
        if(nb==0)
            System.out.println("Echec d'ajout");
        else
            System.out.println("ajout reussi");
        
        System.out.println("tester la lecture des données avec ResultaSet :");
        
        ResultSet rs = stmt.executeQuery("select * from livres");
        
        while(rs.next())
        {
            System.out.println("Code du livre : "+ rs.getString(1));
            System.out.println("Nom Auteur : "+ rs.getString(2));
            System.out.println("Prenom Auteur : "+ rs.getString(3));
            System.out.println("Titre du livre : "+ rs.getString(4));
            System.out.println("Categorie du livre : "+ rs.getString(5));
            System.out.println("ISBN du livre : "+ rs.getString(6));
        }
        
    }
    public static void main(String[] args)
    {
        
            try {
                new ConnexionToMySQL();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        
    }
}

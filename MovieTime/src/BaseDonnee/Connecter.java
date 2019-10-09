/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDonnee;

/**
 *
 * @author FIRAS KAABI
 */
import java.sql.*;
import java.awt.*;
public class Connecter {
    Connection con;
    String urlPilote="com.mysql.jdbc.Driver";
    String urlBaseDonnee="jdbc:mysql://localhost:3306/bdmovietime1";
    
    
    public Connecter() {
        try{
            Class.forName(urlPilote);
        }catch(ClassNotFoundException ec){
            System.out.println("class not found");
        }
        try{
            con=DriverManager.getConnection(urlBaseDonnee,"root","");
            System.out.println("connexion a la base de donnee reussi");
           }catch(SQLException e){
               System.out.println("erruer sql");
           }
        }
    public Connection ObtenirConnexion(){
        return con;
    }
    
    }
    
            
    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movietimes.view;

import BaseDonnee.Connecter;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static javafx.scene.input.KeyCode.R;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import movietimes.view.User.LoginController;

/**
 * FXML Controller class
 *
 * @author NACEF
 */
public class FilmViewController implements Initializable {

    @FXML
    private WebView Trailer;
    @FXML
    private JFXButton close;
    @FXML
    private JFXButton TicketClick;
    @FXML
    private Label Title;
    @FXML
    private Label Year;
    @FXML
    private Label Time;
    @FXML
    private Label Genre;
    @FXML
    private JFXTextArea Description;
     Statement stmt;
    Connecter maconnexion=new Connecter();
    @FXML
    private ImageView posterbag;
    @FXML
    private ImageView Notee;
    @FXML
    private ImageView bgM;
    public int nextio ;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        /* try {
                      stmt=maconnexion.ObtenirConnexion().createStatement();
                      ResultSet rs=stmt.executeQuery("select *from client");
                     Boolean ok=false;
                      while(rs.next()){
                         
                        }
                   
                      System.out.println(ok);
                  } catch (SQLException ex) {
                      System.out.println(ex.toString());
                  }  */

    
            } 
    
      public void myFunction(int x,String text,String annee,String genre,String urlfilm,String timee,String img,String nota,String desp) 
{
    nextio=x;
   
Title.setText(text);
Year.setText(annee);
Genre.setText(genre);
Time.setText(timee);
Description.setText(desp);
posterbag.setImage(new Image(getClass().getResource("Icons/MainView/Posters/"+img).toExternalForm()));
bgM.setImage(new Image(getClass().getResource("Icons/MainView/Bg/"+img).toExternalForm()));
Notee.setImage(new Image(getClass().getResource("Icons/MainView/"+nota).toExternalForm()));
        WebEngine engine = Trailer.getEngine();
    engine.load(
      urlfilm
    );
    
}
    @FXML
    public void changeScreenButtonFilm(ActionEvent event) throws IOException
         {
             Parent Filminfo = FXMLLoader.load(getClass().getResource("MainView.fxml"));
             Scene FilminfoScene = new Scene(Filminfo);
             
             Stage Window = (Stage)((Node)event.getSource()).getScene().getWindow();
             
             Window.setScene(FilminfoScene);
             Window.show();
             Trailer.getEngine().load(null);
             
          }
    @FXML
    public void changeScreenButtonTicket(ActionEvent event) throws IOException
         {
              /*Parent root = FXMLLoader.load(getClass().getResource("User/Login.fxml"));
        
              Stage stage = new Stage(); 
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();*/
         try {
            FXMLLoader loader=new FXMLLoader(getClass().getResource("User/Login.fxml"));
            Parent root = (Parent) loader.load();

            LoginController secController=loader.getController();
            secController.myFunction1(nextio);

            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
            
          }
   
  
}

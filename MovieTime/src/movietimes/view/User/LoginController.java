/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movietimes.view.User;

import BaseDonnee.Connecter;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.sun.jnlp.ApiDialog.DialogResult;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author NACEF
 */
public class LoginController implements Initializable {
    Statement stmt;
    Connecter maconnexion=new Connecter();
    int  id;
       @FXML
    private JFXButton login;

    @FXML
    private JFXButton passwordr;

    @FXML
    private JFXButton exit;
    
        @FXML
    private AnchorPane pane;
    @FXML
    private JFXButton Sign;
    private Label messge;
    private double xoffset;
    private double yoffset;
    @FXML
    private JFXTextField UserName;
    @FXML
    private JFXPasswordField UserPass;
    @FXML
          
            
    
    void closedapp(ActionEvent event) {
          Stage stage = (Stage) exit.getScene().getWindow();
   
    stage.close();

    }

    @FXML
    void makelogin(ActionEvent event) throws IOException {
        String user=UserName.getText();
        String password=UserPass.getText();
       try {
                      stmt=maconnexion.ObtenirConnexion().createStatement();
                      ResultSet rs=stmt.executeQuery("select *from client");
                     Boolean ok=false;
                      while(rs.next()){
                          if((rs.getString(1).equals(user))&&(rs.getString(3).equals(password))){
                              ok=true;
                             }

                        }
                     if(ok==true){
                        Stage stage1 = (Stage) exit.getScene().getWindow(); 
                        stage1.close();
                         try {
                             
            FXMLLoader loader=new FXMLLoader(getClass().getResource("Booking.fxml"));
            Parent root = (Parent) loader.load();

            BookingController seController=loader.getController();
            seController.myFunction2(id ,user);

            Stage stage2=new Stage();
            stage2.initStyle(StageStyle.TRANSPARENT);
            stage2.setScene(new Scene(root));
            stage2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
                    /*   Parent root = FXMLLoader.load(getClass().getResource("Booking.fxml"));
                      Stage stage2 = new Stage(); 
                       Scene scene = new Scene(root);
                       stage2.initStyle(StageStyle.TRANSPARENT);
                       stage2.setScene(scene);
                       stage2.show();*/
                      }   else
                          {
                       messge = new Label();
        messge.setLayoutX(96.0);
        messge.setLayoutY(370.0);
        messge.setPrefHeight(17.0);
        messge.setPrefWidth(197.0);
        messge.setText("Password or username wrong !");
        messge.setTextFill(javafx.scene.paint.Color.valueOf("#b095fb"));
        pane.getChildren().add(messge);                      }
                      System.out.println(ok);
                  } catch (SQLException ex) {
                      System.out.println(ex.toString());
                  }  
        /* Parent Filminfo = null;
            try {
                Filminfo = FXMLLoader.load(LoginController.this.getClass().getResource("Booking.fxml"));
            }catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }   Scene FilminfoScene = new Scene(Filminfo);
            Stage Window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            Window.setScene(FilminfoScene);
            Window.show();       */   
       
     
     /*Parent root = FXMLLoader.load(getClass().getResource("Ticket.fxml"));
        
              Stage stage = new Stage(); 
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
       */
        
           /* try {
            Parent secondView;
            secondView = (AnchorPane) FXMLLoader.load(getClass().getResource("Ticket.fxml"));
            
            Scene newScene = new Scene(secondView);
            Stage curStage = (Stage) pane.getScene().getWindow();
            
            curStage.setScene(newScene);
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
*/
    }

    @FXML
    void passwordreset(ActionEvent event)  throws IOException {
       
        
        
           }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void makeFadeOut(){
        FadeTransition fadeTransition = new  FadeTransition();
        fadeTransition.setDuration(Duration.millis(1));
        fadeTransition.setNode(pane);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.setOnFinished((ActionEvent Event) ->{

                loadNext();
     
            
        }
        );
        fadeTransition.play();
               
        
    }
    private void loadNext(){
        
        try {
            Parent secondView;
            secondView = (AnchorPane) FXMLLoader.load(getClass().getResource("Register.fxml"));
            
            Scene newScene = new Scene(secondView);
            Stage curStage = (Stage) pane.getScene().getWindow();
            
            curStage.setScene(newScene);
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @FXML
    private void SignUp(ActionEvent event) {
         /*Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXMLSignUp.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
                app_stage.setScene(home_page_scene);
                app_stage.show();  
        makeFadeOut();*/
        
         makeFadeOut();
    }
    public void myFunction1(int x){
        id=x;
        System.out.print("Login : "+x);
    }
}

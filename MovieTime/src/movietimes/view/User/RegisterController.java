/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movietimes.view.User;

import BaseDonnee.Connecter;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
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
public class RegisterController implements Initializable {
        Statement stmt;
    Connecter maconnexion=new Connecter();
 @FXML
    private AnchorPane Pane;
 
    private Label label;
    @FXML
    private ImageView plat;
    @FXML
    private ImageView logo;
    @FXML
    private ImageView userlogo;
    @FXML
    private ImageView passlogo1;
    @FXML
    private JFXTextField user;
    @FXML
    private JFXPasswordField pass;
    @FXML
    private JFXPasswordField pass2;
    @FXML
    private ImageView passlogo2;
    @FXML
    private JFXTextField Email;
      @FXML
    private ImageView Emaillogo;
    @FXML
    private JFXDatePicker Dateselector;
    @FXML
    private JFXButton exit;
    @FXML
    private JFXButton Signup;
    private Label messge;

    
    
     

    
    
    @FXML
    void makeregister(ActionEvent event) throws IOException {
        String UserName=user.getText();
        String password=pass.getText();
        String mail=Email.getText();
        String requete="insert into client(username,mail,password,date) values('"+UserName+"','"+mail+"',"+password+"',''1998-10-10')";
       try {
                        stmt=maconnexion.ObtenirConnexion().createStatement();

                     int nb=stmt.executeUpdate(requete);
                     if(nb==0){
                   
                     }else
                     {
                     
                     
                     }
                     /// Boolean ok=false;
                      ResultSet rs1=stmt.executeQuery("select *from client");

                      while(rs1.next()){
                            System.out.println(rs1.getString(1));

                        }
                   /*  if(ok==true){
                        Stage stage1 = (Stage) exit.getScene().getWindow(); 
                          stage1.close();
                       Parent root = FXMLLoader.load(getClass().getResource("Booking.fxml"));
                      Stage stage2 = new Stage(); 
                       Scene scene = new Scene(root);
                       stage2.initStyle(StageStyle.TRANSPARENT);
                       stage2.setScene(scene);
                       stage2.show();
                      }   else
                          {
                       messge = new Label();
        messge.setLayoutX(96.0);
        messge.setLayoutY(370.0);
        messge.setPrefHeight(17.0);
        messge.setPrefWidth(197.0);
        messge.setText("Password or username wrong !");
        messge.setTextFill(javafx.scene.paint.Color.valueOf("#b095fb"));
        Pane.getChildren().add(messge);                      }
                      System.out.println(ok);*/
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
    
    public void initialize(URL url, ResourceBundle rb) {
        //Animation !
        
        
        
        
        TranslateTransition transitionlogo = new TranslateTransition(Duration.seconds(1.2),logo);
        transitionlogo.setToY(-80);
        ScaleTransition Scalelogo = new ScaleTransition(Duration.seconds(1),logo);
        Scalelogo.setToY(0.50);
        Scalelogo.setToX(0.50);
        TranslateTransition transitionUserlogo = new TranslateTransition(Duration.seconds(1.2),userlogo);
        transitionUserlogo.setToY(-140);
         TranslateTransition transitionPasslogo1 = new TranslateTransition(Duration.seconds(1.2),passlogo1);
        transitionPasslogo1.setToY(-125);
        TranslateTransition transitionUser = new TranslateTransition(Duration.seconds(1.2),user);
        transitionUser.setToY(-140);
        TranslateTransition transitionPass1 = new TranslateTransition(Duration.seconds(1.2),pass);
        transitionPass1.setToY(-125);
        
        FadeTransition Fadepass2 = new FadeTransition(Duration.seconds(1.2),pass2);
        Fadepass2.setFromValue(0.0);
        Fadepass2.setToValue(1.0);
             TranslateTransition transitionPass2 = new TranslateTransition(Duration.seconds(1.2),pass2);
        transitionPass2.setToY(-110);
        
            FadeTransition Fadepasslogo = new FadeTransition(Duration.seconds(1.2),passlogo2);
        Fadepasslogo.setFromValue(0.0);
        Fadepasslogo.setToValue(1.0);
             TranslateTransition transitionPasslogo2 = new TranslateTransition(Duration.seconds(1.2),passlogo2);
        transitionPasslogo2.setToY(-110);
        
         FadeTransition FadeEmail = new FadeTransition(Duration.seconds(1.2),Email);
        FadeEmail.setFromValue(0.0);
       FadeEmail.setToValue(1.0);
             TranslateTransition transitionEmail = new TranslateTransition(Duration.seconds(1.2),Email);
        transitionEmail.setToY(-95);
        
            FadeTransition FadeEmaillogo = new FadeTransition(Duration.seconds(1.2),Emaillogo);
        FadeEmaillogo.setFromValue(0.0);
        FadeEmaillogo.setToValue(1.0);
             TranslateTransition transitionEmaillogo = new TranslateTransition(Duration.seconds(1.2),Emaillogo);
        transitionEmaillogo.setToY(-95);
        
            FadeTransition FadeDateselector = new FadeTransition(Duration.seconds(1.2),Dateselector);
        FadeDateselector.setFromValue(0.0);
        FadeDateselector.setToValue(1.0);
             TranslateTransition transitionDateselector = new TranslateTransition(Duration.seconds(1.2),Dateselector);
        transitionDateselector.setToY(-80);
        
             FadeTransition FadeSignup = new FadeTransition(Duration.seconds(1.2),Signup);
        FadeSignup.setFromValue(0.0);
        FadeSignup.setToValue(1.0);
             TranslateTransition transitionSignup = new TranslateTransition(Duration.seconds(1.2),Signup);
        transitionSignup.setToY(-80);
        
        
        
        
        
        
        ParallelTransition parallelogo = new ParallelTransition(
                transitionlogo,
                Scalelogo,
                transitionPasslogo1,
                transitionUserlogo,
                transitionUser,
                transitionPass1,
                Fadepass2,
                transitionPass2,
                Fadepasslogo,
                transitionPasslogo2,
                FadeEmail,
                transitionEmail,
                FadeEmaillogo,
                transitionEmaillogo,
                FadeDateselector,
                transitionDateselector,
                transitionSignup,
                FadeSignup
                
                
                
                
                
                
                
        );
        parallelogo.play();
        
        
    }    

    @FXML
     void closedapp(ActionEvent event) {
         Stage stage = (Stage) exit.getScene().getWindow();
   
    stage.close();
    }
 
    @FXML
    private void Sign(ActionEvent event) {
           String UserName=user.getText();
        String password=pass.getText();
        String password2=pass2.getText();
        String mail=Email.getText();
        String datee=Dateselector.getValue().toString();
      //  String requete="insert into client(username,mail,password,date) values('"+UserName+"','"+mail+"',"+password+"','1998-10-10');";
      
      
      
      
        messge = new Label();
        messge.setLayoutX(96.0);
        messge.setLayoutY(370.0);
        messge.setPrefHeight(17.0);
        messge.setPrefWidth(197.0);
        messge.setText("firas kaabi");
         messge.setTextFill(javafx.scene.paint.Color.valueOf("#b095fb"));
        Pane.getChildren().add(messge); 
     if(UserName.length()==0 ){
       

        messge.setText("il ya champ vide!");
               Pane.getChildren().add(messge); 

       } else
        if(!isValid(mail))
       {
        
                        Pane.getChildren().remove(messge); 

        messge.setText("email non valide !");
               Pane.getChildren().add(messge); 

       }else
         if(password2.equals(password)==false){
       
                              Pane.getChildren().remove(messge); 

        messge.setText("password n'est pas identiqe");
                Pane.getChildren().add(messge); 
 
       }
      else{
                
      String requete="INSERT INTO `client` (`username`, `mail`, `password`, `date`) VALUES ('"+UserName+"', '"+mail+"', '"+password+"', '"+datee+"');";
                      System.out.println(datee);
      
      try {
                        stmt=maconnexion.ObtenirConnexion().createStatement();

                     int nb=stmt.executeUpdate(requete);
                     if(nb==0){
                   
                     }else
                     {
                   Stage stage = (Stage) exit.getScene().getWindow(); 
                        stage.close();
                         try {
                             
            FXMLLoader loader=new FXMLLoader(getClass().getResource("Booking.fxml"));
            Parent root = (Parent) loader.load();

            BookingController seController=loader.getController();
            seController.myFunction2(1 ,UserName);

            Stage stage2=new Stage();
            stage2.initStyle(StageStyle.TRANSPARENT);
            stage2.setScene(new Scene(root));
            stage2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
                     
                     }
                     /// Boolean ok=false;
                      ResultSet rs1=stmt.executeQuery("select *from client");

                      while(rs1.next()){
                            System.out.println(rs1.getString(1));

                        }
                   /*  if(ok==true){
                        Stage stage1 = (Stage) exit.getScene().getWindow(); 
                          stage1.close();
                       Parent root = FXMLLoader.load(getClass().getResource("Booking.fxml"));
                      Stage stage2 = new Stage(); 
                       Scene scene = new Scene(root);
                       stage2.initStyle(StageStyle.TRANSPARENT);
                       stage2.setScene(scene);
                       stage2.show();
                      }   else
                          {
                       messge = new Label();
        messge.setLayoutX(96.0);
        messge.setLayoutY(370.0);
        messge.setPrefHeight(17.0);
        messge.setPrefWidth(197.0);
        messge.setText("Password or username wrong !");
        messge.setTextFill(javafx.scene.paint.Color.valueOf("#b095fb"));
        Pane.getChildren().add(messge);                      }
                      System.out.println(ok);*/
                  } catch (SQLException ex) {
                      System.out.println(ex.toString());
                  }  
    }
       
    }
    public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
}
     

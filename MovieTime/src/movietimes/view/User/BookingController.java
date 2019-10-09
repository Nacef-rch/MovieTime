/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movietimes.view.User;

import BaseDonnee.Connecter;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import static java.lang.System.exit;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static javafx.scene.input.KeyCode.N;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import movietimes.view.MainViewController;

/**
 * FXML Controller class
 *
 * @author NACEF
 */
public class BookingController implements Initializable {
  public  int ch1 ;
    Statement stmt;
    Connecter maconnexion=new Connecter();
    @FXML
    private ComboBox<String> Cinema;
    @FXML
    private FlowPane LeftTh;
    @FXML
    private FlowPane flowmid;
    @FXML
    private FlowPane flowright;
      StackPane stackPane ;
      ImageView fist;
    @FXML
    private ComboBox<String> Date;
    @FXML
    private ComboBox<String> Time;
    @FXML
    private JFXButton Bookseat;
    @FXML
   
  
    /**
     * Initializes the controller class.
     */
    public String userName;
    public String pic;
    public void myFunction2(int x,String user){
        ch1=x;
        
        userName=user;
        
        System.out.println(userName);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                try {
                    stmt=maconnexion.ObtenirConnexion().createStatement();
                    ResultSet rs=stmt.executeQuery("select *from projection where idfilm='1' ");
                        Time.setPromptText("--------");
                        Cinema.setPromptText("choisir salle");
                        Time.setPromptText("---------");

                      while(rs.next()){
                          
                          System.out.println(rs.getString(1));
                          System.out.println(rs.getString(2));
                          System.out.println(rs.getString(3));
                          System.out.println(rs.getString(4));
                          System.out.println(rs.getString(5));
                          System.out.println(rs.getString(6));
                          System.out.println("**********************");
                          Time.getItems().add(rs.getString(6));
                          Date.getItems().add(rs.getString(5));
                      }
                      
                         ResultSet rs1=stmt.executeQuery("select *from salle");

                          while(rs1.next()){
                            System.out.println("***********salle********");
                            System.out.println(rs1.getString(1));
                          System.out.println(rs1.getString(2));
                          System.out.println(rs1.getString(3));
                         System.out.println("**********************");

                              Cinema.getItems().add(rs1.getString(2));
                          }

                } catch (SQLException ex) {
                    Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
                }
    /*  Time.getItems().add("11H30");
      Time.getItems().add("13H15");
      Time.getItems().add("15H00");
      Time.getItems().add("18H00");
      Time.getItems().add("19H30");
      Date.getItems().add("06/05/2019");
      Date.getItems().add("07/05/2019");
      Date.getItems().add("08/05/2019");
      Date.getItems().add("09/05/2019");*/
      
       for(int i=0; i<18; i++){
           if((i%4)==0)
           {
               addButtonTooking(i);
                LeftTh.getChildren().add(fist);
           }else
           {
              addButtonAvaible(i);
               LeftTh.getChildren().add(stackPane);
           }
         }
               for(int i=0; i<24; i++){
           if((i%3)==0)
           {
            addButtonTooking(i);
             flowmid.getChildren().add(fist);
           }else
           {
                addButtonAvaible(i);
               flowmid.getChildren().add(stackPane);  
           }
         }   for(int i=0; i<18; i++){
           if((i%6)==0)
           {
              addButtonTooking(i);
               flowright.getChildren().add(fist);
           }else
           {
               
               addButtonAvaible(i);
               flowright.getChildren().add(stackPane); 
           }
         }
      
    }    
    public void addButtonTooking(int i){
        
         
          fist = new ImageView();
           fist.setFitHeight(30.0);
        fist.setFitWidth(30.0);
        fist.setPickOnBounds(true);
        fist.setPreserveRatio(true);
        fist.setImage(new Image(getClass().getResource("icons/Chairs/whie.png").toExternalForm()));
        FlowPane.setMargin(fist, new Insets(10.0, 0.0, 0.0, 10.0));
       
    
    }
    public int place=1;
        public void addButtonAvaible(int i){
        
            ImageView chair ;
            JFXButton avaible;
           
   
        stackPane = new StackPane();
        chair = new ImageView();
        avaible = new JFXButton();
        stackPane.setPrefHeight(30.0);
        stackPane.setPrefWidth(30.0);
        chair.setFitHeight(30.0);
        chair.setFitWidth(30.0);
        chair.setPickOnBounds(true);
        
        chair.setPreserveRatio(true);
        chair.setImage(new Image(getClass().getResource("icons/Chairs/Mauv.png").toExternalForm()));
        FlowPane.setMargin(stackPane, new Insets(10.0, 0.0, 0.0, 10.0));
        stackPane.getChildren().add(chair);
        stackPane.getChildren().add(avaible);
        
        avaible.setId("chair"+i);
       
         avaible.setOnAction(new EventHandler<ActionEvent>() {
              
    @Override public void handle(ActionEvent e) {
        place=i;
        chair.setImage(new Image(getClass().getResource("icons/Chairs/blue.png").toExternalForm()));
        checkID(avaible);
       
    }
   
});
       
        

  
    }

    private void checkID(JFXButton avaible) {
        
         if (avaible.getId().equals("chair5")) {
        System.out.println("clicked");
        
   }
         String N = avaible.getId();
        System.out.println(N);

    }
    
    public void BookSeat(ActionEvent event) throws IOException {
              
        Stage stage1 = (Stage) Bookseat.getScene().getWindow();
   
    stage1.close();
    
    
    
      /*Parent root = FXMLLoader.load(getClass().getResource("Seat.fxml"));
      Stage stage2 = new Stage(); 
        Scene scene = new Scene(root);
        stage2.initStyle(StageStyle.TRANSPARENT);
        stage2.setScene(scene);
        stage2.show();*/
      FXMLLoader loader=new FXMLLoader(getClass().getResource("Seat.fxml"));
            Parent root = (Parent) loader.load();

            SeatController secController=loader.getController();
            secController.myFunction3(ch1,userName,Cinema.getValue(),Date.getValue());

            Stage stage=new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(new Scene(root));
            stage.show();
       
  

    }

 

}
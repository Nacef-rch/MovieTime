/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movietimes.view;

import BaseDonnee.Connecter;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author NACEF
 */
public class MainViewController implements Initializable {
    @FXML
     private BorderPane BPane;

    @FXML
    private ImageView Logo;
    @FXML
    private JFXButton Films;
    @FXML
    private JFXButton Series;
    @FXML
      private JFXComboBox<String> Genre;
    @FXML
    private JFXComboBox<String> Trier;
    @FXML
    private FlowPane FilmPane;
    @FXML
    private TextField Recherchetext;
    @FXML
    private Button recherchebutton;
 Statement stmt;
    Connecter maconnexion=new Connecter();
     int index ;
    int target = 10;
    public int i;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       try {
                      stmt=maconnexion.ObtenirConnexion().createStatement();
                      ResultSet rs=stmt.executeQuery("select *from film");
                     
                      while(rs.next()){
                          int x=Integer.parseInt(rs.getString(1));
                         addButton(rs.getString(2),rs.getString(3),rs.getString(8),rs.getString(5),rs.getString(9),rs.getString(4),rs.getString(6),rs.getString(7),x);
                        }
                   
                      
                  } catch (SQLException ex) {
                      System.out.println(ex.toString());
                  }  
      
      
       /*  for(int i=0; i<18; i++){
           addButton("Avengers : End Game","2019","film.png",i);
         }*/
       Genre.getItems().add("Tous");
Genre.getItems().add("Action");
Genre.getItems().add("Adventure"); 
Genre.getItems().add("Comedy");
Genre.getItems().add("Crime"); 
Genre.getItems().add("Drama");
Genre.getItems().add("Fantasy"); 
Genre.getItems().add("Historical fiction");
Genre.getItems().add("Horror");
 
         Genre.setPromptText("Tous");



Trier.getItems().add("Annéé ↑");
Trier.getItems().add("Annéé ↓");
Trier.getItems().add("Titre ↑");
Trier.getItems().add("Titre ↓");
Trier.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              FilmPane.getChildren().clear();
                              Genre.setValue("Tous");
                              
              String value=Trier.getValue().toLowerCase();
                

 
                try {
                    stmt=maconnexion.ObtenirConnexion().createStatement();
                  
                    if(value.equals("annéé ↑")){
                                      FilmPane.getChildren().clear();

                      ResultSet rs=stmt.executeQuery("select *from film order by annee asc");
                   
                      while(rs.next()){
                          int x=Integer.parseInt(rs.getString(1));
                          addButton(rs.getString(2),rs.getString(3),rs.getString(8),rs.getString(5),rs.getString(9),rs.getString(4),rs.getString(6),rs.getString(7),x);
                      }
                    
                    }else
                    if(value.equals("annéé ↓")){
                       FilmPane.getChildren().clear();

                      ResultSet rs=stmt.executeQuery("select *from film order by annee desc");
                   
                      while(rs.next()){
                          int x=Integer.parseInt(rs.getString(1));
                          addButton(rs.getString(2),rs.getString(3),rs.getString(8),rs.getString(5),rs.getString(9),rs.getString(4),rs.getString(6),rs.getString(7),x);
                      }
                    
                    
                    }
                    
                    else
                      if(value.equals("titre ↑")){
                        
                      FilmPane.getChildren().clear();
                      ResultSet rs=stmt.executeQuery("select *from film order by nom asc");
                   
                      while(rs.next()){
                          int x=Integer.parseInt(rs.getString(1));
                          addButton(rs.getString(2),rs.getString(3),rs.getString(8),rs.getString(5),rs.getString(9),rs.getString(4),rs.getString(6),rs.getString(7),x);
                      }
                      }
                      else{
                     FilmPane.getChildren().clear();
                      ResultSet rs=stmt.executeQuery("select *from film order by nom desc");
                   
                      while(rs.next()){
                          int x=Integer.parseInt(rs.getString(1));
                          addButton(rs.getString(2),rs.getString(3),rs.getString(8),rs.getString(5),rs.getString(9),rs.getString(4),rs.getString(6),rs.getString(7),x);
                      }
                 
                    }
                        

                } catch (SQLException ex) {
                    Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
         recherchebutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              FilmPane.getChildren().clear();
              String text=Recherchetext.getText().toLowerCase();
                try {
                    stmt=maconnexion.ObtenirConnexion().createStatement();
                    ResultSet rs=stmt.executeQuery("select *from film where nom like '%"+text+"%'");
                 
                      while(rs.next()){

                          
                          
                          int x=Integer.parseInt(rs.getString(1));
                          addButton(rs.getString(2),rs.getString(3),rs.getString(8),rs.getString(5),rs.getString(9),rs.getString(4),rs.getString(6),rs.getString(7),x);
                        
                      
                      }

                } catch (SQLException ex) {
                    Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         
         });
        Genre.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              FilmPane.getChildren().clear();
 
                try {
                    String value=Genre.getValue();
                    stmt=maconnexion.ObtenirConnexion().createStatement();
                    ResultSet rs=stmt.executeQuery("select *from film");
                 if(value.equals("Tous")){
                 while(rs.next()){ 
                     int x=Integer.parseInt(rs.getString(1));
                          addButton(rs.getString(2),rs.getString(3),rs.getString(8),rs.getString(5),rs.getString(9),rs.getString(4),rs.getString(6),rs.getString(7),x);
                        }
                 }else{
                      while(rs.next()){

                          System.out.println(value.toLowerCase().equals(rs.getString(10).toLowerCase()));
                          
                          if(value.toLowerCase().equals(rs.getString(10).toLowerCase())){
                          int x=Integer.parseInt(rs.getString(1));
                          addButton(rs.getString(2),rs.getString(3),rs.getString(8),rs.getString(5),rs.getString(9),rs.getString(4),rs.getString(6),rs.getString(7),x);
                        }
                      
                      }
                 }

                } catch (SQLException ex) {
                    Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }    
        public void addButton(String FilmN , String FilmY , String Img,String genre,String urlfilm,String timee,String nota ,String desp,int i ){
           
   
    VBox vboxForButtons = new VBox();
    Button btnNumber = new Button();
    ImageView Poster = new ImageView();
    Label FilmName = new Label(); 
    Label FilmYear = new Label();
    
    //To change !
    Poster.setImage(new Image(getClass().getResource("Icons/MainView/Posters/"+Img).toExternalForm()));
    FilmName.setText(FilmN);
    FilmYear.setText(FilmY);
    btnNumber.setGraphicTextGap(0.0);
    btnNumber.setMnemonicParsing(false);
    btnNumber.setPrefHeight(180.0);
    btnNumber.setPrefWidth(135.0);
    btnNumber.setId("Film"+i);
    
    btnNumber.setStyle("-fx-padding: 0 0 0 0;");
    btnNumber.getStyleClass().add("Film");
    btnNumber.getStylesheets().add("/movietimes/view/stlye.css");
    btnNumber.setText("");
    Poster.setFitHeight(200.0);
    Poster.setFitWidth(135.0);
    Poster.setPickOnBounds(true);
    Poster.setPreserveRatio(true);
    Poster.getStyleClass().add("Film");
    
    btnNumber.setGraphic(Poster);
    btnNumber.setCursor(Cursor.HAND);
    FilmName.setPrefHeight(39.0);
    FilmName.setPrefWidth(150.0);
    FilmName.setStyle("-fx-padding: 0 10 0 10;");
    FilmYear.setStyle("-fx-padding: 0 10 0 10;");
    FilmName.setTextFill(javafx.scene.paint.Color.WHITE);
    FilmName.setFont(new Font("System Bold", 14.0));
    
    
    FilmYear.setTextFill(javafx.scene.paint.Color.valueOf("#463f3f"));
    
    
    btnNumber.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
           
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainViewController.this.getClass().getResource("FilmView.fxml"));
            BorderPane mainItems = null;
            try {
                mainItems = loader.load();
                FilmViewController secController=loader.getController();
                System.out.println(i);
                secController.myFunction(i,FilmN,FilmY,genre,urlfilm,timee,Img,nota,desp);
            } catch (IOException ex) {
                Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
            BPane.setCenter(mainItems);

            
        }
    
    
    
    
    /*btnNumber.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Parent Filminfo = null;
            try {
                Filminfo = FXMLLoader.load(MainViewController.this.getClass().getResource("FilmView.fxml"));
            }catch (IOException ex) {
                Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
            }   Scene FilminfoScene = new Scene(Filminfo);
            Stage Window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            Window.setScene(FilminfoScene);
            Window.show();
            
        }*/
    });
     
    vboxForButtons.getChildren().add(btnNumber);
    vboxForButtons.getChildren().add(FilmName);
    vboxForButtons.getChildren().add(FilmYear);
    vboxForButtons.setMargin(btnNumber, new Insets(20,0,2,10));
    FilmPane.getChildren().add(vboxForButtons);

}
       
        /* public void changeScreenButtonFilm(ActionEvent event) throws IOException
         {
             Parent Filminfo = FXMLLoader.load(getClass().getResource("FilmView.fxml"));
             Scene FilminfoScene = new Scene(Filminfo);
             
             Stage Window = (Stage)((Node)event.getSource()).getScene().getWindow();
             
             Window.setScene(FilminfoScene);
             Window.show();
             
          }*/

   
    
    @FXML
    public void GenreDrag(ActionEvent event) {
        System.out.println(Genre.getValue());
    }
    @FXML
    public void tireParDrag(ActionEvent event) {
        System.out.println(Trier.getValue());
    }
   private void recherche(ActionEvent event) {
    }     

    @FXML
    private void search(ActionEvent event) {
    }
    }
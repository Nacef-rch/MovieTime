/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movietimes;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author NACEF
 */
public class MovieTimes extends Application {

    
       @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/MainView.fxml"));
        
        Scene scene = new Scene(root);
       stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
   /* private void showMainItems() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MovieTimes.class.getResource("view/MainItems.fxml"));
        BorderPane MainItems = loader.load();
        root.setCenter(MainItems);
        
    }

    private void showMainview() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MovieTimes.class.getResource("view/MainView.fxml"));
        mainlayout = loader.load();
        Scene scene = new Scene(mainlayout);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
      private void showMainItems() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MovieTimes.class.getResource("view/MainItems.fxml"));
        BorderPane MainItems = loader.load();
        mainlayout.setCenter(MainItems);
        
    }
        public static void main(String[] args) {
        launch(args);
    }*/



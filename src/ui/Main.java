
package ui;


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

public class Main extends Application {
    
    private ClassroomGUI classroomGui;
    private Classroom classroom;

    public Main() {
        classroom = new Classroom();
        classroomGui = new ClassroomGUI(classroom);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainpane.fxml"));
        
        fxmlLoader.setController(classroomGui);
        
        Parent root = fxmlLoader.load();
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Classroom");
        primaryStage.show();
        
        classroomGui.loginLoad();
        
        

    }

    
    
}

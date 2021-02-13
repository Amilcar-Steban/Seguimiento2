
package ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javax.swing.JCheckBox;
import model.*;

public class ClassroomGUI implements Initializable {
    
    private Classroom classroom;
    
    @FXML
    private Pane bpMainPain;

    @FXML
    private TextField txtUsername;
    
    @FXML
    private PasswordField jPassword;
    
    @FXML
    private TextField txtUsernaeRegister;
    
    @FXML
    private PasswordField jPasswordRegister;
    
    @FXML
    private TextField txtProfileRegister;
    
    @FXML
    private DatePicker dteBirthdayRegister;
    
    @FXML
    private ComboBox<?> chbFavoriteBrowserRegister;
    
    @FXML
    private ImageView imgProfileList;
    
    @FXML
    private Label txtUsernameList;
    
    @FXML
    private TableView<UserAcount> tvList;
    
    @FXML
    private TableColumn<UserAcount, String> clUsername;
    
    @FXML
    private TableColumn<UserAcount, String> clGender;
    
    @FXML
    private TableColumn<UserAcount, String> clCareer;
    
    @FXML
    private TableColumn<UserAcount, String> clBirthday;
    
    @FXML
    private TableColumn<UserAcount, String> clBrowser;
    
    @FXML
    private MenuBar mnuHelp;
    
    @FXML
    private JCheckBox jmale;
    
    @FXML
    private JCheckBox jother;
    
    @FXML
    private JCheckBox jfemale;
    
    @FXML
    private JCheckBox jSofware;
    
    @FXML
    private JCheckBox jTelematic;
    
    @FXML
    private JCheckBox jIndustrial;
    

    public ClassroomGUI(Classroom classroom) {
        this.classroom = classroom;
        
    }
    public void loginLoad() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
        
        fxmlLoader.setController(this);
        
        Parent root = fxmlLoader.load();
        bpMainPain.getChildren().clear();
        bpMainPain.getChildren().addAll(root);
        
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void btnLogin(ActionEvent event) throws IOException {
        
        String user = txtUsername.getText();
        String password = jPassword.getText();
        
        if (user.isEmpty() || password.isEmpty()) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Campos vacios");
            alert.setContentText("llene todos los campos e inente nuevamente");

            alert.showAndWait();
        }
      
        for (int i = 0; i < classroom.getList().size() && classroom.getList().get(i)!=null ; i++) {
            if(classroom.getList().get(i).getName().equals(txtUsername.getText())) {

                if(classroom.getList().get(i).getPassword().equals(jPassword.getText())){
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Account.fxml"));
                    fxmlLoader.setController(this);
        
                    Parent root = fxmlLoader.load();
                    bpMainPain.getChildren().clear();
                    bpMainPain.getChildren().setAll(root);
                    
                }
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("Invalid Password");
                alert.setContentText("check your information and try again");

                alert.showAndWait();
            }
            
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Invalid Username");
            alert.setContentText("check your information and try again");

            alert.showAndWait();
            
        }
    }
    @FXML
    private void btnSingup(ActionEvent event) throws IOException {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Register.fxml"));
        
        fxmlLoader.setController(this);
        
        Parent root = fxmlLoader.load();
        bpMainPain.getChildren().clear();
        bpMainPain.getChildren().setAll(root);
        
    }
    

    @FXML
    private void btnBrowserRegister(ActionEvent event) {

    }

    @FXML
    private void chbMaleRegister(ActionEvent event) {
        
        jfemale.setSelected(false);
        jother.setSelected(false);

    }

    @FXML
    private void chFemaleRegister(ActionEvent event) {
        
        jmale.setSelected(false);
        jother.setSelected(false);
    }

    @FXML
    private void chbOtherRegister(ActionEvent event) {
        
        jfemale.setSelected(false);
        jmale.setSelected(false);
    }

    @FXML
    private void chbSofwareRegister(ActionEvent event) {
        jTelematic.setSelected(false);
        jIndustrial.setSelected(false);
    }

    @FXML
    private void chbTelematicRegister(ActionEvent event) {
        jSofware.setSelected(false);
        jIndustrial.setSelected(false);
        
    }

    @FXML
    private void chbIndustrialRegister(ActionEvent event) {
        jTelematic.setSelected(false);
        jSofware.setSelected(false);
    }

    @FXML
    private void btnCreateAccount(ActionEvent event) {
        String username = txtUsernaeRegister.getText();
        String password = jPasswordRegister.getText();
        String gender;
        
        if (jmale.isSelected()) {
             gender = jmale.getText();
        }
        else if(jfemale.isSelected()){
             gender = jfemale.getText();
        }
        else if(jother.isSelected()){
            gender = jother.getText();
        }
        String career;
        if (jSofware.isSelected()) {
             career = jSofware.getText();
        }
        else if(jTelematic.isSelected()){
             career = jTelematic.getText();
        }
        else if(jIndustrial.isSelected()){
            career = jIndustrial.getText();
        }

    }
    
    @FXML
    private void btnSinginRegister(ActionEvent event) throws IOException {
        
        
    }

    @FXML
    private void bnLogOut(ActionEvent event) {
    }
    
    @FXML
    private void dateRegister(ActionEvent event) {
        
    }
    @FXML
    private void favoriteBrowser(ActionEvent event) {
        
    }
    public void initializeTable() {
        
        ObservableList<UserAcount> array = FXCollections.observableArrayList(classroom.getList());
		 
        clUsername.setCellValueFactory(new PropertyValueFactory<UserAcount,String>("name"));
	clGender.setCellValueFactory(new PropertyValueFactory<UserAcount,String>("genre"));
	clCareer.setCellValueFactory(new PropertyValueFactory<UserAcount,String>("career"));
	clBirthday.setCellValueFactory(new PropertyValueFactory<UserAcount,String>("birthday"));
	clBrowser.setCellValueFactory(new PropertyValueFactory<UserAcount,String>("f_Browser"));
		 
	tvList.setItems(array);
	 }
    
    
    
}

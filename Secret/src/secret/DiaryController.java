package secret;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.controlsfx.control.HiddenSidesPane;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;


import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import jfxtras.scene.control.LocalDateTextField;
import saveData.Save;
import saveData.SqlQuery;

public class DiaryController implements Initializable{
	@FXML
    private AnchorPane anchor;
    @FXML
    private JFXHamburger ham;
    @FXML
    private JFXTextArea descSecret;
    @FXML
    private TextField title;
    @FXML
    private LocalDateTextField date;
    @FXML
    private Pane panel;
    @FXML
    private JFXDrawer drawer;
    @FXML
    private JFXButton okButton;
    @FXML
    private HiddenSidesPane hidden;
    @FXML
    private FontAwesomeIconView check;
   
    static AnchorPane root;
    static JFXTextArea textArea;
@Override
public void initialize(URL location, ResourceBundle resources) {
	root = anchor;
	textArea = descSecret;
    try {
    	Pane box = new Pane();
    	box = FXMLLoader.load(getClass().getResource("drawerBox.fxml"));
    	drawer.setSidePane(box);
    } catch (IOException ex) {
        Logger.getLogger(DiaryController.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
   Platform.runLater(()->{HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(ham);
   transition.setRate(-1);
   ham.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)->{
       transition.setRate(transition.getRate()* -1);
       transition.play();
       
       if(drawer.isShown())
       {
           drawer.close();
       }else
           drawer.open();
   });}); 
    
okButton.setGraphic(check);

}
private int checkIfInputCorrect() throws ClassNotFoundException, SQLException {
	if((!title.getText().isEmpty()) && (!date.getText().isEmpty())) {
	    // Get the uniques texts fields you want to use as check for duplicate
		String t = title.getText();			
	            // Access all titles in database
	            ObservableList<Save> check  = SqlQuery.searchTitle();           
	            // boolean to check if already exists
	            boolean addNewTitle = true;
	            // Loop through OL where title (lowercase) is 
	            for (Save titles : check) {
	                String exist = titles.getTitle();
	                    if(t.equalsIgnoreCase(exist)) {
				addNewTitle = false;        }
	  }
				// only if none was same --> add
				if(addNewTitle) {
	                         //add new title if no duplicate
					return 0;
				} else {
	                            // title already exist update
					return 1;   }
			} else { 
	                    // textfieds empty
				return 2;}
		}
	  
	    //action event to fire staffLoad button
@FXML
void saveSecrets(ActionEvent event) {
	try {
		if (checkIfInputCorrect() == 0) {
	            // Access updated values from edit boxes
	            String username = adminName.getText();
	            String password = adminPassword.getText();
	            String stat = adminStatus.getText();
	          // Create Employee object to access employeeId
	        panel loginId = adminTable.getSelectionModel().getSelectedItem();
	        int Id = loginId.getid();
	        //update method called
	        SqlQuery.updateAdmin(Id, username, password, stat);
	            // Update the displayed Employees again with changes
	                 adminLoad.fire();
	                    // clear edit fields
	                    emptyAdmin();
	 }   else if(checkIfInputCorrect() == 1) {
	            // Show alert usename already exist
		showAlertError("Failure:" + adminName.getText() + " has already been inserted");
	 }
	     else if (checkIfInputCorrect() == 2 ){
	                        showAlertInformation("all fields required");
	                        }
	            }catch (SQLException e) {
				throw e;
			}
	    
	
	
	
	
}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

}

}

package secret;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXNodesList;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.animation.Interpolator;
import javafx.animation.KeyValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import saveData.Save;
import saveData.SqlQuery;


public class SaveController implements Initializable{
    
	@FXML
    private AnchorPane anchor;
	@FXML
    private TableView<Save> Intro;
    @FXML
    private TableColumn<Save, Integer> id;
    @FXML
    private TableColumn<Save, String> date;
    @FXML
    private TableColumn<Save,String > title;
   
    @FXML
    private JFXButton delete;
    @FXML
    private JFXButton check;
    @FXML
    private JFXButton floatBut;
    @FXML
    private JFXButton newData;
    
    @FXML
    private FontAwesomeIconView end;
    @FXML
    private FontAwesomeIconView view;
    @FXML
    private FontAwesomeIconView cross;

    
        @Override
    public void initialize(URL location, ResourceBundle resources)  {
    	try {
    	loadTitle();
    	}catch(SQLException e) {}
    	catch(ClassNotFoundException e) {}
    	
    	id.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
    	date.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
    	title.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
    
    	
    	
    	Intro.setRowFactory((TableView<Save> tableView) -> {
            final TableRow<Save> row = new TableRow<>();
            // Use MouseEvent
            row.addEventFilter(MouseEvent.MOUSE_PRESSED, (MouseEvent event1) -> {
                final int index = row.getIndex();
                // Apply to employeeTable
                if (index >= 0 && index < Intro.getItems().size() && Intro.getSelectionModel().isSelected(index)) {
                    event1.consume();
                }
            });
            return row;
            });
        
        //add text to intro table 
     Intro.setPlaceholder(new Label("No Content Saved")); //
     
     buttonsNode();
     
    
    	
}

    // display observable list title to intro table
    private void populateTitle(ObservableList<Save> Title) throws ClassNotFoundException {
    		Intro.setItems(Title);   }

public void loadTitle() throws ClassNotFoundException, SQLException  {
	ObservableList<Save> save = SqlQuery.searchTitle();
    populateTitle(save);
	
	
}

 public void buttonsNode() {
	// cross.setGlyphName("cross");
	// view.setGlyphName("check");
	// end.setGlyphName("close");
	 
	 floatBut.setGraphic(cross);
	 check.setGraphic(view);
	 delete.setGraphic(end);
		
JFXNodesList nodesList3 = new JFXNodesList();
			nodesList3.setSpacing(10);
			// init nodes
			nodesList3.addAnimatedNode(floatBut, (expanded)->
                        { return new ArrayList<KeyValue>(){
                        { add(new KeyValue(view.rotateProperty(), expanded? 360:0 , Interpolator.EASE_BOTH));}
                        { add(new KeyValue(end.rotateProperty(), expanded? 360:0 , Interpolator.EASE_BOTH));}
                        
                        };});
			nodesList3.addAnimatedNode(check);
			nodesList3.addAnimatedNode(delete);
                        nodesList3.setRotate(90);
                        nodesList3.setTranslateX(288);
                        nodesList3.setTranslateY(168);
                        anchor.getChildren().add(nodesList3);
                        
					
 }   
 @FXML
 void createData(ActionEvent event) throws IOException {
	 ((Node) event.getSource()).getScene().getWindow().hide();
	 newScene();    
 }

 @FXML
 void deleteData(ActionEvent event) throws ClassNotFoundException,SQLException {
	 try {
		    ObservableList<Save> deleteRows = Intro.getSelectionModel().getSelectedItems();
			for (Save selectedData : deleteRows) {
		                    // delete
		       JOptionPane.showMessageDialog(null, "are you sure you want to delete");
		    SqlQuery.deleteStaffWithId(selectedData.getid());
		    // Update the displayed Employees again with changes 
		    loadTitle();
			}
				// resultArea.setText("Employee deleted!\n");
			JOptionPane.showMessageDialog(null, "Secret deleted");
		            } catch (SQLException e) {
			// resultArea.setText("Problem occurred while deleting employee " + e);
				throw e;    }  
 }

 @FXML
 void loadData(MouseEvent event) {

 }
 public void newScene(){
	 try{
	             Stage userStage = new Stage();
	             FXMLLoader loader = new FXMLLoader();
	             AnchorPane root = (AnchorPane)loader.load(getClass().getResource("/secret/Diary.fxml").openStream());

	             DiaryController diaryController = (DiaryController)loader.getController();
	             Scene scene = new Scene(root);            
	             
	             userStage.setScene(scene);
	             userStage.setTitle("ADMINISRATION");
	             userStage.setResizable(true);
	             userStage.show();
	         } catch (IOException e){
	         }	         }
    
    
    
    
    public static void main(String[] args) {	}
}

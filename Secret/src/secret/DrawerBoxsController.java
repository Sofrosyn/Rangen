package secret;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXColorPicker;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import jfxtras.scene.control.LocalDateTextField;


public class DrawerBoxsController implements Initializable{
	@FXML
    private ImageView image;
    @FXML
    private ComboBox<Integer> fontSize;
    @FXML
    private ComboBox<String> font;
    @FXML
    private ColorPicker colorPick;
    @FXML
    private JFXButton okButton;
    @FXML
    private GridPane grid;
    
            
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	DiaryController.root.setStyle("-fx-background-color: darkgoldenrod");
    
    	Docolor();
        
       
}

private String RGBString(Color c) {
    return "-fx-base: rgb(" + (c.getRed() * 255) + "," + (c.getGreen() * 255) + "," + (c.getBlue() * 255) + ");";
}
/*private String RGBGrid(Color c) {
    return "-fx-backgroung-color : "+ c +"";
} */

private String TextFill(Color c) {
	return "-fx-text-fill: rgb(" + (c.getRed() * 210) + "," + (c.getGreen() * 170) + "," + (c.getBlue() * 12) + ");";
}
private String TextFont(String c) {
	return "-fx-font-family:"+c+" ";
}
private String TextSize(String c) {
	return "-fx-font-size:"+c+" ";
}

public void Docolor() {
ObservableList<String>ol = FXCollections.observableArrayList("Arial","Algerian","cambria","calibri","candara","centaur","chiller","consolas","century","forte","freestyle script");	
font.setItems(ol);
font.setValue("Arial");

ObservableList<Integer>os = FXCollections.observableArrayList(12,14,18,20,24,28,32);	

fontSize.setItems(os);
fontSize.setValue(1);
fontSize.setOnAction((g)->{
	String s = fontSize.getValue().toString();
	DiaryController.textArea.setStyle(TextSize(s));	
});

	colorPick.setOnAction((e)->{
		Color change = colorPick.getValue();
		DiaryController.root.setStyle(RGBString(change));
		DiaryController.textArea.setStyle(TextFill(change));
                
    	});	
	
	font.setOnAction((v)->{
	String s = font.getValue().toString();	
	DiaryController.textArea.setStyle(TextFont(s));	
	});
	
	
	
}
public void saveSetup() {
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

}

}

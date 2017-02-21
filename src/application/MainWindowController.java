package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MainWindowController {
	
	public Main main;
	
	@FXML private AnchorPane anchorMenu;
	@FXML private AnchorPane anchorMain;
	
	@FXML private Button manualStore;
	@FXML private Button autoStore;
	@FXML private Button search;
	@FXML private Button config;
	@FXML private Button stop;
	@FXML private Button searchDoc;
	@FXML private Button save;
	
	@FXML private Label labelActualDoc;
	@FXML private Label labelPath;
	@FXML private Label labelKeywords;
	@FXML private Label labelDate;
	@FXML private Label labelKeywordOne;
	@FXML private Label labelKeywordTwo;
	@FXML private Label labelKeywordThree;
	@FXML private Label labelKeywordFour;
	@FXML private Label labelKeywordFive;
	
	@FXML private ComboBox<String> listKeywordOne;
	@FXML private ComboBox<String> listKeywordTwo;
	@FXML private ComboBox<String> listKeywordThree;
	@FXML private ComboBox<String> listKeywordFour;
	@FXML private ComboBox<String> listKeywordFive;
	
	@FXML private ImageView imageActualDoc;
	
	@FXML private DatePicker datePicker;
	
	public void setMain(Main main) {
				this.main = main;
			}

}

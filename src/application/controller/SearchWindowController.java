package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

/**
 * Controller für das Fenster zur Dokumentensuche
 * 
 * @author kerstin, helge, chris, holger
 *
 */
public class SearchWindowController {
	
	@FXML
    private DatePicker dateFrom;

    @FXML
    private DatePicker dateTill;

    @FXML
    private ChoiceBox<String> listSearchKeywordOne;

    @FXML
    private ChoiceBox<String> listSearchKeywordTwo;

    @FXML
    private ChoiceBox<String> listSearchKeywordThree;

    @FXML
    private ChoiceBox<String> listSearchKeywordFour;

    @FXML
    private ChoiceBox<String> listSearchKeywordFive;

    @FXML
    private Button buttonSearch;

    @FXML
    private ListView<String> listResult;

    @FXML
    private Button zoomPlus;

    @FXML
    private Button zoomMinus;

    @FXML
    private Button print;

    @FXML
    private Button send;

    @FXML
    private ImageView choosenDoc;
    

    @FXML
    private Button newStore;

}

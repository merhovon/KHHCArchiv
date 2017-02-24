package application;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

/**
 * KK170222
 * In der Controllerklasse passiert die ganze Action der Seite
 * Jede Seite hat ihre eigene Controllerklasse
 */
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import sun.misc.ExtensionInfo;

public class MainWindowController {

	public Main main;
	/**
	 * KK 170222 hier müssen nur die Elemente, der Seite rein auf die
	 * programmtechnisch zu gegriffen wird, also zum Schluß "putzen"
	 */
	@FXML
	private AnchorPane anchorMenu;
	@FXML
	private AnchorPane anchorMain;

	@FXML
	private Button manualStore;
	@FXML
	private Button autoStore;
	@FXML
	private Button search;
	@FXML
	private Button config;
	@FXML
	private Button stop;
	@FXML
	private Button searchDoc;
	@FXML
	private Button save;

	@FXML
	private Label labelActualDoc;
	@FXML
	private Label labelPath;
	@FXML
	private Label labelKeywords;
	@FXML
	private Label labelDate;
	@FXML
	private Label labelKeywordOne;
	@FXML
	private Label labelKeywordTwo;
	@FXML
	private Label labelKeywordThree;
	@FXML
	private Label labelKeywordFour;
	@FXML
	private Label labelKeywordFive;

	@FXML
	private ComboBox<String> listKeywordOne;
	@FXML
	private ComboBox<String> listKeywordTwo;
	@FXML
	private ComboBox<String> listKeywordThree;
	@FXML
	private ComboBox<String> listKeywordFour;
	@FXML
	private ComboBox<String> listKeywordFive;

	@FXML
	private ImageView imageActualDoc;

	@FXML
	private DatePicker datePicker;

	public void setMain(Main main) {
		this.main = main;
	}

	public void stopProgram() {
		/**
		 * KK 170222 Programm wird beendet Lifecycle einer fx-Anwendung ist:
		 * init - start - (warten auf Platform.exit) - stop init und stop sind
		 * in Application bereits codiert (leer) und müssen nicht überschrieben
		 * werden start muss auscodiert werden Platform.exit() erlaubt noch das
		 * Aufrufen von stop System.exit() wäre eine Alternative !!es gibt dann
		 * aber keine Möglichkeit auf das Aufrufen von stop()!!
		 * 
		 */
		Platform.exit();
	}

	@FXML
	public void handleSearchDoc() {
		/**
		 * Kk 170223 KK, CB 170224 Dialog zur Dateiauswahl aufrufen *erledigt
		 * Dateiname im Label anzeigen *erledigt ausgewählte Datei im Image
		 * anzeigen
		 */
		// noch fest codiert, wenn wir eine Datenbankanbindung haben sollte
		// hier der Wert von config.rootDir
		File sourceDir = new File("C:/Users/Kerstin/desktop");
		// vordefinierte Klasse zur Dateiauswahl
		FileChooser fileChooser = new FileChooser();
		// grundkonfiguration
		fileChooser.setTitle("Bitte gewünschte Datei auswählen");
		// fileChooser.setInitialDirectory(sourceDir);
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
				new ExtensionFilter("Text Files", "*.txt", "*.pdf"), new ExtensionFilter("All Files", "*.*"));

		// das wird unsere Datei
		File myFile;
		// file wird gelesen
		// myFile=fileChooser.showOpenDialog(main.getPrimarayStage());
		myFile = fileChooser.showOpenDialog(labelPath.getScene().getWindow());
		if (myFile != null) {
			// Path-angaben ausgeben
			labelPath.setText(myFile.getPath());
			labelPath.setVisible(true);
			
			// Image anzeigen - hier bockt es noch
//			System.out.println(myFile.toURI());
//			System.out.println(myFile.toURI().toURL());
//			System.out.println(myFile.toURI().toURL().toString());
			try {
				Image myImage = new Image(myFile.toURI().toURL().toExternalForm(),500.0,650.0,false, true);
				System.out.println(myImage.heightProperty());
				main.getPrimarayStage().show();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// imageActualDoc.setImage(new Image(myFile.getAbsolutePath()));
			// imageActualDoc.setVisible(true);
			// neImage =imageActualDoc.getImage();
			// labelPath.setText(" "+ neImage.getWidth());

		}

	}
}

package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	private Stage primarayStage;
	
	@Override
	public void start(Stage primaryStage) {
		this.primarayStage = primaryStage;
		mainWindow();
	}
	
	public void mainWindow(){		
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindow.fxml"));
			AnchorPane pane = loader.load();
			primarayStage.setMinHeight(800.00);
			primarayStage.setMinWidth(1400.00);
			Scene scene = new Scene(pane);
			primarayStage.setScene(scene);
			primarayStage.show();
			MainWindowController_old mainWindowController = loader.getController();
			mainWindowController.setMain(this);
		} catch (IOException e) {
			// TODO Automatisch generierter Erfassungsblock
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}

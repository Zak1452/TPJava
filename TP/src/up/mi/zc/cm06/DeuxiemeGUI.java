package up.mi.zc.cm06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DeuxiemeGUI extends Application {
	
	public void start(Stage stage) throws Exception
	{
		stage.setTitle("Deuxieme GUI");
		MyPaneWithButtons mp = new MyPaneWithButtons();
		Scene scene = new Scene(mp);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String[]args)
	{
		launch(args);
	}
}

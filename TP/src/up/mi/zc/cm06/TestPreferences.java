package up.mi.zc.cm06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestPreferences extends Application{
	
	@Override
	public void start(Stage stage) throws Exception
	{
		stage.setTitle("Preferences");
		PanePreferences pP = new PanePreferences();
		
		Scene scene = new Scene(pP);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String[]args)
	{
		launch(args);
	}

}

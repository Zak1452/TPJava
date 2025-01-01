package up.mi.zc.cm06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CompteurTest extends Application{
	
	public void start(Stage stage) throws Exception
	{
		stage.setTitle("Compteur Ameliore");
		
		CompteurPaneWithTextArea  cPA = new CompteurPaneWithTextArea();
		
		Scene scene = new Scene(cPA);
		stage.setScene(scene);
		
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String []args)
	{
		launch(args);
	}

}

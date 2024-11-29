package up.mi.zc.td07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CompteurClics extends Application{
	
	@Override 
	public void start(Stage stage) throws Exception
	{
		stage.setTitle("Compteur clics");
		CompteurPane cp = new CompteurPane();
		
		Scene scene = new Scene(cp);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String []args)
	{
		launch(args);
	}

}

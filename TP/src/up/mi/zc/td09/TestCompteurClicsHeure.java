package up.mi.zc.td09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestCompteurClicsHeure extends Application{
	public void start(Stage stage) throws Exception
	{
		stage.setTitle("Clics et heure");
		
		CompteurClics cC = new CompteurClics();
		Scene scene = new Scene(cC);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String[]args)
	{
		launch(args);
	}
}

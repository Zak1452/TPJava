package up.mi.zc.ex2024;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
	
	@Override
	public void start(Stage stage) throws Exception
	{
		stage.setTitle("Convertisseur de monnaies");
		
		MyPane mp = new MyPane();
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

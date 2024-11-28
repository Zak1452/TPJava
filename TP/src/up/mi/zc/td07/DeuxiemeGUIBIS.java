package up.mi.zc.td07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DeuxiemeGUIBIS extends Application{
	
	@Override 
	public void start(Stage stage)throws Exception
	{
		stage.setTitle("GUI");
		PaneInscription p = new PaneInscription();
		Scene scene = new Scene(p);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String[]args)
	{
		launch(args);
	}

}

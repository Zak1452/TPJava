package up.mi.zc.cm06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PremiereGUI extends Application {
	@Override
	public void start(Stage stage) throws Exception
	{
		stage.setTitle("Premiere GUI");
		MyPaneWithLabels mp = new MyPaneWithLabels();
		
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

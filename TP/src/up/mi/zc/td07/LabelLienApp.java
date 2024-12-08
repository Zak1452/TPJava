package up.mi.zc.td07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LabelLienApp extends Application {
	
	@Override
	public void start(Stage stage)
	{
		stage.setTitle("Label");
		LabelLienPane lp = new LabelLienPane();
		Scene scene = new Scene(lp);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String[]args)
	{
		launch(args);
	}

}

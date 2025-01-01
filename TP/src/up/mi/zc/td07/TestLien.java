package up.mi.zc.td07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestLien extends Application{
	
	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("Lien");
		PaneWithLabelLien pL = new PaneWithLabelLien();
		Scene scene = new Scene(pL);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String[]args)
	{
		launch(args);
	}

}

package up.mi.zc.td07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PanelCouleur extends Application {
	
	@Override 
	public void start(Stage stage)
	{
		stage.setTitle("Couleurs");
		PanelCouleurBouton pc = new PanelCouleurBouton();
		Scene scene = new Scene(pc);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String []args)
	{
		launch(args);
	}

}

package up.mi.zc.td07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PanelDate extends Application{
	
	@Override
	public void start (Stage stage)
	{
		stage.setTitle("Date");
		
		PanelDateI pDI = new PanelDateI();
		Scene scene = new Scene(pDI);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}
	
	public static void main(String [] args)
	{
		launch(args);
	}

}

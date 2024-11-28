package up.mi.zc.td07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DeuxiemeGUI extends Application{
	
	@Override
	public void start(Stage stage) throws Exception
	{
		stage.setTitle("GUI");
		Scene scene = new Scene(creerPane());
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
		
	}
	
	public static BorderPane creerPane() throws Exception
	{
		BorderPane bp = new BorderPane();
		TextArea aire = new TextArea();
		aire.setPrefRowCount(10);
		bp.setCenter(aire);
		return bp;
	}
	
	public static void main(String []args)
	{
		launch(args);
	}

}

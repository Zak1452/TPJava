package up.mi.zc.cm06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestApplicationFlowPane extends Application {
	
	@Override
	public void start(Stage stage) throws Exception{
		
		stage.setTitle("Test Flow Pane");
		FlowPaneTest fPT = new FlowPaneTest();
		
		Scene scene = new Scene(fPT);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
		
	}
	
	public static void main(String[]args)
	{
		launch(args);
	}

}

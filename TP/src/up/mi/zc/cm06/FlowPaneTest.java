package up.mi.zc.cm06;

import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class FlowPaneTest extends FlowPane{
	
	public FlowPaneTest()
	{
		this.setOrientation(Orientation.VERTICAL);
		this.setHgap(20);
		this.setVgap(20);
		
		for(int i=1;i<22; i++)
		{
			Label label = new Label("Label "+i);
			this.getChildren().addAll(label);
		}
	}

}

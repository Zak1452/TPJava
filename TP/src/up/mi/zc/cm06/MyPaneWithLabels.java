package up.mi.zc.cm06;

import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MyPaneWithLabels extends Pane {
	
	private Label label1, label2;
	
	public MyPaneWithLabels()
	{
		label1 = new Label("Premier label sans image");
		Image img = new Image("file:D:\\chaker_zakaria\\Universite_Licence\\Universite_Paris_Cite\\L3_info\\S5\\PhotoJX\\Nami1.jpeg");
		ImageView iv = new ImageView(img);
		label2 = new Label("Deuxieme label avec une image", iv);
		label2.setContentDisplay(ContentDisplay.BOTTOM);
		
		label1.relocate(100, 100);
		label2.relocate(100, 200);
		
		this.getChildren().addAll(label1, label2);
	}

}

package up.mi.zc.cm06;

import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MyPaneWithButtons extends Pane{
	
	private Button button1, button2;
	
	public MyPaneWithButtons()
	{
		this.button1 = new Button("Bouton simple");
		
		Image img = new Image("file:D:\\chaker_zakaria\\Universite_Licence\\Universite_Paris_Cite\\L3_info\\S5\\PhotoJX\\NamiTheme.jpg");
		ImageView iv = new ImageView(img);
		iv.setFitHeight(200);
		iv.setFitWidth(400);
		this.button2 = new Button("Bouton avex image ;)", iv);
		button2.setContentDisplay(ContentDisplay.RIGHT);
		
		button1.relocate(50,50);
		button2.relocate(50, 150);
		
		this.getChildren().addAll(button1, button2);
	}
}

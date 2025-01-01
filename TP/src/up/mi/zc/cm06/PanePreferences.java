package up.mi.zc.cm06;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class PanePreferences extends Pane{
	
	public PanePreferences()
	{
		Label label = new Label("Saisir votre preference!");
		RadioButton btn1 = new RadioButton("Nami");
		RadioButton btn2 = new RadioButton("Robin");
		
		ToggleGroup tg = new ToggleGroup();
		btn1.setToggleGroup(tg);
		btn2.setToggleGroup(tg);
		Image imageNami = new Image("file:D:\\chaker_zakaria\\Universite_Licence\\Universite_Paris_Cite\\L3_info\\S5\\PhotoJX\\Nami1.jpeg");
		Image imageRobin = new Image("file:D:\\chaker_zakaria\\Universite_Licence\\Universite_Paris_Cite\\L3_info\\S5\\PhotoJX\\RobinTheme.jpg");
		
		ImageView iv1 = new ImageView();
		
		Button btn = new Button("Je veux voir ce personnage!");
		
		
		label.relocate(20, 20);
		btn1.relocate(20, 50);
		btn2.relocate(20, 70);
		btn.relocate(20, 100);
		
		iv1.relocate(350, 50);
		
		btn.setOnAction((event)->{
			if(btn1.isSelected())
			{
				label.setText("Moi c'est Nami, la chapardeuse!");
				iv1.setImage(imageNami);
			}
			
			else if(btn2.isSelected())
			{
				iv1.setImage(imageRobin);
				iv1.setFitHeight(200);
				iv1.setFitWidth(200);
				label.setText("Moi c'est Robin, j'adore les frissons...");
			}
			else
			{
				label.setText("Veuillez selectionner au moins un personnage!");;
			}
		});
		
		this.getChildren().addAll(label, btn1, btn2, btn, iv1);
		
		
	}
}



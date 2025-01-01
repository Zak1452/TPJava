package up.mi.zc.cm06;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import up.mi.zc.td07.Compteur;

public class CompteurPaneWithTextArea extends Pane{
	
	public CompteurPaneWithTextArea()
	{
		Compteur cpt = new Compteur();
		Button btn = new Button("Incremente");
		Label labelAff = new Label("--->0");
		CheckBox box = new CheckBox("Neg?");
		TextField field = new TextField();
		labelAff.relocate(20, 15);
		btn.relocate(20, 60);
		box.relocate(120, 60);
		field.relocate(180, 60);
		
		
		this.getChildren().addAll(btn, labelAff, field, box);
		
		btn.setOnAction((event) ->{
			
			if(box.isSelected())
			{
				if(field.getText() == "")
				{
					cpt.incrementer(-1);
					labelAff.setTextFill(Color.RED);
				}
				else {
					cpt.incrementer(Integer.parseInt(field.getText())*(-1));
					labelAff.setTextFill(Color.RED);
				}
			}
			else
			{
				if(field.getText() =="")
				{
					cpt.incrementer();
					labelAff.setTextFill(Color.GREEN);

				}
				else
				{
					cpt.incrementer(Integer.parseInt(field.getText()));
					labelAff.setTextFill(Color.GREEN);


				}
			}
			
			labelAff.setText("--->"+cpt.getValeur());
		});
	}
}

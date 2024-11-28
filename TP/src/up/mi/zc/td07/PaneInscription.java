package up.mi.zc.td07;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class PaneInscription extends Pane{
	
	
	public PaneInscription()throws Exception
	{
		Label label = new Label("Formulaire d'inscription");
		Label etLabel = new Label("Etat civil: ");
		RadioButton bt1 = new RadioButton("Mr");
		RadioButton bt2 = new RadioButton("Mme");
		
		Label nom = new Label("\nNom: ");
		TextField tfNom = new TextField();
		Label prenom = new Label("\nPrenom: ");
		TextField tfPrenom = new TextField();
		Button btn = new Button("Soumettre");
		label.relocate(0,  0);
		etLabel.relocate(0, 20);
		bt1.relocate(70, 20);
		bt2.relocate(110, 20);
		//ok
		nom.relocate(0, 50);
		prenom.relocate(0, 80);
		tfNom.relocate(40, 63);
		tfPrenom.relocate(52, 94);
		btn.relocate(0, 130);
		this.getChildren().addAll(label,etLabel, bt1, bt2, nom, tfNom, prenom, tfPrenom, btn);
	}


	
	
}

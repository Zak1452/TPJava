package up.mi.zc.cm06;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import up.mi.zc.td07.Compteur;

public class CompteurPane extends Pane {
	
	private Compteur cpt;
	private Label label;
	private Button btn;
	private CheckBox box;

	public CompteurPane()
	{
		this.cpt = new Compteur();
		this.label = new Label("-->0");
		this.btn = new Button("ok");
		this.box = new CheckBox("Valeur negative");
		btn.setOnAction(new CompteurHandle(label, box, cpt));
		
		btn.relocate(0, 0);
		box.relocate(60, 0);
		label.relocate(200, 0);
		this.getChildren().addAll(label, btn, box);
		
	}
	
	
	
	
	
}

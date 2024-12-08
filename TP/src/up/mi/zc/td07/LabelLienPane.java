package up.mi.zc.td07;

import javafx.scene.layout.Pane;

public class LabelLienPane extends Pane{
	
	LabelLien label;
	public LabelLienPane()
	{
		this.label = new LabelLien("Texte change couleur !");
		label.relocate(20, 20);
		this.getChildren().addAll(label);
	}
}

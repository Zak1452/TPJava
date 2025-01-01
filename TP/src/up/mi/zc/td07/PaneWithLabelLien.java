package up.mi.zc.td07;

import javafx.scene.layout.Pane;

public class PaneWithLabelLien extends Pane{
	
	public PaneWithLabelLien()
	{
		LabelLien label = new LabelLien("Passez la souris sur moi!");

		label.relocate(20, 20);
		this.getChildren().addAll(label);
	}

}

package up.mi.zc.td07;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class PanelCouleurBouton extends Pane{
	Label labelTexte;
	Button btnRouge;
	Button btnVert;
	public PanelCouleurBouton()
	{
		labelTexte = new Label("Ja change de couleur");
		btnRouge = new Button("Rouge");
		btnVert = new Button("Vert");
		btnVert.setTextFill(Color.GREEN);
		btnRouge.setOnAction(new PanelCouleurHandlerR(labelTexte));
		btnVert.setOnAction(new PanelCouleurHandlerV(labelTexte));
		
		labelTexte.relocate(200, 100);
		btnRouge.relocate(150, 200);
		btnVert.relocate(400, 200);
		
		this.getChildren().addAll(labelTexte, btnRouge, btnVert);
	}

}

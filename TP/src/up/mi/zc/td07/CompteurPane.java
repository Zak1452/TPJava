package up.mi.zc.td07;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class CompteurPane extends Pane {
	
	Label l;
	Button btn;
	Compteur cpt;
	public CompteurPane()
	{
		l = new Label("--> 0");
		btn = new Button("Ok");
		cpt = new Compteur();
		
		btn.setOnAction(new CompteurHandler(l, cpt));
		btn.relocate(30, 0);
	    l.relocate(0 , 0);
		this.getChildren().addAll(l, btn);
	}

}

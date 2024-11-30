package up.mi.zc.td07;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class PanelCouleurHandlerR implements EventHandler<ActionEvent>{

	Label labelTexte;
	Button btn;
	
	public PanelCouleurHandlerR(Label l)
	{
		labelTexte = l;
	}
	@Override
	public void handle(ActionEvent event) {
		labelTexte.setTextFill(Color.RED);
	}
	
	
	

}

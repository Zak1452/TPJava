package up.mi.zc.td07;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class CompteurHandler implements EventHandler<ActionEvent>{

	private Label lab;
	private Compteur cpt;
	public CompteurHandler(Label lab, Compteur cpt)
	{
		this.lab = lab;
		this.cpt = cpt;
	}

	@Override
	public void handle(ActionEvent event) {
		cpt.incrementer();
		lab.setText("--> "+cpt.getValeur());
	}
}

package up.mi.zc.cm06;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import up.mi.zc.td07.Compteur;

public class CompteurHandle implements EventHandler<ActionEvent> {
	
	private Compteur cpt;
	private CheckBox box;
	private Label label;
	
	
	public CompteurHandle(Label lab, CheckBox box, Compteur compteur)
	{
		this.box = box;
		this.label = lab;
		this.cpt = compteur;
	}
	
	@Override
	public void handle(ActionEvent event)
	{
		if(box.isSelected()) cpt.incrementer(-1);
		else cpt.incrementer();
		label.setText("--->"+cpt.getValeur());
	}
}

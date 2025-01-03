package up.mi.zc.td09;


import java.time.LocalDateTime;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import up.mi.zc.td07.Compteur;

public class CompteurClics extends Pane {
	
	private Label labelClics, labelHeure;
	private Compteur cpt;
	private Button btn;
	
	public CompteurClics()
	{
		labelClics = new Label("--->0");
		labelHeure = new Label("");
		cpt = new Compteur();
		btn = new Button("Refresh et clic");
		
		labelClics.relocate(0, 0);
		labelHeure.relocate(70, 0);
		btn.relocate(0, 15);
		labelHeure.setText(""+LocalDateTime.now().toString());

		btn.setOnAction((event) ->{
			cpt.incrementer();
			this.labelClics.setText(""+cpt.getValeur());

		});
		Thread t = new Thread()
		{
			@Override
			public void run()
			{
				while(true)
				{
					try {
						sleep(1000);
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
					Platform.runLater(new Runnable(){
						@Override
						public void run()
						{
							labelHeure.setText(""+LocalDateTime.now().toString());
						}
					});
				}
			}
		};
		t.start();
		this.getChildren().addAll(labelClics, labelHeure, btn);
	}
	
	
}

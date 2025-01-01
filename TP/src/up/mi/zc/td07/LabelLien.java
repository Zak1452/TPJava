package up.mi.zc.td07;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class LabelLien extends Label {
	
	
	public LabelLien(String n)
	{
		super(n);
		this.setOnMouseEntered((event)->
		{
			this.setTextFill(Color.RED);
		});
		this.setOnMouseExited((event)->{
			this.setTextFill(Color.BLACK);

		});
		}
	


}

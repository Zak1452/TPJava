package up.mi.zc.ex2024;


import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class MyPane extends FlowPane{
	
	/**
	 * 1€ = 1.10$
	 * 1e = 0.87£
	 */
	
	
	public MyPane()
	{	
		this.setOrientation(Orientation.VERTICAL);
		TextField tf = new TextField();
		Button btn = new Button("Convertir");
		CheckBox cb = new CheckBox("GBP");
		Label label = new Label("");
		this.setVgap(0);
		btn.setOnAction((event)-> {
			
			try
			{
				double val = Double.parseDouble(tf.getText());
				if(cb.isSelected())
				{
					label.setText(tf.getText()+" euros = "+ (val*0.87)+" livres sterling");
				}
				else
				{
					label.setText(tf.getText()+" euros = "+ (val*1.10)+" dollars");
				}
			}
			catch(IllegalArgumentException e)
			{
				label.setText("Il faut entrer un nombre!");
			}
			
		});
		
		this.getChildren().addAll(tf, btn, cb, label);
	}
}

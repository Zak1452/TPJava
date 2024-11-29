package up.mi.zc.td07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class PanelDateI extends Pane {
	
	Label labelDate;
	Button btn;
	Date date;
	public PanelDateI()
	{
		Label labelDate = new Label();
		Button btn = new Button("Mettre a jour");
		
		btn.setOnAction(new PanelDateA(labelDate, date));
		labelDate.relocate(0, 0);
		btn.relocate(200, 0);
		this.getChildren().addAll(btn, labelDate);
		
	}
	
	class PanelDateA implements EventHandler<ActionEvent>
	{
		Date dateI;
		Label label;
		public PanelDateA(Label l, Date d)
		{
			this.label = l;
			this.dateI = d;
		}
		
		public void handle(ActionEvent envent) {
			long d = System.currentTimeMillis();
			String date = d +"";
			String dateCourante = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
			label.setText(date);
		}


		
		
	}
}

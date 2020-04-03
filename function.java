package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

public class function {
	@FXML
	private CheckBox c1;
	@FXML
	private CheckBox c2;
	@FXML
	private CheckBox c3;
	@FXML
	private RadioButton r1;
	@FXML
	private RadioButton r2;
	@FXML
	private RadioButton r3;
	
	public void check(ActionEvent event)
	{
		if(c1.isSelected())
		{
			c2.setSelected(false);
			c3.setSelected(false);
		}
	}
	public void check1(ActionEvent event)
	{
		if(c2.isSelected())
		{
			c1.setSelected(false);
			c3.setSelected(false);
		}
	}
	public void check2(ActionEvent event)
	{
		if(c3.isSelected())
		{
			c2.setSelected(false);
			c1.setSelected(false);
		}
	}
	public void check3(ActionEvent event)
	{
		if(r1.isSelected())
		{
			r2.setSelected(false);
			r3.setSelected(false);
		}
	}
	public void check4(ActionEvent event)
	{
		if(r2.isSelected())
		{
			r1.setSelected(false);
			r3.setSelected(false);
			
		}
	}
	public void check5(ActionEvent event)
	{
		if(r3.isSelected())
		{
			r2.setSelected(false);
			r1.setSelected(false);
		}
	}
	
	
	

}

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;  
import javafx.geometry.Insets;
import javafx.scene.text.*;


public class Main extends Application 
{
	public static void main(String[] args) 
	{
	    launch(args);
	}


    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        primaryStage.setTitle("Danton - JavaFX Calc");
        Button[] numbers = new Button[10];
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(10,10,10,10));
        layout.setVgap(8);
        layout.setHgap(25);
	    
        Text leftVal = new Text();
        leftVal.setText("");
        GridPane.setConstraints(leftVal, 0, 0);
        Text midVal = new Text();
        midVal.setText("");
        GridPane.setConstraints(midVal, 1, 0);
        Text rightVal = new Text();
        rightVal.setText("");
        GridPane.setConstraints(rightVal, 2, 0);
        Text resultVal = new Text();
        resultVal.setText("");
        GridPane.setConstraints(resultVal, 3, 0);
        
        //Set the string for the buttons from 0-9
        for(int counter = 0; counter < 10; counter++)
        {        	        	
        	numbers[counter] = new Button();
        	numbers[counter].setText(Integer.toString(counter));
        }
        
        //Set positions of the buttons
        int column = 1;
        for(int counter = 1; counter <10; counter++)
        {
        	GridPane.setConstraints(numbers[counter],(counter-1)%3, column);
        	if(counter%3 == 0)
        		column ++;
        }

        numbers[0] = new Button();
        numbers[0].setText("0");
        GridPane.setConstraints(numbers[0], 1, 5);
        
        Button plus = new Button();        
        plus.setText("+");
        GridPane.setConstraints(plus, 0, 6);
        
        Button minus = new Button();        
        minus.setText("-");
        GridPane.setConstraints(minus, 1, 6);
        
        Button multi = new Button();        
        multi.setText("x");
        GridPane.setConstraints(multi, 2, 6);
        
        Button div = new Button();        
        div.setText("/");
        GridPane.setConstraints(div, 3, 6);
        
        Button equals = new Button();
        equals.setText("=");
        GridPane.setConstraints(equals, 4, 6);
        
        layout.getChildren().addAll(numbers);
        layout.getChildren().addAll(leftVal, midVal, rightVal, resultVal, plus, minus, multi, div, equals);
        
        numbers[0].setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	if(leftVal.getText().equals(""))
            		leftVal.setText("0");
            	else
            		rightVal.setText("0");
            }
        });
        
        numbers[1].setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	if(leftVal.getText().equals(""))
            		leftVal.setText("1");
            	else
            		rightVal.setText("1");
            }
        });
        
        numbers[2].setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	if(leftVal.getText().equals(""))
            		leftVal.setText("2");
            	else
            		rightVal.setText("2");
            }
        });
        
        numbers[3].setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	if(leftVal.getText().equals(""))
            		leftVal.setText("3");
            	else
            		rightVal.setText("3");
            }
        });
        
        numbers[4].setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	if(leftVal.getText().equals(""))
            		leftVal.setText("4");
            	else
            		rightVal.setText("4");
            }
        });
        
        numbers[5].setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	if(leftVal.getText().equals(""))
            		leftVal.setText("5");
            	else
            		rightVal.setText("5");
            }
        });
        
        numbers[6].setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	if(leftVal.getText().equals(""))
            		leftVal.setText("6");
            	else
            		rightVal.setText("6");
            }
        });
        
        numbers[7].setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	if(leftVal.getText().equals(""))
            		leftVal.setText("7");
            	else
            		rightVal.setText("7");
            }
        });
        
        numbers[8].setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	if(leftVal.getText().equals(""))
            		leftVal.setText("8");
            	else
            		rightVal.setText("8");
            }
        });
        
        numbers[9].setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	if(leftVal.getText().equals(""))
            		leftVal.setText("9");
            	else
            		rightVal.setText("9");
            }
        });
        
        plus.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	midVal.setText("+");
            }
        });
        minus.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	midVal.setText("-");
            }
        });
        
        multi.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	midVal.setText("x");
            }
        });
        
        div.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	resultVal.setText("");
            	midVal.setText("/");
            }
        });
        equals.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
            	int leftValInt = Integer.parseInt(leftVal.getText());
            	int rightValInt = Integer.parseInt(rightVal.getText());
            	if(midVal.getText().equals("+"))
            		resultVal.setText(Integer.toString(leftValInt + rightValInt));
            	else if(midVal.getText().equals("-"))
            		resultVal.setText(Integer.toString(leftValInt - rightValInt));
            	else if(midVal.getText().equals("x"))
            		resultVal.setText(Integer.toString(leftValInt * rightValInt));
            	else if(midVal.getText().equals("/"))
            		resultVal.setText(Integer.toString(leftValInt / rightValInt));
            	
            	// Clear the values
            	leftVal.setText("");
            	midVal.setText("");
            	rightVal.setText("");
            }
        });
        
        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

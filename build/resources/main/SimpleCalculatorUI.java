/*package application;


import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class SimpleCalculatorUI extends calculatorUI {
	Button btnAdd;
	Button btdot;
	Button btnSub;
	Button btnDiv;
	Button btnMul;
	Button btnEqual;
	Button btnClear;
	Button btnDel;
	Button btnMod;
	//public mathExpression mathEX;
	public SimpleCalculatorUI() {
		super();
		btnOPerator();
		 binding();
	}

	public void btnOPerator() {
		btnAdd = new Button("+");
		btnSub = new Button("-");
		btnDiv = new Button("÷");
		btnMul = new Button("*");
		btnEqual = new Button("=");
		btnClear = new Button("C");
		btnDel = new Button("∆");
		btnMod = new Button("%");
	    btdot=new Button(".");
	  
		////////////////////////////////////
	//	mathEX=new mathExpression();
	}
	
	public void bulidUI() {
		
		 HBox h55=new HBox(5);
		 h55.getChildren().addAll(btnClear,btnDiv,btnMul,btnDel);
		
		 HBox h11=new HBox(5);
		 h11.getChildren().addAll(btnNum[7],btnNum[8],btnNum[9],btnSub);
		 
		 HBox h22=new HBox(5);
		 h22.getChildren().addAll(btnNum[4],btnNum[5],btnNum[6],btnAdd);
		 
		 
		 HBox h33=new HBox(5);
		 h33.getChildren().addAll(btnNum[1],btnNum[2],btnNum[3],btnMod);
		 
		 HBox h44=new HBox(5);
		 h44.getChildren().addAll(btnNum[0],btdot,btnEqual);
		 
		
	  
		
		 calUI.setHgap(5.5);
		 calUI.setVgap(5.5);
		 calUI.add(taNote, 0, 0);
		 calUI.add(h55, 0, 1);
		 calUI.add(h11, 0, 2);
		 calUI.add(h22, 0, 3);
		 calUI.add(h33, 0, 4);
		 calUI.add(h44, 0, 5);
		 
		 
	}	
	
	
	public void buttonsActions(){
		//super.buttonsActions();
		
		
		 btnMul.setOnAction(e->{
	    	  s="*"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btnDiv.setOnAction(e->{
	    	  s="÷"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btnMod.setOnAction(e->{
	    	  s="%"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btnAdd.setOnAction(e->{
	    	  s="+"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btnSub.setOnAction(e->{
	    	  s="-"; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     
	     btdot.setOnAction(e->{
	    	  s="."; ss.push(s);
	    	 all=all.concat(s);
	    	 taNote.setText(all);
	     });
	     
	     btnEqual.setOnAction(e->{
	    	
	    	 if(mathEX.check_pracktise(all)&&!mathEX.isNumber(all))
	    	 {
	    		 Result=mathEX.calculate_Expression(all);
	    		 taNote.setText(all+"\r\n"+" = "+Result);
	    	 }
	    	 else
	    		 taNote.setText(all+"\r\n"+" = "+"Invalid Expresion");
	     });
	     
	     
	     btnDel.setOnAction(e->{
	    	 if(all.length()>0)
	    	 {
      	    	 all=all.substring(0, all.length()-ss.pop().length());
	         	 taNote.setText(all);
	    	 }
	    	 else 
	    		  taNote.setText("");
	     });
	     
	     btnClear.setOnAction(e->{
	    	 all="";
	    	 taNote.setText(all);
	     });
		
		
		
		
		
		
		
	     
	     
	}
	
	
	public void binding()
	{
		
		
		 taNote.prefWidthProperty().bind(calUI.widthProperty().subtract(50));
		 taNote.prefHeightProperty().bind(calUI.heightProperty().multiply(1.0/4.0));
		btnNum[0].prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnNum[0].prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		
		btnNum[1].prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnNum[1].prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));

		
		btnNum[2].prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnNum[2].prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
	    
		
		btnNum[3].prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnNum[3].prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		btnNum[4].prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnNum[4].prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		
		
		btnNum[5].prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnNum[5].prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		btnNum[6].prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnNum[6].prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		btnNum[7].prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnNum[7].prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		btnNum[8].prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnNum[8].prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		btnNum[9].prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnNum[9].prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		btnMul.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnMul.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		btnDiv.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnDiv.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		btnSub.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnSub.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		btnAdd.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnAdd.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		btnMod.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnMod.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		
		 
		btdot.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btdot.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
		
		 
		btnDel.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnDel.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));		
		
			
		btnClear.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
		btnClear.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));			
		
		 
		btnEqual.prefWidthProperty().bind(btnSub.prefWidthProperty().multiply(2));
		btnEqual.prefHeightProperty().bind(btnSub.prefHeightProperty());
		
	}
	
}
*/
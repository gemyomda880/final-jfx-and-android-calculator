/*package application;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Scientific_CalculatorUI extends SimpleCalculatorUI
{
	
    Button btentr ;
    Button btrigth;
    Button btleft;
    Button bte;
    Button btfactorial;
    Button btmeasure;
	
	  Button btbi;
	  Button btb1;
	  Button btb2 ;
	  Button btsquar ;
	  Button btsqrt ; 
	  Button btsin;
	  Button btcos;
	  Button bttan;
	  Button btlog;
	  Button btlin;
	  Button btminus;
	  Button btpower;
	
  //  public mathExpression mathEX;
    
    
  public Scientific_CalculatorUI()
  { 
	  super();
	  create_operator();
	 // mathEX =new mathExpression();
	  binding();
  }
  
  public void create_operator() {  
	  btb1=new Button("(");
	     btb2 =new Button(")");
	     btsquar =new Button("square");
	     btsqrt=new Button("sqrt") ; 
	     btsin=new Button("sin");
	     btcos=new Button("cos");
	     bttan=new Button("tan");
	     btlog=new Button("log");
	     btlin=new Button("lin");
	     btbi=new Button("π");
	     btpower=new Button("x^");
	     btminus=new Button("-x"); 
}
  
  public void bulidUI() {
		  
	  
	  HBox h5=new HBox(5);
		 h5.getChildren().addAll(btnClear,btnDiv,btnMul,btnDel);
	  
		 HBox h1=new HBox(5);
		 h1.getChildren().addAll(btnNum[7],btnNum[8],btnNum[9],btnSub);
		 
		 
		 HBox h2=new HBox(5);
		 h2.getChildren().addAll(btnNum[4],btnNum[5],btnNum[6],btnAdd);
		 
		 
		 HBox h3=new HBox(5);
		 h3.getChildren().addAll(btnNum[1],btnNum[2],btnNum[3],btnMod);
		 
		
		 HBox h4=new HBox(5);
		 h4.getChildren().addAll(btnNum[0],btdot,btnEqual);
		 
		 
		 HBox h11=new HBox(5);
		 h11.getChildren().addAll(btb1,btb2,btbi);
		 
		 HBox h22=new HBox(5);
		 h22.getChildren().addAll(btsin,btcos,bttan);
		 
		 HBox h33=new HBox(5);
		 h33.getChildren().addAll(btlin,btlog,btsqrt);
		 
		 HBox h55=new HBox(5);
		 h55.getChildren().addAll(btminus,btpower,btsquar); 
		 
		
		 
		GridPane g1=new GridPane();
		GridPane g11=new GridPane();
		g1.setHgap(5.5);
		g1.setVgap(5.5);
		g11.setHgap(5.5);
		g11.setVgap(5.5);
		
		 g11.add(h5, 0, 1);
		 g11.add(h1, 0, 2);
		 g11.add(h2, 0, 3);
		 g11.add(h3, 0, 4);
		 g11.add(h4, 0, 5);
		
		 g1.add(h55, 0, 1);
		 g1.add(h11, 0, 2);
		 g1.add(h22, 0, 3);
		 g1.add(h33, 0, 4);
		
		 
		 
		 HBox hh=new HBox(40);	
		 hh.getChildren().addAll(g1,g11) ;
		 
		// HBox hhh=new HBox(40);	
		// hhh.getChildren().addAll(btstyle,bt_Sim_or_Sci) ;
	
		 
		 //calUI.add(hhh,0,0);
		 calUI.add(taNote, 0, 0);
		 calUI.add(hh, 0, 1);
	  
  }
   
  public void buttonsActions(){
	  super.buttonsActions();
	
	  
	  btb1.setOnAction(e->{
    	  s="("; ss.push(s);
    	 all=all.concat(s);
    	 taNote.setText(all);
     });
     
     btb2.setOnAction(e->{
    	  s=")"; ss.push(s);
    	 all=all.concat(s);
    	 taNote.setText(all);
     });
     
     btsquar.setOnAction(e->{
    	 s="^2"; ss.push(s);
    	 all=all.concat(s);
    	 taNote.setText(all);
     });
     
     
     btsqrt.setOnAction(e->{
    	  s="√"; ss.push(s);
    	 all=all.concat(s);
    	 taNote.setText(all);
     });
     
     
     btsin.setOnAction(e->{
    	  s="(sin"; ss.push(s);
    	 all=all.concat(s);
    	 taNote.setText(all);
     });
     
     
     btcos.setOnAction(e->{
    	  s="(cos"; ss.push(s);
    	 all=all.concat(s);
    	 taNote.setText(all);
     });
      
     
     bttan.setOnAction(e->{
    	  s="(tan"; ss.push(s);
    	 all=all.concat(s);
    	 taNote.setText(all);
     });
        
     
     btlin.setOnAction(e->{
    	 s="(lin"; ss.push(s);
    	 all=all.concat(s);
    	 taNote.setText(all);
     });
     
     btlog.setOnAction(e->{
    	 s="(log"; ss.push(s);
    	 all=all.concat(s);
    	 taNote.setText(all);
     });
  
     
     btbi.setOnAction(e->{
    	 s="3.14"; ss.push(s);
    	 all=all.concat(s);
    	 taNote.setText(all);
     });
     
     btminus.setOnAction(e->{
   	  s="-"; ss.push(s);
   	 all=all.concat(s);
   	 taNote.setText(all);
    });
       
     btpower.setOnAction(e->{
   	  s="^"; ss.push(s);
   	 all=all.concat(s);
   	 taNote.setText(all);
    });
     
  }
  
  public void binding()
	{
	  
	super.binding(); 
	
	
	 btbi.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
	 btbi.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
	
	 btdot.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
	 btdot.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
	 
	 
	 btsquar.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
	 btsquar.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
	 
	 
	 btsqrt.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
	 btsqrt.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
	 
	  
	 btsin.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
	 btsin.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
	 
	 btcos.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
	 btcos.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
	 
	 bttan.prefWidthProperty().bind( taNote.prefWidthProperty().multiply(1.0/6.0));
	 bttan.prefHeightProperty().bind( taNote.prefHeightProperty().multiply(1.0/2.0));
	
	 
	 btb1.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
	 btb1.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
	  

	 btb2.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
	 btb2.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
	 
	 
	 btlin.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
	 btlin.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
	 
	 
	 btlog.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
	 btlog.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
	
	 
	 btminus.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
	 btminus.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
	  
	 
	 btpower.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
	 btpower.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
	 
	 
	 
	}
  
}
  
  

*/
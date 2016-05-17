

import java.util.Stack;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class calculatorUI 
{
  Button btnNum[]=new Button[10]; // buttons from 0 to 9	
  GridPane calUI;
  TextArea taNote;
  String all=""; //fall expression 
  String s="";   
  Stack<String>ss=new Stack<>();
  String Result="";
  int counter=0;
  ////////////////////////////////////////////
  
    Button btnStyle;
 	Button btnSimple; 
 	Button btnSci; 
  
  ////////////////////////////////////////////
    Button btnAdd;
	Button btdot;
	Button btnSub;
	Button btnDiv;
	Button btnMul;
	Button btnEqual;
	Button btnClear;
	Button btnDel;
	Button btnMod;
  
 ///////////////////////////////////////
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
	
  
  public calculatorUI()
  {	  
	   calUI=new GridPane();
	   calUI.setAlignment(Pos.CENTER);
	   create_Btn();
	   binding();
  }
  
  public void create_Btn() 
  {
	  for(int i=0;i<10;i++ )
		btnNum[i]=new Button(String.valueOf(i)); 
	    taNote = new TextArea();
		taNote.setPrefColumnCount(20);
	    taNote.setPrefRowCount(3);
		taNote.setWrapText(true);
		taNote.setFont(Font.font(15));
		taNote.setEditable(false);
		calUI.setPadding(new Insets(11.5, 12.5, 13.5, 16.5));
		
		///////////////////////////////////////////
		btnAdd = new Button("+");
		btnSub = new Button("-");
		btnDiv = new Button("÷");
		btnMul = new Button("*");
		btnEqual = new Button("=");
		btnClear = new Button("C");
		btnDel = new Button("∆");
		btnMod = new Button("%");
	    btdot=new Button(".");
	    //////////////////////////////////////
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
	     ///////////////////////////////////
	     btnStyle=new Button("Style");
	  	 btnSimple=new Button("Simple"); 
	  	 btnSci=new Button("Scientific");; 
	  	 btnEqual.setStyle("-fx-background-color:green; ");		
		 btnClear.setStyle("-fx-background-color:red; ");	
		 btnDel.setStyle("-fx-background-color:red; ");	
		 

  }
  
  public void bulidUI() {
	  
	  HBox h=new HBox(5);
		 h.getChildren().addAll(btnStyle,btnSimple,btnSci);
	  
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
		
		 g1.add(h, 0, 1);
		 g1.add(h55, 0, 2);
		 g1.add(h11, 0, 3);
		 g1.add(h22, 0, 4);
		 g1.add(h33, 0, 5);
		
		 
		 
		 HBox hh=new HBox(40);	
		 hh.getChildren().addAll(g1,g11) ;
		 
		// HBox hhh=new HBox(40);	
		// hhh.getChildren().addAll(btstyle,bt_Sim_or_Sci) ;
	
		 
		 //calUI.add(hhh,0,0);
		 calUI.add(taNote, 0, 0);
		 calUI.add(hh, 0, 1);
	
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
		 
		 
		 btnStyle.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
		 btnStyle.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btnSci.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
		 btnSci.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));
		 
		 
		 btnSimple.prefWidthProperty().bind(taNote.prefWidthProperty().multiply(1.0/6.0));
		 btnSimple.prefHeightProperty().bind(taNote.prefHeightProperty().multiply(1.0/2.0));

		
	}
	
  
  /*public void buttonsActions(){
	

	}*/
}
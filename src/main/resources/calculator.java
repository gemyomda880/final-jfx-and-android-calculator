

import javafx.application.Application;
import javafx.scene.control.Button;

public class calculator 
{
	mathExpression mathEx;
	//SimpleCalculatorUI s_cal;
	//Scientific_CalculatorUI sci_cal;
	calculatorUI c=new calculatorUI();
	public calculator () {
		mathEx =new mathExpression();
		/*s_cal=new SimpleCalculatorUI();
		sci_cal=new Scientific_CalculatorUI();
*/		
		}
	 public void draw () {
		 /*s_cal.bulidUI();
		 sci_cal.bulidUI();*/
		 c.bulidUI();
	}

	public void  runS_cal() {
		 c.btnNum[0].setOnAction(e->{
			 c.s="0";
	    	  c.ss.push(c.s);
	    	  c.all=c.all.concat(c.s);
	    	  c.taNote.setText(c.all);
	     });
	     
	  c.btnNum[1].setOnAction(e->{
		  c.s="1";
		  c.ss.push(c.s);
	    	  c.all=c.all.concat(c.s);
	    	 c.taNote.setText(c.all);
	     });
	     
	  c.btnNum[2].setOnAction(e->{
		  c.s="2"; c.ss.push(c.s);
		  c.all=c.all.concat(c.s);
		  c.taNote.setText(c.all);
	     });

	  c.btnNum[3].setOnAction(e->{
		  c.s="3"; c.ss.push(c.s);
	    	  c.all=c.all.concat(c.s);
	    	 c.taNote.setText(c.all);
	     });
	     
	  c.btnNum[4].setOnAction(e->{
		  c.s="4"; c.ss.push(c.s);
		  c.all=c.all.concat(c.s);
		  c.taNote.setText(c.all);
	     });
	     
	  c.btnNum[5].setOnAction(e->{
		  c.s="5"; c.ss.push(c.s);
	    	  c.all=c.all.concat(c.s);
	    	 c.taNote.setText(c.all);
	     });
	     
	     
	  c.btnNum[6].setOnAction(e->{
		  c.s="6"; c.ss.push(c.s);
		  c.all=c.all.concat(c.s);
	    	 c.taNote.setText(c.all);
	     });
	     
	  c.btnNum[7].setOnAction(e->{
		  c.s="7"; c.ss.push(c.s);
	    	  c.all=c.all.concat(c.s);
	    	 c.taNote.setText(c.all);
	     });
	     
	  c.btnNum[8].setOnAction(e->{
		  c.s="8"; c.ss.push(c.s);
		  c.all=c.all.concat(c.s);
	    	 c.taNote.setText(c.all);
	     });
	     
	  c.btnNum[9].setOnAction(e->{
		  c.s="9"; c.ss.push(c.s);
		  c.all=c.all.concat(c.s);
		  c.taNote.setText(c.all);
	     });
	     
	  
	  
	  
	  c.btnMul.setOnAction(e->{
		  c.s="*"; c.ss.push(c.s);
		  c.all=c.all.concat(c.s);
	    	 c.taNote.setText(c.all);
	     });
	     
	  c.btnDiv.setOnAction(e->{
	    	 c.s="÷"; c.ss.push(c.s);
	    	 c.all=c.all.concat(c.s);
	    	 c.taNote.setText(c.all);
	     });
	     
	  c.btnMod.setOnAction(e->{
		  c.s="%"; c.ss.push(c.s);
		  c.all=c.all.concat(c.s);
		  c.taNote.setText(c.all);
	     });
	     
	  c.btnAdd.setOnAction(e->{
		  c.s="+"; c.ss.push(c.s);
		  c.all=c.all.concat(c.s);
		  c.taNote.setText(c.all);
	     });
	     
	  c.btnSub.setOnAction(e->{
		  c.s="-"; c.ss.push(c.s);
	    	  c.all=c.all.concat(c.s);
           c.taNote.setText(c.all);
	     });
	     
	     
	  c.btdot.setOnAction(e->{
		  c.s="."; c.ss.push(c.s);
		  c.all=c.all.concat(c.s);
		  c.taNote.setText(c.all);
	     });
	     
	  c.btnEqual.setOnAction(e->{
	    	
	    	 if(mathEx.check_pracktise(c.all)&&!mathEx.isNumber(c.all))
	    	 {
	    		 c.Result=mathEx.calculate_Expression(c.all);
	    		 c.taNote.setText(c.all+"\r\n"+" = "+c.Result);
	    		
	    	 }
	    	 else
	    	 { c.taNote.setText(c.all+"\r\n"+" = "+"Invalid Expresion"); }
	     });
	     
	     
	  c.btnDel.setOnAction(e->{
	    	 if(c.all.length()>0)
	    	 {
	    		 c.all=c.all.substring(0, c.all.length()-c.ss.pop().length());
	    		 c.taNote.setText(c.all);
	    	 }
	    	 else 
	    		 c.taNote.setText("");
	     });
	     
	  c.btnClear.setOnAction(e->{
		  c.all="";
	    	 c.taNote.setText(c.all);
	     });
	  
	  c.btb1.setOnAction(e->{
    	  c.s="("; c.ss.push(c.s);
    	 c.all=c.all.concat(c.s);
    	 c.taNote.setText(c.all);
     });
     
     c.btb2.setOnAction(e->{
    	  c.s=")"; c.ss.push(c.s);
    	 c.all=c.all.concat(c.s);
    	 c.taNote.setText(c.all);
     });
     
     c.btsquar.setOnAction(e->{
    	 c.s="^2"; c.ss.push(c.s);
    	 c.all=c.all.concat(c.s);
    	 c.taNote.setText(c.all);
     });
     
     
     c.btsqrt.setOnAction(e->{
    	  c.s="√"; c.ss.push(c.s);
    	 c.all=c.all.concat(c.s);
    	 c.taNote.setText(c.all);
     });
     
     
     c.btsin.setOnAction(e->{
    	  c.s="(sin"; c.ss.push(c.s);
    	 c.all=c.all.concat(c.s);
    	 c.taNote.setText(c.all);
     });
     
     
     c.btcos.setOnAction(e->{
    	  c.s="(cos"; c.ss.push(c.s);
    	 c.all=c.all.concat(c.s);
    	 c.taNote.setText(c.all);
     });
      
     
    c. bttan.setOnAction(e->{
    	  c.s="(tan"; c.ss.push(c.s);
    	 c.all=c.all.concat(c.s);
    	 c.taNote.setText(c.all);
     });
        
     
    c. btlin.setOnAction(e->{
    	 c.s="(lin"; c.ss.push(c.s);
    	 c.all=c.all.concat(c.s);
    	c. taNote.setText(c.all);
     });
     
    c.btlog.setOnAction(e->{
    	c. s="(log"; c.ss.push(c.s);
    	 c.all=c.all.concat(c.s);
    	 c.taNote.setText(c.all);
     });
  
     
     c.btbi.setOnAction(e->{
    	 c.s="3.14"; c.ss.push(c.s);
    	 c.all=c.all.concat(c.s);
    	c. taNote.setText(c.all);
     });
     
     c.btminus.setOnAction(e->{
   	  c.s="(-"; c.ss.push(c.s);
   	 c.all=c.all.concat(c.s);
   	 c.taNote.setText(c.all);
    });
       
     c.btpower.setOnAction(e->{
   	  c.s="^"; c.ss.push(c.s);
   	 c.all=c.all.concat(c.s);
   	 c.taNote.setText(c.all);
    });
     
     
     c.btnStyle.setOnAction(e->{
    	 c.counter++;
    	 
    	 if(c.counter==1)
    	 {
    	 Application.setUserAgentStylesheet(getClass().getResource("app.css")
			       .toExternalForm());
    	 c.btnAdd.setStyle("-fx-background-color:#03A9F4;-fx-text-fill: white");
    	 c.btnSub.setStyle("-fx-background-color:#03A9F4;-fx-text-fill: white");
    	 c.btnMod.setStyle("-fx-background-color:#03A9F4;-fx-text-fill: white");
    	 c.btnMul.setStyle("-fx-background-color:#03A9F4;-fx-text-fill: white");
    	 c.btnDiv.setStyle("-fx-background-color:#03A9F4;-fx-text-fill: white");
    	 c.btnClear.setStyle("-fx-background-color:#03A9F4 ;-fx-text-fill: white");	
		 c.btnDel.setStyle("-fx-background-color:#03A9F4;;-fx-text-fill: white ");
		 c.btdot.setStyle("-fx-background-color:#03A9F4;;-fx-text-fill: white ");
		 
    	 }
    	 if(c.counter==2)
    	 {
	    	 Application.setUserAgentStylesheet(getClass().getResource("app4.css")
				       .toExternalForm());
	    	 c.btnAdd.setStyle("-fx-background-color:orange");
	    	 c.btnSub.setStyle("-fx-background-color:orange");
	    	 c.btnMod.setStyle("-fx-background-color:orange");
	    	 c.btnMul.setStyle("-fx-background-color:orange");
	    	 c.btnDiv.setStyle("-fx-background-color:orange");
	    	 c.btnClear.setStyle("-fx-background-color:#F64C22; ");	
	    	 c.btnDel.setStyle("-fx-background-color:#F64C22; ");	
			 c.btnEqual.setStyle("-fx-background-color:orange");
			 c.btdot.setStyle("-fx-background-color:orange");
	    	 
    	 }
    	 
    	 if(c.counter==3)
    	 {
	    	 Application.setUserAgentStylesheet(getClass().getResource("app3.css")
				       .toExternalForm());
	    	 
	    	 c.btnEqual.setStyle("-fx-background-color:#48EA8E;"
	    	 		+ "-fx-background-radius: 15em; ");		
	    	 c.btnClear.setStyle("-fx-background-color:red;"+ "-fx-background-radius: 15em;");	
	    	 c.btnDel.setStyle("-fx-background-color:red; ");
	    
	    	 c.btnAdd.setStyle("-fx-background-color:#4DA3C3");
	    	 c.btnSub.setStyle("-fx-background-color:#4DA3C3");
	    	 c.btnMod.setStyle("-fx-background-color:#4DA3C3");
	    	 c.btnMul.setStyle("-fx-background-color:#4DA3C3");
	    	 c.btnDiv.setStyle("-fx-background-color:#4DA3C3");
	    	 c.btnClear.setStyle("-fx-background-color:#4DA3C3; ");	
	    	 c.btnDel.setStyle("-fx-background-color:#4DA3C3 ");
			 c.btdot.setStyle("-fx-background-color:#4DA3C3; ");
	    	 
    	 }
    	 
    	 if(c.counter==4)
    	 {
	    	 Application.setUserAgentStylesheet(getClass().getResource("app2.css")
				       .toExternalForm());
	    	 c.btnAdd.setStyle("-fx-background-color:black;-fx-text-fill:white");
	    	 c.btnSub.setStyle("-fx-background-color:black;-fx-text-fill:white");
	    	 c.btnMod.setStyle("-fx-background-color:black;-fx-text-fill:white");
	    	 c.btnMul.setStyle("-fx-background-color:black;-fx-text-fill:white");
	    	 c.btnDiv.setStyle("-fx-background-color:black;-fx-text-fill:white");
	    	 c.btnClear.setStyle("-fx-background-color:black;-fx-text-fill:white");	
	    	 c.btnDel.setStyle("-fx-background-color:black;-fx-text-fill:white");
			 c.btdot.setStyle("-fx-background-color:black;-fx-text-fill:white");
			 
	   
    	 }
    	 if(c.counter==5)
    	 {
    		 Application.setUserAgentStylesheet(getClass().getResource("app5.css")
				       .toExternalForm());
    		 c.btnAdd.setStyle("-fx-background-color:#666666");
    		 c.btnSub.setStyle("-fx-background-color:#666666");
    		 c.btnMod.setStyle("-fx-background-color:#666666");
    		 c.btnMul.setStyle("-fx-background-color:#666666");
    		 c.btnDiv.setStyle("-fx-background-color:#666666");
    		 c.btnClear.setStyle("-fx-background-color:#666666; ");	
    		 c.btnDel.setStyle("-fx-background-color:#666666; ");
    		 c.btdot.setStyle("-fx-background-color:#666666; ");
			 
    		 c.btnNum[0].setStyle("-fx-background-color:#4C4C4C; ");
    		 c.btnNum[1].setStyle("-fx-background-color:#4C4C4C; ");
    		 c.btnNum[2].setStyle("-fx-background-color:#4C4C4C; ");
    		 c.btnNum[3].setStyle("-fx-background-color:#4C4C4C; ");
    		 c.btnNum[4].setStyle("-fx-background-color:#4C4C4C; ");
    		 c.btnNum[5].setStyle("-fx-background-color:#4C4C4C; ");
    		 c.btnNum[6].setStyle("-fx-background-color:#4C4C4C; ");
    		 c.btnNum[7].setStyle("-fx-background-color:#4C4C4C; ");
			 c.btnNum[8].setStyle("-fx-background-color:#4C4C4C; ");
			 c.btnNum[9].setStyle("-fx-background-color:#4C4C4C; ");
			 
			 c.counter=0;
    	 }
    	 
     });
     
  

		
	} 
	
	
	/*public void  runSci_cal() {
		sci_cal.btnNum[0].setOnAction(e->{
			sci_cal.s="0";
	    	 sci_cal.ss.push(s_cal.s);
	    	 sci_cal.all=s_cal.all.concat(s_cal.s);
	    	 sci_cal.taNote.setText(s_cal.all);
	     });
	     */
	/* sci_cal.btnNum[1].setOnAction(e->{
		 sci_cal.s="1";
		 sci_cal.ss.push(s_cal.s);
	    	 sci_cal.all=s_cal.all.concat(s_cal.s);
	    	sci_cal.taNote.setText(s_cal.all);
	     });
	     
	 sci_cal.btnNum[2].setOnAction(e->{
		 sci_cal.s="2";sci_cal.ss.push(s_cal.s);
		 sci_cal.all=s_cal.all.concat(s_cal.s);
		 sci_cal.taNote.setText(s_cal.all);
	     });

	 sci_cal.btnNum[3].setOnAction(e->{
		 sci_cal.s="3";sci_cal.ss.push(s_cal.s);
	    	 sci_cal.all=s_cal.all.concat(s_cal.s);
	    	sci_cal.taNote.setText(s_cal.all);
	     });
	     
	 sci_cal.btnNum[4].setOnAction(e->{
		 sci_cal.s="4";sci_cal.ss.push(s_cal.s);
		 sci_cal.all=s_cal.all.concat(s_cal.s);
		 sci_cal.taNote.setText(s_cal.all);
	     });
	     
	 sci_cal.btnNum[5].setOnAction(e->{
		 sci_cal.s="5";sci_cal.ss.push(s_cal.s);
	    	 sci_cal.all=s_cal.all.concat(s_cal.s);
	    	sci_cal.taNote.setText(s_cal.all);
	     });
	     
	     
	 sci_cal.btnNum[6].setOnAction(e->{
		 sci_cal.s="6";sci_cal.ss.push(s_cal.s);
		 sci_cal.all=s_cal.all.concat(s_cal.s);
	    	sci_cal.taNote.setText(s_cal.all);
	     });
	     
	 sci_cal.btnNum[7].setOnAction(e->{
		 sci_cal.s="7";sci_cal.ss.push(s_cal.s);
	    	 sci_cal.all=s_cal.all.concat(s_cal.s);
	    	sci_cal.taNote.setText(s_cal.all);
	     });
	     
	 sci_cal.btnNum[8].setOnAction(e->{
		 sci_cal.s="8";sci_cal.ss.push(s_cal.s);
		 sci_cal.all=s_cal.all.concat(s_cal.s);
	    	sci_cal.taNote.setText(s_cal.all);
	     });
	     
	 sci_cal.btnNum[9].setOnAction(e->{
		 sci_cal.s="9";sci_cal.ss.push(s_cal.s);
		 sci_cal.all=s_cal.all.concat(s_cal.s);
		 sci_cal.taNote.setText(s_cal.all);
	     });
	     
	  
	  
	  
	 sci_cal.btnMul.setOnAction(e->{
		 sci_cal.s="*";sci_cal.ss.push(s_cal.s);
		 sci_cal.all=s_cal.all.concat(s_cal.s);
	    	sci_cal.taNote.setText(s_cal.all);
	     });
	     
	 sci_cal.btnDiv.setOnAction(e->{
	    	sci_cal.s="÷";sci_cal.ss.push(s_cal.s);
	    	sci_cal.all=s_cal.all.concat(s_cal.s);
	    	sci_cal.taNote.setText(s_cal.all);
	     });
	     
	 sci_cal.btnMod.setOnAction(e->{
		 sci_cal.s="%";sci_cal.ss.push(s_cal.s);
		 sci_cal.all=s_cal.all.concat(s_cal.s);
		 sci_cal.taNote.setText(s_cal.all);
	     });
	     
	 sci_cal.btnAdd.setOnAction(e->{
		 sci_cal.s="+";sci_cal.ss.push(s_cal.s);
		 sci_cal.all=s_cal.all.concat(s_cal.s);
		 sci_cal.taNote.setText(s_cal.all);
	     });
	     
	 sci_cal.btnSub.setOnAction(e->{
		 sci_cal.s="-";sci_cal.ss.push(s_cal.s);
	    	 sci_cal.all=s_cal.all.concat(s_cal.s);
	    	 sci_cal.taNote.setText(s_cal.all);
	     });
	     
	     
	 sci_cal.btdot.setOnAction(e->{
		 sci_cal.s=".";sci_cal.ss.push(s_cal.s);
		 sci_cal.all=s_cal.all.concat(s_cal.s);
		 sci_cal.taNote.setText(s_cal.all);
	     });
	     
	 sci_cal.btnEqual.setOnAction(e->{
	    	
	    	 if(mathEx.check_pracktise(s_cal.all)&&!mathEx.isNumber(s_cal.all))
	    	 {
	    		sci_cal.Result=mathEx.calculate_Expression(s_cal.all);
	    		sci_cal.taNote.setText(s_cal.all+"\r\n"+" = "+s_cal.Result);
	    	 }
	    	 else
	    		sci_cal.taNote.setText(s_cal.all+"\r\n"+" = "+"Invalid Expresion");
	     });
	     
	     
	 sci_cal.btnDel.setOnAction(e->{
	    	 if(s_cal.all.length()>0)
	    	 {
	    		sci_cal.all=s_cal.all.substring(0,sci_cal.all.length()-s_cal.ss.pop().length());
	    		sci_cal.taNote.setText(s_cal.all);
	    	 }
	    	 else 
	    		sci_cal.taNote.setText("");
	     });
	     
	 sci_cal.btnClear.setOnAction(e->{
		 sci_cal.all="";
	    	sci_cal.taNote.setText(s_cal.all);
	     });
	  


		
	} */
}


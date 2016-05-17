
import java.util.Stack;

import javafx.beans.property.DoubleProperty;

public class mathExpression {
	
	 Stack<Integer>pracktise;
	 double d;
	 String Result="";
	 int counter=0;
	 DoubleProperty d1;
	 Stack<String>ss=new Stack<>();
	 
	 
	 public mathExpression(){}
	 
	 public  boolean is_symbol(char c)
	 {
		 switch (c) {
		case '+':
			return true;
		case '-':
			return true;

        case '*':
        	return true;
        case 'v':
        	return true;
        case '%':
        	return true;
       case '�':
    	   return true;
    	   
      /* case 's':
    	   return true;
    	   
       case 't':
    	   return true;
    	   
       case 'c':
    	   return true;*/
    	   
       case '^':
    	   return true;
        default:
        	return false;
		}
	 }
	 
	 public boolean check_pracktise(String s)
	 {
		 int index1 = s.indexOf("("),index2= s.indexOf(")");
		pracktise=new Stack<>();
		 pracktise.push(index1);
		 int c1 = 0 , c2 = 0;
	    while(index1!=-1)
	    {
	    	c1++;
	    	index1=s.indexOf("(",index1+1);
	    	pracktise.push(index1);
	    } 
	    
	    while(index2!=-1)
	    {
	    	c2++;
	    	index2=s.indexOf(")",index2+1);
	    } 
	   
	    pracktise.pop();
	    
	    if(c1==c2)
	    	return true;
	    else
	    	return false;
	    
	 }
	
	 public int[] getIndexFor_Op(String s,int op) { //op index for operation
			int post = 0,pre=0;
			int[]indces=new int[2];
			char[] Ex=s.toCharArray();
			for(int i=op+1;i<Ex.length;i++)
				if(!is_symbol(Ex[i]))
					post++;
				else if(Ex[i]=='-'&&is_symbol(Ex[i-1]))// for a negative number
					post++;
				else
					break;
			for(int i=op-1;i>=0;i--)
				if(!is_symbol(Ex[i]))
					pre++;
				else if(Ex[i]=='-'&&i==0)
					pre++;
				else if(Ex[i]=='-'&&is_symbol(Ex[i-1]))
					pre++;
				else
					break;
			indces[1]=op+post;
			indces[0]=op-pre;
			return indces;
		}  
		
		public String calculate_operation(StringBuffer sb , int[] index) {
			mathOperation operation=new mathOperation((sb.substring(index[0], index[1]+1)).toString());
			sb.replace(index[0], index[1]+1, String.valueOf(operation.result));
			return sb.toString();
		}
		
		public String calculate_Expression(String s)
		{
		  while(!isNumber(s)) {
			 if(s.contains("(")&&s.contains(")"))
			 {
				 int i=pracktise.pop();
				 String str=s.substring(i+1, s.indexOf(")",i));
				 StringBuffer sb=new StringBuffer(s);
				 sb.replace(i, s.indexOf(")",i)+1, calculate_Expression(str));
				 s=sb.toString();
			 }
			else if(s.contains("tan"))
		    	{
				mathOperation operation=new mathOperation(s);
		    	    return String.valueOf(operation.result); 
		    	}
		    else if(s.contains("sin"))
		    	{
		    	mathOperation operation=new mathOperation(s);
		    	    return String.valueOf(operation.result); 
		    
		    	}
		    else if(s.contains("cos"))
		    	{
		    	mathOperation operation=new mathOperation(s);
		    	    return String.valueOf(operation.result); 
		    	
		    	}
		    else if(s.contains("^"))
		    	{
		    		s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("^") ));
		    	}
		    else if(s.contains("√"))
		    	{
		    	s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("√") ));
		    	}
		    	
			 else if(s.contains("*"))
		    	{
			    	s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("*") ));

		    	}
		    else if(s.contains("÷"))
		    	{
		    	s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("÷") ));

		    	}
		    else if(s.contains("%"))
		    	{
		    	s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("%") ));

		    	}
		    
		    else if(s.contains("+"))
		    	{
		    	s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("+") ));

		    	}
		    else if(s.contains("-"))
		    	{
		    	  if(!isNumber(s))
		    		  if(s.indexOf("-")!=0)
		    	       s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.indexOf("-") ));
		    		  else
		    			  s=calculate_operation(new StringBuffer(s),getIndexFor_Op(s,s.lastIndexOf("-") )); 
		    	  else
		    		  return s;

		    	}
		    else if(s.contains("log"))
	    	{
	    	    mathOperation operation=new mathOperation(s);
	    	    return String.valueOf(operation.result);
			 
	    	}
		    else if(s.contains("lin"))
	    	{
	    	   mathOperation operation=new mathOperation(s);
	    	    return String.valueOf(operation.result);
			 
	    	}	 
		  }
		  return s;  
	}

		public boolean isNumber(String s) {
			 
			 try{
				Double.parseDouble(s);
				 return true;
				}catch(NumberFormatException e)
			 {return false;}

		} 
		
}

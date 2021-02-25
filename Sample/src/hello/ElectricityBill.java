package hello;

public class ElectricityBill {

	public static void main(String[] args) {
		int previousr=Integer.parseInt(args[0]);
		int presentr=Integer.parseInt(args[1]);
		double scno=Double.parseDouble(args[2]);
		double custcharge=50;
		double electricityduty=7.75;
		double totalbill;
		double amount=0;
		int totalunits= presentr-previousr;
		String category;
		if(totalunits<=100) {
			category="1A";
		}
		else if(totalunits<=200) {
			category="1bi";
		}
		else
		{
			category="1bii";
		}
			
			
		switch(category) {
	    case "1A":
	    	if(totalunits<=50) {
	    		amount=totalunits*1.45;
	    	}
	    		else if(totalunits>50 && totalunits<=100) {
	    			amount=(1.45*50)+(totalunits-50)*2.6;
	    	}
	    		
	    		
	    	
	    	break;
	    case "1bi":
	    	if(totalunits<=100) {
	    		amount=totalunits*3.30;
	    	}
	    		else if(totalunits>100 && totalunits<=200)
	    		{
	    			amount=(3.30*100)+(totalunits-100)*4.30;
	    		}
	    		
	    		
	    	
	    	break;
	    case "1bii":
	    	if(totalunits<=200)
	    	{
	    		amount=totalunits*5.00;
	    		}
	    		else if(totalunits>200 && totalunits<=300) { 
	    			amount=(200*5.00)+(totalunits-200)*7.20;
	    		}
	    		else if (totalunits>300 && totalunits<=400) {
	    			amount=200*5.00+100*7.2+(totalunits-300)*8.50;
	    		}
	    		else if(totalunits>400 && totalunits<=800)
	    		{
	    			amount=(200*5.00)+(100*7.2)+(100*8.50)+(totalunits-400)*9.00;
	    		}
	    		else
	    		{
	    			amount=(200*5.00)+(100*7.2)+(100*8.50)+(400*9)+(totalunits-800)*9.5;
	    		}
	    		
	    	
	    	break;
		}
		
totalbill=amount+custcharge+electricityduty;
System.out.println(scno+" "+previousr+" "+presentr+" "+totalunits+" "+category+" "+totalbill+" ");
}
}
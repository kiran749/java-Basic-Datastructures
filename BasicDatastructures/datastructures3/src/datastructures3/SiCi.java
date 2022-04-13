package datastructures3;

		class SiCi {
			
		    public double simpleInterest(double p,int t,double i){
		    	
		    double simpleinterest=(p*t*i)/100;
		    	return simpleinterest;
		    	
		    }
		    
		    public double compoundInterest(double principalAmount,int time,double interestRate){
		    	double compoundinterest;
		    	
		    	compoundinterest = (principalAmount * Math.pow(1 + (interestRate),time))-principalAmount;
		    	return compoundinterest;
		    }
		}

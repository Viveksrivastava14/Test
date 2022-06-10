package testt;
class VehicleException extends Exception  {
	  
	  public VehicleException(String str) {
	    super(str);
	  }
	}

	class UnSafetyException extends Exception  {
	  
	  public UnSafetyException(String str) {
	    super(str);
	  }
	}

	public class FourWheeler {
	  
	  String name;
	  int cc;
	  int safety;
	  Double price;
	  
	  public FourWheeler(String name, int cc, int safety, Double price) {
	    super();
	    this.name = name;
	    this.cc = cc;
	    this.safety = safety;
	    this.price = price;
	  }
	  
	  public String checkSafety(FourWheeler f) throws VehicleException , UnSafetyException{
	    try {
	      if(f.cc<1000) {
	        throw new VehicleException("It is two wheeler not four wheeler");
	      }
	      else if(f.safety!=5) {
	        throw new UnSafetyException("Sorry, Invalid Safety features.");
	      }
	    }
	    catch(Exception e) {
	      return e.getMessage();
	    }
	    return "Safe vehicle";
	    
	  }

	  public static void main(String args[]) throws VehicleException, UnSafetyException {
	    
	    FourWheeler f1 = new FourWheeler("Vehicle 1", 1000,5,100000d);
	    FourWheeler f2 = new FourWheeler("Vehicle 2", 200,5,20000d);
	    FourWheeler f3 = new FourWheeler("Vehicle 3", 3000,5,300000d);
	    FourWheeler f4 = new FourWheeler("Vehicle 4", 400,5,400000d);
	    
	    System.out.println(f1.checkSafety(f1));
	    System.out.println(f2.checkSafety(f2));
	    System.out.println(f3.checkSafety(f3));
	    System.out.println(f4.checkSafety(f4));
	  }

	}
package testt;
class Pizza{

	  String pizzabase;
	  double price;
	  public Pizza(String pizzabase, double price) {
	    super();
	    this.pizzabase = pizzabase;
	    this.price = price;
	  }

	}

	class ChickenPizza extends Pizza{

	  String topping = "Chicken Topping";

	  public ChickenPizza(String pizzabase, double price) {
	    super(pizzabase, price);
	    this.topping = topping;
	  }

	  public String getTopping() {
	    return topping;
	  }

	  public void setTopping(String topping) {
	    this.topping = topping;
	  }
	  
	  
	  public void display() {
	    System.out.println(pizzabase+" "+price+" "+topping);
	  }

	}

	class MuttonPizza extends ChickenPizza{
	  
	  String flavouredTopping ="Mutton Topping";

	  public MuttonPizza(String pizzabase, double price) {
	    super(pizzabase, price);
	    this.flavouredTopping = flavouredTopping;
	  }

	  public String getFlavouredTopping() {
	    return flavouredTopping;
	  }

	  public void setFlavouredTopping(String flavouredTopping) {
	    this.flavouredTopping = flavouredTopping;
	  }

	  public void display() {
	    System.out.println(pizzabase+" "+price+" "+flavouredTopping);
	  }

	}

	public class PizzaHut {

	  public static void main(String[] args) {
	    
	    Pizza p = new Pizza("Base",100);
	    ChickenPizza cp = new ChickenPizza("Flour base",500);
	    MuttonPizza mp = new MuttonPizza("WheatBase", 1000);
	    cp.display();
	    mp.display();
	  }

	}

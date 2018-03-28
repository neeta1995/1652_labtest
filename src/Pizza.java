
public class Pizza {
	String PizzaType;
	String PizzaName;
	int quantity;
	float price;
	
	
	public Pizza(String PizzaType, String PizzaName, int quantity, float price)
	{
		super();
		this.PizzaType=PizzaType;
		this.PizzaName=PizzaName;
		this.quantity=quantity;
		this.price=price;
		
	}
	public String getPizzaName() {
		return PizzaName;
	}
	public void setPizzaName(String pizzaName) {
		PizzaName = pizzaName;
	}
	public String getPizzaType() {
		return PizzaType;
	}
	public void setPizzaType(String pizzaType) {
		PizzaType = pizzaType;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void printDetails()
	{
		
		System.out.println("     "+getPizzaType()+"       "+getPizzaName()+"      "	+getQuantity()+"          "	+getPrice()+"          "	+netPrice());
		
	}
	public float netPrice()
	{
		float total;
		total=getQuantity()*getPrice();
		return total;
	}
	
	
	
}

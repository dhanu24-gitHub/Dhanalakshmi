package FunctionsClass;

public class UseObjectAc {
	public static void main(String[]args) {
		Calculation c = new Calculation();
		ObjectAc ac = new ObjectAc();
		
		ac.brand = "Voltas";
		ac.colour = "Green";
		ac.price = 500000;
		ac.netPrice = c.findNetPrice(ac.price, 10);
		System.out.println(ac.netPrice);
	}

}

//Bean Class:
class ObjectAc {
	String brand;
	int price;
	String colour;
	int netPrice;
	
}


//Method Creation To Find NetPrice:
class Calculation{
public int findNetPrice(int price, int percentage) {
	return (price * percentage / 100)+ price;
}
}
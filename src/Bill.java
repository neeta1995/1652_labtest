
public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total=0;
		int i;
		
		Pizza[] p1=new Pizza[10];
		p1[0]=new Pizza("veg","margherita",2,150);
		p1[1]=new  Pizza("veg","peppy paneer",1,250);
		p1[2]=new  Pizza("nonveg","chicken fiesta",2,400);
		
		System.out.println("******************** BILL*********************");
System.out.println(" Pizza type " + " Pizza name " + "Quantity " + "Price "      + "Total Price:-");
		
		for(i=0;i<=2;i++)
		{
			total=total+p1[i].netPrice();
			p1[i].printDetails();
			
			
		}

		System.out.println("Total Amount:- "+total);
		
			float amount=total;
			float GST;
			float finalamt;
			GST=(amount*8)/100;
			System.out.println("GST AMOUNT:- "+GST);
			finalamt=amount+GST;
			System.out.println("Grand Total amount:-" +finalamt);
			System.out.println("*******VISIT AGAIN********");
			
			System.out.println("****************************************");
		
		
		
	}

}

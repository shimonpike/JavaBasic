package ClassInheritance;

public class MainProduct {

	public static void main(String[] args) {
		Product p = new Product();
		p.setName("Yogurt");
		p.setPrice(5.6);
		p.setCode(1234);
		p.setUnit("200ml");
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println(p.getCode());
		System.out.println(p.getUnit());
		
		Product p1 = 
			new Product("Bread", 10.20, 6543,"0.5kg");
		//p1.setPrice(9.40);
		//System.out.println(p1);
		//System.out.println(p);
		
		MeatProduct mp = 
		new MeatProduct("Sausage", 72.50, 7676,"kg","chiken");
		//System.out.println(mp);
		
		MilkProduct mlp = 
				new MilkProduct("Milk",7.20,1515,
						             "1L", "cow", 3);
		//System.out.println(mlp);
		
		Drink d = new Drink("Coca cola", 7.90,9875,
				"1L", true);
		//System.out.println(d);
		
AlcoholDrink ald = 
new AlcoholDrink("Beer", 6.50, 2323,"0.5L",true,4.5);
//System.out.println(ald);
//                      0   1  2    3   4    5  
Product[] minimarket = {p, p1, mp, mlp, d, ald};
//                     pr
for(Product pr : minimarket)
{
	System.out.println(pr);
}



	
		
		
		

	}

}
/*
p1->[name = "Bread" price = 9.40 unit = "0.5kg" code = 6543]
p->[name = "Yogurt" price = 5.60  unit = "200ml" code = 1234]


*/
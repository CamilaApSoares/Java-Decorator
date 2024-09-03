public class CoffeShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseBlend houseblend = new HouseBlend();
		System.out.println(houseblend.getDescription() + ":" + houseblend.cost());
		
		Milk milkAddOn = new Milk(houseblend);
		System.out.println(milkAddOn.getDescription() + ":" + milkAddOn.cost());
		
		Sugar sugarAddOn = new Sugar(milkAddOn);
		System.out.println(sugarAddOn.getDescription() + ":" + sugarAddOn.cost());
	}

}

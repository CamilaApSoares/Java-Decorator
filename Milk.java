public class Milk extends AddOn{
	public Milk(Beverage bev){
		super("Milk", bev);
	}
	
	@Override 
	public String getDescription(){
		return beverage.getDescription() + "With Milk";
	}
	
	@Override
	public double cost(){
		return beverage.cost()+100;
	}
}

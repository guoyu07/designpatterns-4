/**
 * The Factory Method pattern is used here to print the name of a 
 * product in e.g., a store. The product is created and its name is printed.
 *  
 * @author Gergely Kovacs  <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.creational.factorymethod.AbstractFactoryMethod;
import be.whatshould.designpatterns.creational.factorymethod.FactoryMethod;
import be.whatshould.designpatterns.etc.enums.ProductTypes;

public class MainFactoryMethodClient {
	
	public MainFactoryMethodClient() {
	}
	
	public static void main(String[] args) {
		
		AbstractFactoryMethod fm = new FactoryMethod();
		fm.printName(ProductTypes.PRODUCT_B);
	}
}
package sumalan1;

public class LetsAnalyze2 {
	public static void main(String[] args) {
		
	
		System.out.println("-------SUPER MARKET MENU------");
		// declare the List, product ID and Prrice Variables
		String[] list1 = { "Corned Beef", "Tuna    ", "Beef loaf"};
		String[] list2 = { " Sprite", " Coke Zero    ", " Pepsi"};
		String[] list3 = { "        Condensed Milk", "Evaporada Milk", "        Kremdensada"};
		System.out.println("-Can Goods:" + "\t" + "\t" + "-Softdrinks:" + "\t" + "\t" + "-Condiments:");
		for (int m = 0; m < list1.length; m++) {
			System.out.println(list1[m] + "\t" + "\t" + list2[m] +"\t" + "\t" + list3[m]);
		}
		
	}
}

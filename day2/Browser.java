package week1.day2;

public class Browser {


		public String launchBrowser(String browserName) {
			System.out.println("Browser launched successfully");
			return browserName;
		}
		public void loadurl() {
			System.out.println("Application loaded successfully");
		}
		public static void main(String[] args) {
			Browser lb=new Browser();
			System.out.println(lb.launchBrowser ("chrome"));
			lb.loadurl();
		// TODO Auto-generated method stub

	}

}

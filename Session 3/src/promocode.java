// Assignment: 1. Suggest the User right promo code, if user has applied a wrong one
//			   2. Suggest the User, promo Code which delivers highest discount
//				     2.1 if user applied invalid promo code
//					 2.2 if user has entered d a promo code which is giving him lesser discount as compare to other
import java.util.Scanner;
public class promocode{
	public static void getMyPromo(boolean orderType,float amount) {
		System.out.println("You Are Eligible for PromoCodes ");
		System.out.println("1.FIRST200 for first-time orders and upto RS.200 below orders");
		System.out.println("2.KOTAK200 for orders above RS.399. avails Flat 20%");
		System.out.println("3.SWAG800 for orders above RS.800. avails Salman movie tickets");
		System.out.println("4.COOLWINK2020 for orders above RS.1000. Flat 30%");
		System.out.println("5.Choose No promocode and proceed");
		int choice;
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		scan.nextLine();
		if(choice > 4 && choice < 1) { //////// 2.1 condition
			System.out.println("Entered Wrong Promocode, Lets try again :-)");
			getMyPromo(orderType, amount);
		}
		//////We are not looking on switch case here, I'm just using if-else conditions
		if(choice == 1 ) {
				if(amount<=200) {
				if( orderType == true) {
					System.out.println("Awesome You are eligible for full discount, order will be delivered soon");
				}
				else {
					System.out.println("Uhh! ho Looks like its not your first Order!");
					System.out.println("This promocode is only applicable for first time orders and bellow Rs.200 order price");
					System.out.println("Lets try again!");
					getMyPromo(orderType,amount);
				}
			    }
				else {
					System.out.println("Your cart value is above 200, you're not eligible for this promocode.");
					System.out.println("Lets choose something else");
					getMyPromo(orderType,amount);
				}
		}
		else if(choice==2) {
			if(amount >399) {
				if(amount>1000) { ///---------------------->2.2 condition
					System.out.println("Your cart value best suits other promocode i.e., COOLWINK2020 flat 30%");
					System.out.println("You can still use this, proceed or choose again (y/n)");
					String ch;
					ch = scan.nextLine();
					if(ch.equals("y")) {
						System.out.println("Awesome 20% flat discount is applied!");
						amount = (float) (amount-(amount*0.2));
						System.out.println("Please pay RS."+amount);
					}
					else {
						getMyPromo(orderType,amount);
					}
				}
				else if(amount>800) {  /////// ---------------> 2.2 condition
					System.out.println("Your cart value best suits other promocode i.e., SWAG800 Movie Tickets");
					System.out.println("You can still use this, proceed or choose again (y/n)");
					String ch;
					ch = scan.nextLine();
					if(ch.equals("y")) {
						System.out.println("Awesome promo Applied, Movie Tickets will be mailed to you :)");
						System.out.println("Please pay RS."+amount);
					}
				}
			}
			else {
				System.out.println("Your cart value doesn't meet the constraint!");
				System.out.println("Lets try it again, choose something else");
				getMyPromo(orderType,amount);
			}
		}
		else if(choice== 3) {
			if(amount>800) {
				if(amount>1000) { ///------------------------>2.2 condition 
					System.out.println("Your cart value best suits other promocode i.e., COOLWINK2020 flat 30%");
					System.out.println("You can still use this, proceed or choose again (y/n)");
					String ch;
					ch = scan.nextLine();
					if(ch.equals("y")) {
						System.out.println("Awesome promo Applied, Movie Tickets will be mailed to you :)");
						System.out.println("Please pay RS."+amount);
					}
					else
						getMyPromo(orderType,amount);
				}
				
			}
			else {
				System.out.println("Your cart value doesn't meet the needs, please select something else");
				getMyPromo(orderType,amount);
			}
		}
		else if(choice == 4) {
			if(amount>=1000) {
				amount =(float)(amount -(amount*0.3));
				System.out.println("Awesome promo Applied!");
				System.out.println("Please pay RS."+amount);
			}
			else {
				System.out.println("Your cart value doesn't meet the needs, please select something else");
				getMyPromo(orderType,amount);
			}
		}
		else {
			System.out.println("Thank you for shopping with us!");
			System.out.println("Please Pay RS."+amount);
		}
	}
	public static void main(String[] args) {
		boolean firstOrder = true;
		float amount = 450;
		getMyPromo(firstOrder,amount);
	}
}
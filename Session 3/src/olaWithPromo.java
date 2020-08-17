// Assignment: Integrate PromoCoode Coupon Snippet in this program w.r.t. OLA Ride Booking Program :)
import java.util.Scanner;
public class olaWithPromo {
	
	public static void getMyPromo(boolean orderType,double amount) {
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
		
		// MODEL
		int baseFare = 50;
		int kmCharge = 10;
		
		int distanceTravlled = 7;
		
		int olaMicro = 1;
		int olaMini = 2;
		int olaSedan = 3;
		int olaBike = 4;
		int olaShared = 5;
		boolean orderType = false;

		double amountToPay = 0;
		
		// VIEW
		System.out.println("=========================");
		System.out.println("Select the Type of Cab:");
		System.out.println("1. OLA MICRO");
		System.out.println("2. OLA MINI");
		System.out.println("3. OLA SEDAN");
		System.out.println("4. OLA BIKE");
		System.out.println("5. OLA SHARED");
		System.out.println("=========================");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Choice:");
		int choice = scanner.nextInt();
		scanner.close();
		
		switch(choice) {
		
			case 1:
				baseFare += 10;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				getMyPromo(orderType,amountToPay);
				//System.out.println("OLA MICRO BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
				
			case 2:
				baseFare += 20;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				getMyPromo(orderType,amountToPay);
				//System.out.println("OLA MINI BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
			
			case 3:
				baseFare += 50;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				getMyPromo(orderType,amountToPay);
				//System.out.println("OLA SEDAN BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
				
			case 4:
				baseFare += 5;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				getMyPromo(orderType,amountToPay);
				//System.out.println("OLA BIKE BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
				
			case 5:
				baseFare += 8;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				getMyPromo(orderType,amountToPay);
				//System.out.println("OLA SHARED BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
				
			default:
				System.out.println("Please Select Cab to Porceed");
				break;
				
		}
		
	}

	
}
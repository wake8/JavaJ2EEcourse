
public class myName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in eclipse windows->preferences->workspace->textEncoding to UTF-8
		//UTF-8 unicode for Telugu name of Lakshminarayana
		//took help from https://www.online-toolz.com/tools/text-unicode-entities-convertor.php/
		char[] name = {'\u0C32','\u0C15','\u0C4D','\u0C37','\u0C4D','\u0C2E','\u0C40','\u0C28','\u0C3E','\u0C30','\u0C3E','\u0C2F','\u0C23'};
		for(int i =0;i<name.length;i++) {
			System.out.print(name[i]);
		}
	}

}

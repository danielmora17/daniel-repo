package bucles;

public class buclesej11 {

	public static void main(String[] args) {
		int num;
		int ultimopar=(29/2+1)*2;
		for(num=51;num>=29;num--) {
			if(num % 2==0) {
				System.out.printf("%d", num);
				if(num!=ultimopar) {
					System.out.printf("-", args);
				}
			}
			
		}

	}

}

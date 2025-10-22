import java.util.*;

class InsertatIndex{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.next();
		int n=in.nextInt();
		StringBuilder sb= new StringBuilder(s1);
		for(int i=n;i<sb.length();i=i+n+1){
		    sb.insert(i,s2);
		}
		String s=sb.toString();
		System.out.print(s);
           in.close();
	}
}

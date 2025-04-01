package Principal;

public class Functions {
	public static String formatarCpf(String x) {
		String pt1 = x.substring(0,3);
		String pt2 = x.substring(3,6);
		String pt3 = x.substring(6,9);
		String pt4 = x.substring(9);
		
		return (pt1+"."+pt2+"."+pt3+"-"+pt4);
	}
}

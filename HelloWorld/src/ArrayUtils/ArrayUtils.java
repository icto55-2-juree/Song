package ArrayUtils;
public class ArrayUtils {
	public static double[] intToDouble(int[] src){
		
		double[] arr2 = new double[src.length];
		
		for (int i = 0; i < src.length; i++) {
			arr2[i] = (double)src[i];
		}
		return arr2;
	}

	static int[] doubleToInt(double[] source){
		
		int[] arr3 = new int[source.length];
		
		for (int i = 0; i < source.length; i++) {
			arr3[i] = (int) source[i];
		}
		return arr3;

	}

	static int[] concat(int[] s1, int[] s2){
		
		int[] arr1 = new int[s1.length+s2.length];
		
		for (int i = 0; i < s1.length; i++) {
			arr1[i] = s1[i];
		}
		for (int i = s1.length; i < arr1.length; i++) {
			arr1[i] = s2[i-s1.length];
		}
		
		return arr1;

	}

}

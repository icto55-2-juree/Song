package ArrayUtils;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayUtilsTestApp {
	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };
		int[] c = { 100, 200, 300, 400, 500 };
		double[] b = { 10.5, 20.5, 30.5, 40.5, 50.5 };

		double[] doubleArray = ArrayUtils.intToDouble(a);
		int[] intArray = ArrayUtils.doubleToInt(b);
		int[] Array = ArrayUtils.concat(a, c);

		for (int i = 0; i < doubleArray.length; i++) {
			System.out.print(doubleArray[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
		}
		System.out.println();
	}
}

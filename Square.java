# Pro52
package pro;

public class Square {

	public static void main(String[] args) {
		//input:(10,10),(10,20),(20,20),(20,10)
		//here array values are in x1,y1,x2,y2.......
		int[] a = new int[8];
		String aa = "x";
		String bb = "y";
		a[0]=10;
		a[1]=10;
		a[2]=10;
		a[3]=20;
		a[4]=20;
		a[5]=20;
		a[6]=20;
		a[7]=10;
		int a1 = a[6] - a[1];
		int a2 = a[5] - a[7];
		int a3 = a[4] - a[2];
		int a4 = a[3] - a[0];
		if (a1 == a2 && a2 == a3 && a3 == a4) {
			System.out.println("Square");
		} else
			System.out.println("Not Square");
	}
}

package day17.object;

public class ObjectEx {

	public static void main(String[] args) {
		Point1 pt1 = new Point1(10, 20);
		System.out.println(pt1);
		System.out.println(pt1.toString());
		
	}

}
class Point1{
	private int x, y;
	
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	class Point2{
		private int x, y;
		
		public Point2(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public String toString() {
			return "(" + x + "," + y + ")";
		}
}
}
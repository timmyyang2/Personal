package year2016;

public class CheckCollision {
	
	public static void findCollision(int x, int y, int z, int j){
		int o = 0;
		int t = 1;
		int th = 4;
		int f = 1;
		String collision = "";
		if(x <= o && y <= t || x == o || y == t){
			System.out.println("collision");;
		}else{
		System.out.println("No collision");
		}
	}
	
	public static void main(String[] args){
		CheckCollision.findCollision(3, 3, 1, 4);
	}
}

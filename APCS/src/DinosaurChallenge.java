
public class DinosaurChallenge {
	private static final double MIN_SIDE_DIST = 1; // dinosaurs NOT at the edge
	
	public static void main(String[] args) {
		
		// Test case 1
		int width_1 = 2;
		int height_1 = 2;
		int[][] dinosaurs_1 = {{1,1}};
		System.out.printf("%.3f", calcualteMaxMinDist(dinosaurs_1, width_1, height_1));
		System.out.println();
		
		int width_2 = 5;
		int height_2 = 4;
		int[][] dinosaurs_2 = {{1,3}, {4,1}, {1,2}};
		System.out.printf("%.3f", calcualteMaxMinDist(dinosaurs_2, width_2, height_2));
		System.out.println();
		
		int width_3 = 5;
		int height_3 = 4;
		int[][] dinosaurs_3 = {{1,3}, {4,1}};
		System.out.printf("%.3f", calcualteMaxMinDist(dinosaurs_3, width_3, height_3));
		System.out.println();
	
		int width_4 = 5;
		int height_4 = 4;
		int[][] dinosaurs_4 = {{1,3}, {4,1}, {1,2}, {2,3}};
		System.out.printf("%.3f", calcualteMaxMinDist(dinosaurs_4, width_4, height_4));
		System.out.println();
	}
	
	private static double calcualteMaxMinDist(int[][] dinosaurPos, int width, int height) {
	
		double sideDist = Integer.MAX_VALUE;
		
		//Get the min distance to the two sides.
		// for edge cases, not 100% complete yet. A few others need to be considered.
		for(int i=0; i<dinosaurPos.length; i++) {
			int x = dinosaurPos[i][0];
			int y = dinosaurPos[i][1];
			int temp = width-x;
			if(temp < sideDist) {
				sideDist = temp;
			}
			
			temp = height-y;
			if(temp < sideDist) {
				sideDist = temp;
			}
		}

		double minDist = Integer.MAX_VALUE;
		//Get the distances between one another
		for(int i=0; i<dinosaurPos.length-1; i++) {
			for(int j=i+1; j<dinosaurPos.length; j++) {
				int x1 = dinosaurPos[i][0];
				int y1 = dinosaurPos[i][1];
				int x2 = dinosaurPos[j][0];
				int y2 = dinosaurPos[j][1];

				double dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
				dist = dist/2; //curve goes across the middle of two dinosaurs
				if(dist >= MIN_SIDE_DIST && dist < minDist) { // distance needs to be greater than MIN_SIDE_DIST to be qualified  
					minDist = dist;
				}
			}
		}
		
		if(minDist > sideDist && minDist != Integer.MAX_VALUE) {
			return minDist;
		}else {
			return sideDist;
		}
	}
}


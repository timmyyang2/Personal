import java.util.Arrays;

public class RealDino {
	private static final double MIN_SIDE_DIST = 1; // Since dinosaurs cannot be at the edge, the min max is 1 at the minimum.
	
	private static double calculateMinSideDist(int[][] dinosaurPos, int width, int height) {
		double minSideDist = Double.MAX_VALUE; //defines and initializes as max double
		
		//Gets the min distance to the two sides
		for(int i=0; i<dinosaurPos.length; i++) {
			int x = dinosaurPos[i][0];
			int y = dinosaurPos[i][1];
			
			double tempX = Math.min(x, width-x);
			if(tempX < minSideDist) {
				minSideDist = tempX;
			}
			
			double tempY = Math.min(y, height-y);
			if(tempY < minSideDist) {
				minSideDist = tempY;
			}
		}
		return minSideDist;
	}
	
	private static int[][] calculateNortheastCornerPoint(int[][] dinosaurPos, int width, int height) {
		double minDist = Double.MAX_VALUE; //defines and initializes minDist as max double
		int[][] cornerPoint = new int[1][2]; // one point
		for(int i=0; i<dinosaurPos.length; i++) {
			int x = dinosaurPos[i][0];
			int y = dinosaurPos[i][1];
			
			double dist = Math.sqrt((x-width)*(x-width)+(y-height)*(y-height));
			if(dist < minDist) { // distance needs to be greater than MIN_SIDE_DIST to be qualified  
				minDist = dist;
				cornerPoint[0][0] = dinosaurPos[i][0];
				cornerPoint[0][1] = dinosaurPos[i][1];
			}
		}
		
		return cornerPoint;
	}
	
	private static double calculateNorthwestRouteSideDist(int[][] dinosaurPos, int width, int height) {
		double minDist = Integer.MAX_VALUE; //defines and initializes as max integer
		
		//Gets the min distance to the two sides
		for(int i=0; i<dinosaurPos.length; i++) {
			int x = dinosaurPos[i][0];
			int y = dinosaurPos[i][1];
			
			if(x < minDist) {
				minDist = x;
			}
			
			if((height-y) < minDist) {
				minDist = height-y;
			}
		}
		return minDist;
	}
	
	private static double calculateSoutheastRouteSideDist(int[][] dinosaurPos, int width, int height) {
		double minDist = Integer.MAX_VALUE; //defines and initializes as max integer
		
		//Gets the min distance to the two sides
		for(int i=0; i<dinosaurPos.length; i++) {
			int x = dinosaurPos[i][0];
			int y = dinosaurPos[i][1];
			
			if((width-x) < minDist) {
				minDist = width-x;
			}
			
			if(y < minDist) {
				minDist = y;
			}
		}
		return minDist;
	}
	
	private static double calcualteMaxMinDist(int[][] dinosaurPos, int width, int height) {
		double minSideDist = calculateMinSideDist(dinosaurPos, width, height);
		double northwestRouteSideDist = calculateNorthwestRouteSideDist(dinosaurPos, width, height);
		double southeastRouteSideDist = calculateSoutheastRouteSideDist(dinosaurPos, width, height);
		double insideRouteMaxMinDist = calculateInsideRouteMaxMinDistance(dinosaurPos);
		
		if( northwestRouteSideDist > insideRouteMaxMinDist && southeastRouteSideDist > insideRouteMaxMinDist) {
			return Math.min(northwestRouteSideDist, southeastRouteSideDist); //returns whichever is smaller
		}
		else if(northwestRouteSideDist > insideRouteMaxMinDist){ //
			return northwestRouteSideDist; //returns northwestRouteSideDist
		}
		else if(southeastRouteSideDist > insideRouteMaxMinDist) {
			return southeastRouteSideDist; //returns southeastRouteSideDist
		}
		
		int[][] northeastCornerPoint = calculateNortheastCornerPoint(dinosaurPos, width, height);
		double maxNortheastCornerDist = Math.max(width-northeastCornerPoint[0][0], height-northeastCornerPoint[0][1]);
		if(maxNortheastCornerDist < insideRouteMaxMinDist) {
			return maxNortheastCornerDist;
		}
		
		//If the above routes is not applicable, compares insideRouteMaxMinDist and minSideDist and returns whichever is greater.
		if(insideRouteMaxMinDist > minSideDist) {
			return insideRouteMaxMinDist;
		}else {
			return minSideDist;
		}
	}
		
	private static double calculateInsideRouteMaxMinDistance(int[][] dinosaurPos) {
		double minDist = Double.MAX_VALUE;
		for(int i=0; i<dinosaurPos.length-1; i++) {
			for(int j=i+1; j<dinosaurPos.length; j++) {
				int x1 = dinosaurPos[i][0];
				int y1 = dinosaurPos[i][1];
				int x2 = dinosaurPos[j][0];
				int y2 = dinosaurPos[j][1];

				double dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
				dist = dist/2; //curve goes across the middle of two dinosaurs to stay the max distance to both ends
				if(dist >= MIN_SIDE_DIST && dist < minDist) { // distance needs to be greater than MIN_SIDE_DIST to be qualified  
					minDist = dist;
				}
			}
		}
		
		if(minDist == Double.MAX_VALUE) { //if nothing replaces this value means only one dinosaur
			minDist = MIN_SIDE_DIST; //just assigns the min side distance to it
		}
		return minDist;
	}
	
	private static void printTestcase(String message, int[][] dinosaurs, int width, int height) {
		System.out.println(message);
		System.out.println(dinosaurs.length+" "+width+" "+height);
		System.out.println(Arrays.deepToString(dinosaurs));
		System.out.printf("%.3f", calcualteMaxMinDist(dinosaurs, width, height));
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		int width = 2;
		int height = 2;
	
		//////////////////////// Three test cases from the handout ///////////////////
		System.out.println("--- Three test cases from handout ---\n");
		int[][] dinosaurs_1 = {{1,1}};
		printTestcase("Test case 1", dinosaurs_1, width, height);

		width = 5;
		height = 4;
		
		int[][] dinosaurs_2 = {{1,3}, {4,1}, {1,2}};
		printTestcase("Test case 2", dinosaurs_2, width, height);
	
		int[][] dinosaurs_3 = {{1,3}, {4,1}};
		printTestcase("Test case 3", dinosaurs_3, width, height);
		
		///////////////////////// Additional new test cases ////////////////////////////////
		System.out.println("--- Additional other new test cases ---");
		int[][] dinosaurs_4 = {{1,3}, {4,1}, {1,2}, {2,3}}; //inside route max min
		printTestcase("Test case 4", dinosaurs_4, width, height);
		
		int[][] dinosaurs_5 = {{1,3}, {2,4}}; //northwest corner
		printTestcase("Test case 5", dinosaurs_5, width, height);
				
		int[][] dinosaurs_6 = {{3,1}, {4,2}}; //southeast corner
		printTestcase("Test case 6", dinosaurs_6, width, height);
		
		width = 8;
		height = 7;
		int[][] dinosaurs_7 = {{4,6}, {7,6}}; //northeast corner case
		printTestcase("Test case 7", dinosaurs_7, width, height);
	}
}
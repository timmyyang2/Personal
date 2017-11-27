import org.apache.commons.math3.stat.inference.TTest; 
import org.apache.commons.math3.stat.StatUtils; 

public class Comparison {
	
	public static double compareMeans (double [] valuesA, double [] valuesB)
	{
		TTest studentTest = new TTest();		
		double testResult = 0.0;
		
		try{			
			double standardMean = StatUtils.mean(valuesA);
			double measuredMean = StatUtils.mean(valuesB);
			System.out.println("\nStandard Concussion Mean Value of control % of K+ efflux: "+
								String.format("%.2f", standardMean));
			System.out.println("Measured Concussion Mean Value of control % of K+ efflux: "+
								String.format("%.2f", measuredMean));
			if(measuredMean >= standardMean){
				testResult = 1;
			}else{
				testResult = studentTest.tTest(valuesA, valuesB);		
			}
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
		return testResult;
	}
	
	public static int random_int(int Min, int Max){
	     return (int) (Math.random()*(Max-Min))+Min;
	}
	
	public static void main(String args[]) throws Exception {
		
		// Standard data set indicating the potassium efflux control % between 1 and 4 minutes.
		// Total of 180 samples, one sample per sec. Only 60 samples are significant. All others
		// are simplified as 0's.
		double [] valuesA = new double[180];
		for(int i=61; i<=120; i++){
			valuesA[i] = random_int(380, 420);
		}
		
		// Measurements for 3 players on the field after the impact
		double [] valuesB = new double[180];
		for(int i=61; i<=120; i++){
			valuesB[i] = random_int(350, 400);
		}
		double probabilityResult = Comparison.compareMeans(valuesA, valuesB);
		System.out.println("Player 1 P Value: "+ String.format("%.2f", probabilityResult)+". "
											   + "Concussion: "+(probabilityResult>=0.05));
		
		valuesB = new double[180];
		for(int i=61; i<=120; i++){
			valuesB[i] = random_int(380, 430);
		}
		probabilityResult = Comparison.compareMeans(valuesA, valuesB);
		System.out.println("Player 2 P Value: "+ String.format("%.2f", probabilityResult)+". "
											   + "Concussion: "+(probabilityResult>=0.05));
		
		valuesB = new double[180];
		for(int i=61; i<=120; i++){
			valuesB[i] = random_int(200, 350);
		}
		probabilityResult = Comparison.compareMeans(valuesA, valuesB);
		System.out.println("Player 3 P Value: "+ String.format("%.2f", probabilityResult)+". "
				   							   + "Concussion: "+(probabilityResult>=0.05));
	}
}



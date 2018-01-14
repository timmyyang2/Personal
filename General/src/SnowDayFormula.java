
public class SnowDayFormula {
	
	private static void formula(int choice1, int choice2, int choice3, int choice4, int choice5, int choice6, int choice7, int choice8, int choice9){
		do{
			try{
				int count = 0;
				System.out.println("When will it start snowing?\n"
						+ "After 9:00 AM (1)\n"
						+ "After 3:00 PM (2)\n"
						+ "After 9:00 PM (3)\n"
						+ "After 3:00 AM (4)");
				count = count + choice1;
				System.out.println(choice1 + "\n");
				
				System.out.println("How windy will it be?\n"
						+ "Calm (1)\n"
						+ "1-5 MPH (2)\n"
						+ "5-10 MPH (3)\n"
						+ "10+ MPH (4)");
				count = count + choice2;
				System.out.println(choice2 + "\n");
				
				System.out.println("How mush snow will fall?\n"
						+ "1-3 inches (1)\n"
						+ "3-6 inches (2)\n"
						+ "6-12 inches (3)\n"
						+ "12+ inches (4)");
				count = count + choice3;
				System.out.println(choice3 + "\n");
				
				System.out.println("Will the snow be wet or heavy?\n"
						+ "Unsure (1)\n"
						+ "Very light, powdery (2)\n"
						+ "Average (3)\n"
						+ "Very heavy (4)");
				count = count + choice4;
				System.out.println(choice4 + "\n");
				
				System.out.println("How fast will the snow be falling?\n"
						+ "Very lightly (1)\n"
						+ "Moderate; possibly 1 inch an hour (2)\n"
						+ "Heavy; over 1 inch an hour (3)\n"
						+ "Very heavily; consistently over 1 inch an hour (4)");
				count = count + choice5;
				System.out.println(choice5 + "\n");
				
				System.out.println("Are schools around you closing (schools from other districts)?\n"
						+ "No (1)\n"
						+ "Yes, but not many (2)\n"
						+ "Yes, many around the area are close (3)\n"
						+ "Yes, almost everyone is closed (4)");
				count = count + choice6;
				System.out.println(choice6 + "\n");
				
				System.out.println("How is the storm being hyped?\n"
						+ "No one cares (1)\n"
						+ "Hearing talk among people (2)\n"
						+ "News is talking about it (3)\n"
						+ "Everyone is talking about it (4)");
				count = count + choice7;
				System.out.println(choice7 + "\n");
				
				System.out.println("How low will visibility be?\n"
						+ "High, you can see miles away (1)\n"
						+ "Fair, cannot see a great distance away (2)\n"
						+ "Low, visiblilty under 3 miles (3)\n"
						+ "Very low, under 1 mile at times (4)");
				count = count + choice8;
				System.out.println(choice8 + "\n");
				
				System.out.println("How will traffic be?\n"
						+ "Good, little interruption (1)\n"
						+ "Fair, some back-ups, nothing major (2)\n"
						+ "Bad, traffic is sometimes bumper-to-bumper (3)\n"
						+ "Horrible, no one is moving for over half an hour (4)");
				count = count + choice9;
				System.out.println(choice9 + "\n");
				
				System.out.println("Total: " + count);
				
				if(count >= 0 && count <= 12){
					System.out.println("There will not be a snowday!");
				}else if(count >= 13 && count <= 20){
					System.out.println("The chance of a snowday is very unlikely!");
				}else if(count >= 21 && count <= 28){
					System.out.println("The is a chance that there will be a snowday!");
				}else if(count >= 29 && count <= 32){
					System.out.println("The is a good chance that there will be a snowday!");
				}else if(count >= 33 && count <= 36){
					System.out.println("There is going to be a snowday!");
				}else{ //if user inputs none of the above
					System.out.println("Please enter a number between 1 and 4\n");
				}
				break;
			}catch(Exception e) {
				System.out.println("Invalid input\n");
			}
		}while(true);
	}
}

import java.util.ArrayList;

public class NBAJersey {

	private String name;
	private int number;
	private String design;
	private String logo;
	private String color;
	private int price;
	private int viewCount;
	
	public NBAJersey(){
		
	}
	
	public NBAJersey(String jerseyName, int jerseyNumber, String jerseyDesign, String jerseyLogo, String jerseyColor){
		name = jerseyName;
		number = jerseyNumber;
		design = jerseyDesign;
		logo = jerseyLogo;
		color = jerseyColor;
	}
	
	public void printInfo() {
		System.out.print(name + " ");
		System.out.print(number + " ");
		System.out.print(logo + " ");
		System.out.print(design + " ");
		System.out.print(color + " \n");
		System.out.println(price);
		System.out.println(viewCount);
	}
	
	public String getName(){
		return name;
	}
	
	public int getViewCount(){
		return viewCount;
	}
	
	public static void buy(){
		
	}
	
	public static void sell(){
		
	}
	
	public void view(){
		viewCount++;
	}
	
	public static void main(String[] args){
		NBAJersey celticsJersey = new NBAJersey("Celtics", 4, "Lucky", "Skyline", "Green");
		NBAJersey thunderJersey = new NBAJersey("Thunder", 0, "Logo", "Lightning", "Blue");
		NBAJersey bucksJersey = new NBAJersey("Bucks", 34, "Deer", "Triangle", "Tan");
		NBAJersey wolvesJersey = new NBAJersey("Wolves", 32, "Wolf", "Tree", "Gray");
		NBAJersey sixersJersey = new NBAJersey("Sixers", 21, "TTP", "Star", "Blue");
		NBAJersey rocketsJersey = new NBAJersey("Rockets", 13, "Bear", "Skyline", "Red");
		
		ArrayList<NBAJersey> jerseyList = new ArrayList<NBAJersey>();
		jerseyList.add(celticsJersey);
		jerseyList.add(thunderJersey);
		jerseyList.add(bucksJersey);
		jerseyList.add(wolvesJersey);
		jerseyList.add(sixersJersey);
		jerseyList.add(rocketsJersey);
		for(int i = 0; i<56000; i++){
			rocketsJersey.view();
		}
		System.out.println(rocketsJersey.getName() + " has " + rocketsJersey.getViewCount()+ " views.");
//		for(int i = 0; i<jerseyList.size(); i++){
//			jerseyList.get(i).printInfo();
//			
//		}
		
	}
}

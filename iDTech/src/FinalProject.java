import java.util.Scanner;

public class FinalProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean gameOver;
		while (true){
			Scanner user_input = new Scanner(System.in);
			int playerLevel = 1;

			System.out.println("What's your name?");
			String playerName = user_input.nextLine();
			//input name

			int playerSupply = 60;
			int playerHealth = 75;

			System.out.println(playerName + " has entered the game.");
			int lost;

			System.out.println("You're lost in the middle of no where. You do not have full health or full supplies. "
					+ "To proceed you have to choose whether you go... \n1) right \n2) left");
			//lost = user_input.nextInt();
			int choice = user_input.nextInt();
			
			if(choice != 1 && choice != 2){
				System.out.println("Choose a number between 1 and 2!");
				choice = user_input.nextInt();
				
				}

			if(choice == 1){
				System.out.println("You chose to go right!");
				System.out.println("You have " + playerHealth + " player health!");
				System.out.println("You have " + playerSupply + " player supply!");
				playerLevel = playerLevel + 1;
				System.out.println("Your player level increased by 1. It is " + playerLevel + "!");
				System.out.println("You have now reached a steep cliff! \n"
						+ "You can jump off the cliff and lose 60 health or \nyou can go walk all the way "
						+ "around it and only lose 40 health... \n1) You can jump off the "
						+ "cliff and lose 60 health \n2) you can go walk all the way around it and lose 40 health");
				int cliffChoice = user_input.nextInt();
				user_input.nextLine();
				//what happens when you choose choice 1
				
				if(cliffChoice != 1 && cliffChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
				}

				if(cliffChoice == 1){//Player chooses to jump off
					playerHealth -= 60;
					if(playerHealth <= 0){
						gameOver = true;
						System.out.println("You ran out of health! You lost!");
						System.exit(0);
					}
					System.out.println("You chose to jump off the cliff, losing 60 health.");
					System.out.println("Your player health is now " + playerHealth + "!");
				} 
				/*if(cliffChoice != 1 && cliffChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
				}*/
				
				else if(cliffChoice == 2){//Player chooses to go around
					playerHealth -= 40;
					if(playerHealth <= 0){
						gameOver = true;
						System.out.println("You ran out of health! You lost!");
						System.exit(0);
					}
					System.out.println("You chose to go around, losing 40 health.");
					System.out.println("Your player health is now " + playerHealth + "!");
				}
			}
			else if(choice == 2){
				System.out.println("You chose to go left!");
				System.out.println("You have " + playerHealth + " player health!");
				System.out.println("You have " + playerSupply + " player supply!");
				playerLevel = playerLevel + 1;
				System.out.println("Your player level increased by 1. It is " + playerLevel + "!");
				System.out.println("You walk for five miles and reach a river with fast rapids! \n"
						+ "You can swim across the river and lose 35 health "
						+ "or \n you can build a boat and paddle across and lose 30 supply... "
						+ "\n1) You can swim across the river and lose 35 health "
						+ "\n2) you can build a boat and paddle across and lose 30 supply");
				int riverChoice = user_input.nextInt();
				user_input.nextLine();
				//what happens when you choose choice 2
				
				if(riverChoice != 1 && riverChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
				}

				if(riverChoice == 1){//Player chooses to swim across
					playerHealth -= 35;
					if(playerHealth <= 0){
						gameOver = true;
						System.out.println("You ran out of health! You lost!");
						System.exit(0);
					}
					System.out.println("You chose to swim across, losing 35 health.");
					System.out.println("Your player health is now " + playerHealth + "!");

				} 
				
				/*if(riverChoice != 1 && riverChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
				}*/
				
				else if(riverChoice == 2){ //Player chooses to build a boat
					playerSupply -= 30;
					if(playerSupply <= 0){
						gameOver = true;
						System.out.println("You ran out of supplies! You lost!");
						System.exit(0);
					}
					System.out.println("You chose to build a boat, losing 30 supply.");
					System.out.println("Your player health is now " + playerSupply+ "!");
				}
			}

			System.out.println("You find a house in the woods! Do you... \n1) Go in house \n2) Pass by house");
			choice = user_input.nextInt();
			user_input.nextLine();
			//beads on a string always goes to back to the same plot
			
			if(choice != 1 && choice != 2){
				System.out.println("Choose a number between 1 and 2!");
				choice = user_input.nextInt();
			}

			if(choice == 1){
				System.out.println("You chose to go in the house!");
				System.out.println("You have " + playerHealth + " player health!");
				System.out.println("You have " + playerSupply + " player supply!");
				playerLevel = playerLevel + 2;
				System.out.println("Your player level increased by 2. It is " + playerLevel + "!");
				System.out.println("Once you are in the house, you can either gain 20 supplies or "
						+ "you can sleep there and gain 10 health... \n1) gain 20 supplies"
						+ "\n2) you can sleep there and gain 10 health");
				int houseChoice = user_input.nextInt();
				user_input.nextLine();
				//what happens when you choose choice 1
				
				if(houseChoice != 1 && houseChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}

				if(houseChoice == 1){//Player chooses to gain 20 supplies
					playerSupply += 10;
					if(playerSupply > 100){
						playerSupply = playerSupply - (playerSupply%100);
					}
					System.out.println("You chose to gain 10 supplies.");
					System.out.println("Your player supply is now " + playerSupply + "!");
				} 
				
				/*if(houseChoice != 1 && houseChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}*/
	
				else if(houseChoice == 2){//Player chooses to gain 20 health
					playerHealth += 10;
					if(playerHealth > 100){
						playerHealth = playerHealth - (playerHealth%100);
					}
					System.out.println("You chose to gain 10 health.");
					System.out.println("Your health is now " + playerHealth + "!");
				}
			}
			else if(choice == 2){
				System.out.println("You chose to pass the house!");
				System.out.println("You have " + playerHealth + " player health!");
				System.out.println("You have " + playerSupply + " player supply!");
				playerLevel = playerLevel + 1;
				System.out.println("Your player level increased by 1. It is " + playerLevel + "!");
				System.out.println("After you pass the house, you hear some weird sounds in the house so you run faster "
						+ "and you trip over a tree log and "
						+ "sprain your knee, you can either make a knee brace and lose 40 supply "
						+ "or you can just keep going and lose 30 health... \n1) make a knee brace and lose 40 supply "
						+ "\n2) keep going and lose 30 health");
				int passChoice = user_input.nextInt();
				user_input.nextLine();
				//what happens when you choose choice 1
				
				if(passChoice != 1 && passChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}

				if(passChoice == 1){//Player chooses to make a knee brace
					playerSupply -= 40;
					if(playerSupply <= 0){
						gameOver = true;
						System.out.println("You ran out of supplies! You lost!");

						System.exit(0);
					}
					System.out.println("You chose to make a knee brace, losing 40 supplies.");
					System.out.println("Your player supply is now " + playerSupply + "!");

				} 
				
				/*if(passChoice != 1 && passChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}*/
				
				else if(passChoice == 2){//Player chooses to keep going
					playerHealth -= 30;
					if(playerHealth <= 0){
						gameOver = true;
						System.out.println("You ran out of health! You lost!");
						System.exit(0);
					}
					System.out.println("You chose to keep going, losing 30 health.");
					System.out.println("Your health is now " + playerHealth + "!");
				}
			}

			System.out.println("You run out of the woods and you keep running until you're finally out of breath. "
					+ "You fall down on the ground and sand gets in your mouth. \nYou stand up and realize that you're "
					+ "in a desert. You look around and see a bike and an elephant. You can either ride the elephant "
					+ "to see where it \ntakes you or you can ride the bike to the unknown world ahead of you... \n1) "
					+ "ride the elephant \n2) ride the bike to the unknown world ahead of you");
			choice = user_input.nextInt();
			user_input.nextLine();
			//beads on a string always goes to back to the same plot
			
			if(choice != 1 && choice != 2){
				System.out.println("Choose a number between 1 and 2!");
				choice = user_input.nextInt();
			}

			if(choice == 1){
				System.out.println("You chose to ride the elephant!");
				System.out.println("You have " + playerHealth + " player health!");
				System.out.println("You have " + playerSupply + " player supply!");
				playerLevel = playerLevel + 1;
				System.out.println("Your player level increased by 1. It is " + playerLevel + "!");
				System.out.println("Once you get on the elephant, the elephant goes wild and starts swinging you around. "
						+ "You can either jump off the elephant and lose 35 health, \nor you can stay on and lose"
						+ " 25 supply because they fall off when the elephant is "
						+ "swinging around... \n1) jump off the elephant and lose 35 health \n2) "
						+ "stay on and lose 25 supply because "
						+ "they fall off when the elephant is swinging around");
				int elephantChoice = user_input.nextInt();
				user_input.nextLine();
				//what happens when you choose choice 1
				
				if(choice != 1 && choice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}
				
				if(elephantChoice == 1){//Player chooses to jump of the elephant
					playerHealth -= 35;
					if(playerHealth <= 0){
						gameOver = true;
						System.out.println("You ran out of health! You lost!");
						System.exit(0);
					}
					System.out.println("You chose to jump off the elephant, losing 35 health.");
					System.out.println("Your player health is now " + playerHealth + "!");
				} 
				
				/*if(elephantChoice != 1 && elephantChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}*/
				
				else if(elephantChoice == 2){//Player chooses to stay on
					playerSupply -= 25;
					if(playerSupply <= 0){
						gameOver = true;
						System.out.println("You ran out of supplies! You lost!");
						System.exit(0);
					}
					System.out.println("You chose to stay on, losing 25 supply.");
					System.out.println("Your supply is now " + playerSupply + "!");
				}
			}

			//PLAYER CHOSE TO RIDE THE BIKE
			else if(choice == 2){
				System.out.println("You chose to ride the bike!");
				System.out.println("You have " + playerHealth + " player health!");
				System.out.println("You have " + playerSupply + " player supply!");
				playerLevel = playerLevel + 1;
				System.out.println("Your player level increased by 1. It is " + playerLevel + "!");
				System.out.println("Once you get on the bike, you ride smoothly and you when you stop biking, you sit "
						+ "down to rest and you have to choose \nwhether to gain 5 supply or 5 health by either resting "
						+ "or by collecting supplies near by... \n1) gain 5 supply by collecting supplies near by \n2) "
						+ "gain 5 health by resting");
				int bikeChoice = user_input.nextInt();
				user_input.nextLine();
				//what happens when you choose choice 1
				
				if(bikeChoice != 1 && bikeChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}

				if(bikeChoice == 1){//Player chooses to gain 5 supply by collecting supplies near by
					playerSupply += 5;
					if(playerSupply > 100){
						playerSupply = playerSupply - (playerSupply%100);
					}
					System.out.println("You chose to collect supplies, gaining 5 supply.");
					System.out.println("Your player supply is now " + playerSupply + "!");
				} 
				
				/*if(bikeChoice != 1 && bikeChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}*/
				
				else if(bikeChoice == 2){//Player chooses to gain 5 health by resting
					playerHealth += 5;
					if(playerHealth > 100){
						playerHealth = playerHealth - (playerHealth%100);
					}
					System.out.println("You chose to rest, gaining 5 health.");
					System.out.println("Your health is now " + playerHealth + "!");
				}
			}	

			System.out.println("After your long ride, you finally arrive at a cave openning. There are two diverging "
					+ "paths in the caves. Both seem terrifying but you have "
					+ "to choose one. Which cave will you choose... \n1) cave 1"
					+ "\n2) cave 2");
			choice = user_input.nextInt();
			user_input.nextLine();

			//beads on a string always goes to back to the same plot
			if(choice != 1 && choice != 2){
				System.out.println("Choose a number between 1 and 2!");
				choice = user_input.nextInt();
			}
			
			if(choice == 1){
				System.out.println("You chose to enter cave 1!");
				System.out.println("You have " + playerHealth + " player health!");
				System.out.println("You have " + playerSupply + " player supply!");
				playerLevel = playerLevel + 1;
				System.out.println("Your player level increased by 1. It is " + playerLevel + "!");
				System.out.println("After entering cave 1, a rock falls on you and you lose health. "
						+ "Then you realize its an avalanche. \n"
						+ "You start running but then you stop. You have to make a decision "
						+ "whether to run out of the cave and lose 50 supply \n"
						+ "or you can stay in and lose 35 health and then run out of the cave after "
						+ "the avalanche is over... \n1) run out of the cave and lose 50 supply \n2) stay in and lose 35 health");
				int caveChoice = user_input.nextInt();
				user_input.nextLine();
				//what happens when you choose choice 1
				
				if(caveChoice != 1 && caveChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}

				if(caveChoice == 1){//Player chooses to run out of the cave
					playerSupply -= 50;
					if(playerSupply <= 0){
						gameOver = true;
						System.out.println("You ran out of supplies! You lost!");
						System.exit(0);
					}
					System.out.println("You chose to run out of the cave, losing 50 supply.");
					System.out.println("Your player supply is now " + playerSupply + "!");
				} 
				
				/*if(caveChoice != 1 && caveChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}*/
				
				else if(caveChoice == 2){//Player chooses to stay in
					playerHealth -= 35;
					if(playerHealth <= 0){
						gameOver = true;
						System.out.println("You ran out of health! You lost!");
						System.exit(0);
						System.out.println("You chose to stay in, losing 35 health.");
						System.out.println("Your health is now " + playerHealth + "!");	
					}
				}
			}
			else if(choice == 2){
				System.out.println("You chose to enter cave 2!");
				System.out.println("You have " + playerHealth + " player health!");
				System.out.println("You have " + playerSupply + " player supply!");
				playerLevel = playerLevel + 1;
				System.out.println("Your player level increased by 1. It is " + playerLevel + "!");
				System.out.println("After entering cave 2, it seems peachful but suddenly "
						+ "you hear a voice. You start running faster \n"
						+ "and faster and faster and you hear their footsteps. \n"
						+ "You either fight them and lose 35 health or you run "
						+ "away and you lose 25 supply \n1) fight them and lose 20 health "
						+ "\n2)  run away and you lose 15 supply");
				int caveeChoice = user_input.nextInt();
				user_input.nextLine();
				//what happens when you choose choice 1
				
				if(caveeChoice != 1 && caveeChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}

				if(caveeChoice == 1){//Player chooses to fight them
					playerHealth -= 35;
					if(playerHealth <= 0){
						gameOver = true;
						System.out.println("You ran out of health! You lost!");
						System.exit(0);
					}
					System.out.println("You chose to fight them, losing 35 health.");
					System.out.println("Your player health is now " + playerHealth + "!");
				} 
				
				/*if(caveeChoice != 1 && caveeChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}*/
				
				else if(caveeChoice == 2){//Player chooses to run away
					playerSupply -= 25;
					if(playerSupply <= 0){
						gameOver = true;
						System.out.println("You ran out of supplies! You lost!");
						System.exit(0);
					}
					System.out.println("You chose to run away, losing 25 supply.");
					System.out.println("Your supply is now " + playerSupply + "!");
				}
			}
			System.out.println("After you escape from the cave you come across a bear that starts chasing you! \n"
					+ "You run away and reach an abandoned car. You can either break in the car or "
					+ "you can keep running... \n1) break in the car \n2) keep running");
			choice = user_input.nextInt();
			user_input.nextLine();
			//beads on a string always goes to back to the same plot
			
			if(choice != 1 && choice != 2){
				System.out.println("Choose a number between 1 and 2!");
				choice = user_input.nextInt();
			}

			if(choice == 1){
				System.out.println("You chose to break in the car!");
				System.out.println("You have " + playerHealth + " player health!");
				System.out.println("You have " + playerSupply + " player supply!");
				playerLevel = playerLevel + 1;
				System.out.println("Your player level increased by 1. It is " + playerLevel + "!");
				System.out.println("After breaking in the car you find supplies there. "
						+ "You can either gather the supplies and gain 10 supply or you"
						+ " can rest in the car and gain 10 health... \n1) gather the supplies and gain 10 supply "
						+ "\n2) rest in the car and gain 10 health");
				int carChoice = user_input.nextInt();
				user_input.nextLine();
				//what happens when you choose choice 1
				
				if(carChoice != 1 && carChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}

				if(carChoice == 1){//Player chooses to gather supplies
					playerSupply += 10;
					if(playerSupply > 100){
						playerSupply = playerSupply - (playerSupply%100);
					}
					System.out.println("You chose to gather supplies, gaining 10 supplies.");
					System.out.println("Your player supply is now " + playerSupply + "!");
				} 
				
				/*if(carChoice != 1 && carChoice != 2){
					System.out.println("Choose a number between 1 and 2!");
					choice = user_input.nextInt();
					
				}*/
				
				else if(carChoice == 2){//Player chooses to rest in the car
					playerHealth += 10;
					if(playerHealth > 100){
						playerHealth = playerHealth - (playerHealth%100);
						System.out.println("You lost all your health! You lost!");
					}
				}
				System.out.println("You chose to rest, gaining 10 health.");
				System.out.println("Your health is now " + playerHealth + "!");
			}
			else if(choice == 2){
				System.out.println("You chose to keep running!");
				System.out.println("You have " + playerHealth + " player health!");
				System.out.println("You have " + playerSupply + " player supply!");
				playerLevel = playerLevel + 1;
				System.out.println("Your player level increased by 1. It is " + playerLevel + "!");
			}
			System.out.println("You keep running near a cliff and you drop your supplies which "
					+ "is now right under the bear. You can either go back and get your supplies "
					+ "but lose 30 health or just lose 20 supply... \n1) go back and get "
					+ "your supplies but lose 30 health \n2) lose 20 supply");
			int runChoice = user_input.nextInt();
			user_input.nextLine();
			//what happens when you choose choice 
			
			if(runChoice != 1 && runChoice != 2){
				System.out.println("Choose a number between 1 and 2!");
				choice = user_input.nextInt();
				
			}
			
			if(runChoice == 1){//Player chooses to go back and get supplies;
				playerHealth -= 30;
				if(playerHealth <= 0){
					gameOver = true;
					System.out.println("You ran out of health! You lost!");
					System.exit(0);
				}
				System.out.println("You chose to go back and get supplies, losing 30 health.");
				System.out.println("Your player health is now " + playerHealth + "!");

			} 
			
			/*if(runChoice != 1 && runChoice != 2){
				System.out.println("Choose a number between 1 and 2!");
				choice = user_input.nextInt();
				
			}*/
			
			else if(runChoice == 2){//Player chooses to run away and lose 20 supplies
				playerSupply -= 20;
				if(playerSupply <= 0){
					gameOver = true;
					System.out.println("You ran out of supplies! You lost!");
					System.exit(0);
				}
				System.out.println("You chose to run away, losing 20 supply.");
				System.out.println("Your supply is now " + playerSupply + "!");
			}
			//???

			System.out.println("\n\nAfter escaping the course, you run until your out of the forest and "
					+ "\nyou realize that your in your backyard. You made it out alive! Good job!");

			System.out.println("\n\nHey, would you like to play again?????");
			System.out.println("\n1) Yes"); 
			System.out.println("\n2) No");
			int repeatGameChoice = user_input.nextInt();
			if(repeatGameChoice == 1){
				System.out.println("\n\n\n");
				//don't do anything it'll just loop
			}else{
				break;
			}
		}
	}
}

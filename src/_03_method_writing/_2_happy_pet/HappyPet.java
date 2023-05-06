package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel=0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet= JOptionPane.showInputDialog("What pet do you want?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		for(int i=0; i<50; i++) {
			
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "take a walk", "clean up poop", "food" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			if(task==0) {
				walkPet();
			}
			if(task==1) {
				cleanPoop();
			}
			if(task==2) {
				food();
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel==50) {
				JOptionPane.showMessageDialog(null, "You love your "+pet);
				break;
			}
		}
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void walkPet() {
		JOptionPane.showMessageDialog(null," Your pet will be excited to go on a walk!");
		happinessLevel+=10;
	}
	public static void cleanPoop() {
		JOptionPane.showMessageDialog(null, "Your pet is ok with you cleaning up his poop." );
		happinessLevel+=5;
	}
	public static void food() {
		JOptionPane.showMessageDialog(null, "Your pet loves his food");
		happinessLevel+=20;
	}
	
}
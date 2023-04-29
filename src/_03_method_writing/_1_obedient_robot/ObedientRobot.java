package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob= new Robot();
	static String color= JOptionPane.showInputDialog("What color do you want your shape to be?");
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("What shape do you want to draw?");
	if(color.equals("red")) {
		rob.setPenColor(255,0,0);
	}
	else if(color.equals("blue")) {
		rob.setPenColor(0,255,0);
	}
	else {
		rob.setPenColor(0,0,255);
	}
	if(input.equals("square")) {	
		drawSquare();
	}
	else if(input.equals("triangle")) {
		drawTriangle();
	}
	else {
		drawCircle();
	}
	 		
}
public static void drawSquare()	{
	rob.penDown();
	for(int i=0;i<4;i++) {	
		rob.move(60);
		rob.turn(90);
	}
	rob.hide();
}
public static void drawTriangle() {
	rob.penDown();
	for(int i=0; i<3; i++) {
		rob.move(60);
		rob.turn(360/3);
	}
	rob.hide();
}
public static void drawCircle() {
	rob.penDown();
	rob.turn(360);
	rob.hide();
}
}
	



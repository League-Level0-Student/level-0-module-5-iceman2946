package _01_algorithms._2_fibonacci;

public class Fibonnacci {
public static void main(String[] args) {
	int last=0;
	int secondLast=1;

	for(int i=0;i<13;i++) {
		int sum=last+secondLast;
		secondLast=last;
		last=sum;
		System.out.println(sum);
		
}
}
}

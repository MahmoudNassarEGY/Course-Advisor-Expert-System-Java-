import java.util.Scanner;

public class CourseSuggest { 
	public static void main(String[]Args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your Student Number: ");
		int StudentID = s.nextInt();
		System.out.println("Please enter your Major: ");
		String Major = s.next();
		System.out.println("Please enter a number representing year of study you are in (example third year enter '3'): ");
		int year = s.nextInt();
		
		Student x = new Student(StudentID,Major,year);
		
		if (Major.equals("COSC")){
			Major = "Computer Science";
		}
		if (Major.equals("CS")){
			Major = "Computer Science";
		}
		if (Major.equals("PSYC")){
			Major = "Psychology";
		}
		if (Major.equals("ADMN")){
			Major = "Business";
		}
		if (Major.equals("JURI")){
			Major = "Law";
		}
		
		
		
		if (Major.equals("Computer Science")&& year == 1){
			
			System.out.print("Student: "+StudentID+" should take: COSC1046 , COSC1047 , MATH1056");
		}
		
		else if (Major.equals("Computer Science")&& year == 2){
			
			System.out.print("Student: "+StudentID+" should take: COSC2006 , COSC2007 , COSC2406");
		}
		
		else if (Major.equals("Computer Science")&& year == 3){
						
			System.out.print("Student: "+StudentID+" should take: COSC3106 , COSC3127 , COSC3407 , COSC3117");
		}
		else if (Major.equals("Computer Science")&& year == 4){
			
			System.out.print("Student: "+StudentID+"  should take: COSC4806 , COSC4106 , COSC4436");
		}
		
		
		else if (Major.equals("Psychology")&& year == 1){
			
			System.out.print("Student: "+StudentID+" should take: PSYC1106 , PSYC1107 ");
		}
		
		else if (Major.equals("Psychology")&& year == 2){
			
			System.out.print("Student: "+StudentID+" should take: PSYC2127 , PSYC2346 , PSYC2606, PSYC2756 , PSYC2956");
		}
		
		else if (Major.equals("Psychology")&& year == 3){
						
			System.out.print("Student: "+StudentID+" should take: PSYC3106 , PSYC3286 , PSYC3606,PSYC3506");
		}
		else if (Major.equals("Psychology")&& year == 4){
			
			System.out.print("Student: "+StudentID+"  should take: PSYC4006 , PSYC4026 , PSYC4907,PSYC4596");
		}
		
		
		else if (Major.equals("Business")&& year == 1){
			
			System.out.print("Student: "+StudentID+" should take: ADMN1016 , ADMN1126 , ADMN1127 , ADMN1206,ADMN1207");
		}
		
		else if (Major.equals("Business")&& year == 2){
			
			System.out.print("Student: "+StudentID+" should take: ADMN2106 , ADMN2506 , ADMN2107, ADMMN2406 , ADMN2556");
		}
		
		else if (Major.equals("Business")&& year == 3){
						
			System.out.print("Student: "+StudentID+" should take: ADMN3106 , ADMN3116 , ADMN3136 , ADMN3126 ");
		}
		else if (Major.equals("Business")&& year == 4){
			
			System.out.print("Student: "+StudentID+" "+" should take: ADMN4046 , ADMN4376 , ADMN4386,ADMN4837");
			
			
		}
	else if (Major.equals("Law")&& year == 1){
			
			System.out.print("Student: "+StudentID+" should take: JURI1106 , JURI1107 , JURI2306 ");
		}
		
		else if (Major.equals("Law")&& year == 2){
			
			System.out.print("Student: "+StudentID+" should take: JURI2107 , JURI2106 , JURI2136, JURI2996 ");
		}
		
		else if (Major.equals("Law")&& year == 3){
						
			System.out.print("Student: "+StudentID+" should take: JURI3906 , JURI3907 , JURI3107 ,JURI3216 , JURI3526 , JURI3606");
		}
		else if (Major.equals("Law")&& year == 4){
			
			System.out.print("Student: "+StudentID+"  should take: JURI4726 , JURI4816 ,JURI4826 ,JURI4836 , JURI4846");
		}
					
		
		
		
		else {
		System.out.print("There was an error in one of the inputs , Please try again!");
		}
	
	
}

}

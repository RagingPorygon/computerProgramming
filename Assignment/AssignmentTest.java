public class AssignmentTest
{
	public static void main(String[] args)
	{
	  Assignment assign1 = new Assignment();
	  System.out.println(assign1);
	  System.out.println();
	  
	  Assignment assign2 = new Assignment("Test", "Chapter 1 Test", 95);
	  System.out.println(assign2);
	  System.out.println();
	  
	  assign1.setType("Quiz");
	  assign1.setName("Chapter 1 Quiz");
	  assign1.setScore(83);
	  
	  System.out.println("Type        = " + assign1.getType());
	  System.out.println("Name        = " + assign1.getName());
	  System.out.println("Score       = " + assign1.getScore());
	  System.out.println("LetterGrade = " + assign1.getLetterGrade());
	  System.out.println();
	  
	}
}
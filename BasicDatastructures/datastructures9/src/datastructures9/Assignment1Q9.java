package datastructures9;

public class Assignment1Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student marks =new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the how many students:");
		int a=sc.nextInt();
		int subjs[]=new int[3];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<3;j++)
			{
				subjs[j]=sc.nextInt();
			}
			
			System.out.println(marks.StudentTotalMarksInAllSubjects());
		}
	}

}

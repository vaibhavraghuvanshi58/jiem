/*Find how many specific chars in string and occurrences of each char*/
package Session11Task;

public class StringOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is java program";
		int[] occurrence=new int[str.length()];
		int i, j;

		char string[]=str.toCharArray();

		for(i=0;i<str.length();i++)
		{
			occurrence[i]=1;
			for(j=i+1;j<str.length();j++)
			{
				if(string[i]==string[j])
				{
					occurrence[i]++;
					string[j] = '0';    
				}
			}
		}

		System.out.println("Characters and their corresponding occurances");   
		for(i = 0; i <occurrence.length; i++)
		{    
			if(string[i] != ' ' && string[i] != '0')    
				System.out.println(string[i] + "-" + occurrence[i]);    
		}    
	}
}

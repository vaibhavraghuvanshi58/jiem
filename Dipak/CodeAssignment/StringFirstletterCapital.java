package test;

public class StringFirstletterCapital {
    public static void main(String[] args) 
    { 
        String name = "dipak patil";
        char str[] = name.toCharArray(); 
        for (int i = 0; i < name.length(); i++) {
            if (i == 0 && str[i] != ' ' || str[i] != ' ' && str[i - 1] == ' ') 
            {  
                if (str[i] >= 'a' && str[i] <= 'z') 
                { 
                    str[i] = (char)(str[i] - 'a' + 'A'); 
                }
            }
        }  
        String st = new String(str);
        System.out.println(st);
    }   
}

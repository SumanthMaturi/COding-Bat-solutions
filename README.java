# COding-Bat-solutions
IN Strings2
*doubleChar
solution:-
public String doubleChar(String str) {
  String result="";
for(int i=0;i<str.length();i++){
result=result+str.charAt(i)+ str.charAt(i);
}
return result;
}
*CountHi
solution:-
public int countHi(String str) 
{
  int count=0;
  int i;
  for(i=0;i<str.length()-1;i++)
  {
   
  if(str.substring(i,i+2).equals("hi"))
  {
    count++;
  }
  }
  return count;
  
}
*catDog
solution:-
public boolean catDog(String str)
{
  int len = str.length()-2;
	int d = 0;
	for(int i = 0; i < len; i++)
	{
		if(str.charAt(i) == 'c')
		{
			if(str.charAt(i+1) == 'a' && str.charAt(i+2) == 't')
				d++;
		}
		else if(str.charAt(i) == 'd')
		{
			if(str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g')
				d--;
		}
	}
	return (d == 0);
}
*countCode
solution:-
public int countCode(String str) {
  int len = str.length()-3;
	int d = 0;
	for(int i = 0; i < len; i++)
	{
		if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e' )
		{
				d++;
		}
		
}
return d;
}
*bobThere
solution:-
public boolean bobThere(String str) {
  
  int len = str.length()-2;
	int count = 0;
	for(int i = 0; i < len; i++)
	{
		if( str.substring(i,i+3).startsWith("b")&&str.substring(i,i+3).endsWith("b") )
		{
return true;
}
		
}
return false;
}


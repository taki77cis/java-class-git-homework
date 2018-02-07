import java.util.Scanner;
public class Calculator{
public static void main(String[]args){
	int no1=0;
	int no2=0;
	int ru=0;
	boolean r=true;
	char op=' ';
	System.out.print("> ");
	Scanner input= new Scanner(System.in);
	String x = input.nextLine();
	for(int i=0;i < x.length();i++)
	{
	    char ch=x.charAt(i);
	    if(' '==(ch)&&!(r)){String Sno2=(x.substring(i+1,x.length()));
	    no2=Integer.parseInt(Sno2);}
	    if((' '==(ch))&&(r) ){no1=Integer.parseInt(x.substring(0,i));r=false;}
	    if('+'==(ch)||'-'==(ch)||'*'==(ch)||'/'==(ch)){op=ch;}
     	}

	switch (op){
	case '+': ru=no1+no2;break;
	case '-': ru=no1-no2;break;
	case '*': ru=no1*no2;break;
	case '/': ru=no1/no2;break;
	}
	System.out.println("= "+ru);
	}
	}
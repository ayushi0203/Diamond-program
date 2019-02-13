public class Diamond 
{
 
public static void main(String[] args){
for(int i=1;i<=5;i++){
for(int j=1;j<=5-i;j++){
System.out.print(" ");
}//print spaces
 for(int j=1;j<=i*2-1;j++)
{
System.out.print("*");
}//print stars 
System.out.println();//space and asterisk are printed then next line
}//upper part of diamond 


for(int i=5-1;i>0;i--)
{
for(int j=1;j<=5-i;j++)
 {
System.out.print(" ");
}
for(int j=1;j<=i*2-1;j++){
System.out.print("*");
}
System.out.println();
}
// lower part of diamond
}},
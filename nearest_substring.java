/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
    import java.lang.*;
class GFG {
	/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
    
    public static boolean find_str(String s1 ,String s2){
        if(Math.abs(s1.length()-s2.length())>1)
            return false;
        int count=0;
        int i=0;
        int j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)!=s2.charAt(j)){
                count++;
            if(s1.length()>s2.length())
                i++;
            else if(s2.length()>s1.length())
                j++;
            else{
             i++;
             j++;}
            if(count>1)
                return false;
            }
            else {
                i++;
                j++;}
        }
        if((i<s1.length() || j<s2.length()) && count==0)
            return true;
        return (count==1);
        
    }
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String st = s.nextLine();
	    String str[]={"peaks","baba","bana"};
	   boolean b=false;
	        for(int j=0;j<str.length;j++){
	            String s1 = st;
	            String s2=str[j];
	            b = find_str(s1,s2);
	            if(b==true){
	                System.out.println("YES");
	                break;
	            }
	        }
	        if(b==false)
	          System.out.println("NO");
	    
	}


}
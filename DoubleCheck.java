package twopointfive;

import java.util.Arrays; 

public class DoubleCheck {
	  
	    static String removeDupsSorted(String str) 
	    { 
	        int res_ind = 1, ip_ind = 1; 
	          
	        char arr[] = str.toCharArray(); 
	          
	        while (ip_ind != arr.length) 
	        { 
	            if(arr[ip_ind] != arr[ip_ind-1]) 
	            { 
	                arr[res_ind] = arr[ip_ind]; 
	                res_ind++; 
	            } 
	            ip_ind++; 
	            
	        } 
	      
	        str = new String(arr); 
	        return str.substring(0,res_ind); 
	    } 
	       
	    static String removeDups(String str) 
	    { 
	       char temp[] = str.toCharArray(); 
	       Arrays.sort(temp); 
	       str = new String(temp); 
	         
	       return removeDupsSorted(str); 
	    } 
	       
	    public static void main(String[] args) 
	    { 
	        String str = "Double Check! Get it right!"; 
	        System.out.println(removeDups(str)); 
	 } 
} 


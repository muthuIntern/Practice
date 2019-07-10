package com.muthu;

import java.io.IOException;

import javax.swing.text.AbstractDocument.LeafElement;

public class cypherSolution {// Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
    	
    	String originalAlphabet = "abcdefghijklmnopqrstuvwxyz";
    	String alphabetRoatated = leftrotate(originalAlphabet, k);
    	String originalAlphabetCapital = originalAlphabet.toUpperCase();
    	String alphabetRoatatedCapital = leftrotate(originalAlphabetCapital, k);
    	System.out.println(alphabetRoatated);
    	String result = null;
    	for(int i=0; i<s.length(); i++) {
    		char c = s.charAt(i);
    		System.out.println(c);
    		if(Character.isAlphabetic(c)) {
    		int position = originalAlphabet.indexOf(c);
    		if(position != -1) {
    			result = result == null ? String.valueOf(alphabetRoatated.charAt(position)) : result+alphabetRoatated.charAt(position);
    		} else {
    			position = originalAlphabetCapital.indexOf(c);
    			result = result == null ? String.valueOf(alphabetRoatatedCapital.charAt(position)) : result+alphabetRoatatedCapital.charAt(position);
    		}
    		} else {
    			result = result + c;
    		}
    		
    	}
    	
		return result;


    }

    private static String leftrotate(String str, int d) 
    { 
            String ans = str.substring(d) + str.substring(0, d); 
            return ans; 
    }
    
    public static void main(String[] args) throws IOException {
       

        String result = caesarCipher("middle-Outz", 2);
        System.out.println(result);
      
    }
    }

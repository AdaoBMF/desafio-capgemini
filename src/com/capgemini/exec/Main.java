package com.capgemini.exec;

import com.capgemini.questao1.Stairway;
import com.capgemini.questao2.PasswordLength;
import com.capgemini.questao3.Anagrams;

public class Main {

	public static void main(String[] args) {
		
		//questão 1
		Stairway.stairway(7);		
		
		//questão 2
		System.out.println(PasswordLength.charsLack("d1@00o"));
		
		//questão 3
		System.out.println(Anagrams.anagramCounter("ifailuhkqq"));
	}
}

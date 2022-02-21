package com.capgemini.questao2;

import java.util.Arrays;
import java.util.List;
/*
 * obter senha
 * a senha passa? se sim retorna 0
 * 
 * não passa
 * quantos requisitos faltam?
 * 
 * tamanho bate?
 * quanto falta?
 */

public class PasswordLength {
	
	static int minLength = 6;
	static List<String> patterns = Arrays.asList(
			".*[A-Z].*",".*[a-z].*", ".*[0-9].*", ".*[\\!@#\\$%\\^&\\*\\(\\)\\-\\+].*"
			);
	static String pattern = "(?=.*?[A-Z]+).*(?=.*?[0-9]+).*(?=.*?[\\!@#\\$%\\^&\\*\\(\\)\\-\\+]+).*";
	
	public static int charsLack(String password) {
		int pendingMatches = 0;
		if(password.equals("")) return minLength;
		
		if(password.matches(pattern)) {
			return password.length() < minLength ? minLength - password.length() : 0;
		}
		
		for(String pattern: patterns) {
			if(!password.matches(pattern)) {
				pendingMatches++;
			}
		}
		
		int dif = minLength - password.length();
		if (dif <= 0) {
			return pendingMatches;
		}else {
			return pendingMatches >= dif ? pendingMatches : dif;
		}
	}
}

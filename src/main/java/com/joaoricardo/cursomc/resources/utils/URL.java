package com.joaoricardo.cursomc.resources.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class URL {
	
	public static String decodeParam(String s) {
		try {
			return URLDecoder.decode(s, "UTF-8");
		} 
		catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			return "";
		}
	}

	// fazer uma  classe sem instanciar (static)
	public static List<Integer> decodeIntList(String s){
		String[] vet = s.split(",");
		List<Integer> list = new ArrayList<>(); 
		for(int i = 0; i < vet.length; i++) {
			list.add(Integer.parseInt(vet[i])); // converter a string 1,2,3 passado na requisiçao para inteiro pegando um a um
		}
		// fazer isso tudo acima usando lambda
		//return Arrays.asList(s.split(",")).stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
		return list;
		
	}
}

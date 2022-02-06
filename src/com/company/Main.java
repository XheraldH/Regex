package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> list = Arrays.asList("musical", "wall", "volume", "act", "tax", "mask", "laborer", "beat" , "park", "mutter");
        List<String> list2;

        Pattern pattern = Pattern.compile("[aeiouy][^ ]*[aeiouy]");
        list2 = list.stream().filter(s -> pattern.matcher(s).find()).toList();
        System.out.println(list2);
    }
}

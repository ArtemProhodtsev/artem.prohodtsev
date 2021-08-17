package com.artpro.service;

import static org.apache.commons.lang3.StringUtils.reverse;

public class TextImpl implements Text {
    @Override
    public int Count(String text) {
        return Split(text).length;
    }

    @Override
    public boolean Palindrome(String text) {
        String[] words = Split(text);
        for (String word : words) {
            if (word.length() > 1 && reverse(word).equals(word)) {
                return true;
            }
        }
        return false;
    }

    public String[] Split(String text) {
        return text.replaceAll("[,]", "").split(" ");
    }
}

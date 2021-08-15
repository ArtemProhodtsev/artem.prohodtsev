package service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TextFormatter {

    public static List<String> getPalindrome(List<String> strings) {
        List<String> palindromeList = new ArrayList<>();
        for (String element : strings) {
            if (element.matches("\\d+")) {
                continue;
            }
            if (element.equalsIgnoreCase(new StringBuilder(element).reverse().toString())) {
                palindromeList.add(element);
            }
        }
        return palindromeList;
    }

    public static List<String> read(String filePath) {
        List<String> listOfWords = new ArrayList<>();
        try (BufferedReader buffReader = new BufferedReader(new FileReader(filePath))) {
            String line = buffReader.readLine();
            while (line != null) {
                listOfWords.add(line);
                line = buffReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfWords;
    }

    public static void write(List<String> palindromeList, String filePath) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
            for (String palindrome : palindromeList) {
                fileOutputStream.write(palindrome.getBytes(StandardCharsets.UTF_8));
                fileOutputStream.write("\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readText(String filePath) {
        String text = null;
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            final byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            text = new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    public static String getReplaceLine(String value) {
        return value
                .replaceAll("-\\r\\n", "  ")
                .replaceAll("\\r\\n", " ")
                .replaceAll("\\s{2,}", "");
    }

    public static String[] getSplitString(String replaceString) {
        return getReplaceLine(replaceString).split("\\.+|!+|\\?+");
    }

    public static int getCountWords(String string) {
        return string.split("[^ ]\\s").length;
    }

    public static boolean isSentenceHasPalindrome(String string) {
        String[] arrayWords = string.split("\\s");
        for (String str : arrayWords) {
            boolean isWordPalindrome = str.length() > 1 && str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
            if (isWordPalindrome) {
                return true;
            }
        }
        return false;
    }

    public static void write(String sentence, String filePath) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath, true)) {
            fileOutputStream.write(sentence.getBytes());
            fileOutputStream.write("\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] getSplitBlackList(String blackList) {
        return blackList.split(",");
    }

    public static List<String> getObsceneSentence(String[] text, String[] blackList) {
        List<String> List = new ArrayList<>();
        for (String textLine : text) {
            for (String blackListWord : blackList) {
                boolean contains = textLine.toLowerCase().contains(blackListWord.toLowerCase());
                if (contains) {
                    List.add(textLine);
                }
            }
        }
        return List;
    }
}


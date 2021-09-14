package DC;

import javafx.util.Pair;

import java.util.*;

public class Main {

    public static HashMap<String, List<Pair<Integer, Integer>>> data = new HashMap<>();

    public static void main(String[] args) {
        compilePages(Arrays.asList(
                "AA BB CC DD",
                "DD EE QQ",
                "LL AA BB")
        );

        System.out.println(data);

        System.out.println(lookupWord("BB"));
    }

    public static void compilePages(List<String> pages){
        for (int j = 0; j < pages.size(); j++) {
            String page = pages.get(j);
            String[] words = page.split(" ");

            HashMap<String, List<Pair<Integer, Integer>>> hashMap = new HashMap<>();

            for (int i = 0; i < words.length ; i++) {
                String word = words[i];

                hashMap.getOrDefault(word, new ArrayList<>()).add(new Pair<>(j, i));

            /*if (hashMap.containsKey(word)){
                hashMap.get(word).add(new Pair<>(index, i));
            } else {
                hashMap.put(word, Collections.singletonList(new Pair<>(index, i)));
            }*/
            }

            data.putAll(hashMap);
        }
    }

    public static List<Pair<Integer, Integer>> lookupWord(String word){
        if (data.containsKey(word)) {
            return data.get(word);
        }
        return new ArrayList<>();
    }

    private static HashMap<String, List<Pair<Integer, Integer>>> Index(String[] words, int index) {
        HashMap<String, List<Pair<Integer, Integer>>> hashMap = new HashMap<>();

        for (int i = 0; i < words.length ; i++) {
            String word = words[i];

            hashMap.getOrDefault(word, new ArrayList<>()).add(new Pair<>(index, i));

            /*if (hashMap.containsKey(word)){
                hashMap.get(word).add(new Pair<>(index, i));
            } else {
                hashMap.put(word, Collections.singletonList(new Pair<>(index, i)));
            }*/
        }
        return hashMap;
    }
}

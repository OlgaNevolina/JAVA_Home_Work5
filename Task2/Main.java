// Подсчитать количество искомого слова, через map 
// (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно

package Task2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String searchWord = "россия";
        HashMap<String, Integer> wordCounts = new HashMap<>();

        String[] words = str.toLowerCase().split(" ");

        for (String word : words) {
            if (word.contains(searchWord)) {
                if (wordCounts.containsKey(searchWord)) {
                    wordCounts.put(searchWord, wordCounts.get(searchWord) + 1);
                } else {
                    wordCounts.put(searchWord, 1);
                }
            }
        }

        System.out.println("Слово \"" + searchWord + "\" встречается " + wordCounts.get(searchWord) + " раз(а)");
    }
}
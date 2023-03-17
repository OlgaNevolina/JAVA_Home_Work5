// Подсчитать количество вхождения каждого слова
// Пример:
// Россия идет вперед всей планеты. Планета — это не Россия.
// toLoverCase().

package Task1;

import java.util.HashMap;

public class Main {
   public static void main(String[] args) {
       String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
       str = str.toLowerCase(); 
       String[] words = str.split("[^а-яА-ЯёЁ]+"); 

       HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

       for (String word : words) {
           if (!word.isEmpty()) { 
               if (!wordCount.containsKey(word)) {
                   wordCount.put(word, 1); 
               } else {
                   int count = wordCount.get(word);
                   wordCount.put(word, count + 1); 
               }
           }
       }

       for (String word : wordCount.keySet()) {
           int count = wordCount.get(word);
           System.out.printf("\"%s\" встречается %d раз(а)\n", word, count);
       }
   }
}
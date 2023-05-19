/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
что 1 человек может иметь несколько телефонов.*/

package HW.HW05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HW05_01{
    
   
 public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
     if (map.containsKey(key)) {
         map.get(key).add(value);
     } else {
         ArrayList<Integer> list = new ArrayList<>();
         list.add(value);
         map.put(key, list);
     }

 }

 public static void printBook(Map<String, ArrayList<Integer>> map){
     for (var item : map.entrySet()) {
         String phones = "";
         for(int el: item.getValue()){
             phones = phones + el + ", ";
         }
         System.out.printf("%s: %s \n", item.getKey(), phones);
     }
 }
 public static void main(String[] args) {
     Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
     addNumber("Иванов", 9996663, bookPhone);
     addNumber("Петров", 9663669, bookPhone);
     addNumber("Васичкин", 8676585, bookPhone);
     addNumber("Васичкин", 8956477, bookPhone);
     addNumber("Васичкин", 85875233, bookPhone);
     addNumber("Петров", 7686897, bookPhone);
     printBook(bookPhone);
    }
}
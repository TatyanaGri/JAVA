/*В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку,
используя StringBuilder. Значения null не включаются в запрос.
*/
package HW.HW02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HW02_01 {

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("HW02/person.txt"))) {
            String data;
            while ((data = br.readLine()) != null) {
                sb.append(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, String> dictionary = new HashMap<>();
        String[] keys = sb.toString().replace("{", "").replace("\"", "").
                replace("}", "").replaceAll("\\s", "").split(",");
        for (String data : keys) {
            String[] keyValue = data.split(":");
            String key = keyValue[0];
            String value = keyValue[1];
            dictionary.put(key, value);
        }
        System.out.println(dictionary);
        String name = dictionary.get("name");
        String country = dictionary.get("country");
        String city = dictionary.get("city");
        System.out.printf("SELECT * FROM students WHERE name = %s AND country = %s AND city = %s", name,
                country, city);
    }
}
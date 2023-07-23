import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> phone = new HashMap<>();

    void addNote(String num, String name){
        phone.put(num, name);
    }

    String findByName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: phone.entrySet()){
            String num = entry.getKey();
            String name = entry.getValue();
            if (name.equalsIgnoreCase(lastName)){
                stringBuilder.append(num);
                stringBuilder.append(": ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) throws Exception {
        Map <String, Integer> mapa = new HashMap<>();

        mapa.put("Matheus", 25);
        mapa.put("Camargo", 26);
        mapa.put("Ginebro", 27);

        int idadeDoMatheus = mapa.get("Matheus");
        System.out.println("Idade do Matheus: " + idadeDoMatheus);

        for(Map.Entry<String, Integer> entry : mapa.entrySet()){
            System.out.println("Nome: " + entry.getKey() + " | Idade: " + entry.getValue());
        }
    }
}

package Collections_Java.Map;

import java.util.HashMap;
import java.util.Map;

public class Map_ChaveValor {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");
        usuarios.put(5, "Roberto");
        usuarios.putIfAbsent(5,"Exemplo"); // não será incluído

        System.out.println("Tamanho da lista: " + usuarios.size());
        System.out.println("Está vazia: " + usuarios.isEmpty());
        System.out.println("Conjunto de chaves: " + usuarios.keySet());
        System.out.println("Conjunto de valores: " + usuarios.values());
        System.out.println("Conjunto: " + usuarios.entrySet());

        System.out.println("Pode ser buscado tanto por chave como por valor: ");
        System.out.println("Chave 20: " + usuarios.containsKey(20));
        System.out.println("Rebeca: " + usuarios.containsValue("Rebeca"));

        System.out.println("Pode ser espiado via chave (get): ");
        System.out.println("Usuário 3: " + usuarios.get(3));
        System.out.println("Usuário 2 (não existe): " + usuarios.getOrDefault(2,"Erro"));

    }
}


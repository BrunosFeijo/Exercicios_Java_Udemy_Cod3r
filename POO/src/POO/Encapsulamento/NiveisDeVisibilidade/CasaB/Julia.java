package POO.Encapsulamento.NiveisDeVisibilidade.CasaB;

import POO.Encapsulamento.NiveisDeVisibilidade.CasaA.Ana;

public class Julia {
    void testeAcessos() {
        Ana sogra = new Ana();

        //System.out.println(esposa.segredo); // privado
        //System.out.println(somenteEmCasa); // default (pacote)
        //System.out.println(sogra.segredoMaterno); // protegido
        System.out.println(sogra.todosSabem); // publico
    }
}

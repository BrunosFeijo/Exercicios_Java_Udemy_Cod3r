package POO.Encapsulamento.NiveisDeVisibilidade.CasaB;

import POO.Encapsulamento.NiveisDeVisibilidade.CasaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
        Ana mae = new Ana();

        //System.out.println(esposa.segredo); // privado
        //System.out.println(somenteEmCasa); // default (pacote)
        System.out.println(segredoMaterno); // protegido
        System.out.println(todosSabem); // publico
    }
}

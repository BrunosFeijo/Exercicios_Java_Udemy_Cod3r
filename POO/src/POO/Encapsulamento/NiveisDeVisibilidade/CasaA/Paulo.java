package POO.Encapsulamento.NiveisDeVisibilidade.CasaA;

public class Paulo {

    void testeAcessos() {
        Ana esposa = new Ana();

        //System.out.println(esposa.segredo); // privado
        System.out.println(esposa.somenteEmCasa); // default (pacote)
        System.out.println(esposa.segredoMaterno); // protegido
        System.out.println(esposa.todosSabem); // publico
    }
}

package br.com.CursoJava.modelo;

import br.com.CursoJava.excecao.ExplosaoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CampoTest {
    private Campo campo = new Campo(3, 3);

//    @BeforeEach
//    void iniciarCampo() {
//        campo = new Campo(3, 3);
//    }

    @Test
    void testeVizinhoDistancia1Esquerda() {
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }
    @Test
    void testeVizinhoDistancia1Direita() {
        Campo vizinho = new Campo(3, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }
    @Test
    void testeVizinhoDistancia1Cima() {
        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }
    @Test
    void testeVizinhoDistancia1Baixo() {
        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }
    @Test
    void testeVizinhoDistancia2() {
        Campo vizinho = new Campo(2,2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }
    @Test
    void testeNaoVizinho() {
        Campo vizinho = new Campo(3,3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertFalse(resultado);
    }
    @Test
    void testeValorPadraoAtributoMarcado(){
        Assertions.assertFalse(campo.isMarcado());
    }
    @Test
    void testeAlternarMarcacao(){
        campo.alternarMarcacao();
        Assertions.assertTrue(campo.isMarcado());
    }
    @Test
    void testeAlternarMarcacaoDuasChamadas(){
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        Assertions.assertFalse(campo.isMarcado());
    }
    @Test
    void testeAbrirNaoMinadoNaoMarcado(){
        Assertions.assertTrue(campo.abrir());
    }
    @Test
    void testeAbrirNaoMinadoMarcado(){
        campo.alternarMarcacao();
        Assertions.assertFalse(campo.abrir());
    }
    @Test
    void testeAbrirMinadoMarcado(){
        campo.alternarMarcacao();
        campo.minar();
        Assertions.assertFalse(campo.abrir());
    }
    @Test
    void testeAbrirMinadoNaoMarcado(){
        campo.minar();
        Assertions.assertThrows(ExplosaoException.class, () -> campo.abrir());
    }
    @Test
    void testeAbrirComVizinhos(){
        Campo vizinho = new Campo(2,2); // vizinho de 3,3
        Campo vizinhoDoVizinho = new Campo(1,1); // vizinho de  2,2
        campo.adicionarVizinho(vizinho);
        vizinho.adicionarVizinho(vizinhoDoVizinho);

        campo.abrir();
        // verificar se vizinho de Campo e vizinho do vizinho foram abertos por estarem com 'VizinhancaSegura'
        Assertions.assertTrue(vizinho.isAberto() && vizinhoDoVizinho.isAberto());
    }
    @Test
    void testeAbrirComVizinhoMinado(){
        Campo vizinho = new Campo(2,2); // vizinho de 3,3
        Campo vizinhoDoVizinho = new Campo(1,1); // vizinho de  2,2
        Campo vizinhoMinado = new Campo(1,2); // vizinho de 1,1 e 2,2
        vizinhoMinado.minar();
        campo.adicionarVizinho(vizinho);
        vizinho.adicionarVizinho(vizinhoDoVizinho);
        vizinho.adicionarVizinho(vizinhoMinado);

        campo.abrir();
        // verificar se vizinho de Campo e vizinho do vizinho foram abertos por estarem com 'VizinhancaSegura'
        Assertions.assertTrue(vizinho.isAberto() && !vizinhoDoVizinho.isAberto());
    }





}

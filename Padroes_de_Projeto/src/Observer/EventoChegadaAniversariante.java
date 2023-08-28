package Observer;

import java.util.Date;

public class EventoChegadaAniversariante {
    private Date momento;

    public EventoChegadaAniversariante(Date momento){
        this.momento = momento;
    }
    public Date getMomento(){
        return momento;
    }
}

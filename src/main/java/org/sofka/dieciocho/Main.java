package org.sofka.dieciocho;
import org.jboss.logging.Logger;
public class Main {
    private static Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Serie listaSeries[] = new Serie[5];
        VideoJuego listaVideojuegos[] = new VideoJuego[5];

        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("Juego de tronos", "George R. R. Martin ");
        listaSeries[2]=new Serie("Los Simpsons", 25, "Humor", "Matt Groening");
        listaSeries[3]=new Serie("Padre de familia", 12 ,"Humor", "Seth MacFarlane");
        listaSeries[4]=new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");

        listaVideojuegos[0]=new VideoJuego();
        listaVideojuegos[1]=new VideoJuego("Assasin creed 2", 30, "Aventura", "EA");
        listaVideojuegos[2]=new VideoJuego("God of war 3", "Santa Monica");
        listaVideojuegos[3]=new VideoJuego("Super Mario 3DS", 30, "Plataforma", "Nintendo");
        listaVideojuegos[4]=new VideoJuego("Final fantasy X", 200, "Rol", "Square Enix");

        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();

        int entregados=0;

        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();
            }
            else if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }

        log.info("Hay "+entregados+" articulos entregados");

        Serie serieMayor=listaSeries[0];
        VideoJuego videojuegoMayor=listaVideojuegos[0];

        for(int i=1;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)==Serie.MAYOR){
                serieMayor=listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegoMayor)==VideoJuego.MAYOR){
                videojuegoMayor=listaVideojuegos[i];
            }

        }

        log.info(videojuegoMayor);
        log.info(serieMayor);
    }
}

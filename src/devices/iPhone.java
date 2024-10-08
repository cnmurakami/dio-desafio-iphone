package devices;

import devices.apps.AparelhoTelefonico;
import devices.apps.NavegadorInternet;
import devices.apps.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    @Override
    public void tocar(){
        System.out.println("Tocando música");
    }
    
    @Override
    public void pausar(){
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(){
        System.out.println("Selecionando música");
    }

    @Override
    public void ligar(){
        System.out.println("Realizando ligação");
    }

    @Override
    public void atender(){
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(){
        System.out.println("Exibindo página da internet");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba de internet");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando página de internet");
    }

}

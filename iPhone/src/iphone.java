public class iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    
  

    public void play(){
       System.out.println("Inicindo Play");
       System.out.println("**Tocando agora:**" + nomeMusica);
       
    }
    public void pause(){
        System.out.println("Pausando Play");
    }
    public void stop(){
        System.out.println("Stop Play");
    }

    public void fazerChamada(String numero){
        System.out.println("Iniciando chamada");
    }
    public void atenderChamada(){
        System.out.println("Atender chamada");
    }
    public void encerrarChamada(){
        System.out.println("Encerrar chamada");
    }
    public void enviarMensagem(String mensagem){
        System.out.println("Enviano mensagem");
        System.out.println(mensagem);
    }

    public void receberMensagem(String mensagem){
        System.out.println("Mensagem recebida");
        System.out.println(mensagem);
        
    }

    public void navegar(String url){
        System.out.println("Navegando na internet");
    }
    public void abrirPaginaWeb(String pagina){
        System.out.println("Abrir aba de navegação");
    }
    public void fecharPaginaWeb(){
        System.out.println("Fechar aba de navegaão");
    }
   
}

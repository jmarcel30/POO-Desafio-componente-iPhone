public class ServiçosIphone {
    
    public static void main(String[] args) {
        
        iphone ip = new iphone();

        ip.atenderChamada();
        ip.encerrarChamada();
        ip.enviarMensagem("Oi tudo bem");
        ip.receberMensagem("Tudo sim e você");
        ip.play();
        ip.pause();
        ip.navegar("Uol.com");
        ip.abrirPaginaWeb("Abrindo navegador");
       

    }
    
}

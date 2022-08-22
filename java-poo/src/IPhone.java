public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void ligar() {
        System.out.println("Iniciando ligação");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Contatando serviço de correio de voz");
    }

    @Override
    public void salvarContato() {
        System.out.println("Contato salvo");
    }

    @Override
    public void deletarContato() {
        System.out.println("Contato deletado");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página em exibição");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void salvarFavorito() {
        System.out.println("Favorito salvo");
    }

    @Override
    public void deletarFavorito() {
        System.out.println("Deletado dos favoritos");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Reprodução pausada");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Próxima música");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Música anterior");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhendo música");
    }

    @Override
    public void criarPlaylist() {
        System.out.println("Nova playlist criada com sucesso");
    }

    @Override
    public void modoAleatorio() {
        System.out.println("Habilitando modo aleatório");
    }

    @Override
    public void modoRepeticao() {
        System.out.println("Habilitando modo repetição");
    }
}

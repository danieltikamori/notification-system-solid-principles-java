package cc.tkmr.infrastructure;

class NotificacaoEmailImpl implements NotificacaoEmail {
    @Override
    public void enviarEmail(String mensagem) {
        System.out.println("Email enviado: %s".formatted(mensagem));
    }
}

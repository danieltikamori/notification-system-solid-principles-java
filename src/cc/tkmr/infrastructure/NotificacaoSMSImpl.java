package cc.tkmr.infrastructure;

class NotificacaoSMSImpl implements NotificacaoSMS {
    @Override
    public void enviarSMS(String mensagem) {
        System.out.println("SMS enviado: %s".formatted(mensagem));
    }
}

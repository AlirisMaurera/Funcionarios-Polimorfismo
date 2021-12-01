public class Administrador extends Funcionario implements Autenticavel {

    private AutenticarUtil util;

    public Administrador(){
        util = new AutenticarUtil();
    }
    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        boolean aut = this.util.autentica(senha);
        return aut;
    }
    @Override
    public double getBonificacao() {
        return 50;
    }
}

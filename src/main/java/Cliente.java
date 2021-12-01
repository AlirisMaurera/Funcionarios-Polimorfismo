public class Cliente implements Autenticavel {

    private AutenticarUtil util;

    public Cliente(){
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
}

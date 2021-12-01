public class SistemaInterno {

    private int senha = 222;

    public void autentica(Autenticavel g){
        boolean aute = g.autentica(this.senha);

        if (aute){
            System.out.println("Pode entrar no sistema");
        }else System.out.println("Não pode entrar no sistema");

    }
}

public class TesteSistema {

    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);

        Administrador adm = new Administrador();
        adm.setSenha(333);

        si.autentica(adm);

    }
}

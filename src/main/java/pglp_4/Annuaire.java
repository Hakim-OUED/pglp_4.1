package pglp_4;

public class Annuaire {
    private Contact noeud;

    public Annuaire(Contact c) {
        this.noeud=c;
    }

    public void hierarchicPrint() {
        System.out.println(noeud.hierarchic());
    }
}

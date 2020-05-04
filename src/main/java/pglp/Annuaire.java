package pglp;

import java.util.ArrayList;

public class Annuaire {
        private Contact noeud;

        public Annuaire(Contact c) {
            this.noeud = c;
        }

        public void hierarchicPrint() {
                System.out.println(noeud.hierarchic());
        }

        public void groupPrint() {
            ArrayList<Contact> list = new ArrayList<Contact>();
            ArrayList<Contact> groupe = new ArrayList<Contact>();
            groupe.add(noeud);
            Contact c;
            String chaine = "";
            while (!list.isEmpty() || !groupe.isEmpty()) {
                if (list.isEmpty()) {
                    list.addAll(groupe);
                    groupe.clear();
                }
                c = list.remove(0);
                chaine = chaine.concat(c.toString() + "\n");
                if (c instanceof Section) {
                    int i=1;
                    IterateurHierarchique it  = ((Section) c).iterator();
                    while (it.hasNext()) {
                        chaine = chaine.concat(i +"- ");
                        Contact e = it.next();
                        chaine = chaine.concat(e.toString() + "\n");
                        if (e instanceof Section){
                            groupe.add(e);
                        }
                        i++;

                    }
                    chaine = chaine.concat("************\n");
                }
            }
            System.out.println(chaine);
        }
}

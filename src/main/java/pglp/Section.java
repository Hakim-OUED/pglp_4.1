package pglp;

import java.util.ArrayList;

public class Section implements Contact, Iterable {
    private String nomSection;
    private ArrayList<Contact> listeElement;

Section(String nomSection){
    this.nomSection=nomSection;
    this.listeElement = new ArrayList<>();
}
    @Override
    public void affiche() {
        for (Contact contact : listeElement){
            contact.affiche();
        }
    }
    @Override
    public String hierarchic() {
        String chaine = this.toString();
        IterateurHierarchique it = iterator();
        Contact c;
        while (it.hasNext()) {
            c = it.next();
            chaine = chaine.concat("\n");
            chaine = chaine.concat(c.hierarchic());
        }
        chaine = chaine.concat("\nFin " + this.toString());
        return chaine;
    }

    public void addContact(final Contact contact) {
        this.listeElement.add(contact);
    }

    public void deleteContact(Contact contact){
        if (this.listeElement.contains(contact)) {
            this.listeElement.remove(contact);
        }

    }

    @Override
    public IterateurHierarchique iterator() {
        return new IterateurHierarchique(this.listeElement);
    }

    @Override
    public String toString() {
        return ("Section: "+ this.nomSection );
    }
}

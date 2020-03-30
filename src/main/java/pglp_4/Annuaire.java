package pglp_4;

import java.util.ArrayList;
import java.util.Iterator;

public class Annuaire implements Contact {
    private String nomSection;
    private ArrayList<Contact> listePersonnel;

Annuaire(String nomSection){
    this.nomSection=nomSection;
    this.listePersonnel = new ArrayList<>();
}
    @Override
    public void affiche() {
    System.out.println(this.nomSection);
    for (Contact contact : listePersonnel){
        contact.affiche();
    }

    }

    public void addContact(Contact contact){
        this.listePersonnel.add(contact);
    }

    public void deleteContact(Contact contact){
        if (this.listePersonnel.contains(contact)) {
            this.listePersonnel.remove(contact);
        }

    }
}

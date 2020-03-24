package pglp_4;

import java.util.ArrayList;

public class Annuaire implements Contact{
    private String nomSection;
    private ArrayList<Contact> listePersonnel = new ArrayList<>();

    @Override
    public void affiche() {

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

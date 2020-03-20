package pglp_4;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Personnel {
    private String nom;
    private String prenom;
    private String fonction;
    private LocalDate ddn;
    private Map<String, Integer> telephones;

    Personnel(BuilederPersonnel builder) {
        this.nom = builder.nom;
        this.fonction = builder.fonction;
        this.telephones.put("Pro", builder.telephones.get("pro"));
        this.ddn=builder.ddn;
        this.prenom=builder.prenom;
    }


    class BuilederPersonnel{
        private String nom;
        private String fonction;
        //facultatif
        private String prenom="";
        private LocalDate ddn=LocalDate.now();
        // au moins le numero pro est obligatoire
        private Map<String, Integer> telephones;

        public BuilederPersonnel(String nom,LocalDate ddn, String fonction, Integer numPro) {
            //obligatoire
            this.nom=nom;
            this.fonction=fonction;
            this.telephones.put("pro",numPro);
        }

        public BuilederPersonnel prenom(String prenom) {
            this.prenom=prenom;
            return this;
        }
        public BuilederPersonnel addDdn(LocalDate ddn) {
            this.ddn=ddn;
            return this;
        }
        public BuilederPersonnel addTelephone(String type, Integer numero) {
            this.telephones.put(type,numero);
            return this;
        }

        public Personnel build() {
            return new Personnel(this);
        }


    }
}

package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
Gaulois asterix = new Gaulois("Ast�rix",8);
Gaulois obelix = new Gaulois("Ob�lix",16);

asterix.parler("Bonjour Ob�lix.");
obelix.parler("Bonjour Asterix. Ca te dirais d'aller chasser des sangliers ?)");
asterix.parler("Oui tr�s bonne id�e.");
}

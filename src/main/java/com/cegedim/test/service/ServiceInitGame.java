package com.cegedim.test.service;

import java.util.ArrayList;
import java.util.List;
import com.cegedim.test.model.Case;
import com.cegedim.test.model.Couleur;
import com.cegedim.test.model.Grille;
import com.cegedim.test.model.Joueur;

/**
 * @author TARIK
 *
 */
public class ServiceInitGame {

  private static String NAME_J1 = "J1";
  private static String NAME_J2 = "J2";

  private static Joueur JJ = new Joueur(Couleur.Jaune, NAME_J1);
  private static Joueur JR = new Joueur(Couleur.Rouge, NAME_J2);

  public Grille InitGrille() {
    return new Grille(this.InitCases());
  }


  /**
   * generate the case in the pdf
   * 
   * @return list of cases
   */
  private List<Case> InitCases() {
    List<Case> cases = new ArrayList<Case>();
    cases.add(new Case(0, 0, JR));
    cases.add(new Case(0, 1, JJ));
    cases.add(new Case(0, 2, JJ));
    cases.add(new Case(0, 3, JJ));
    cases.add(new Case(0, 4, JR));
    cases.add(new Case(0, 5, JR));
    cases.add(new Case(0, 6, JJ));

    cases.add(new Case(0, 0, JJ));
    cases.add(new Case(0, 1, JR));
    cases.add(new Case(0, 2, JR));
    cases.add(new Case(0, 3, JJ));
    cases.add(new Case(0, 4, JR));
    cases.add(new Case(0, 5, null));
    cases.add(new Case(0, 6, JJ));

    cases.add(new Case(0, 0, null));
    cases.add(new Case(0, 1, null));
    cases.add(new Case(0, 2, JJ));
    cases.add(new Case(0, 3, JR));
    cases.add(new Case(0, 4, null));
    cases.add(new Case(0, 5, null));
    cases.add(new Case(0, 6, null));

    cases.add(new Case(0, 0, null));
    cases.add(new Case(0, 1, null));
    cases.add(new Case(0, 2, JR));
    cases.add(new Case(0, 3, JR));
    cases.add(new Case(0, 4, null));
    cases.add(new Case(0, 5, null));
    cases.add(new Case(0, 6, null));

    return cases;
  }

}

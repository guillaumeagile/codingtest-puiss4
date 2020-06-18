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

  private Grille grille;

  public void InitGrille() {
    this.grille = new Grille(this.InitCases());
  }

  public Joueur getWinner() {
    if (this.checkHorizental() != null)
      return this.checkHorizental();
    else if (this.checkVertical() != null)
      return this.checkHorizental();
    else if (this.checkDiagonal() != null)
      return this.checkDiagonal();
    return null;
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

  /**
   * check if we have winner horizentaly
   * 
   * @return winner player
   */
  private Joueur checkHorizental() {
    for (int j = 0; j < 6; j++) {
      for (int i = 0; i < 7; i++) {
        if (grille.getCases().contains(new Case(j, i, JJ))
            && grille.getCases().contains(new Case(j, i + 1, JJ))
            && grille.getCases().contains(new Case(j, i + 2, JJ))
            && grille.getCases().contains(new Case(j, i + 4, JJ))) {
          return JJ;
        }

        if (grille.getCases().contains(new Case(j, i, JR))
            && grille.getCases().contains(new Case(j, i + 1, JR))
            && grille.getCases().contains(new Case(j, i + 2, JR))
            && grille.getCases().contains(new Case(j, i + 4, JR))) {
          return JR;
        }
      }
    }
    return null;
  }

  /**
   * check if we have winner verticaly
   * 
   * @return winner player
   */
  private Joueur checkVertical() {
    for (int j = 0; j < 7; j++) {
      for (int i = 0; i < 6; i++) {
        if (grille.getCases().contains(new Case(i, j, JJ))
            && grille.getCases().contains(new Case(i + 1, j, JJ))
            && grille.getCases().contains(new Case(i + 2, j, JJ))
            && grille.getCases().contains(new Case(i + 3, j + 4, JJ))) {
          return JJ;
        }

        if (grille.getCases().contains(new Case(i, j, JR))
            && grille.getCases().contains(new Case(i + 1, j, JR))
            && grille.getCases().contains(new Case(i + 2, j, JR))
            && grille.getCases().contains(new Case(i + 3, j + 4, JR))) {
          return JR;
        }
      }
    }
    return null;
  }

  /**
   * check if we have winner in diagonal
   * 
   * @return winner player
   */
  private Joueur checkDiagonal() {
    for (int j = 0; j < 7; j++) {
      for (int i = 0; i < 6; i++) {
        if ((grille.getCases().contains(new Case(i - 1, j - 1, JJ))
            && grille.getCases().contains(new Case(i - 2, j - 2, JJ))
            && grille.getCases().contains(new Case(i + 1, j + 1, JJ))
            && grille.getCases().contains(new Case(i + 2, j + 2, JJ))) ||

            (grille.getCases().contains(new Case(i - 1, j + 1, JJ))
                && grille.getCases().contains(new Case(i - 2, j + 2, JJ))
                && grille.getCases().contains(new Case(i + 1, j - 1, JJ))
                && grille.getCases().contains(new Case(i + 2, j - 2, JJ))))

        {
          return JJ;
        }

        if ((grille.getCases().contains(new Case(i - 1, j - 1, JR))
            && grille.getCases().contains(new Case(i - 2, j - 2, JR))
            && grille.getCases().contains(new Case(i + 1, j + 1, JR))
            && grille.getCases().contains(new Case(i + 2, j + 2, JR))) ||

            (grille.getCases().contains(new Case(i - 1, j + 1, JR))
                && grille.getCases().contains(new Case(i - 2, j + 2, JR))
                && grille.getCases().contains(new Case(i + 1, j - 1, JR))
                && grille.getCases().contains(new Case(i + 2, j - 2, JR))))

        {
          return JR;
        }
      }
    }
    return null;
  }


}

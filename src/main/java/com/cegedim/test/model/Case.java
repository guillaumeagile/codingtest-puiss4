package com.cegedim.test.model;

public class Case {
  private int ligne;
  private int colonne;
  private Joueur joueur;

  public Case(int ligne, int colonne, Joueur joueur) {
    this.ligne = ligne;
    this.colonne = colonne;
    this.joueur = joueur;
  }

  public int getColonne() {
    return colonne;
  }

  public void setColonne(int colonne) {
    this.colonne = colonne;
  }

  public Joueur getJoueur() {
    return joueur;
  }

  public void setJoueur(Joueur joueur) {
    this.joueur = joueur;
  }

  public int getLigne() {
    return ligne;
  }

  public void setLigne(int ligne) {
    this.ligne = ligne;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + colonne;
    result = prime * result + ((joueur == null) ? 0 : joueur.hashCode());
    result = prime * result + ligne;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Case other = (Case) obj;
    if (colonne != other.colonne)
      return false;
    if (joueur == null) {
      if (other.joueur != null)
        return false;
    } else if (!joueur.equals(other.joueur))
      return false;
    if (ligne != other.ligne)
      return false;
    return true;
  }



}

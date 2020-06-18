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

}

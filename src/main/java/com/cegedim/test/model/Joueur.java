package com.cegedim.test.model;

public class Joueur {

  private Couleur couleur;
  private String name;

  public Joueur(Couleur couleur, String name) {
    this.couleur = couleur;
    this.name = name;
  }


  public Couleur getCouleur() {
    return couleur;
  }

  public void setCouleur(Couleur couleur) {
    this.couleur = couleur;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

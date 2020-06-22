package com.cegedim.test.model;

import java.util.List;

public class Grille {

  public Grille(List<Case> cases) {
    this.cases = cases;
  }

  private List<Case> cases;

  public List<Case> getCases() {
    return cases;
  }

  public void setCases(List<Case> cases) {
    this.cases = cases;
  }

}

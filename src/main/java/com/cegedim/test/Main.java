package com.cegedim.test;

import com.cegedim.test.service.ServiceInitGame;

public class Main {

  public static void main(String[] args) {
    ServiceInitGame game = new ServiceInitGame();
    game.InitGrille();
    System.out.println("Partie gagnée par le camp : " + game.getWinner().getCouleur());
  }


}

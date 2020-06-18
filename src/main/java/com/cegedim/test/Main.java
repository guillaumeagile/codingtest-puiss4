package com.cegedim.test;

import com.cegedim.test.service.ServiceInitGame;

public class Main {

  /**
   * This main will run the game, init data and check the winner.
   * 
   * @param args args
   */
  public static void main(String[] args) {
    ServiceInitGame game = new ServiceInitGame();
    game.initGrille();
    System.out.println("Partie gagnée par le camp : " + game.getWinner().getCouleur());
  }


}

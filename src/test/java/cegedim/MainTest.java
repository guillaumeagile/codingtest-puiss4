package cegedim;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.cegedim.test.model.Couleur;
import com.cegedim.test.service.ServiceInitGame;

public class MainTest {

  @Test
  public void test() {
    ServiceInitGame game = new ServiceInitGame();
    game.initGrille();
    assertEquals(game.getWinner().getCouleur(), Couleur.Rouge);
  }
}

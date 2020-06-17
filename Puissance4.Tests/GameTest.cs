using System;
using Xunit;
using puissance4.src;

namespace Puissance4.Tests
{
    public class GameTest
    {
        private EtatCase[,] partieTest = { 
            { EtatCase.Rouge, EtatCase.Jaune, EtatCase.Jaune, EtatCase.Jaune, EtatCase.Rouge, EtatCase.Rouge, EtatCase.Jaune },
            { EtatCase.Jaune, EtatCase.Rouge, EtatCase.Rouge, EtatCase.Jaune, EtatCase.Rouge, EtatCase.Vide,  EtatCase.Jaune },
            { EtatCase.Vide,  EtatCase.Vide,  EtatCase.Jaune,  EtatCase.Rouge,  EtatCase.Vide,  EtatCase.Vide,  EtatCase.Vide },
            { EtatCase.Vide,  EtatCase.Vide,  EtatCase.Rouge,  EtatCase.Rouge,  EtatCase.Vide,  EtatCase.Vide,  EtatCase.Vide },
            { EtatCase.Vide,  EtatCase.Vide,  EtatCase.Vide,  EtatCase.Vide,  EtatCase.Vide,  EtatCase.Vide,  EtatCase.Vide },
            { EtatCase.Vide,  EtatCase.Vide,  EtatCase.Vide,  EtatCase.Vide,  EtatCase.Vide,  EtatCase.Vide,  EtatCase.Vide },
        };


        [Fact]
        public void ConstructionNouveauJeux()
        {
            var partie = new Game();
            Assert.NotNull(partie);
        }

        [Fact]
        public void RepriseJeuInstanciation()
        {
            var partie = new Game(partieTest);
            Assert.NotNull(partie);
        }

        [Fact]
        public void TestCaseNouvellePartie()
        {
            var partie = new Game();
            for (int i = 0; i < 6; i++)
                for (int j = 0; j < 7; j++)
                    Assert.Equal(partie.EtatCase(j, i), EtatCase.Vide);
        }

        [Fact]
        public void TestCaseReprise()
        {
            var partie = new Game(partieTest);
            for (int i = 0; i < 6; i++)
                for (int j = 0; j < 7; j++)
                    Assert.Equal(partie.EtatCase(j, i), partieTest[i, j]);
        }

        [Fact]
        public void TestVainqueur()
        {
            var nouvellePartie = new Game();
            Assert.Equal(EtatCase.Vide, nouvellePartie.Vainqueur());

            var reprisePartie = new Game(partieTest);
            Assert.Equal(EtatCase.Rouge, reprisePartie.Vainqueur());
        }
    }
}

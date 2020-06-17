using System;

namespace puissance4.src
{        
    /// <summary>
    /// Représentation du plateau de jeu
    /// </summary>
    public class Game
    {
        public const int NB_LIGNES = 6;
        public const int NB_COLONNES = 7;
        private EtatCase[,] cases = new EtatCase[NB_LIGNES, NB_COLONNES];

        /// <summary>
        /// Démarre une nouvelle partie
        /// </summary>
        public Game()
        {
            for (int i = 0; i < NB_LIGNES; i++)
                for (int j = 0; j < NB_COLONNES; j++)
                    cases[i, j] = src.EtatCase.Vide;
        }

        /// <summary>
        /// Reprend sur une partie existante
        /// </summary>
        /// <param name="jeu"></param>
        public Game(EtatCase[,] jeu)
        {
            for (int i = 0; i < NB_LIGNES; i++)
                for (int j = 0; j < NB_COLONNES; j++)
                    cases[i, j] = jeu[i, j];
        }

        /// <summary>
        /// Méthode permettant de connaitre le vainqueur de la partie
        /// </summary>
        /// <returns>Vide, si pas de vainqueur, sinon la couleur du vaninqueur</returns>
        public EtatCase Vainqueur()
        {
            throw new NotImplementedException("Vainqueur");
        }

        /// <summary>
        /// Retourne l'état d'une 
        /// </summary>
        /// <param name="ligne"></param>
        /// <param name="colonne"></param>
        /// <returns></returns>
        public EtatCase EtatCase(int colonne, int ligne)
        {
            return cases[ligne, colonne];
        }

        /// <summary>
        /// Un joueur joue un jeton dans une colonne
        /// </summary>
        /// <param name="joueur">Couleur du joueur</param>
        /// <param name="colonne">Colonne jouée</param>
        /// <returns>true si coup vainqueur</returns>
        public bool Jouer(EtatCase joueur, int colonne)
        {
            throw new NotImplementedException("EtatCase");
        }
    }
}

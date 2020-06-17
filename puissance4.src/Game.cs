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
        /// <returns>Vide, si pas de vainqueur, sinon la couleur du vainqueur</returns>
        public EtatCase Vainqueur()
        {
            for (int i = 0; i < NB_LIGNES; i++)
                for (int j = 0; j < NB_COLONNES; j++)
                {
                    if (cases[i, j] == src.EtatCase.Vide) continue;
                    if (gagnant(i, j)) return cases[i, j];
                }
            return src.EtatCase.Vide;
        }

        private bool gagnant(int ligne, int colonne)
        {
            return
                //test ligne gauche
                (colonne - 3 >= 0 && cases[ligne, colonne] == cases[ligne, colonne - 1] && cases[ligne, colonne] == cases[ligne, colonne - 2] && cases[ligne, colonne] == cases[ligne, colonne - 3])
                ||
                //test ligne droite
                (colonne + 3 < NB_COLONNES && cases[ligne, colonne] == cases[ligne, colonne + 1] && cases[ligne, colonne] == cases[ligne, colonne + 2] && cases[ligne, colonne] == cases[ligne, colonne + 3])
                ||
                //test colonne bas
                (ligne - 3 >= 0 && cases[ligne, colonne] == cases[ligne -1 , colonne] && cases[ligne, colonne] == cases[ligne -1, colonne] && cases[ligne, colonne] == cases[ligne-3, colonne ])
                ||
                //test colonne haut
                (ligne + 3 < NB_LIGNES && cases[ligne, colonne] == cases[ligne + 1, colonne] && cases[ligne, colonne] == cases[ligne + 2, colonne] && cases[ligne, colonne] == cases[ligne + 3, colonne])
                ||
                //test diagonale 1
                (ligne + 3 < NB_LIGNES && colonne + 3 < NB_COLONNES && cases[ligne, colonne] == cases[ligne + 1, colonne+1] && cases[ligne, colonne] == cases[ligne + 2, colonne+2] && cases[ligne, colonne] == cases[ligne + 3, colonne+3])
                ||
                //test diagonale 2
                (ligne + 3 < NB_LIGNES && colonne - 3 >= 0 && cases[ligne, colonne] == cases[ligne + 1, colonne - 1] && cases[ligne, colonne] == cases[ligne + 2, colonne - 2] && cases[ligne, colonne] == cases[ligne + 3, colonne - 3])
                ||
                //test diagonale 3
                (ligne - 3 >= 0 && colonne + 3 < NB_COLONNES && cases[ligne, colonne] == cases[ligne - 1, colonne + 1] && cases[ligne, colonne] == cases[ligne - 2, colonne + 2] && cases[ligne, colonne] == cases[ligne - 3, colonne + 3])
                                ||
                //test diagonale 4
                (ligne - 3 >= 0 && colonne - 3 >= 0 && cases[ligne, colonne] == cases[ligne - 1, colonne - 1] && cases[ligne, colonne] == cases[ligne - 2, colonne - 2] && cases[ligne, colonne] == cases[ligne - 3, colonne - 3])
            ;

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

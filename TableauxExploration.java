package com.company;

public class TableauxExploration {

    public static void initTen(int[][] tab){
        int nbLignes= tab.length;
        int nbColonnes = tab[0].length;

        for (int i = 0; i < nbLignes; i++){
            for (int j = 0; j < nbColonnes; j++){
                tab[i][j] = 10;
            }
        }
    }

    public static void initDiagonaleTen(int[][] tab){
        for (int i = 0; i < tab.length; i++){
            tab[i][i] = 10;
        }
    }

    public static void initPosition(String[][] tabResult) {
        int nbLignes= tabResult.length;
        int nbColonnes = tabResult[0].length;

        for (int i = 0; i < nbLignes; i++){
            for (int j = 0; j < nbColonnes; j++){
                tabResult[i][j] = i + ":" + j;
            }
        }
    }

    public static boolean isTabCarre(int[][] tab) {
        boolean isCarre = tab.length == tab[0].length;
        return isCarre;
    }

    public static boolean isTabDimEgal(int[][] tab1, int[][] tab2) {
        boolean isDimEgal = ((tab1.length == tab2.length) && (tab1[0].length == tab2[0].length));
        return isDimEgal;
    }

    public static int[][] getSommeMatrices(int[][] matrice1, int[][] matrice2) {
        int nbLignes = matrice1.length;
        int nbColonnes = matrice1[0].length;
        int[][] sommesMatrice = new int[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++){
            for (int j = 0; j < nbColonnes; j++){
                sommesMatrice[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        return sommesMatrice;
    }
}

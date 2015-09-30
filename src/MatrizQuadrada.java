    /**
     * Created by pcqs on 25/09/2015.
     */
    public class MatrizQuadrada {

        private int[][] matriz;
        private int tam;

        public MatrizQuadrada(int tam) {
            if(tam > 0) {
                matriz = new int[tam][tam];
                this.tam = tam;
            }
        }

        public int get(int i, int j) {
            return matriz[i][j];
        }

        public void alterar(int i, int j, int val) {
            matriz[i][j] = val;
        }

        public int somaLinha(int i) {

            int som = 0;
            for (int j = 0; j < matriz.length ; j++) {
                som += matriz[i][j];
            }

            return som;
        }

        public int somaColuna(int j) {

            int som = 0;
            for (int i = 0; i < matriz.length ; j++) {
                som += matriz[i][j];
            }

            return som;
        }

        public int somaDiag() {

            int som = 0;
            for (int i = 0; i < matriz.length ; i++) {
                som += matriz[i][i];
            }

            return som;
        }

        public MatrizQuadrada somaMatrizes(MatrizQuadrada outra) {
            MatrizQuadrada res = new MatrizQuadrada(outra.getTam());
            int linha = 0;
            int coluna = 0;
            for (int i = 0; i < this.getTam(); i++) {
                for (int j = 0; j < outra.getTam(); j++) {
                    int soma = this.get(i,j) + outra.get(i,j);
                    res.alterar(linha,coluna,soma);
                    if(coluna == res.getTam() - 1) {
                        linha++;
                        coluna = 0;
                    }
                    else  coluna++;
                }
            }
            return res;
        }

        public int getTam() {
            return tam;
        }
    }

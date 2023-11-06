//Parcial de Programación 3
public class Main {
    public static void main(String[] args) {

        //Defino casos de prueba
        //Las primeras 5 matrices son mutantes
        String[][] adnMutante1 = {
                {"A", "A", "A", "A", "C", "G"},
                {"C", "A", "G", "T", "G", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "A", "A", "G", "G"},
                {"C", "C", "C", "C", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}
        };
        String[][] adnMutante2 = {
                {"A", "G", "A", "T", "T", "C"},
                {"C", "T", "T", "T", "G", "C"},
                {"T", "T", "C", "T", "G", "T"},
                {"T", "A", "A", "A", "A", "G"},
                {"A", "C", "C", "C", "T", "A"},
                {"T", "C", "G", "C", "T", "G"}
        };
        String[][] adnMutante3 = {
                {"G", "T", "A", "A", "C", "G"},
                {"C", "C", "A", "T", "G", "A"},
                {"T", "T", "A", "A", "G", "T"},
                {"A", "G", "A", "G", "A", "G"},
                {"C", "C", "T", "G", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}
        };
        String[][] adnMutante4 = {
                {"T", "A", "G", "A", "C", "G"},
                {"C", "A", "C", "T", "A", "C"},
                {"C", "T", "G", "C", "T", "T"},
                {"C", "T", "C", "A", "G", "G"},
                {"C", "G", "C", "G", "C", "C"},
                {"T", "C", "A", "A", "A", "A"}
        };
        String[][] adnMutante5 = {
                {"A", "A", "A", "A", "C", "G"},
                {"C", "A", "G", "T", "G", "C"},
                {"T", "T", "A", "T", "G", "T"},
                {"A", "G", "A", "A", "G", "G"},
                {"C", "C", "C", "C", "T", "A"},
                {"T", "C", "A", "C", "T", "G"}
        };

        //Las segundas 5 matrices no son mutantes
        String[][] adnNoMutante1 = {
                {"A", "T", "G", "C", "G", "A"},
                {"C", "A", "G", "T", "C", "C"},
                {"T", "G", "C", "T", "A", "T"},
                {"A", "G", "C", "A", "G", "G"},
                {"C", "C", "A", "A", "A", "A"},
                {"T", "G", "A", "C", "T", "G"}
        };
        String[][] adnNoMutante2 = {
                {"A", "T", "G", "C", "G", "A"},
                {"C", "G", "A", "T", "A", "C"},
                {"G", "T", "C", "C", "G", "T"},
                {"A", "G", "C", "A", "C", "T"},
                {"C", "T", "G", "A", "A", "T"},
                {"T", "A", "C", "C", "T", "C"}
        };
        String[][] adnNoMutante3 = {
                {"C", "T", "G", "C", "G", "A"},
                {"A", "G", "A", "T", "A", "C"},
                {"G", "G", "C", "C", "A", "T"},
                {"A", "C", "A", "A", "C", "T"},
                {"C", "T", "G", "T", "A", "T"},
                {"T", "G", "C", "C", "T", "T"}
        };
        String[][] adnNoMutante4 = {
                {"G", "T", "G", "C", "G", "A"},
                {"C", "G", "A", "T", "A", "C"},
                {"G", "T", "T", "C", "G", "A"},
                {"A", "G", "C", "A", "A", "T"},
                {"C", "A", "G", "A", "A", "C"},
                {"T", "C", "C", "G", "T", "T"}
        };
        String[][] adnNoMutante5 = {
                {"A", "T", "G", "C", "G", "T"},
                {"C", "G", "A", "T", "A", "C"},
                {"G", "T", "A", "C", "G", "T"},
                {"A", "C", "C", "A", "C", "T"},
                {"T", "T", "G", "A", "A", "A"},
                {"T", "A", "C", "C", "T", "T"}
        };
        
        //Llamamos a la función y le pasamos diferentes matrices
        comprobarMutante(adnMutante1);
        comprobarMutante(adnMutante2);
        comprobarMutante(adnMutante3);
        comprobarMutante(adnMutante4);
        comprobarMutante(adnMutante5);
        comprobarMutante(adnNoMutante1);
        comprobarMutante(adnNoMutante2);
        comprobarMutante(adnNoMutante3);
        comprobarMutante(adnNoMutante4);
        comprobarMutante(adnNoMutante5);
    }

    //Esta función llama a la función isMutant y muestra por pantalla si la matriz es mutante o no.
    static void comprobarMutante(String[][] matriz) {

        Operaciones op = new Operaciones();
        mostrarMatriz(matriz);

        if (op.isMutant(matriz)) {
            System.out.println("La matriz es mutante\n");
        }else{
            System.out.println("La matriz no es mutante\n");
        }

    }

    static void mostrarMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
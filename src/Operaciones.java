public class Operaciones {

    //Esta función recorre la matriz y verifica los caracteres repetidos de manera horizontal.
    //Si encuentra 4 caracteres repetidos, incrementa un contador que la función retorna.
    //Si el contador es igual a 0, significa que no se encontraron caracteres repetidos 4 veces de forma horizontal.
    private int verificarHorizontal(String[][] adn) {
        int contador = 0;
        for (int i = 0; i < adn.length; i++) {
            for (int j = 0; j < adn[i].length - 3; j++) {
                if (adn[i][j].equals(adn[i][j+1]) && adn[i][j].equals(adn[i][j+2]) && adn[i][j].equals(adn[i][j+3])) {
                    contador++;
                }
            }
        }
        return contador;
    }

    //Esta función recorre la matriz y verifica los caracteres repetidos de manera vertical.
    //Si encuentra 4 caracteres repetidos, incrementa un contador que la función retorna.
    //Si el contador es igual a 0, significa que no se encontraron caracteres repetidos 4 veces de forma vertical.
    private int verificarVertical(String[][] adn) {
        int contador = 0;
        for (int i = 0; i < adn.length - 3; i++) {
            for (int j = 0; j < adn[i].length; j++) {
                if (adn[i][j].equals(adn[i+1][j]) && adn[i][j].equals(adn[i+2][j]) && adn[i][j].equals(adn[i+3][j])) {
                    contador++;
                }
            }
        }
        return contador;
    }

    //Esta función recorre la matriz y verifica los caracteres repetidos de manera diagonal de izquierda a derecha.
    //Si encuentra 4 caracteres repetidos, incrementa un contador que la función retorna.
    //Si el contador es igual a 0, significa que no se encontraron caracteres repetidos 4 veces de izquierda a derecha en diagonal.
    private int deIzquierdaADerecha(String[][] adn) {
        int contador = 0;
        for (int i = 0; i < adn.length - 3; i++) {
            for (int j = 0; j < adn[i].length - 3; j++) {
                if (adn[i][j].equals(adn[i+1][j+1]) && adn[i][j].equals(adn[i+2][j+2]) && adn[i][j].equals(adn[i+3][j+3])) {
                    contador++;
                }
            }
        }
        return contador;
    }

    //Esta función recorre la matriz y verifica los caracteres repetidos de manera diagonal de derecha a izquierda.
    //Si encuentra 4 caracteres repetidos, incrementa un contador que la función retorna.
    //Si el contador es igual a 0, significa que no se encontraron caracteres repetidos 4 veces de derecha a izquierda en diagonal.
    private int deDerechaAIzquierda(String[][] adn) {
        int contador = 0;
        for (int i = 3; i < adn.length; i++) {
            for (int j = 0; j < adn[i].length - 3; j++) {
                if (adn[i][j].equals(adn[i-1][j+1]) && adn[i][j].equals(adn[i-2][j+2]) && adn[i][j].equals(adn[i-3][j+3])) {
                    contador++;
                }
            }
        }
        return contador;
    }

    //Esta función llama a las funciones que comprueban diagonales e incrementa un contador que retorna.
    //Si el contador es igual a 0, significa que no se encontraron caracteres repetidos 4 veces en diagonal.
    private int verificarDiagonal(String[][] adn) {
        int contador = 0;
        contador += deIzquierdaADerecha(adn);
        contador += deDerechaAIzquierda(adn);
        return contador;
    }

    //Esta función llama a las funciones que comprueban los caracteres de forma horizontal, vertical y diagonal.
    //Si el contador es igual o mayor a 2, significa que la matriz es mutante.
    public boolean isMutant(String[][] adn){
        int contador = 0;
        contador += verificarHorizontal(adn);
        contador += verificarVertical(adn);
        contador += verificarDiagonal(adn);
        return contador > 1;
    }
}

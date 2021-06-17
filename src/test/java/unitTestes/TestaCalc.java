package unitTestes;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestaCalc {

    @Test
    public void testarSomarDoisNumeros() {
        // 1 - Prepara - Configurar - Given
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;

        // 2 - Executar - When
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("Resultado esperado: " + resultadoEsperado + "\nResultado Atual...: " + resultadoAtual);
        assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testarSubtrairDoisNumeros() {
        // 1 - Prepara - Configurar - Given
        int num1 = 5;
        int num2 = 3;
        int resultadoEsperado = 2;

        // 2 - Executar - When
        int resultadoAtual = Calc.subtrairDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("Resultado esperado: " + resultadoEsperado + "\nResultado Atual...: " + resultadoAtual);
        assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testarMultiplicarDoisNumero() {
        // 1 - Pepara - Configurar - Given
        int num1 = 2;
        int num2 = 3;
        int resultadoEsperado = 6;

        // 2 - Executar - When
        int resultadoAtual = Calc.multiplicarDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("Resultado esperado: " + resultadoEsperado + "\nResultado Atual...: " + resultadoAtual);
        assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testarDividirDoisNumero() {
        // 1 - Prepara - Configurar - Given
        int num1 = 6;
        int num2 = 2;
        int resultadoEsperado = 3;

        // 2 - Executa - When
        int resultadoAtual = Calc.dividirDoisNumeros(num1, num2);

        // 2 Validar - Then
        System.out.println("Resultado esperado: " + resultadoEsperado + "\nResultado Atual...: " + resultadoAtual);
        assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testarDividirDoisNumeroComZero() {
        // 1 - Prepara - Configurar - Given
        int num1 = 2;
        int num2 = 0;
        int resultadoEsperado = 0;

        // 2 - Executa - When
        int resultadoAtual = Calc.dividirDoisNumeros(num1, num2);

        // 3 - Valida - Then
        System.out.println("Resultado esperado: " + resultadoEsperado + "\nResultado Atual...: " + resultadoAtual);
        assertEquals(resultadoAtual, resultadoEsperado);
    }

}

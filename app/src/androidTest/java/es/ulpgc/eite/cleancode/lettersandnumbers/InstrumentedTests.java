package es.ulpgc.eite.cleancode.lettersandnumbers;


import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.uiautomator.UiDevice;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import es.ulpgc.eite.cleancode.lettersandnumbers.letters.LetterListActivity;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class InstrumentedTests { // 18 tests


    @Rule
    public ActivityTestRule<LetterListActivity> rule =
        new ActivityTestRule<>(LetterListActivity.class);

    public InstrumentedRobot robot = new InstrumentedRobot();


    public void rotateScreen() {

        try {

            UiDevice device = UiDevice.getInstance(getInstrumentation());

            Thread.sleep(700);
            device.setOrientationLeft();
            Thread.sleep(700);
            device.setOrientationNatural();
            Thread.sleep(700);

        } catch (Exception e) {

        }

    }


    @Test
    public void testPulsarEnSegundaLetra() { // 1

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // When pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumerosConDimensionP1("0");
    }

    @Test
    public void testCrearPrimerNumeroParaSegundaLetra() { // 2

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // When pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumerosConDimensionP1("1");
    }

    @Test
    public void testCrearSegundoNumeroParaSegundaLetra() { // 3

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // When pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
        // And mostramos numero en lista en posicion "1" con valor "2"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("1", "2");
        // And mostramos lista de numeros con dimension "2"
        robot.mostramosListaDeNumerosConDimensionP1("2");
    }

    @Test
    public void testRegresarDesdeSegundoNumeroParaSegundaLetra() { // 4

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetrasConDimensionP1("2");
    }


    @Test
    public void testPulsarEnTerceraLetra() { // 5

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // When pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");
        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumerosConDimensionP1("0");
    }

    @Test
    public void testCrearPrimerNumeroParaTerceraLetra() { // 6

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");
        // When pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // Then mostramos numero en lista en posicion "0" con valor "3"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "3");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumerosConDimensionP1("1");
    }

    @Test
    public void testRegresarDesdePrimerNumeroParaTerceraLetra() { // 7

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetrasConDimensionP1("3");
    }

    @Test
    public void testPulsarEnPrimeraLetra() { // 8

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // When pulsamos celda de letra en posicion "0"
        robot.pulsamosCeldaDeLetraEnPosicionP1("0");
        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumerosConDimensionP1("0");
    }


    @Test
    public void testRegresarDesdePrimerNumeroParaPrimeraLetra() { // 9

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosCeldaDeLetraEnPosicionP1("0");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetrasConDimensionP1("3");
    }



    @Test
    public void testCrearSegundoNumeroParaSegundaLetraConRotacion() { // 10

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
        // And mostramos numero en lista en posicion "1" con valor "2"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("1", "2");
        // And mostramos lista de numeros con dimension "2"
        robot.mostramosListaDeNumerosConDimensionP1("2");
    }

    @Test
    public void testRegresarDesdeSegundoNumeroParaSegundaLetraConRotacion() { // 11

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetrasConDimensionP1("2");
    }

    @Test
    public void testCrearTercerLetraConRotacion() { // 12

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetrasConDimensionP1("3");
    }

    @Test
    public void testPulsarEnTerceraLetraConRotacion() { // 13

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumerosConDimensionP1("0");
    }

    @Test
    public void testCrearPrimerNumeroParaTerceraLetraConRotacion() { // 14

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos numero en lista en posicion "0" con valor "3"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "3");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumerosConDimensionP1("1");
    }

    @Test
    public void testRegresarDesdePrimerNumeroParaTerceraLetraConRotacion() { // 15

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetrasConDimensionP1("3");
    }

    @Test
    public void testPulsarEnPrimeraLetraConRotacion() { // 16

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosCeldaDeLetraEnPosicionP1("0");
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumerosConDimensionP1("0");
    }

    @Test
    public void testCrearPrimerNumeroParaPrimeraLetraConRotacion() { // 17

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosCeldaDeLetraEnPosicionP1("0");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos numero en lista en posicion "0" con valor "4"
        robot.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "4");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumerosConDimensionP1("1");
    }

    @Test
    public void testRegresarDesdePrimerNumeroParaPrimeraLetraConRotacion() { // 18

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetrasConDimensionP1("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosCeldaDeLetraEnPosicionP1("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosCeldaDeLetraEnPosicionP1("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosCeldaDeLetraEnPosicionP1("0");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetrasConDimensionP1("3");
    }
}
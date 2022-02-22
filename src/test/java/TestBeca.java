import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class TestBeca {


    Beca beca = new Beca();

    Utils utilsM = Mockito.mock(Utils.class);


    @BeforeAll
    public static void before(){
        MockedStatic<Helpers> mocked = Mockito.mockStatic(Helpers.class);

        mocked.when(()-> Helpers.aplicaBeca(8435264)).thenReturn(true);
        mocked.when(()-> Helpers.aplicaBeca(123)).thenReturn(true);
        mocked.when(()-> Helpers.aplicaBeca(1010)).thenReturn(false);

    }


    // CUANDO APLICA BECA ES TRUE
    // PROMEDIO ES MAYOR O IGUAL A 90

    @Test
    public void checkBecaA(){

        Mockito.when(utilsM.getNota(8435264)).thenReturn(92);

        Beca beca1 = new Beca(utilsM);

        String actualResult = beca1.recomendacionBeca(8435264);
        String expectedResult = "SI APLICA A BECA";


        Assertions.assertEquals(expectedResult,actualResult,"ERROR");

    }


    // CUANDO APLICA BECA ES TRUE
    // PROMEDIO ES MENOR A 90

    @Test
    public void checkBecaB(){

        Mockito.when(utilsM.getNota(123)).thenReturn(80);

        Beca beca1 = new Beca(utilsM);

        String actualResult = beca1.recomendacionBeca(123);
        String expectedResult = "NO APLICA A BECA POR PROMEDIO ACADEMICO";


        Assertions.assertEquals(expectedResult,actualResult,"ERROR");

    }


    // CUANDO APLICA BECA ES FALSE
    @Test
    public void checkBecaC(){

        Mockito.when(utilsM.getNota(1010)).thenReturn(90);

        Beca beca1 = new Beca(utilsM);

        String actualResult = beca1.recomendacionBeca(1010);
        String expectedResult = "EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";


        Assertions.assertEquals(expectedResult,actualResult,"ERROR");

    }





}

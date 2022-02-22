public class Beca {

    Utils utils;
    Helpers helpers;


    String msg = "";

    public Beca(Utils utilsMockeado,Helpers helpersMockeado){

        utils = utilsMockeado;
        helpers = helpersMockeado;


    }

    public Beca(){}



    public String recomendacionBeca(int CI){


        int notaTemp = 0 ;
        if (Helpers.aplicaBeca(CI)){
            notaTemp = utils.getNota(CI);

            if (notaTemp >= 90){
                msg = "SI APLICA A BECA";
            }else {
                msg = "NO APLICA A BECA POR PROMEDIO ACADEMICO";
            }


        }else {
            msg = "EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";
        }

        return msg;

    }
}

public class Beca {

    Utils utils;
    Helpers helpers;


    String msg = "";

    public Beca(Utils utilsMockeado,Helpers helpersMockeado){

        utils = utilsMockeado;
        helpers = helpersMockeado;


    }



    public String recomendacionBeca(int CI){

        if (Helpers.aplicaBeca(CI)){
           msg =  utils.getNota(CI)


        }

    }
}

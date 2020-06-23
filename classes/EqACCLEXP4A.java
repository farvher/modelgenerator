package com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence;

/**
 * Equivalence values and catalog to transform ACCL into CANONICAL
 *
 * @author Cobiscorp
 */
public class EqACCLEXP4A {


        /**
        	* Equivalence values and catalog for sucursalDestinatario
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String sucursalDestinatario(String o){

            if("SUC".equals(o)){
                return "1";
            }
            if("CBB".equals(o)){
                return "545";
            }
            if("ORU".equals(o)){
                return "723";
            }
            if("POT".equals(o)){
                return "884";
            }
            if("COB".equals(o)){
                return "1468";
            }
            if("LPZ".equals(o)){
                return "102";
            }
            if("TRI".equals(o)){
                return "1419";
            }
            if("TJA".equals(o)){
                return "1134";
            }
            if("SCZ".equals(o)){
                return "1225";
            }

            return null;
        }


}

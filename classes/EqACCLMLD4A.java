package com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence;

/**
 * Equivalence values and catalog to transform ACCL into CANONICAL
 *
 * @author Cobiscorp
 */
public class EqACCLMLD4A {


        /**
        	* Equivalence values and catalog for tipOrden
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String tipOrden(String o){

            if("210".equals(o)){
                return "DEB";
            }
            if("250".equals(o)){
                return "MOV";
            }

            return null;
        }
        /**
        	* Equivalence values and catalog for codPaisDestinatario
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String codPaisDestinatario(String o){

            if("BO".equals(o)){
                return "68";
            }

            return null;
        }
        /**
        	* Equivalence values and catalog for codSucursalDestinatario
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String codSucursalDestinatario(String o){

            if("SUC".equals(o)){
                return "2";
            }
            if("CBB".equals(o)){
                return "634";
            }
            if("ORU".equals(o)){
                return "865";
            }
            if("POT".equals(o)){
                return "884";
            }
            if("COB".equals(o)){
                return "1468";
            }
            if("LPZ".equals(o)){
                return "173";
            }
            if("TRI".equals(o)){
                return "1419";
            }
            if("TJA".equals(o)){
                return "1134";
            }
            if("SCZ".equals(o)){
                return "1293";
            }

            return null;
        }


}

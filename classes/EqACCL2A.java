package com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence;

/**
 * Equivalence values and catalog to transform ACCL into CANONICAL
 *
 * @author Cobiscorp
 */
public class EqACCL2A {


        /**
        	* Equivalence values and catalog for codSucursalOriginante
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String codSucursalOriginante(String o){

            if("SUC".equals(o)){
                return "1";
            }
            if("CBB".equals(o)){
                return "545";
            }
            if("ORU".equals(o)){
                return "731";
            }
            if("POT".equals(o)){
                return "987";
            }
            if("COB".equals(o)){
                return "1498";
            }
            if("LPZ".equals(o)){
                return "219";
            }
            if("TRI".equals(o)){
                return "1419";
            }
            if("TJA".equals(o)){
                return "1134";
            }
            if("SCZ".equals(o)){
                return "1242";
            }

            return null;
        }
        /**
        	* Equivalence values and catalog for codOriginante
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String codOriginante(String o){

            if("3002".equals(o)){
                return "21";
            }
            if("1033".equals(o)){
                return "1";
            }
            if("74003".equals(o)){
                return "20";
            }
            if("3001".equals(o)){
                return "16";
            }
            if("74002".equals(o)){
                return "15";
            }
            if("74001".equals(o)){
                return "13";
            }
            if("1008".equals(o)){
                return "6";
            }
            if("1018".equals(o)){
                return "11";
            }
            if("53001".equals(o)){
                return "17";
            }
            if("1007".equals(o)){
                return "18";
            }
            if("1017".equals(o)){
                return "10";
            }
            if("1016".equals(o)){
                return "9";
            }
            if("1005".equals(o)){
                return "5";
            }
            if("1004".equals(o)){
                return "4";
            }
            if("1014".equals(o)){
                return "8";
            }
            if("1036".equals(o)){
                return "19";
            }
            if("1003".equals(o)){
                return "3";
            }
            if("1035".equals(o)){
                return "14";
            }
            if("53002".equals(o)){
                return "49";
            }
            if("3015".equals(o)){
                return "22";
            }
            if("3004".equals(o)){
                return "35";
            }
            if("1034".equals(o)){
                return "12";
            }
            if("1001".equals(o)){
                return "2";
            }
            if("3003".equals(o)){
                return "43";
            }
            if("1009".equals(o)){
                return "7";
            }

            return null;
        }
        /**
        	* Equivalence values and catalog for codDestinatario
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String codDestinatario(String o){

            if("3002".equals(o)){
                return "21";
            }
            if("74003".equals(o)){
                return "20";
            }
            if("3001".equals(o)){
                return "16";
            }
            if("74002".equals(o)){
                return "15";
            }
            if("1008".equals(o)){
                return "6";
            }
            if("1018".equals(o)){
                return "11";
            }
            if("53001".equals(o)){
                return "17";
            }
            if("1007".equals(o)){
                return "18";
            }
            if("1017".equals(o)){
                return "1";
            }
            if("1016".equals(o)){
                return "9";
            }
            if("1005".equals(o)){
                return "5";
            }
            if("1004".equals(o)){
                return "4";
            }
            if("1014".equals(o)){
                return "8";
            }
            if("1036".equals(o)){
                return "19";
            }
            if("1003".equals(o)){
                return "3";
            }
            if("1035".equals(o)){
                return "14";
            }
            if("53002".equals(o)){
                return "49";
            }
            if("3004".equals(o)){
                return "35";
            }
            if("3015".equals(o)){
                return "29";
            }
            if("1034".equals(o)){
                return "12";
            }
            if("1001".equals(o)){
                return "2";
            }
            if("3003".equals(o)){
                return "43";
            }
            if("1009".equals(o)){
                return "7";
            }

            return null;
        }
        /**
        	* Equivalence values and catalog for codMoneda
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String codMoneda(String o){

            if("BOB".equals(o)){
                return "0";
            }
            if("USD".equals(o)){
                return "2";
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
        	* Equivalence values and catalog for codPaisOriginante
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String codPaisOriginante(String o){

            if("TJA".equals(o)){
                return "14343";
            }
            if("BO".equals(o)){
                return "68";
            }

            return null;
        }
        /**
        	* Equivalence values and catalog for tipCuentaOrigen
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String tipCuentaOrigen(String o){

            if("CCAO".equals(o)){
                return "CCAO";
            }
            if("CMOVILO".equals(o)){
                return "CMOVILO";
            }
            if("CEFECTIVOO".equals(o)){
                return "CEFECTIVOO";
            }

            return null;
        }


}

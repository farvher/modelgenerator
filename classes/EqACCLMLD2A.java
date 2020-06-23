package com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence;

/**
 * Equivalence values and catalog to transform ACCL into CANONICAL
 *
 * @author Cobiscorp
 */
public class EqACCLMLD2A {


        /**
        	* Equivalence values and catalog for codSucursalOriginante
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String codSucursalOriginante(String o){

            if("SUC".equals(o)){
                return "4";
            }
            if("CBB".equals(o)){
                return "603";
            }
            if("ORU".equals(o)){
                return "834";
            }
            if("POT".equals(o)){
                return "884";
            }
            if("COB".equals(o)){
                return "1493";
            }
            if("LPZ".equals(o)){
                return "373";
            }
            if("TRI".equals(o)){
                return "1419";
            }
            if("TJA".equals(o)){
                return "1500";
            }
            if("SCZ".equals(o)){
                return "1262";
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
        	* Equivalence values and catalog for codSubDestinatario
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String codSubDestinatario(String o){

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
            if("53001".equals(o)){
                return "17";
            }
            if("1007".equals(o)){
                return "18";
            }
            if("1018".equals(o)){
                return "11";
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
            if("1036".equals(o)){
                return "19";
            }
            if("1014".equals(o)){
                return "8";
            }
            if("1035".equals(o)){
                return "14";
            }
            if("1034".equals(o)){
                return "12";
            }
            if("1001".equals(o)){
                return "2";
            }
            if("MLD3030".equals(o)){
                return "39";
            }
            if("1009".equals(o)){
                return "7";
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
        	* Equivalence values and catalog for codSubOriginante
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String codSubOriginante(String o){

            if("MLD1034".equals(o)){
                return "25";
            }
            if("MLD3016".equals(o)){
                return "48";
            }
            if("MLD1014".equals(o)){
                return "26";
            }
            if("MLD3033".equals(o)){
                return "34";
            }
            if("MLD3011".equals(o)){
                return "52";
            }
            if("MLD3034".equals(o)){
                return "38";
            }
            if("MLD3012".equals(o)){
                return "51";
            }
            if("MLD3031".equals(o)){
                return "45";
            }
            if("MLD3010".equals(o)){
                return "46";
            }
            if("MLD1018".equals(o)){
                return "23";
            }
            if("MLD75001".equals(o)){
                return "24";
            }
            if("MLD3026".equals(o)){
                return "28";
            }
            if("MLD3048".equals(o)){
                return "37";
            }
            if("MLD3027".equals(o)){
                return "42";
            }
            if("MLD3005".equals(o)){
                return "53";
            }
            if("MLD3046".equals(o)){
                return "40";
            }
            if("MLD3024".equals(o)){
                return "44";
            }
            if("MLD3047".equals(o)){
                return "41";
            }
            if("MLD3044".equals(o)){
                return "33";
            }
            if("MLD3022".equals(o)){
                return "36";
            }
            if("MLD3043".equals(o)){
                return "31";
            }
            if("MLD3021".equals(o)){
                return "30";
            }
            if("MLD74003".equals(o)){
                return "54";
            }
            if("MLD3028".equals(o)){
                return "27";
            }
            if("MLD3006".equals(o)){
                return "50";
            }
            if("MLD3007".equals(o)){
                return "47";
            }
            if("MLD3029".equals(o)){
                return "32";
            }
            if("MLD3030".equals(o)){
                return "39";
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
        /**
        	* Equivalence values and catalog for canal
        	* @param o equivalentValue
        	* @return catalogId
        	* */
        public static String canal(String o){

            if("WEB".equals(o)){
                return "1";
            }
            if("VEN".equals(o)){
                return "9";
            }

            return null;
        }


}

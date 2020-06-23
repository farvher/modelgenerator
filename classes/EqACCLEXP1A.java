package com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence;

/**
 * Equivalence values and catalog to transform CANONICAL into ACCL
 *
 * @author Cobiscorp
 */
public class EqACCLEXP1A {


        /**
        	* Equivalence values and catalog for originatorAccountType
        	* @param o catalogId
        	* @return equivalentValue
        	* */
        public static String originatorAccountType(String o){

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
        	* Equivalence values and catalog for channel
        	* @param o catalogId
        	* @return equivalentValue
        	* */
        public static String channel(String o){

            if("0".equals(o)){
                return "VEN";
            }
            if("1".equals(o)){
                return "WEB";
            }
            if("8".equals(o)){
                return "MOV";
            }

            return null;
        }
        /**
        	* Equivalence values and catalog for receiverCode
        	* @param o catalogId
        	* @return equivalentValue
        	* */
        public static String receiverCode(String o){

            if("22".equals(o)){
                return "3015";
            }
            if("11".equals(o)){
                return "1018";
            }
            if("12".equals(o)){
                return "1034";
            }
            if("14".equals(o)){
                return "1035";
            }
            if("15".equals(o)){
                return "74002";
            }
            if("16".equals(o)){
                return "3001";
            }
            if("17".equals(o)){
                return "53001";
            }
            if("18".equals(o)){
                return "1007";
            }
            if("19".equals(o)){
                return "1036";
            }
            if("1".equals(o)){
                return "1033";
            }
            if("2".equals(o)){
                return "1001";
            }
            if("3".equals(o)){
                return "1003";
            }
            if("4".equals(o)){
                return "1004";
            }
            if("5".equals(o)){
                return "1005";
            }
            if("6".equals(o)){
                return "1008";
            }
            if("7".equals(o)){
                return "1009";
            }
            if("8".equals(o)){
                return "1014";
            }
            if("9".equals(o)){
                return "1016";
            }
            if("20".equals(o)){
                return "74003";
            }
            if("21".equals(o)){
                return "3002";
            }
            if("10".equals(o)){
                return "1017";
            }
            if("43".equals(o)){
                return "3003";
            }

            return null;
        }
        /**
        	* Equivalence values and catalog for currencyCode
        	* @param o catalogId
        	* @return equivalentValue
        	* */
        public static String currencyCode(String o){

            if("0".equals(o)){
                return "BOB";
            }
            if("2".equals(o)){
                return "USD";
            }

            return null;
        }


}

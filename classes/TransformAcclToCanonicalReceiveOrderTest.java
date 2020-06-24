package com.cobiscorp.messagetransformation;

import static org.junit.Assert.assertTrue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import javax.validation.*;
import org.junit.Test;
import java.text.MessageFormat;
import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;


/**
 * Test cases for ACCL Messages
 *
 * @author Cobiscorp
 */
public class TransformAcclToCanonicalReceiveOrderTest {

    private static final String VIOLATIONS_MUST_BE_EMPTY = "Violations must be empty";


     /**
        * Test case validate ACCL Messages {@link CanonicalReceiveOrder }
        *
        */
     @Test
     public void ACCLMLD1ATest() {
         long startTime = System.currentTimeMillis();

        CanonicalReceiveOrder tmpDto = CanonicalReceiveOrder.newCanonicalReceiveOrder()
                            .receiverClientName("01234567891011")
                            .originatorAccountType("CCAO")
                            .documentType("0123456789")
                            .procedureCode("012")
                            .originatorBranchCode("4")
                            .channel("9")
                            .originatorNumberOrder("01234567891011")
                            .description("01234567891011")
                            .receiverCode("23")
                            .etc("01234567891011")
                            .originatorAccountNumber("01234567891011")
                            .receiverIdentificationNumber("01234567891011")
                            .receiverAccountNumber("01234567891011")
                            .compensatorCode("0123")
                            .amount(new java.math.BigDecimal(100L))
                            .receiverAccountType("01234567891011")
                            .receiverCountryCode("68")
                            .originatorCode("1")
                            .sentOrderType("012")
                            .originatorFunds("01234567891011")
                            .originatorClientName("01234567891011")
                            .receiverSubVaultCode("012345678")
                            .originatorCountryCode("68")
                            .receiverFunds("01234567891011")
                            .houseDate("0123456789")
                            .originatorIdentificationNumber("01234567891011")
                            .currencyCode("0")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        ACCLMLD1A transformation = new TransformCanonicalReceiveOrdertoACCLMLD1A(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLMLD1ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link CanonicalReceiveOrder }
        *
        */
     @Test
     public void ACCLMLDARTest() {
         long startTime = System.currentTimeMillis();

        CanonicalReceiveOrder tmpDto = CanonicalReceiveOrder.newCanonicalReceiveOrder()
                            .responseDescription("01234567891011")
                            .houseCode("0")
                            .originatorNumberOrder("01234567891011")
                            .achNumberOrder("01234567891011")
                            .responseCode("0123")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        ACCLMLDAR transformation = new TransformCanonicalReceiveOrdertoACCLMLDAR(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLMLDARTest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link ACCLMLD1B }
        *
        */
     @Test
     public void ACCLMLD1BTest() {
         long startTime = System.currentTimeMillis();

        ACCLMLD1B tmpDto = ACCLMLD1B.newACCLMLD1B()
                            .withNumOrdenOriginante("01234567891011")
                            .withErrorMensaje("01234567891011")
                            .withCodCamara("0")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        CanonicalReceiveOrder transformation = new TransformACCLMLD1BtoCanonicalReceiveOrder(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLMLD1BTest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link ACCLMLD5A }
        *
        */
     @Test
     public void ACCLMLD5ATest() {
         long startTime = System.currentTimeMillis();

        ACCLMLD5A tmpDto = ACCLMLD5A.newACCLMLD5A()
                            .withNumOrdenOriginante("01234567891011")
                            .withErrorMensaje("01234567891011")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        CanonicalReceiveOrder transformation = new TransformACCLMLD5AtoCanonicalReceiveOrder(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLMLD5ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link ACCLMLD4A }
        *
        */
     @Test
     public void ACCLMLD4ATest() {
         long startTime = System.currentTimeMillis();

        ACCLMLD4A tmpDto = ACCLMLD4A.newACCLMLD4A()
                            .withNumOrdenOriginante("01234567891011")
                            .withNumOrdenDestinatario("01234567891011")
                            .withTipOrden("210")
                            .withCodPaisDestinatario("BO")
                            .withNumOrdenAch("01234567891011")
                            .withTitularDestinatario("01234567891011")
                            .withCodRespuesta("0123")
                            .withCodSucursalDestinatario("SUC")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        CanonicalReceiveOrder transformation = new TransformACCLMLD4AtoCanonicalReceiveOrder(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLMLD4ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link CanonicalReceiveOrder }
        *
        */
     @Test
     public void ACCLMLD3ATest() {
         long startTime = System.currentTimeMillis();

        CanonicalReceiveOrder tmpDto = CanonicalReceiveOrder.newCanonicalReceiveOrder()
                            .receiverClientName("01234567891011")
                            .receiverNumberOrder("01234567891011")
                            .receiverCountryCode("68")
                            .originatorNumberOrder("01234567891011")
                            .operationType("DEB")
                            .achNumberOrder("01234567891011")
                            .responseCode("0123")
                            .receiverBranchCode("2")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        ACCLMLD3A transformation = new TransformCanonicalReceiveOrdertoACCLMLD3A(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLMLD3ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link ACCLMLD3B }
        *
        */
     @Test
     public void ACCLMLD3BTest() {
         long startTime = System.currentTimeMillis();

        ACCLMLD3B tmpDto = ACCLMLD3B.newACCLMLD3B()
                            .withErrorMensaje("01234567891011")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        CanonicalReceiveOrder transformation = new TransformACCLMLD3BtoCanonicalReceiveOrder(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLMLD3BTest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link ACCLMLD2A }
        *
        */
     @Test
     public void ACCLMLD2ATest() {
         long startTime = System.currentTimeMillis();

        ACCLMLD2A tmpDto = ACCLMLD2A.newACCLMLD2A()
                            .withDestinoFondos("01234567891011")
                            .withCodProcedimiento("012")
                            .withCuentaOrigen("01234567891011")
                            .withNumOrdenAch("01234567891011")
                            .withCuentaDestino("01234567891011")
                            .withOrigenFondos("01234567891011")
                            .withTitularOriginante("01234567891011")
                            .withCodSucursalOriginante("SUC")
                            .withEtc("01234567891011")
                            .withCodSubDestinatario("1033")
                            .withCodSubOriginante("MLD1018")
                            .withCanal("VEN")
                            .withTipOrden("012")
                            .withGlosa("01234567891011")
                            .withCodPaisOriginante("BO")
                            .withTitularDestinatario("01234567891011")
                            .withTipCuentaDestino("01234567891011")
                            .withImporte("01234567891011")
                            .withNumOrdenOriginante("01234567891011")
                            .withCiNitOriginante("01234567891011")
                            .withCodDestinatario("0123456789")
                            .withTipoDocumento("0123456789")
                            .withCodMoneda("BOB")
                            .withCodPaisDestinatario("BO")
                            .withTipCuentaOrigen("CCAO")
                            .withCodCamara("0")
                            .withCiNitDestinatario("01234567891011")
                            .withFecCamara("0123456789")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        CanonicalReceiveOrder transformation = new TransformACCLMLD2AtoCanonicalReceiveOrder(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLMLD2ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link CanonicalReceiveOrder }
        *
        */
     @Test
     public void ACCL1ATest() {
         long startTime = System.currentTimeMillis();

        CanonicalReceiveOrder tmpDto = CanonicalReceiveOrder.newCanonicalReceiveOrder()
                            .receiverClientName("01234567891011")
                            .originatorAccountType("CMOVILO")
                            .subReceiverCode("01234567891011")
                            .documentType("0123456789")
                            .procedureCode("012")
                            .originatorBranchCode("1")
                            .channel("9")
                            .originatorNumberOrder("01234567891011")
                            .description("01234567891011")
                            .receiverCode("1")
                            .etc("01234567891011")
                            .originatorAccountNumber("01234567891011")
                            .receiverIdentificationNumber("01234567891011")
                            .receiverAccountNumber("01234567891011")
                            .amount(new java.math.BigDecimal(100L))
                            .receiverAccountType("01234567891011")
                            .receiverCountryCode("68")
                            .sentOrderType("012")
                            .originatorFunds("01234567891011")
                            .originatorClientName("01234567891011")
                            .subOriginatorCode("01234567891011")
                            .originatorCountryCode("68")
                            .receiverFunds("01234567891011")
                            .houseDate("0123456789")
                            .originatorIdentificationNumber("01234567891011")
                            .currencyCode("0")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        ACCL1A transformation = new TransformCanonicalReceiveOrdertoACCL1A(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCL1ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link CanonicalReceiveOrder }
        *
        */
     @Test
     public void ACCLARTest() {
         long startTime = System.currentTimeMillis();

        CanonicalReceiveOrder tmpDto = CanonicalReceiveOrder.newCanonicalReceiveOrder()
                            .responseDescription("01234567891011")
                            .houseCode("0")
                            .originatorNumberOrder("01234567891011")
                            .achNumberOrder("01234567891011")
                            .responseCode("0123")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        ACCLAR transformation = new TransformCanonicalReceiveOrdertoACCLAR(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLARTest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link ACCL1B }
        *
        */
     @Test
     public void ACCL1BTest() {
         long startTime = System.currentTimeMillis();

        ACCL1B tmpDto = ACCL1B.newACCL1B()
                            .withNumOrdenOriginante("01234567891011")
                            .withErrorMensaje("01234567891011")
                            .withCodCamara("0")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        CanonicalReceiveOrder transformation = new TransformACCL1BtoCanonicalReceiveOrder(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCL1BTest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link ACCL5A }
        *
        */
     @Test
     public void ACCL5ATest() {
         long startTime = System.currentTimeMillis();

        ACCL5A tmpDto = ACCL5A.newACCL5A()
                            .withNumOrdenOriginante("01234567891011")
                            .withErrorMensaje("01234567891011")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        CanonicalReceiveOrder transformation = new TransformACCL5AtoCanonicalReceiveOrder(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCL5ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link ACCL4A }
        *
        */
     @Test
     public void ACCL4ATest() {
         long startTime = System.currentTimeMillis();

        ACCL4A tmpDto = ACCL4A.newACCL4A()
                            .withNumOrdenOriginante("01234567891011")
                            .withNumOrdenDestinatario("01234567891011")
                            .withTipOrden("250")
                            .withCodPaisDestinatario("BO")
                            .withNumOrdenAch("01234567891011")
                            .withTitularDestinatario("01234567891011")
                            .withCodRespuesta("0123")
                            .withCodSucursalDestinatario("SUC")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        CanonicalReceiveOrder transformation = new TransformACCL4AtoCanonicalReceiveOrder(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCL4ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link CanonicalReceiveOrder }
        *
        */
     @Test
     public void ACCL3ATest() {
         long startTime = System.currentTimeMillis();

        CanonicalReceiveOrder tmpDto = CanonicalReceiveOrder.newCanonicalReceiveOrder()
                            .receiverClientName("01234567891011")
                            .receiverNumberOrder("01234567891011")
                            .receiverCountryCode("68")
                            .originatorNumberOrder("01234567891011")
                            .operationType("PCC")
                            .achNumberOrder("01234567891011")
                            .responseCode("0123")
                            .receiverBranchCode("1")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        ACCL3A transformation = new TransformCanonicalReceiveOrdertoACCL3A(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCL3ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link ACCL3B }
        *
        */
     @Test
     public void ACCL3BTest() {
         long startTime = System.currentTimeMillis();

        ACCL3B tmpDto = ACCL3B.newACCL3B()
                            .withErrorMensaje("01234567891011")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        CanonicalReceiveOrder transformation = new TransformACCL3BtoCanonicalReceiveOrder(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCL3BTest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link ACCL2A }
        *
        */
     @Test
     public void ACCL2ATest() {
         long startTime = System.currentTimeMillis();

        ACCL2A tmpDto = ACCL2A.newACCL2A()
                            .withDestinoFondos("01234567891011")
                            .withCodProcedimiento("012")
                            .withCuentaOrigen("01234567891011")
                            .withNumOrdenAch("01234567891011")
                            .withCuentaDestino("01234567891011")
                            .withOrigenFondos("01234567891011")
                            .withTitularOriginante("01234567891011")
                            .withCodSucursalOriginante("SUC")
                            .withEtc("01234567891011")
                            .withCodSubDestinatario("01234567891011")
                            .withCodSubOriginante("01234567891011")
                            .withCodServicio("01234567891011")
                            .withCanal("0123456789")
                            .withTipOrden("012")
                            .withCodOriginante("1033")
                            .withGlosa("01234567891011")
                            .withCodPaisOriginante("BO")
                            .withTitularDestinatario("01234567891011")
                            .withTipCuentaDestino("01234567891011")
                            .withImporte("01234567891011")
                            .withNumOrdenOriginante("01234567891011")
                            .withCiNitOriginante("01234567891011")
                            .withTipoDocumento("0123456789")
                            .withCodDestinatario("1017")
                            .withCodMoneda("BOB")
                            .withCodPaisDestinatario("BO")
                            .withTipCuentaOrigen("CMOVILO")
                            .withCodCamara("0")
                            .withCiNitDestinatario("01234567891011")
                            .withFecCamara("0123456789")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        CanonicalReceiveOrder transformation = new TransformACCL2AtoCanonicalReceiveOrder(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCL2ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link CanonicalReceiveOrder }
        *
        */
     @Test
     public void ACCLEXP1ATest() {
         long startTime = System.currentTimeMillis();

        CanonicalReceiveOrder tmpDto = CanonicalReceiveOrder.newCanonicalReceiveOrder()
                            .receiverClientName("01234567891011")
                            .originatorAccountType("CCAO")
                            .amount(new java.math.BigDecimal(100L))
                            .authorizationDescription("01234567891011")
                            .receiverAccountType("01234567891011")
                            .serviceCode("01234567891011")
                            .channel("8")
                            .originatorNumberOrder("01234567891011")
                            .description("01234567891011")
                            .receiverCode("43")
                            .originatorFunds("01234567891011")
                            .originatorClientName("01234567891011")
                            .originatorAccountNumber("01234567891011")
                            .receiverIdentificationNumber("01234567891011")
                            .receiverAccountNumber("01234567891011")
                            .receiverFunds("01234567891011")
                            .originatorIdentificationNumber("01234567891011")
                            .currencyCode("0")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        ACCLEXP1A transformation = new TransformCanonicalReceiveOrdertoACCLEXP1A(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLEXP1ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link ACCLEXP5A }
        *
        */
     @Test
     public void ACCLEXP5ATest() {
         long startTime = System.currentTimeMillis();

        ACCLEXP5A tmpDto = ACCLEXP5A.newACCLEXP5A()
                            .withNumOrdenAch("01234567891011")
                            .withNumOrdenOriginante("01234567891011")
                            .withCodigo("0123")
                            .withCodigoDescripcion("01234567891011")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        CanonicalReceiveOrder transformation = new TransformACCLEXP5AtoCanonicalReceiveOrder(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLEXP5ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link ACCLEXP4A }
        *
        */
     @Test
     public void ACCLEXP4ATest() {
         long startTime = System.currentTimeMillis();

        ACCLEXP4A tmpDto = ACCLEXP4A.newACCLEXP4A()
                            .withDescripcionRespuesta("01234567891011")
                            .withTitularDestinatario("01234567891011")
                            .withNumeroOrdenCamara("01234567891011")
                            .withNumeroOrdenOriginante("01234567891011")
                            .withNumeroOrdenDestinatario("01234567891011")
                            .withCodigoRespuesta("0123")
                            .withSucursalDestinatario("SUC")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        CanonicalReceiveOrder transformation = new TransformACCLEXP4AtoCanonicalReceiveOrder(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLEXP4ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link CanonicalReceiveOrder }
        *
        */
     @Test
     public void ACCLEXP3ATest() {
         long startTime = System.currentTimeMillis();

        CanonicalReceiveOrder tmpDto = CanonicalReceiveOrder.newCanonicalReceiveOrder()
                            .receiverClientName("01234567891011")
                            .receiverNumberOrder("01234567891011")
                            .receiverCountryCode("68")
                            .originatorNumberOrder("01234567891011")
                            .operationType("MOV")
                            .achNumberOrder("01234567891011")
                            .responseCode("0123")
                            .receiverBranchCode("1")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        ACCLEXP3A transformation = new TransformCanonicalReceiveOrdertoACCLEXP3A(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLEXP3ATest() time execution : {0} milliseconds", duration));

     }
     /**
        * Test case validate ACCL Messages {@link ACCLEXP2A }
        *
        */
     @Test
     public void ACCLEXP2ATest() {
         long startTime = System.currentTimeMillis();

        ACCLEXP2A tmpDto = ACCLEXP2A.newACCLEXP2A()
                            .withCiNitOrigen("01234567891011")
                            .withFecCamara("0123456789")
                            .withCodSucursalOriginante("SUC")
                            .withCodOriginante("3003")
                            .withCodMoneda("BOB")
                            .withCodDestinatario("3003")
                            .withTipoCuentaDestino("01234567891011")
                            .withTitularOrigen("01234567891011")
                            .withCodProcedimiento("012")
                            .withCanal("MOV")
                            .withTitularDestino("01234567891011")
                            .withNumOrdenAch("01234567891011")
                            .withOrigenFondos("01234567891011")
                            .withCuentaDestino("01234567891011")
                            .withTipoOrden("012")
                            .withGlosa("01234567891011")
                            .withCodPaisOriginante("BO")
                            .withIdQr("01234567891011")
                            .withImporte("01234567891011")
                            .withNumOrdenOriginante("01234567891011")
                            .withTipoDocumento("0123456789")
                            .withCodPaisDestinatario("BO")
                            .withCiNitDestino("01234567891011")
                            .withCuentaOrigen("01234567891011")
                            .withTipoCuentaOrigen("CCAO")
                            .withDestinoFondos("01234567891011")
                            .withCodServicio("01234567891011")
                        .build();

        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(tmpDto).isEmpty());

        CanonicalReceiveOrder transformation = new TransformACCLEXP2AtoCanonicalReceiveOrder(tmpDto).transform();
        assertTrue(VIOLATIONS_MUST_BE_EMPTY, validateMessage(transformation).isEmpty());

        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(MessageFormat.format("ACCLEXP2ATest() time execution : {0} milliseconds", duration));

     }

	private <T> Collection<ConstraintViolation<T>> validateMessage(T acclMessage) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<T>> violations = validator.validate(acclMessage);
		for (ConstraintViolation<T> v : violations) {
			System.out.println(v.getMessage());
		}
		return violations;

	}



}
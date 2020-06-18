package com.cobiscorp.messagetransformation;

import static org.junit.Assert.assertTrue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import javax.validation.*;
import org.junit.Test;
import com.cobiscorp.accl.messagetransformation.bsl.dto.*;


/**
 * Test cases for ACCL Messages
 *
 * @author Cobiscorp
 */
public class TransformAcclToCanonicalReceiveOrderTest implements Serializable{

     /**
        * Test case validate ACCL Messages {@link AcclACCLMLD1A }
        *
        */
     @Test
     public void AcclACCLMLD1ATest() {
        AcclACCLMLD1A tmpDto = AcclACCLMLD1A.newAcclACCLMLD1A()
                            .withDestinoFondos("01234567891011")
                            .withCodProcedimiento("012")
                            .withCuentaOrigen("01234567891011")
                            .withCuentaDestino("01234567891011")
                            .withOrigenFondos("01234567891011")
                            .withTitularOriginante("01234567891011")
                            .withCodSucursalOriginante("SUC")
                            .withEtc("01234567891011")
                            .withCodSubDestinatario("MLD1018")
                            .withCodSubOriginante("1033")
                            .withCanal("VEN")
                            .withTipOrden("012")
                            .withGlosa("01234567891011")
                            .withCodCompensador("0123")
                            .withCodPaisOriginante("BO")
                            .withTitularDestinatario("01234567891011")
                            .withTipCuentaDestino("01234567891011")
                            .withImporte("01234567891011")
                            .withNumOrdenOriginante("01234567891011")
                            .withCiNitOriginante("01234567891011")
                            .withCodDestinatario("012345678")
                            .withTipoDocumento("0123456789")
                            .withCodMoneda("BOB")
                            .withCodPaisDestinatario("BO")
                            .withTipCuentaOrigen("CCAO")
                            .withCiNitDestinatario("01234567891011")
                            .withFecCamara("0123456789")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCLMLDAR }
        *
        */
     @Test
     public void AcclACCLMLDARTest() {
        AcclACCLMLDAR tmpDto = AcclACCLMLDAR.newAcclACCLMLDAR()
                            .withNumOrdenOriginante("01234567891011")
                            .withErrorMensaje("01234567891011")
                            .withCodCamara("0")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCLMLD1B }
        *
        */
     @Test
     public void AcclACCLMLD1BTest() {
        AcclACCLMLD1B tmpDto = AcclACCLMLD1B.newAcclACCLMLD1B()
                            .withNumOrdenOriginante("01234567891011")
                            .withErrorMensaje("01234567891011")
                            .withCodCamara("0")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCLMLD5A }
        *
        */
     @Test
     public void AcclACCLMLD5ATest() {
        AcclACCLMLD5A tmpDto = AcclACCLMLD5A.newAcclACCLMLD5A()
                            .withNumOrdenOriginante("01234567891011")
                            .withErrorMensaje("01234567891011")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCLMLD4A }
        *
        */
     @Test
     public void AcclACCLMLD4ATest() {
        AcclACCLMLD4A tmpDto = AcclACCLMLD4A.newAcclACCLMLD4A()
                            .withNumOrdenOriginante("01234567891011")
                            .withNumOrdenDestinatario("01234567891011")
                            .withTipOrden("210")
                            .withCodPaisDestinatario("BO")
                            .withNumOrdenAch("01234567891011")
                            .withTitularDestinatario("01234567891011")
                            .withCodRespuesta("0123")
                            .withCodSucursalDestinatario("SUC")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCLMLD3A }
        *
        */
     @Test
     public void AcclACCLMLD3ATest() {
        AcclACCLMLD3A tmpDto = AcclACCLMLD3A.newAcclACCLMLD3A()
                            .withNumOrdenOriginante("01234567891011")
                            .withNumOrdenDestinatario("01234567891011")
                            .withTipOrden("210")
                            .withCodPaisDestinatario("BO")
                            .withNumOrdenAch("01234567891011")
                            .withTitularDestinatario("01234567891011")
                            .withCodRespuesta("0123")
                            .withCodSucursalDestinatario("SUC")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCLMLD3B }
        *
        */
     @Test
     public void AcclACCLMLD3BTest() {
        AcclACCLMLD3B tmpDto = AcclACCLMLD3B.newAcclACCLMLD3B()
                            .withErrorMensaje("01234567891011")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCLMLD2A }
        *
        */
     @Test
     public void AcclACCLMLD2ATest() {
        AcclACCLMLD2A tmpDto = AcclACCLMLD2A.newAcclACCLMLD2A()
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

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCL1A }
        *
        */
     @Test
     public void AcclACCL1ATest() {
        AcclACCL1A tmpDto = AcclACCL1A.newAcclACCL1A()
                            .withDestinoFondos("01234567891011")
                            .withCodProcedimiento("012")
                            .withCuentaOrigen("01234567891011")
                            .withCuentaDestino("01234567891011")
                            .withOrigenFondos("01234567891011")
                            .withTitularOriginante("01234567891011")
                            .withCodSucursalOriginante("SUC")
                            .withEtc("01234567891011")
                            .withCodSubDestinatario("01234567891011")
                            .withCodSubOriginante("01234567891011")
                            .withCanal("VEN")
                            .withTipOrden("012")
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
                            .withCiNitDestinatario("01234567891011")
                            .withFecCamara("0123456789")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCLAR }
        *
        */
     @Test
     public void AcclACCLARTest() {
        AcclACCLAR tmpDto = AcclACCLAR.newAcclACCLAR()
                            .withNumOrdenOriginante("01234567891011")
                            .withErrorMensaje("01234567891011")
                            .withCodCamara("0")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCL1B }
        *
        */
     @Test
     public void AcclACCL1BTest() {
        AcclACCL1B tmpDto = AcclACCL1B.newAcclACCL1B()
                            .withNumOrdenOriginante("01234567891011")
                            .withErrorMensaje("01234567891011")
                            .withCodCamara("0")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCL5A }
        *
        */
     @Test
     public void AcclACCL5ATest() {
        AcclACCL5A tmpDto = AcclACCL5A.newAcclACCL5A()
                            .withNumOrdenOriginante("01234567891011")
                            .withErrorMensaje("01234567891011")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCL4A }
        *
        */
     @Test
     public void AcclACCL4ATest() {
        AcclACCL4A tmpDto = AcclACCL4A.newAcclACCL4A()
                            .withNumOrdenOriginante("01234567891011")
                            .withNumOrdenDestinatario("01234567891011")
                            .withTipOrden("250")
                            .withCodPaisDestinatario("BO")
                            .withNumOrdenAch("01234567891011")
                            .withTitularDestinatario("01234567891011")
                            .withCodRespuesta("0123")
                            .withCodSucursalDestinatario("SUC")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCL3A }
        *
        */
     @Test
     public void AcclACCL3ATest() {
        AcclACCL3A tmpDto = AcclACCL3A.newAcclACCL3A()
                            .withNumOrdenOriginante("01234567891011")
                            .withNumOrdenDestinatario("01234567891011")
                            .withTipOrden("250")
                            .withCodPaisDestinatario("BO")
                            .withNumOrdenAch("01234567891011")
                            .withTitularDestinatario("01234567891011")
                            .withCodRespuesta("0123")
                            .withCodSucursalDestinatario("SUC")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCL3B }
        *
        */
     @Test
     public void AcclACCL3BTest() {
        AcclACCL3B tmpDto = AcclACCL3B.newAcclACCL3B()
                            .withErrorMensaje("01234567891011")
                            .withNumOrdenAch("01234567891011")
                            .withError("0123")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCL2A }
        *
        */
     @Test
     public void AcclACCL2ATest() {
        AcclACCL2A tmpDto = AcclACCL2A.newAcclACCL2A()
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

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCLEXP1A }
        *
        */
     @Test
     public void AcclACCLEXP1ATest() {
        AcclACCLEXP1A tmpDto = AcclACCLEXP1A.newAcclACCLEXP1A()
                            .withOrigenFondos("01234567891011")
                            .withCiNitOrigen("01234567891011")
                            .withCuentaDestino("01234567891011")
                            .withGlosa("01234567891011")
                            .withNumeroOrdenOriginante("01234567891011")
                            .withIdQr("01234567891011")
                            .withImporte("01234567891011")
                            .withCiNitDestino("01234567891011")
                            .withCodMoneda("BOB")
                            .withCodDestinatario("3003")
                            .withTipoCuentaDestino("01234567891011")
                            .withCuentaOrigen("01234567891011")
                            .withTipoCuentaOrigen("CCAO")
                            .withDestinoFondos("01234567891011")
                            .withTitularOrigen("01234567891011")
                            .withCanal("MOV")
                            .withTitularDestino("01234567891011")
                            .withCodServicio("01234567891011")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCLEXP5A }
        *
        */
     @Test
     public void AcclACCLEXP5ATest() {
        AcclACCLEXP5A tmpDto = AcclACCLEXP5A.newAcclACCLEXP5A()
                            .withNumOrdenAch("01234567891011")
                            .withNumOrdenOriginante("01234567891011")
                            .withCodigo("0123")
                            .withCodigoDescripcion("01234567891011")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCLEXP4A }
        *
        */
     @Test
     public void AcclACCLEXP4ATest() {
        AcclACCLEXP4A tmpDto = AcclACCLEXP4A.newAcclACCLEXP4A()
                            .withDescripcionRespuesta("01234567891011")
                            .withTitularDestinatario("01234567891011")
                            .withNumeroOrdenCamara("01234567891011")
                            .withNumeroOrdenOriginante("01234567891011")
                            .withNumeroOrdenDestinatario("01234567891011")
                            .withCodigoRespuesta("0123")
                            .withSucursalDestinatario("SUC")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCLEXP3A }
        *
        */
     @Test
     public void AcclACCLEXP3ATest() {
        AcclACCLEXP3A tmpDto = AcclACCLEXP3A.newAcclACCLEXP3A()
                            .withNumOrdenOriginante("01234567891011")
                            .withNumOrdenDestinatario("01234567891011")
                            .withTipOrden("250")
                            .withCodPaisDestinatario("BO")
                            .withNumOrdenAch("01234567891011")
                            .withTitularDestinatario("01234567891011")
                            .withCodRespuesta("0123")
                            .withCodSucursalDestinatario("SUC")
                        .build();

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

     }
     /**
        * Test case validate ACCL Messages {@link AcclACCLEXP2A }
        *
        */
     @Test
     public void AcclACCLEXP2ATest() {
        AcclACCLEXP2A tmpDto = AcclACCLEXP2A.newAcclACCLEXP2A()
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

        assertTrue("Violations must be empty", validateMessage(tmpDto).isEmpty());

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
package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to ACCLEXP2A into CanonicalReceiveOrder
 *
 * @author Cobiscorp
 */
public class TransformACCLEXP2AtoCanonicalReceiveOrder
implements ITransformation<ACCLEXP2A, CanonicalReceiveOrder> {

    private ACCLEXP2A s;

    public TransformACCLEXP2AtoCanonicalReceiveOrder(ACCLEXP2A s){
        this.s = s;
    }

    /**
    * Execute transformation to ACCLEXP2A into CanonicalReceiveOrder
    * @param s ACCLEXP2A
    * @return CanonicalReceiveOrder
    */
	@Override
    public CanonicalReceiveOrder transform() {

		return CanonicalReceiveOrder
				.newCanonicalReceiveOrder()
				.receiverClientName(this.s.getTitularDestino())//V
				.originatorAccountType(EqACCLEXP2A.tipoCuentaOrigen(this.s.getTipoCuentaOrigen()))//C
				.authorizationDescription(this.s.getIdQr())//V
				.documentType(this.s.getTipoDocumento())//P
				.procedureCode(this.s.getCodProcedimiento())//H
				.serviceCode(this.s.getCodServicio())//V
				.originatorBranchCode(EqACCLEXP2A.codSucursalOriginante(this.s.getCodSucursalOriginante()))//C
				.originatorNumberOrder(this.s.getNumOrdenOriginante())//V
				.channel(EqACCLEXP2A.canal(this.s.getCanal()))//C
				.description(this.s.getGlosa())//V
				.receiverCode(EqACCLEXP2A.codDestinatario(this.s.getCodDestinatario()))//C
				.originatorAccountNumber(this.s.getCuentaOrigen())//V
				.receiverIdentificationNumber(this.s.getCiNitDestino())//V
				.receiverAccountNumber(this.s.getCuentaDestino())//V
				.amount(new java.math.BigDecimal(this.s.getImporte()))//V
				.receiverAccountType(this.s.getTipoCuentaDestino())//H
				.receiverCountryCode(EqACCLEXP2A.codPaisDestinatario(this.s.getCodPaisDestinatario()))//C
				.originatorCode(EqACCLEXP2A.codOriginante(this.s.getCodOriginante()))//C
				.originatorFunds(this.s.getOrigenFondos())//V
				.originatorClientName(this.s.getTitularOrigen())//V
				.originatorCountryCode(EqACCLEXP2A.codPaisOriginante(this.s.getCodPaisOriginante()))//C
				.operationType(EqACCLEXP2A.tipoOrden(this.s.getTipoOrden()))//C
				.receiverFunds(this.s.getDestinoFondos())//V
				.houseDate(this.s.getFecCamara())//V
				.achNumberOrder(this.s.getNumOrdenAch())//V
				.originatorIdentificationNumber(this.s.getCiNitOrigen())//V
				.currencyCode(EqACCLEXP2A.codMoneda(this.s.getCodMoneda()))//C
				.build();

    }


}

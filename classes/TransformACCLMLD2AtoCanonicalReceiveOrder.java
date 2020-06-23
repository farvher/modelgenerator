package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to ACCLMLD2A into CanonicalReceiveOrder
 *
 * @author Cobiscorp
 */
public class TransformACCLMLD2AtoCanonicalReceiveOrder
implements ITransformation<ACCLMLD2A, CanonicalReceiveOrder> {

    private ACCLMLD2A s;

    public TransformACCLMLD2AtoCanonicalReceiveOrder(ACCLMLD2A s){
        this.s = s;
    }

    /**
    * Execute transformation to ACCLMLD2A into CanonicalReceiveOrder
    * @param s ACCLMLD2A
    * @return CanonicalReceiveOrder
    */
	@Override
    public CanonicalReceiveOrder transform() {

		return CanonicalReceiveOrder
				.newCanonicalReceiveOrder()
				.receiverClientName(this.s.getTitularDestinatario())//V
				.originatorAccountType(EqACCLMLD2A.tipCuentaOrigen(this.s.getTipCuentaOrigen()))//C
				.subReceiverCode(this.s.getCodDestinatario())//V
				.documentType(this.s.getTipoDocumento())//P
				.procedureCode(this.s.getCodProcedimiento())//H
				.originatorBranchCode(EqACCLMLD2A.codSucursalOriginante(this.s.getCodSucursalOriginante()))//C
				.channel(EqACCLMLD2A.canal(this.s.getCanal()))//C
				.originatorNumberOrder(this.s.getNumOrdenOriginante())//V
				.description(this.s.getGlosa())//V
				.receiverCode(EqACCLMLD2A.codSubDestinatario(this.s.getCodSubDestinatario()))//C
				.etc(this.s.getEtc())//V
				.originatorAccountNumber(this.s.getCuentaOrigen())//V
				.receiverIdentificationNumber(this.s.getCiNitDestinatario())//V
				.receiverAccountNumber(this.s.getCuentaDestino())//V
				.amount(new java.math.BigDecimal(this.s.getImporte()))//V
				.receiverAccountType(this.s.getTipCuentaDestino())//H
				.receiverCountryCode(EqACCLMLD2A.codPaisDestinatario(this.s.getCodPaisDestinatario()))//C
				.originatorCode(EqACCLMLD2A.codSubOriginante(this.s.getCodSubOriginante()))//C
				.sentOrderType(this.s.getTipOrden())//H
				.originatorFunds(this.s.getOrigenFondos())//V
				.originatorClientName(this.s.getTitularOriginante())//V
				.houseCode(this.s.getCodCamara())//V
				.originatorCountryCode(EqACCLMLD2A.codPaisOriginante(this.s.getCodPaisOriginante()))//C
				.receiverFunds(this.s.getDestinoFondos())//V
				.houseDate(this.s.getFecCamara())//V
				.achNumberOrder(this.s.getNumOrdenAch())//V
				.originatorIdentificationNumber(this.s.getCiNitOriginante())//V
				.currencyCode(EqACCLMLD2A.codMoneda(this.s.getCodMoneda()))//C
				.build();

    }


}

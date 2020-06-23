package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to CanonicalReceiveOrder into ACCLMLD1A
 *
 * @author Cobiscorp
 */
public class TransformACCLMLD1AtoCanonicalReceiveOrder
implements ITransformation<CanonicalReceiveOrder, ACCLMLD1A> {

    private CanonicalReceiveOrder s;

    public TransformACCLMLD1AtoCanonicalReceiveOrder(CanonicalReceiveOrder s){
        this.s = s;
    }

    /**
    * Execute transformation to CanonicalReceiveOrder into ACCLMLD1A
    * @param s CanonicalReceiveOrder
    * @return ACCLMLD1A
    */
	@Override
    public ACCLMLD1A transform() {

		return ACCLMLD1A
				.newACCLMLD1A()
				.withTitularDestinatario(this.s.getReceiverClientName())//V
				.withTipCuentaOrigen(EqACCLMLD1A.originatorAccountType(this.s.getOriginatorAccountType()))//C
				.withTipoDocumento(this.s.getDocumentType())//P
				.withCodProcedimiento(this.s.getProcedureCode())//H
				.withCodSucursalOriginante(EqACCLMLD1A.originatorBranchCode(this.s.getOriginatorBranchCode()))//C
				.withCanal(EqACCLMLD1A.channel(this.s.getChannel()))//C
				.withNumOrdenOriginante(this.s.getOriginatorNumberOrder())//V
				.withGlosa(this.s.getDescription())//V
				.withCodSubDestinatario(EqACCLMLD1A.receiverCode(this.s.getReceiverCode()))//C
				.withEtc(this.s.getEtc())//V
				.withCuentaOrigen(this.s.getOriginatorAccountNumber())//V
				.withCiNitDestinatario(this.s.getReceiverIdentificationNumber())//V
				.withCuentaDestino(this.s.getReceiverAccountNumber())//V
				.withCodCompensador(this.s.getCompensatorCode())//P
				.withImporte(this.s.getAmount().toPlainString())//V
				.withTipCuentaDestino(this.s.getReceiverAccountType())//H
				.withCodPaisDestinatario(EqACCLMLD1A.receiverCountryCode(this.s.getReceiverCountryCode()))//C
				.withCodSubOriginante(EqACCLMLD1A.originatorCode(this.s.getOriginatorCode()))//C
				.withTipOrden(this.s.getSentOrderType())//H
				.withOrigenFondos(this.s.getOriginatorFunds())//V
				.withTitularOriginante(this.s.getOriginatorClientName())//V
				.withCodDestinatario(this.s.getReceiverSubVaultCode())//P
				.withCodPaisOriginante(EqACCLMLD1A.originatorCountryCode(this.s.getOriginatorCountryCode()))//C
				.withDestinoFondos(this.s.getReceiverFunds())//V
				.withFecCamara(this.s.getHouseDate())//V
				.withCiNitOriginante(this.s.getOriginatorIdentificationNumber())//V
				.withCodMoneda(EqACCLMLD1A.currencyCode(this.s.getCurrencyCode()))//C
				.build();

    }


}

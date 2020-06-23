package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to CanonicalReceiveOrder into ACCLEXP1A
 *
 * @author Cobiscorp
 */
public class TransformACCLEXP1AtoCanonicalReceiveOrder
implements ITransformation<CanonicalReceiveOrder, ACCLEXP1A> {

    private CanonicalReceiveOrder s;

    public TransformACCLEXP1AtoCanonicalReceiveOrder(CanonicalReceiveOrder s){
        this.s = s;
    }

    /**
    * Execute transformation to CanonicalReceiveOrder into ACCLEXP1A
    * @param s CanonicalReceiveOrder
    * @return ACCLEXP1A
    */
	@Override
    public ACCLEXP1A transform() {

		return ACCLEXP1A
				.newACCLEXP1A()
				.withTitularDestino(this.s.getReceiverClientName())//V
				.withTipoCuentaOrigen(EqACCLEXP1A.originatorAccountType(this.s.getOriginatorAccountType()))//C
				.withImporte(this.s.getAmount().toPlainString())//V
				.withIdQr(this.s.getAuthorizationDescription())//V
				.withTipoCuentaDestino(this.s.getReceiverAccountType())//H
				.withCodServicio(this.s.getServiceCode())//V
				.withCanal(EqACCLEXP1A.channel(this.s.getChannel()))//C
				.withNumeroOrdenOriginante(this.s.getOriginatorNumberOrder())//V
				.withGlosa(this.s.getDescription())//V
				.withCodDestinatario(EqACCLEXP1A.receiverCode(this.s.getReceiverCode()))//C
				.withOrigenFondos(this.s.getOriginatorFunds())//V
				.withTitularOrigen(this.s.getOriginatorClientName())//V
				.withCuentaOrigen(this.s.getOriginatorAccountNumber())//V
				.withCiNitDestino(this.s.getReceiverIdentificationNumber())//V
				.withCuentaDestino(this.s.getReceiverAccountNumber())//V
				.withDestinoFondos(this.s.getReceiverFunds())//V
				.withCiNitOrigen(this.s.getOriginatorIdentificationNumber())//V
				.withCodMoneda(EqACCLEXP1A.currencyCode(this.s.getCurrencyCode()))//C
				.build();

    }


}

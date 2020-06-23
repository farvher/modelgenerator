package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to CanonicalReceiveOrder into ACCLMLD3A
 *
 * @author Cobiscorp
 */
public class TransformACCLMLD3AtoCanonicalReceiveOrder
implements ITransformation<CanonicalReceiveOrder, ACCLMLD3A> {

    private CanonicalReceiveOrder s;

    public TransformACCLMLD3AtoCanonicalReceiveOrder(CanonicalReceiveOrder s){
        this.s = s;
    }

    /**
    * Execute transformation to CanonicalReceiveOrder into ACCLMLD3A
    * @param s CanonicalReceiveOrder
    * @return ACCLMLD3A
    */
	@Override
    public ACCLMLD3A transform() {

		return ACCLMLD3A
				.newACCLMLD3A()
				.withTitularDestinatario(this.s.getReceiverClientName())//V
				.withNumOrdenDestinatario(this.s.getReceiverNumberOrder())//V
				.withCodPaisDestinatario(EqACCLMLD3A.receiverCountryCode(this.s.getReceiverCountryCode()))//C
				.withNumOrdenOriginante(this.s.getOriginatorNumberOrder())//V
				.withTipOrden(EqACCLMLD3A.operationType(this.s.getOperationType()))//C
				.withNumOrdenAch(this.s.getAchNumberOrder())//V
				.withCodRespuesta(this.s.getResponseCode())//P-C
				.withCodSucursalDestinatario(EqACCLMLD3A.receiverBranchCode(this.s.getReceiverBranchCode()))//C
				.build();

    }


}

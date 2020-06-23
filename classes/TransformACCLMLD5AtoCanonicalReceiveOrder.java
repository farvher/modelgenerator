package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to ACCLMLD5A into CanonicalReceiveOrder
 *
 * @author Cobiscorp
 */
public class TransformACCLMLD5AtoCanonicalReceiveOrder
implements ITransformation<ACCLMLD5A, CanonicalReceiveOrder> {

    private ACCLMLD5A s;

    public TransformACCLMLD5AtoCanonicalReceiveOrder(ACCLMLD5A s){
        this.s = s;
    }

    /**
    * Execute transformation to ACCLMLD5A into CanonicalReceiveOrder
    * @param s ACCLMLD5A
    * @return CanonicalReceiveOrder
    */
	@Override
    public CanonicalReceiveOrder transform() {

		return CanonicalReceiveOrder
				.newCanonicalReceiveOrder()
				.responseDescription(this.s.getErrorMensaje())//V
				.originatorNumberOrder(this.s.getNumOrdenOriginante())//V
				.achNumberOrder(this.s.getNumOrdenAch())//V
				.responseCode(this.s.getError())//P-C
				.build();

    }


}

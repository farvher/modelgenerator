package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to ACCLMLD1B into CanonicalReceiveOrder
 *
 * @author Cobiscorp
 */
public class TransformACCLMLD1BtoCanonicalReceiveOrder
implements ITransformation<ACCLMLD1B, CanonicalReceiveOrder> {

    private ACCLMLD1B s;

    public TransformACCLMLD1BtoCanonicalReceiveOrder(ACCLMLD1B s){
        this.s = s;
    }

    /**
    * Execute transformation to ACCLMLD1B into CanonicalReceiveOrder
    * @param s ACCLMLD1B
    * @return CanonicalReceiveOrder
    */
	@Override
    public CanonicalReceiveOrder transform() {

		return CanonicalReceiveOrder
				.newCanonicalReceiveOrder()
				.responseDescription(this.s.getErrorMensaje())//V
				.houseCode(this.s.getCodCamara())//V
				.originatorNumberOrder(this.s.getNumOrdenOriginante())//V
				.achNumberOrder(this.s.getNumOrdenAch())//V
				.responseCode(this.s.getError())//P-C
				.build();

    }


}

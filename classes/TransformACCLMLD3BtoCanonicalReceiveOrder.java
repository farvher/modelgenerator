package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to ACCLMLD3B into CanonicalReceiveOrder
 *
 * @author Cobiscorp
 */
public class TransformACCLMLD3BtoCanonicalReceiveOrder
implements ITransformation<ACCLMLD3B, CanonicalReceiveOrder> {

    private ACCLMLD3B s;

    public TransformACCLMLD3BtoCanonicalReceiveOrder(ACCLMLD3B s){
        this.s = s;
    }

    /**
    * Execute transformation to ACCLMLD3B into CanonicalReceiveOrder
    * @param s ACCLMLD3B
    * @return CanonicalReceiveOrder
    */
	@Override
    public CanonicalReceiveOrder transform() {

		return CanonicalReceiveOrder
				.newCanonicalReceiveOrder()
				.responseDescription(this.s.getErrorMensaje())//V
				.achNumberOrder(this.s.getNumOrdenAch())//V
				.responseCode(this.s.getError())//P-C
				.build();

    }


}

package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to ACCL3B into CanonicalReceiveOrder
 *
 * @author Cobiscorp
 */
public class TransformACCL3BtoCanonicalReceiveOrder
implements ITransformation<ACCL3B, CanonicalReceiveOrder> {

    private ACCL3B s;

    public TransformACCL3BtoCanonicalReceiveOrder(ACCL3B s){
        this.s = s;
    }

    /**
    * Execute transformation to ACCL3B into CanonicalReceiveOrder
    * @param s ACCL3B
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

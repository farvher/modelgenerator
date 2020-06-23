package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to CanonicalReceiveOrder into ACCLAR
 *
 * @author Cobiscorp
 */
public class TransformACCLARtoCanonicalReceiveOrder
implements ITransformation<CanonicalReceiveOrder, ACCLAR> {

    private CanonicalReceiveOrder s;

    public TransformACCLARtoCanonicalReceiveOrder(CanonicalReceiveOrder s){
        this.s = s;
    }

    /**
    * Execute transformation to CanonicalReceiveOrder into ACCLAR
    * @param s CanonicalReceiveOrder
    * @return ACCLAR
    */
	@Override
    public ACCLAR transform() {

		return ACCLAR
				.newACCLAR()
				.withErrorMensaje(this.s.getResponseDescription())//V
				.withCodCamara(this.s.getHouseCode())//V
				.withNumOrdenOriginante(this.s.getOriginatorNumberOrder())//V
				.withNumOrdenAch(this.s.getAchNumberOrder())//V
				.withError(this.s.getResponseCode())//P-C
				.build();

    }


}

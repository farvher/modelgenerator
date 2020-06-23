package com.cobiscorp.accl.messagetransformation.bsl.impl;

import com.cobiscorp.accl.messagetransformation.bsl.dto.*;
import com.cobiscorp.accl.messagetransformation.bsl.impl.equivalence.*;
import com.cobiscorp.messagetransformation.bsl.dto.CanonicalReceiveOrder;

/**
 * Representation of the transformation to CanonicalReceiveOrder into ACCLMLDAR
 *
 * @author Cobiscorp
 */
public class TransformACCLMLDARtoCanonicalReceiveOrder
implements ITransformation<CanonicalReceiveOrder, ACCLMLDAR> {

    private CanonicalReceiveOrder s;

    public TransformACCLMLDARtoCanonicalReceiveOrder(CanonicalReceiveOrder s){
        this.s = s;
    }

    /**
    * Execute transformation to CanonicalReceiveOrder into ACCLMLDAR
    * @param s CanonicalReceiveOrder
    * @return ACCLMLDAR
    */
	@Override
    public ACCLMLDAR transform() {

		return ACCLMLDAR
				.newACCLMLDAR()
				.withErrorMensaje(this.s.getResponseDescription())//V
				.withCodCamara(this.s.getHouseCode())//V
				.withNumOrdenOriginante(this.s.getOriginatorNumberOrder())//V
				.withNumOrdenAch(this.s.getAchNumberOrder())//V
				.withError(this.s.getResponseCode())//P-C
				.build();

    }


}

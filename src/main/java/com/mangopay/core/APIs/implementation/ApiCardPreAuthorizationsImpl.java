package com.mangopay.core.APIs.implementation;

import com.mangopay.MangoPayApi;
import com.mangopay.core.APIs.ApiBase;
import com.mangopay.core.APIs.declaration.ApiCardPreAuthorizations;
import com.mangopay.entities.CardPreAuthorization;

/**
 * API for card pre-authorizations.
 */
public class ApiCardPreAuthorizationsImpl extends ApiBase implements ApiCardPreAuthorizations {

    /**
     * Instantiates new ApiCardPreAuthorizationsImpl object.
     *
     * @param root Root/parent instance that holds the OAuthToken and Configuration instance.
     */
    public ApiCardPreAuthorizationsImpl(MangoPayApi root) {
        super(root);
    }

    @Override
    public CardPreAuthorization create(CardPreAuthorization cardPreAuthorization) throws Exception {
        return this.create(null, cardPreAuthorization);
    }

    @Override
    public CardPreAuthorization create(String idempotencyKey, CardPreAuthorization cardPreAuthorization) throws Exception {
        return this.createObject(CardPreAuthorization.class, idempotencyKey, "preauthorization_create", cardPreAuthorization);
    }

    @Override
    public CardPreAuthorization get(String cardPreAuthorizationId) throws Exception {
        return this.getObject(CardPreAuthorization.class, "preauthorization_get", cardPreAuthorizationId);
    }

    @Override
    public CardPreAuthorization update(CardPreAuthorization cardPreAuthorization) throws Exception {
        return this.updateObject(CardPreAuthorization.class, "preauthorization_save", cardPreAuthorization);
    }
}

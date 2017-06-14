package com.xero.api;

import java.io.InputStream;

public interface Config {

    String getAppType();

    String getPrivateKeyPassword();

    String getPathToPrivateKey();

    String getConsumerKey();

    String getConsumerSecret();

    String getApiUrl();

    String getRequestTokenUrl();

    String getAuthorizeUrl();

    String getAccessTokenUrl();

    String getUserAgent();

    String getAccept();

    String getRedirectUri();

    InputStream getPrivateKeyCert();
    
    int getConnectTimeout();
    
    // in seconds
    void setConnectTimeout(int connectTimeout);

}

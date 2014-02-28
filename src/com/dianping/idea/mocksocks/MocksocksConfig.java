package com.dianping.idea.mocksocks;

/**
 * @author yihua.huang@dianping.com
 */
public class MocksocksConfig {

    private boolean proxyOn = false;

    private MocksocksConfig() {
    }

    private static final MocksocksConfig INSTANCE = new MocksocksConfig();

    public static MocksocksConfig instance() {
        return INSTANCE;
    }

    public boolean isProxyOn() {
        return proxyOn;
    }

    public void setProxyOn(boolean proxyOn) {
        this.proxyOn = proxyOn;
    }
}

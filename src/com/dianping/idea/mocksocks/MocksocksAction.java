package com.dianping.idea.mocksocks;

import com.dianping.mocksocks.gui.gui.MocksocksDashboard;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author yihua.huang@dianping.com
 */
public class MocksocksAction extends AnAction {

    private MocksocksConfig mocksocksConfig = MocksocksConfig.instance();

    @Override
    public void actionPerformed(AnActionEvent e) {
        MocksocksDashboard mocksocksDashboard = new MocksocksDashboard();
        mocksocksDashboard.addClosingHandler(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                mocksocksConfig.setProxyOn(false);
            }
        });
    }

}

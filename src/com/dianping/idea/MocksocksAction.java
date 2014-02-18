package com.dianping.idea;

import com.dianping.mocksocks.gui.gui.Main;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * @author yihua.huang@dianping.com
 */
public class MocksocksAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Main.main(null);
    }
}

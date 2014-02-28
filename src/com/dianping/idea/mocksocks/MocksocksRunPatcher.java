package com.dianping.idea.mocksocks;

import com.intellij.execution.Executor;
import com.intellij.execution.configurations.JavaParameters;
import com.intellij.execution.configurations.ParametersList;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.runners.JavaProgramPatcher;
import com.intellij.ide.plugins.IdeaPluginDescriptor;
import com.intellij.ide.plugins.PluginManager;
import org.apache.commons.lang3.StringUtils;

import java.io.File;

/**
 * @author yihua.huang@dianping.com
 */
public class MocksocksRunPatcher extends JavaProgramPatcher {

    private MocksocksConfig mocksocksConfig = MocksocksConfig.instance();

    @Override
    public void patchJavaParameters(Executor executor, RunProfile configuration, JavaParameters javaParameters) {
        if (mocksocksConfig.isProxyOn()) {
            IdeaPluginDescriptor plugin = PluginManager.getPlugin(PluginManager.getPluginByClassName(getClass().getName()));
            String clientJarPath = StringUtils.join(new String[]{plugin.getPath().getAbsolutePath(), "lib", "mocksocks-client.jar"}, File.separator);
            ParametersList vmParametersList = javaParameters.getVMParametersList();
            vmParametersList
                    .add("-javaagent:" + clientJarPath);
            vmParametersList
                    .add("-DmockFile=" + clientJarPath);
        }
    }
}

package com.dianping.idea.mocksocks;

import com.intellij.execution.Executor;
import com.intellij.execution.configurations.JavaParameters;
import com.intellij.execution.configurations.ParametersList;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.runners.JavaProgramPatcher;

/**
 * @author yihua.huang@dianping.com
 */
public class MocksocksRunPatcher extends JavaProgramPatcher {

    private MocksocksConfig mocksocksConfig = MocksocksConfig.instance();

	@Override
	public void patchJavaParameters(Executor executor, RunProfile configuration, JavaParameters javaParameters) {
        if (mocksocksConfig.isProxyOn()) {
			ParametersList vmParametersList = javaParameters.getVMParametersList();
			vmParametersList
					.add("-javaagent:/usr/local/mocksocks/client.jar");
			vmParametersList
					.add("-DmockFile=/usr/local/mocksocks/client.jar");
		}
	}
}

package rocks.inspectit.agent.java.sensor.platform.provider.def;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

import rocks.inspectit.agent.java.sensor.platform.provider.ThreadInfoProvider;

/**
 * Uses the {@link java.lang.management.ThreadMXBean} in order to retrieve all needed information.
 * 
 * @author Eduard Tudenhoefner
 * 
 */
public class DefaultThreadInfoProvider implements ThreadInfoProvider {
	/**
	 * The MXBean used to retrieve information from the thread system.
	 */
	private ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();

	/**
	 * {@inheritDoc}
	 */
	public int getThreadCount() {
		return threadBean.getThreadCount();
	}

	/**
	 * {@inheritDoc}
	 */
	public int getPeakThreadCount() {
		return threadBean.getPeakThreadCount();
	}

	/**
	 * {@inheritDoc}
	 */
	public long getTotalStartedThreadCount() {
		return threadBean.getTotalStartedThreadCount();
	}

	/**
	 * {@inheritDoc}
	 */
	public int getDaemonThreadCount() {
		return threadBean.getDaemonThreadCount();
	}

}

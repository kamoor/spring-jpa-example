package com.nube.core.util.jvm;

import java.lang.management.ManagementFactory;

import org.apache.log4j.Logger;

/**
 * All JVM, Server Status util methods goes here
 * 
 * @author kamoorr
 * @version 1.0
 * 
 */
public class JVMStatus {

	static Logger logger = Logger.getLogger(JVMStatus.class);

	/**
	 * Print JVM Status
	 */
	public static void printJVMStatus() {
		printMemory();
		// Add more later

	}

	/**
	 * Print current memory status
	 */
	public static void printMemory() {
		if (logger.isDebugEnabled()) {
			logger.debug(getMemory());
		}

	}

	/**
	 * Return current jvm memory status
	 * 
	 * @return
	 */
	public static String getMemory() {

		StringBuilder buffer = new StringBuilder();
		ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();

		buffer.append("MEMORY STAT:");
		buffer.append("Total = ");
		buffer.append(Runtime.getRuntime().totalMemory());
		buffer.append(", Max = ");
		buffer.append(Runtime.getRuntime().maxMemory());
		buffer.append(", Free = ");
		buffer.append(Runtime.getRuntime().freeMemory());
		buffer.append(", Heap = ");
		buffer.append(ManagementFactory.getMemoryMXBean().getHeapMemoryUsage());
		buffer.append(", NonHeap = ");
		buffer.append(ManagementFactory.getMemoryMXBean()
				.getNonHeapMemoryUsage());
		return buffer.toString();

	}

}

package com.inmobi.messaging;

import com.inmobi.instrumentation.TimingAccumulator;


public interface MessagePublisherMXBean {
	TimingAccumulator getStats();
}

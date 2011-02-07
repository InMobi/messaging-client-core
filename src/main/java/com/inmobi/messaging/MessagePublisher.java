package com.inmobi.messaging;

import java.util.List;


public interface MessagePublisher {
	
	public void publish(Message m);
	
	public MessagePublisherMXBean getInspector();

}

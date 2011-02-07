package com.inmobi.messaging;

import java.util.List;

public interface MultiplexedMessagePublisher extends MessagePublisher {
	public void publish(List<Message> l);
}

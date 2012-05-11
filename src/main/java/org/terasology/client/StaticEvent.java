package org.terasology.client;

import org.terasology.entitySystem.AbstractEvent;
import org.terasology.entitySystem.EntityRef;


public class StaticEvent extends AbstractEvent {
	public void reset() {
	}
	public EntityRef getEntity() {
		return null;
	}
	public static StaticEvent makeEvent(String mod, String eventName) {
		StaticEvent event = new StaticEvent() {{}};
		return event;
	}
}

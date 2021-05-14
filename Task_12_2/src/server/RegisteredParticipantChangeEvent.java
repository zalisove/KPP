package server;

import java.util.EventObject;

public class RegisteredParticipantChangeEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public RegisteredParticipantChangeEvent(Object source) {
        super(source);
    }
}

package com.imagisekai.simpleevent;

/**
 * Represents the base class for classes that contain event data, and provides a
 * value to use for events that do not include event data.
 */
public class EventArgs {
    private EventArgs() {}

    /**
     * Provides a value to use with events that do not have event data.
     */
    public static EventArgs Empty = new EventArgs();
}

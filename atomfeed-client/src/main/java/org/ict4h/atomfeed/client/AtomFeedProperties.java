package org.ict4h.atomfeed.client;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class AtomFeedProperties {
    private int readTimeout = 20000;
    private int connectTimeout = 10000;
    private boolean controlsEventProcessing = true;
    private int maxFailedEvents = 5;

    private static Logger logger = LogManager.getLogger(AtomFeedProperties.class);

    public int getReadTimeout() {
        return readTimeout;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        if (readTimeout == 0)
            logger.warn("Setting readTimeout to zero. WebClient would wait infinitely to read");
        this.readTimeout = readTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        if (connectTimeout == 0)
            logger.warn("Setting connectTimeout to zero. WebClient would wait infinitely to connect.");
        this.connectTimeout = connectTimeout;
    }

    public void setControlsEventProcessing(boolean value) {
        this.controlsEventProcessing = value;
    }

    public boolean controlsEventProcessing() {
        return controlsEventProcessing;
    }

    public int getMaxFailedEvents() {
        return maxFailedEvents;
    }

    public void setMaxFailedEvents(int maxFailedEvents) {
        this.maxFailedEvents = maxFailedEvents;
    }
}

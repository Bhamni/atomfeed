package org.ict4h.atomfeed.server.domain.chunking;

import javax.persistence.*;

@Entity
@Table(name ="chunking_history")
public class ChunkingHistoryEntry {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sequenceNumber;

    @Column(name = "interval")
    private Long interval;

    @Column(name = "start")
    private Long leftBound;

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public Long getInterval() {
        return interval;
    }

    public Long getLeftBound() {
        return leftBound;
    }
}
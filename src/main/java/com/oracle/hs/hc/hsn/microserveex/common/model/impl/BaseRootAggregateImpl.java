/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex.common.model.impl;

import com.oracle.hs.hc.hsn.microserveex.Event;
import com.oracle.hs.hc.hsn.microserveex.EventPublisher;
import com.oracle.hs.hc.hsn.microserveex.EventStore;
import com.oracle.hs.hc.hsn.microserveex.RootAggregate;


public abstract class BaseRootAggregateImpl<Long, E extends Event> implements RootAggregate<Long,E> {
    private Long aggId;
    
    private EventPublisher<E> publisher;
    
    protected BaseRootAggregateImpl(BaseRootAggregateImpl.Builder<Long,E> builder) {
        this.aggId = builder.Long;
        this.publisher = builder.publisher;
    }
    public static abstract class Builder<Long,E extends Event> {
        private Long Long;
        private EventPublisher<E> publisher;
        
        public Builder(Long Long) {
            this.Long = Long;
        }
        
        
        public RootAggregate<Long, E> build()  {
            publisher = EventStore.createEventStore();
            return this.createAggregate();
        }

        public abstract RootAggregate<Long, E> createAggregate();
    }
        
    public BaseRootAggregateImpl(Long id, EventPublisher<E> publisher) {
        this.aggId = id;
        this.publisher = publisher;
        
    }
    @Override
    public Long getAggregateId() {
        return this.aggId;
    }

    @Override
    public EventPublisher<E> getEventPublisher() {
        return this.publisher;
    }

    
}

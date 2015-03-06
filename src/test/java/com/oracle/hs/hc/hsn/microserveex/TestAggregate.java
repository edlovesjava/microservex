/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.hs.hc.hsn.microserveex;

import com.oracle.hs.hc.hsn.microserveex.common.model.impl.BaseRootAggregateImpl;

/**
 *
 * @author edlovesjava
 */
public class TestAggregate extends BaseRootAggregateImpl<Long, TestEvent> implements RootAggregate<Long, TestEvent>, TestCommandHandler {

    private TestAggregate(Builder aThis) {
        super(aThis);
    }
    
    static class Builder extends BaseRootAggregateImpl.Builder<Long, TestEvent> {

        public Builder(java.lang.Long id) {
            super(id);
        }

        @Override
        public RootAggregate createAggregate() {
            return new TestAggregate(this);
        }
        
    }

    public TestAggregate(Long Long, EventPublisher<TestEvent> publisher) {
        super(Long, publisher);
    }

    @Override
    public Double process(TestCommand command) {

        Double result = command.getArgs() * 10;
        getEventPublisher().publish(new TestEvent(result));
        return result;
    }
   
}

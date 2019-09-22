package com.design.patterns.behavioral.chainofresponsibility;

public class IssueRaiser {
	public IReceiver setFirstReceiver;

	public IssueRaiser(IReceiver firstReceiver) {
		this.setFirstReceiver = firstReceiver;
	}

	public void raiseMessage(Message msg) {
		if (setFirstReceiver != null)
			setFirstReceiver.ProcessMessage(msg);
	}
}

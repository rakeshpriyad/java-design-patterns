package com.design.patterns.behavioral.chainofresponsibility;

interface IReceiver {
	Boolean ProcessMessage(Message msg);
}
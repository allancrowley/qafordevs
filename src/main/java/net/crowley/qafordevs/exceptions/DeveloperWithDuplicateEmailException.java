package net.crowley.qafordevs.exceptions;

import org.aspectj.bridge.IMessage;
import org.aspectj.bridge.IMessageContext;

public class DeveloperWithDuplicateEmailException extends RuntimeException  {
    public DeveloperWithDuplicateEmailException(String message) {
        super(message);
    }
}

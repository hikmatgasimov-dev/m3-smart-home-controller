package com.bootcamp.smarthome.exception;

public class DeviceOfflineException extends HomeAutomationException {

    public DeviceOfflineException(String deviceId) {
      super("Device '"+deviceId+"' is offline");
    }
}

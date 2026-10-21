package com.bootcamp.smarthome.exception;

public class DeviceNotFoundException extends  RuntimeException{
    public DeviceNotFoundException(String deviceId){
         super("Device not found:"+deviceId);
    }
}

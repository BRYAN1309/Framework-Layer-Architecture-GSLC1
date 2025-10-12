package com.firstconnection.smarthome.dto;

import java.util.Map;

public class CommandRequest {
    private String command;
    private Map<String, String> args;

    public CommandRequest() {}

    public String getCommand() { return command; }
    public Map<String, String> getArgs() { return args; }

    public void setCommand(String command) { this.command = command; }
    public void setArgs(Map<String, String> args) { this.args = args; }
}
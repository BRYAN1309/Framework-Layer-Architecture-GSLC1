package smarthome.dto;

public class CommandRequest {
    private Long deviceId;
    private String command;

    public Long getDeviceId() { return deviceId; }
    public void setDeviceId(Long deviceId) { this.deviceId = deviceId; }

    public String getCommand() { return command; }
    public void setCommand(String command) { this.command = command; }
}

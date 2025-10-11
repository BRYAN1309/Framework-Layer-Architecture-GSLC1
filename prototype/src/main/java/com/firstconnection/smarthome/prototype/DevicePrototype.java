package smarthome.prototype;

import smarthome.model.Device;

public class DevicePrototype implements Prototype<Device> {
    private final Device prototypeDevice;

    public DevicePrototype(Device prototypeDevice) {
        this.prototypeDevice = prototypeDevice;
    }

    @Override
    public Device clone() {
        Device cloned = new Device();
        cloned.setName(prototypeDevice.getName());
        cloned.setType(prototypeDevice.getType());
        cloned.setEnabled(prototypeDevice.isEnabled());
        cloned.setMetadata(new HashMap<>(prototypeDevice.getMetadata()));
        return cloned;
    }
}

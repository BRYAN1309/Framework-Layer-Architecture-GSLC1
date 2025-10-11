import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import smarthome.dto.CreateDeviceRequest;
import smarthome.model.DeviceType;
import smarthome.service.DeviceService;

@SpringBootApplication
public class OriginalApplication implements CommandLineRunner {

    private final DeviceService service;

    public OriginalApplication(DeviceService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(OriginalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        CreateDeviceRequest req = new CreateDeviceRequest();
        req.setName("Smart Lamp");
        req.setType(DeviceType.LIGHT);
        req.setEnabled(true);

        var created = service.createDevice(req);
        System.out.println("Created: " + created);

        var cloned = service.cloneDevice(created.getId());
        cloned.ifPresent(c -> System.out.println("Cloned: " + c));
    }
}

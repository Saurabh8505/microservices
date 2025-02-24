package solid.com.d;

interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb: ON");
    }
    public void turnOff() {
        System.out.println("LightBulb: OFF");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan: ON");
    }
    public void turnOff() {
        System.out.println("Fan: OFF");
    }
}

class Switch {
    private Switchable device;
    private boolean isOn = false;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void press() {
        if (isOn) {
            device.turnOff();
        } else {
            device.turnOn();
        }
        isOn = !isOn;
    }
}


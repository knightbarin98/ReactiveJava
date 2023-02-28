package com.mrbarin.designpatterns;

public class Mobile {
	final int ram, storage;
	final int battery;
	final String processor;
	final double screenSize;

	public Mobile(int ram, int storage, int battery, String processor, double screenSize) {
		this.ram = ram;
		this.storage = storage;
		this.battery = battery;
		this.processor = processor;
		this.screenSize = screenSize;
	}

	public Mobile(MobileBuilder builder) {
		this.ram = builder.ram;
		this.storage = builder.storage;
		this.battery = builder.battery;
		this.processor = builder.processor;
		this.screenSize = builder.screenSize;
	}

	public int getRam() {
		return ram;
	}

	public int getStorage() {
		return storage;
	}

	public int getBattery() {
		return battery;
	}

	public String getProcessor() {
		return processor;
	}

	public double getScreenSize() {
		return screenSize;
	}

	@Override
	public String toString() {
		return "Mobile [ram=" + ram + ", storage=" + storage + ", battery=" + battery + ", processor=" + processor
				+ ", screenSize=" + screenSize + "]";
	}

}

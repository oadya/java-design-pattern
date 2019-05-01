package com.design_pattern.creational.builder;


//First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class. We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.
//Java Builder class should have a public constructor with all the required attributes as parameters.
//Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.
//The final step is to provide a build() method in the builder class that will return the Object needed by client program. For this we need to have a private constructor in the Class with Builder class as argument.
		
		
public class Computer {
	
	//required parameters
	private String HDD;
	private String RAM;
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	
	public String getHDD() {
		return HDD;
	}
	
	public String getRAM() {
		return RAM;
	}
	
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	
	
	private Computer(ComputerBuilder builder) {
		super();
		this.HDD=builder.HDD;
		this.RAM=builder.RAM;
		this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled=builder.isBluetoothEnabled;
	}
	
	public static class ComputerBuilder{
		
		// required parameters
		private String HDD;
		private String RAM;

		// optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		
		public ComputerBuilder(String hDD, String rAM) {
			super();
			HDD = hDD;
			RAM = rAM;
		}


		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return  this;
		}


		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return  this;
		}
		
		public Computer build(){
			return new Computer(this);
		}
		
		
		
	}

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
	
	

}

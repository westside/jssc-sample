package jssc;

public class TestMain {
	public static void main(String[] args) throws SerialPortException {
		final SerialPort port = new SerialPort("COM49");
		port.openPort();
		
		
		port.addEventListener(new SerialPortEventListener() {
			
			public void serialEvent(SerialPortEvent serialPortEvent) {
				
				try {
					String str = port.readString();
					if (str != null && !"".equals(str)) {
						System.out.println(str);
					}
				} catch (SerialPortException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		try {
			for (int i = 0 ; i < 10 ;i++) {
				port.writeString("test");
				Thread.sleep(1000);
			}
			
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

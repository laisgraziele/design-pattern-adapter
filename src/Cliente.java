
public class Cliente {
	
		public static void conectaControleDesktop(ControleBluetoothXBOX desktop) {
			desktop.useControleBluetooth();
		
		}

	 public static void main(String[] args) {
		
		 Desktop pc = new Desktop();
		 
		 conectaControleDesktop(new AdapterControlePC(pc));
		 
		
		 
		 
	}
}

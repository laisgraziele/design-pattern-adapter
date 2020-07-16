
public class AdapterControlePC implements ControleBluetoothXBOX {
	
	private Teclado teclado;

	
	public AdapterControlePC (Teclado teclado) {
		this.teclado = teclado;
	}


	@Override
	public void useControleBluetooth() {
		
	System.out.println("Controle Conectado!");
	
		
	}
}


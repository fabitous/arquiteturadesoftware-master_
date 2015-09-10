package asw.xadrez.versao3.T1.EduardoFabio;

public class ConexaoBluethoot extends DataElement {

	public ConexaoBluethoot(boolean bool) {
		
		super(bool);

	}
	public conectarBluetooth() {
		
		LocalDevice.getDiscoverable();
	}
	protected void buscarNaRedeBluetooth() {
		
		
	}
	protected void desafiarJogador() {
		
		ServiceRecord.setAttributeValue(valueType, null);
	}
	protected void confirmarPartida() {
		
		
	}
}

package asw.xadrez.versao3.T1.EduardoFabio;


public class Peca {
	private TipoDePeca tipoDePeca;
	private Cor corDaPeca;
	
	public Peca(TipoDePeca tipoDePeca, Cor corDaPeca) {
		super();
		this.tipoDePeca = tipoDePeca;
		this.corDaPeca = corDaPeca;
	}
	
	public Cor getCor(){
		return corDaPeca;
	}
	 
	@Override
	public String toString() {
		return String.valueOf(tipoDePeca.getCaractere());
		
	}
}
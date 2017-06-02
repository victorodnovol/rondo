package smeta_asutp;

public class ProcessData {

	public static void main(String[] args) {
		// 1 создать инстанс ProcessData
		// 2 собрать входные данные, с диска, бд, и через экранную форму
		ProcessData pinput = new ProcessData();
		pd.go();
		
	}
	
	public void go(){
		// создать экранную форму представления для ввода исходных данных и передать ей новую смету для обработки
		Smeta smeta = new Smeta();
		ViewData v = new ViewData();
		v.createInputForm(smeta);
		
	}

}

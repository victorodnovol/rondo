package smeta_asutp;

public class ProcessData {

	public static void main(String[] args) {
		// 1 ������� ������� ProcessData
		// 2 ������� ������� ������, � �����, ��, � ����� �������� �����
		ProcessData pinput = new ProcessData();
		pd.go();
		
	}
	
	public void go(){
		// ������� �������� ����� ������������� ��� ����� �������� ������ � �������� �� ����� ����� ��� ���������
		Smeta smeta = new Smeta();
		ViewData v = new ViewData();
		v.createInputForm(smeta);
		
	}

}

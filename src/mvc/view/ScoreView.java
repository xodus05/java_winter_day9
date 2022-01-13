package mvc.view;

import java.util.ArrayList;
import mvc.vo.StudentVO;

public class ScoreView {
	
	private ArrayList<StudentVO> studentArrList;
	
	public ScoreView(ArrayList<StudentVO> studentArrList) {
		this.studentArrList = studentArrList;
	}

	public void print() {
		System.out.println("====== ��ü �л� ���� ���� ��� ======");
		for (int i = 0; i < studentArrList.size(); i++) {
			StudentVO s = studentArrList.get(i);
			int sum = calcSum(s);
			double avg = calcAvg(sum);
			System.out.printf("* %d %s ���� : %d ���� : %d ���� : %d ���� : %d ���� : %d �հ� : %d ��� : %.2f \n" , s.getStuId()
					, s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getScience(), s.getHistory(), sum, avg);
		}
	}
	
	public int calcSum(StudentVO s) {
		return s.getKor()+s.getEng()+s.getMath()+s.getScience()+s.getHistory();
	}
	
	public double calcAvg(int sum) {
		return sum/5.0;
	}
}

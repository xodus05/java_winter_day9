package mvc.view;

import java.util.ArrayList;
import mvc.vo.StudentVO;

public class ScoreView {
	
	private ArrayList<StudentVO> studentArrList;
	
	public ScoreView(ArrayList<StudentVO> studentArrList) {
		this.studentArrList = studentArrList;
	}

	public void print() {
		System.out.println("====== 전체 학생 성적 정보 출력 ======");
		for (int i = 0; i < studentArrList.size(); i++) {
			StudentVO s = studentArrList.get(i);
			int sum = calcSum(s);
			double avg = calcAvg(sum);
			System.out.printf("* %d %s 국어 : %d 영어 : %d 수학 : %d 과학 : %d 역사 : %d 합계 : %d 평균 : %.2f \n" , s.getStuId()
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

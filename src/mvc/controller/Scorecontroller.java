package mvc.controller;

import java.util.Scanner;

import mvc.view.ScoreView;
import mvc.vo.StudentVO;
import java.util.ArrayList;;

public class Scorecontroller {

   public static void main(String[] args) {
      //학생 데이터를 입력 받아서 StudentVO객체를 생성 (여러 학생 정보: 반복문)
      //생성된 StudentVO객체를 ArrayList에 추가
	  ArrayList<StudentVO> stuArrList = new ArrayList<StudentVO>();
	   
      Scanner s1=new Scanner(System.in);   //문자열 입력용
      Scanner s2=new Scanner(System.in);   //숫자 입력용
      String[] subjects = {"국어", "영어", "수학", "과학", "역사"};
      int[] scores = new int[subjects.length];
      
      System.out.println("*** 학생들의 성적을 입력해 주세요 ***");
      while(true) {
         System.out.print("* 성명입력 : ");
         String name=s1.nextLine();
         
         System.out.print("* 학번입력 : ");
         int stuId=s2.nextInt();
         
         for (int i = 0; i < subjects.length; i++) {
			System.out.printf("* %s성적 입력 : ", subjects[i]);
			scores[i] = s2.nextInt();
		}
         
         StudentVO s = new StudentVO(name, stuId, scores[0], scores[1], scores[2], scores[3], scores[4]);
         stuArrList.add(s);
         
         System.out.print("* 계속해서 다음 학생의 성적을 입력하시겠습니까?(y/n)");
         String msg=s1.nextLine();
         if(msg.equals("n")||msg.equals("no"))
            break;
      }
      
      ScoreView view = new ScoreView(stuArrList);
      view.print();
      
      s1.close();
      s2.close();
   }

}
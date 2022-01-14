package mvc.controller;

import java.util.Scanner;

import mvc.view.ScoreView;
import mvc.vo.StudentVO;
import java.util.ArrayList;;

public class Scorecontroller {

   public static void main(String[] args) {
      //�л� �����͸� �Է� �޾Ƽ� StudentVO��ü�� ���� (���� �л� ����: �ݺ���)
      //������ StudentVO��ü�� ArrayList�� �߰�
	  ArrayList<StudentVO> stuArrList = new ArrayList<StudentVO>();
	   
      Scanner s1=new Scanner(System.in);   //���ڿ� �Է¿�
      Scanner s2=new Scanner(System.in);   //���� �Է¿�
      String[] subjects = {"����", "����", "����", "����", "����"};
      int[] scores = new int[subjects.length];
      
      System.out.println("*** �л����� ������ �Է��� �ּ��� ***");
      while(true) {
         System.out.print("* �����Է� : ");
         String name=s1.nextLine();
         
         System.out.print("* �й��Է� : ");
         int stuId=s2.nextInt();
         
         for (int i = 0; i < subjects.length; i++) {
			System.out.printf("* %s���� �Է� : ", subjects[i]);
			scores[i] = s2.nextInt();
		}
         
         StudentVO s = new StudentVO(name, stuId, scores[0], scores[1], scores[2], scores[3], scores[4]);
         stuArrList.add(s);
         
         System.out.print("* ����ؼ� ���� �л��� ������ �Է��Ͻðڽ��ϱ�?(y/n)");
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
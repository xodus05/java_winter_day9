package mvc.controller;

import java.util.Scanner;

public class Scorecontroller {

   public static void main(String[] args) {
      //�л� �����͸� �Է� �޾Ƽ� StudentVO��ü�� ���� (���� �л� ����: �ݺ���)
      //������ StudentVO��ü�� ArrayList�� �߰�
      Scanner s1=new Scanner(System.in);   //���ڿ� �Է¿�
      Scanner s2=new Scanner(System.in);   //���� �Է¿�
      
      System.out.println("*** �л����� ������ �Է��� �ּ��� ***");
      while(true) {
         System.out.print("* �����Է� : ");
         String name=s1.nextLine();
         
         System.out.print("* �й��Է� : ");
         String stuId=s2.nextLine();
         
         
         
         System.out.print("* ����ؼ� ���� �л��� ������ �Է��Ͻðڽ��ϱ�?(y/n)");
         String msg=s1.nextLine();
         if(msg.contentEquals("n")||msg.contentEquals("no"))
            break;
      }
      s1.close();
      s2.close();
   }

}
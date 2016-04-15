 package com.kejiang.yuandl.mylibrary.email;

 import android.util.Log;

 import com.kejiang.yuandl.mylibrary.CustomActivityOnCrash;


 public class ReportByEmail
 {
   public static boolean sendEmail2(String title, String reportContent)
   {
     MyMail m = new MyMail("android2dev@163.com", "android");
     m.set_host("smtp.163.com");
     m.set_port("25");
     m.set_debuggable(true);
     String[] toArr = CustomActivityOnCrash.getEmailTo();
     if ((toArr == null) || (toArr.length <= 0)) {
       toArr = new String[] {"13468857714@qq.com" };
     }
     m.set_to(toArr);
     m.set_from("android2dev@163.com");
     m.set_subject("��" + title + "���쳣����");
     m.setBody(reportContent.toString());
     try {
       if (m.send()) {
         Log.i(title, "�ʼ����ͳɹ�");
         return true;
       }
       
       Log.i(title, "�ʼ�����ʧ��");
       return false;
     }
     catch (Exception e) {
       Log.e(title, "�ʼ������쳣", e); }
     return false;
   }
 }


/* Location:              E:\kejiang\AndroidStudioProjects\inspection\app\libs\UncaughtExceptionSendEmail\classes.jar!\cat\ereza\customactivityoncrash\email\ReportByEmail.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */
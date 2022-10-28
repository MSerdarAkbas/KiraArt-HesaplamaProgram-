import java.util.Scanner;


public class KiraHesaplama {
  int kira ;
  int yil ;

  public static void main (String[] args) {
    Scanner konsolVeri = new Scanner(System.in);

    System.out.println("Kira tutarını giriniz=? ");
    int kira = konsolVeri.nextInt();
    System.out.println("İlk Kira artışı olacak yılı giriniz=? (2006-2022) ");
    int yil = konsolVeri.nextInt();
    sonKira(yil,kira);
 
    //System.out.println("2016 yılındaki kira :"  + " " + sonKira(yil,kira));
    //System.out.println("Maaşı :"  + " " + salary +" "+"TL");
    //System.out.println("Çalışma Saati :"  + " " + workHours +" "+ "saat");
    //System.out.println("Başlangıç Yılı :"  + " " + hireYear);
    
    //kira(salary);
    //System.out.println("Vergi= "+ " " + kira(salary)+" "+ "TL");
  }

  public static double sonKira (int yil,double kira){
    double [] tufeOrani = {0.0772,0.0965,0.0839,0.1006,0.0653,0.0640,0.1045,0.0616,0.074,0.0817,0.0881,0.0853,0.1192,0.2030,0.1184,0.1460,0.35};
      
    
    for (int a= (yil-2006);yil<2023;yil++) {
        double sonKira = tufeOrani[a]*kira+kira;
        int sonKiraint = (int) sonKira+1;
        System.out.println("\n" + yil + " "+"yılındaki kira :" +sonKira );
        System.out.println(yil + " "+"yılındaki kira :" +sonKiraint + " TL" );
        System.out.println(tufeOrani[a]);
        a++;
        kira=sonKira;
        
      
    }
    
  /*if (yil ==2016) {
    double sonKira = (kira*0.0853)+kira;
     System.out.println("2016 yılındaki kira :"  + " " + sonKira(yil,kira));
    
    return sonKira;
  }
  else if (yil ==2017){
    double sonKira = (kira*0.1192 )+kira;


    return sonKira;

    }
   */

  return 0.0;  
  }
  
}
  

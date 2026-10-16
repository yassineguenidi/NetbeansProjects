package javaapplication1;
import java.io.PrintStream;

import javax.swing.*;
   class Lire{
   
      static int position(String t){
      
         int a=0,c=0;String b=" ";
         while(c==0){
            b=JOptionPane.showInputDialog(t);
            try{a=Integer.parseInt(b);
               if(a>0 && a<4) c=1;}
            
               catch(NumberFormatException e){
               
                  System.out.println("*******ERROR soyer prudent ******");}}
         return a;}
   }

// ------------------------------------
   class PXO{
   
      final int x=1,o=-1,a=0;
      int cot=0;
      private int tour;
      int[][] t=new int[3][3];
      boolean c=true;
      int ch;
   
      PXO(){
         int a;
         for(int i=0;i<t.length;i++)
            for(int j=0;j<t.length;j++)
               t[i][j]=0;
         a=(int)((Math.random()*10));
         if(a<=5)tour=-1;
         else tour=1;	}
   
      private int detLig(){
         int s=0;
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               s+=t[i][j];}
            if(s==3){c=false;
               return 1;}
            if(s==-3){c=false;
               return -1;}s=0;}
         return 0;}
   
      private int detCol(){
         int s=0;
         for(int j=0;j<3;j++){
            for(int i=0;i<3;i++){
               s+=t[i][j];}
            if(s==3){c=false;
               return 1;}
            if(s==-3){c=false;
               return -1;}s=0;}
         return 0;}
   
      private int detDiaX(){
         int s=t[0][0]+t[1][1]+t[2][2];
         if(s==3){c=false;
            return 1;} 
         if(s==-3){c=false;
            return -1;}
         return 0;}
   
      private int detDiaY(){
         int s=t[2][0]+t[1][1]+t[0][2];
         if(s==3){c=false;
            return 1; }
         if(s==-3){c=false;
            return -1;}
         return 0;}
   
      private int Tou(){
         return  tour=-1*tour;
      }
   
      void aff(){
         String x="X",o="O";tour=-1*tour;
         System.out.println("\tL'etat: "+Etat()+"\n");
         lirT();
         if(tour==1)
            System.out.println("\t le tour de ( X )");
         else System.out.println("\t le tour de ( O )");
         System.out.println("________________________________");
      
      }
   
      private void lirT(){
      
      
         for(int i=0;i<3;i++){
         
            for(int j=0;j<2;j++){
               if(t[i][j]==1)
                  System.out.print(" X ");
               if(t[i][j]==-1)
                  System.out.print(" O ");
               if(t[i][j]==0)
                  System.out.print("   "); 
               System.out.print((char)179); }
         
            if(t[i][2]==1)
               System.out.print(" X ");
            if(t[i][2]==-1)
               System.out.print(" O ");
            if(t[i][2]==0)
               System.out.print("   ");
            System.out.println();
            if(i!=2)
               for (int o=0;o<12;o++)
                  System.out.print( (o==3 || o==7)? (char)197 : (char)196);
            System.out.println();
         }	
      
      }
   
      void InitV(int a,int b){
         int d=a-1,f=b-1;cot++;
         t[d][f]=tour;}
   
      private String Etat(){
         String a=" O est le gagnant",b=" X est le gagnant",c=" aucun est le gagnant";
         if((detLig()==-1)||(detCol()==-1)||(detDiaX()==-1)||(detDiaY()==-1))
            return a;
         if((detLig()==1)||(detCol()==1)||(detDiaX()==1)||(detDiaY()==1))
            return b;
         return c;}
   
      boolean Eli(int a,int b){
         if(t[a-1][b-1]!=0)
            return true;
         return false;}
   
      private void selfint(){
      
         double y;int r=0,b=0;
      
         do{  
            y=Math.random()*9.0;
            if(y<=3) r=1;
            if(y>3&&y<=6) r=2;
            if(y>6) r=3;
            y=Math.random()*9;
            if(y<=3) b=1;
            if(y>3&&y<=6) b=2;
            if(y>6) b=3;
         }while(Eli(r,b));
         InitV(r,b);
      }
   
      void Intel(){
         int s=0,l=-2*tour; boolean ctr=true;
         if(cot<9){
         
            if(ctr){  
               for(int i=0;i<3;i++) {       //ligne C
                  for(int j=0;j<3;j++){
                     s+=t[i][j];}
                  if(s==-l||s==l)
                     for(int j=0;j<3;j++)
                        if(t[i][j]==0){t[i][j]=tour; ctr=false;cot++;
                           break;}s=0;}
            }
         
            if(ctr){
               for(int j=0;j<3;j++){  // colone C
                  for(int i=0;i<3;i++){
                     s+=t[i][j];}
                  if(s==-l||s==l)
                     for(int i=0;i<3;i++)
                        if(t[i][j]==0){t[i][j]=tour; ctr=false;cot++;
                           break;}s=0;}
            }
         
            if(ctr){
               s=t[0][0]+t[1][1]+t[2][2];  //diagX C
               if(s==-l||s==l)
                  for(int i=0;i<3;i++)
                     if(t[i][i]==0){t[i][i]=tour;ctr=false;cot++;
                        break;}}
         
            if(ctr){
               s=t[2][0]+t[1][1]+t[0][2];     //diagY C
               if(s==-l||s==l)
                  for(int i=0;i<3;i++){
                     if(t[2-i][i]==0){t[2-i][i]=tour;ctr=false;cot++;
                        break;}} 
                        }
                
            if(ctr) selfint();               
         }
      
      } 
      boolean Reset(){
         int  r=Lire.position(" 1 Pour jouer XO \n 2 Pour quiter ");
         if(r==1){
            cot=0;c=true;
            for(int i=0;i<t.length;i++)
               for(int j=0;j<t.length;j++)
                  t[i][j]=0;
            int a=(int)((Math.random()*10));
            if(a<=5)tour=-1;
            else tour=1;
            return true;}
         else 
            return false;
      }
   
      void ContC(){
         int r=0,b=0;
         aff();
         if(ch==tour){
         
            while( c && cot<9){
               do{
                  r=Lire.position("pour quel ligne\n soit entre 1 et 3");
                  b=Lire.position("pour quel colone\n soit entre 1 et 3");
               }while(Eli(r,b));
               InitV(r,b);
               aff();
               if(c && cot<9){Intel();
                  aff();}
            }}
         else{
            while(c && cot<9){
               Intel();
               aff();
               if(c && cot<9){ 
                  do{
                     r=Lire.position("  ligne ? \n soit entre 1 et 3");
                     b=Lire.position(" colone ? \n soit entre 1 et 3");
                  }while(Eli(r,b));
                  InitV(r,b);
                  aff();}}
         
         }}
   
      void Choix(){ 
         int r=Lire.position("Press 1 pour X.\nPress 2 pour O.\n Press 3 par hasard");
         if(r==1)ch=1;
         if(r==2)ch=-1;
         if(r==3)ch=Tou();
      }
   
   
      void ContP(){
         int r,b;
         aff();
         while(c && cot<9){
            do{
               r=Lire.position("  ligne ? \n soit entre 1 et 3");
               b=Lire.position(" colone ? \n soit entre 1 et 3");
            }while(Eli(r,b));
            InitV(r,b);
            aff();}
      }
   
      boolean Joue(){
         int r=Lire.position(" Nombre des joueurs\n 1- Contre l'ordinateur"+
                           "\n 2- Deux joueurs.");
         if(r==1)
            return true;
         if(r==2)
            return false;
         else {System.out.println(" Vous serez contre l'ordinateur");
            return true;}
      }
   }
//--------------------------------
   class XO{
      public static void main(String[] args){
      
      
         PXO a=new PXO();
         int r,b;
         a.aff();
      
         while(a.c && a.cot<9){
            do{
               r=Lire.position("  ligne ? \n soit entre 1 et 3");
               b=Lire.position("  colone ? \n soit entre 1 et 3 ");
            }while(a.Eli(r,b));
            a.InitV(r,b);
            a.aff();}
      }
   }
// -----------------------------
   class XOSE{
      public static void main(String[] args){
      
         PXO a=new PXO();
      while(a.Reset()){
         
            if(a.Joue()){
               a.Choix();
               a.ContC();
            }	
            
            else
               a.ContP();
         }	
     new Charbel(); 
      }
   }
// -----------------------------
   class XOVC{
      public static void main(String[] args){
      
      
         int r,b;double y;
         PXO a=new PXO();
         a.aff();
         while(a.c && a.cot<9){
            do{
               r=Lire.position("pour quel ligne\n soit entre 1 et 3");
               b=Lire.position("pour quel colone\n soit entre 1 et 3");
            }while(a.Eli(r,b));
            a.InitV(r,b);
            a.aff();
            a.Intel();
            a.aff();
         }
      }
   }
// -----------------------

 class Charbel
{

    final int n = 8;
    final int t = 40;
    Thread ct;

    public Charbel()
    {
        this("Faites par:", "Charbel Tannous");
    }

    public Charbel(String s, String s1)
    {
        ct = new Thread();
        System.out.println("\n\n");
        for(int i = 0; i <= 8; i++)
        {
            for(int j = 0; j <= 40; j++)
            {
                System.out.print(" ");
                System.out.print((new StringBuilder()).append(s).append(" ").append('\333').toString());
                for(int l = 0; l < j; l++)
                {
                    System.out.print('\333');
                }

                System.out.print((new StringBuilder()).append(" ").append(s1).append(" ").toString());
                for(int i1 = 0; i1 < 40 - j; i1++)
                {
                    System.out.print('\333');
                }

                try
                {
                    Thread _tmp = ct;
                    Thread.sleep(400L);
                }
                catch(Exception exception) { }
                System.out.print('\333');
                System.out.print("\r");
            }

            for(int k = 0; k < 40; k++)
            {
                System.out.print(" ");
                System.out.print((new StringBuilder()).append(s).append(" ").append('\333').toString());
                try
                {
                    Thread _tmp1 = ct;
                    Thread.sleep(400L);
                }
                catch(Exception exception1) { }
                for(int j1 = 40; j1 > k; j1--)
                {
                    System.out.print('\333');
                }

                System.out.print((new StringBuilder()).append(" ").append(s1).append(" ").toString());
                for(int k1 = k; k1 > 0; k1--)
                {
                    System.out.print('\333');
                }

                System.out.print("\r");
            }

        }

    }
}
// ----------------------- fin des class---------------
// ----------------------- compilez les et ....-------
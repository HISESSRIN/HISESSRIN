package si;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
        System.out.println("        Menú");
        System.out.println("1. if simple");
        System.out.println("2. if doble");
        System.out.println("3. if anidado");
        System.out.println("4. IMC");
        System.out.println("5. Carrera con switch");
        System.out.println("6. Imprime 1 a N");
        System.out.println("7. Imprime de N a M con step de A");
        System.out.println("8. Preguntar por N numeros e imprime la suma y promedio");
        System.out.println("9. El 7 con while");
        System.out.println("10. El 8 con do while");
        
        int s=in.nextInt();
        System.out.println(" ");
        
        switch (s){
            case 1:
            System.out.println("Calificación?");
            int co=in.nextInt();
            
            if (co<=5){
                System.out.println("Reprobado");
            }
            break;
            
            case 2:
            System.out.println("Edad?");
            int e=in.nextInt();
            
            if (e>=18){
                System.out.println("Mayor de edad");
                
            }else{
                System.out.println("Menor");
            }
            break;
            
            case 3:
            System.out.println("Num. 1:");
            int a=in.nextInt();
            System.out.println("Num. 2:");
            int b=in.nextInt();
            System.out.println("Num. 3:");
            int c=in.nextInt();
            
            if (a>b && a>c){
                if (b>c){
                    System.out.println(""+a+""+b+""+c);
                }else{
                    System.out.println(""+a+""+c+""+b);
                }
            }else if(b>a && b>c){
                if (a>c){
                    System.out.println(""+b+""+a+""+c);
                }else{
                    System.out.println(""+b+""+c+""+a);
                }
            }else if(c>a && c>b){
                if (b>c){
                    System.out.println(""+c+""+a+""+b);
                }else{
                    System.out.println(""+c+""+b+""+a);
                }
        }
            
            break;
            case 4:
            //imc WIP
            double p,h,al,ec;
            System.out.println("Peso (kg)");
            p=in.nextDouble();
            System.out.println("Altura (m)");
            h=in.nextDouble();
            //imc= peso/altura²
            al=Math.pow(h,2);
            ec=p/al;
            
            if (ec<18.5){
                System.out.println("Bajo peso");
            }else if (ec>=18.5 && ec<=24.9){
                System.out.println("Adecuado");
            }else if (ec>=25 && ec<=29.9){
                System.out.println("Sobrepeso");
            }else if (ec>=30 && ec<=34.9){
                System.out.println("Obesidad grado 1");
            }else if (ec>=35 && ec<=39.9){
                System.out.println("Obesidad grado 2");
            }else if (ec>=40){
                System.out.println("Obesidad grado 3");
            }
            break;
            
            case 5:
            String pro;
            System.out.println("ingresa tu carrera");
            pro=in.next();
            switch(pro){
                case "Programación":
                System.out.println(" 303 \n 304 \n 305");
                break;
                  case "Programacion":
                System.out.println(" 303 \n 304 \n 305");
                break;
                case "PROGRAMACIÓN":
                System.out.println(" 303 \n 304 \n 305");
                break;
                case "PROGRAMACION":
                System.out.println(" 303 \n 304 \n 305");
                break;
                  case "programación":
                System.out.println(" 303 \n 304 \n 305");
                break;
                  case "programacion":
                System.out.println(" 303 \n 304 \n 305");
                break;
                case "Maquinas":
                System.out.println(" 306 \n 307");
                break;
                case "MAQUINAS":
                System.out.println(" 306 \n 307");
                break;
             case "maquinas":
                System.out.println(" 306 \n 307");
                break;
                 case "Ventas":
                System.out.println(" 301 \n 302");
                break;
                case "VENTAS":
                System.out.println(" 301 \n 302");
                break;
                case "ventas":
                System.out.println(" 301 \n 302");
                break;
            }
            break;
                case 6:
                System.out.println("N?");
                int N=in.nextInt();
                
                for (int i=0; i<=N; i++){
                    System.out.println(i);
                }
                break;
                
                case 7:
                System.out.println("N?");
                int N1=in.nextInt();
                System.out.println("M?");
                int M=in.nextInt();
                System.out.println("A?");
                int A=in.nextInt();
                
                for (int i=N1; N1<=M; N1+=A){
                    System.out.println(i);
                }
                break;
            case 8:
            double cu=0;
            double sum=0,sigm=0;
            System.out.println("cuantos");
            cu=in.nextDouble();
            for(int lu=1 ;lu<=cu;lu++){
                System.out.println("numero "+lu);
                sum=in.nextDouble();
                sigm=sigm+sum;
            }
            System.out.println("suma"+sigm);
            System.out.println("promedio"+sigm/cu);
            break;
            
            case 9:
            System.out.println("N?");
                int i1=0,A1=0, N2=0, M1=0;
                N2=in.nextInt();
                System.out.println("M?");
                M1=in.nextInt();
                System.out.println("A?");
                A1=in.nextInt();
                   i1=A1;
            while (N2 < M1){
               
                System.out.println(i1);
                N2+=i1;
                i1+=A1;
               
            }
            break;
            
            case 10:
            double cuo=0;
            double jo=1;
            double sumo=0,sigmo=0;
            System.out.println("cuantos");
            cuo=in.nextDouble();
            do{
                System.out.println("numero "+jo);
                sumo=in.nextDouble();
                sigmo=sigmo+sumo;
                jo++;
            }while(jo-1<cuo);
            System.out.println("suma"+sigmo);
            System.out.println("promedio"+sigmo/cuo);
            break;
            
        }
        	
	
	
	
}
}

package testeGrafico;


public class Criptografia {
    public Criptografia() {
    
}
    public String criptografar(String senha) {
     
      
       int a;
      
     
      
      String pass1 = "", pass2="", pass3="";
      char au = 68;
      int aux;
      
      //passo3
     
            int t = senha.length();
            t = t/2;
         //   System.out.println(t + " = "+ palavras[i]);
            for(int j=0;j<senha.length();j++){                    
                au = senha.charAt(j);
               if(j>=t)
                   au--;
                pass3=""+pass3+au;
                }
             
            senha = pass3;
            pass3 ="";
            
            //passo2
      
            t = senha.length();
            t--;
          //  System.out.println(t + " = "+ palavras[i]);
            for(int j=t;j>=0;j--){
                au = senha.charAt(j);
               // System.out.println("pass");
                pass2=""+pass2+au;
                }
             
            senha = pass2;
            pass2 ="";
      
 
      //passo 1;
     
           
            t = senha.length();
            for(int j=0;j<t;j++){
                    aux = senha.codePointAt(j);
                if((aux>=65 && aux<=90) || (aux>=97 && aux<=122)){
                    aux=aux+3;
                    au = (char)aux;
                    pass1=""+pass1+au;
                }else{
                    au = (char)aux;
                     pass1=""+pass1+au;
                }
            }
            senha = pass1;
            pass1 ="";
      
      
      
       
      
       
          return senha;  
    
    
    }
    
    public String descriptografar(String senha) {
       int a;
      
     
      
      String pass1 = "", pass2="", pass3="";
      char au = 68;
      int aux;
 
      //passo 1;
     
           
            int t = senha.length();
            for(int j=0;j<t;j++){
                    aux = senha.codePointAt(j);
                if((aux>=65 && aux<=90) || (aux>=97 && aux<=122)){
                    aux=aux+3;
                    au = (char)aux;
                    pass1=""+pass1+au;
                }else{
                    au = (char)aux;
                     pass1=""+pass1+au;
                }
            }
            senha = pass1;
            pass1 ="";
      
      //passo2
      
            t = senha.length();
            t--;
          //  System.out.println(t + " = "+ palavras[i]);
            for(int j=t;j>=0;j--){
                au = senha.charAt(j);
               // System.out.println("pass");
                pass2=""+pass2+au;
                }
             
            senha = pass2;
            pass2 ="";
      
       
      //passo3
     
            t = senha.length();
            t = t/2;
         //   System.out.println(t + " = "+ palavras[i]);
            for(int j=0;j<senha.length();j++){                    
                au = senha.charAt(j);
               if(j>=t)
                   au--;
                pass3=""+pass3+au;
                }
             
            senha = pass3;
            pass3 ="";
      
       
          return senha;  
    
    }
    
}

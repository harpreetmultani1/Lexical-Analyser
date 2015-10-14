import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class simpLex{
   public static void main(String[] args) {
      char[] str;
      BufferedReader code = null;



      try {

         String sCurrentLine,sAllLines;
         //sAllLines = "";


         code = new BufferedReader(new FileReader(args[0]));
         sAllLines=code.readLine();
         while ((sCurrentLine = code.readLine()) != null) {
            sAllLines = sAllLines + "\n" + sCurrentLine;
         }
         //System.out.println(sAllLines);
         ArrayList<String> sCurrent1 = split(sAllLines);
         for(String sCurrent:sCurrent1)  {
            //System.out.println(sCurrent+"\t"+1);
            if (sCurrent.equals(":=") || sCurrent.equals("<=") || sCurrent.equals(">=") || sCurrent.equals("!=")){
               if (sCurrent.equals("!=") || sCurrent.equals("<=") || sCurrent.equals(">=")) {
                  System.out.println(sCurrent+"\t\t"+"RELATIONAL OPERATOR"+"\n");
               }
               else{
                  System.out.println(sCurrent+"\t\t"+"ASSIGN OPERATOR"+"\n");
               }
               }
            else{
                  str=sCurrent.toCharArray();
                  //System.out.println(sCurrent+"\t"+9+isvariable(sCurrent));
                  if (sCurrent.equals("and") || sCurrent.equals("then") || sCurrent.equals("var") || sCurrent.equals("true") || sCurrent.equals("andvar") || sCurrent.equals("void") || sCurrent.equals("while") || sCurrent.equals("for") ){
                        System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("return")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("string")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("or")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("real")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("not")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("main")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("Main")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("bool")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("const")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("do")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("else")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("false")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("if")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals("int")){
                     System.out.println(sCurrent+"\t\t"+"KEYWORD"+"\n");
                  }
                  else if (sCurrent.equals(".")){
                     System.out.println(sCurrent+"\t\t"+"DOT OPERATOR"+"\n");
                  }
                  else if (sCurrent.equals("!")){
                     System.out.println(sCurrent+"\t\t"+"NOT OPERATOR"+"\n");
                  }
                  else if (sCurrent.equals("+") || sCurrent.equals("-") || sCurrent.equals("*") || sCurrent.equals("/") || sCurrent.equals("%")  )    //+ - * / % = != < > <= >= ( ) , ; : . := ? ! { }
                  {
                     System.out.println(sCurrent+"\t\t"+"ARTHEMATIC OPERATOR"+"\n");
                  }
                  else if (sCurrent.equals("<") || sCurrent.equals(">")) {
                     System.out.println(sCurrent+"\t\t"+"RELATIONAL OPERATOR"+"\n");
                  }
                  else if (sCurrent.equals("(")){
                     System.out.println(sCurrent+"\t\t"+"LPAREN"+"\n");
                  }
                  else if (sCurrent.equals("=")){
                     System.out.println(sCurrent+"\t\t"+"ASSIGN OPERATOR"+"\n");
                  }
                  else if (sCurrent.equals("[")){
                     System.out.println(sCurrent+"\t\t"+"SQUARE LPAREN"+"\n");
                  }
                  else if (sCurrent.equals("]")){
                     System.out.println(sCurrent+"\t\t"+"SQUARE RPAREN"+"\n");
                  }
                  else if (sCurrent.equals(")")){
                     System.out.println(sCurrent+"\t\t"+"RPAREN"+"\n");
                  }
                  else if (sCurrent.equals(",")){
                     System.out.println(sCurrent+"\t\t"+"COMMA OPERATOR"+"\n");
                  }
                  else if (sCurrent.equals("{")){
                     System.out.println(sCurrent+"\t\t"+"LBARCE"+"\n");
                  }
                  else if (sCurrent.equals("?")){
                     System.out.println(sCurrent+"\t\t"+"QUESTION OPERATOR"+"\n");
                  }
                  else if (sCurrent.equals("}")){
                     System.out.println(sCurrent+"\t\t"+"RBARCE"+"\n");
                  }
                  else if (sCurrent.equals(":")){
                     System.out.println(sCurrent+"\t\t"+"Colon"+"\n");
                  }
                  else if (sCurrent.equals(";")){
                     System.out.println(sCurrent+"\t\t"+"SemiColon"+"\n");
                  }
                  else if (isvariable(sCurrent)==1){
                     System.out.println(sCurrent+"\t\t"+"Identifier"+"\n");
                  }
                  else if (isint(sCurrent)==1){
                     System.out.println(sCurrent+"\t\t"+"Integer"+"\n");
                  }
                  else if (isreal(sCurrent)==1){
                     System.out.println(sCurrent+"\t\t"+"Real Number"+"\n");
                  }
                  else if (isreal(sCurrent)==2){
                     System.out.println(sCurrent+"\t\t"+"Invalid Real Number"+"\n");
                  }
                  else if (str.length>1 && str[0]=='/' && (str[1]=='/' || str[1]=='*')){
                        System.out.println(sCurrent+"\t\t"+"Comment"+"\n");
                  }
                  else if (isvariable(sCurrent)==2){
                        System.out.println(sCurrent+"\t\t"+"Invalid Identifier"+"\n");
                  }
                  else if (str.length>0){
                     if (str[0]=='\"' && str[str.length-1]=='\"'){
                        System.out.println(sCurrent+"\t\t"+"String"+"\n");
                     }
                     else if (str[0]=='\"' && str[str.length-1]!='\"'){
                        System.out.println(sCurrent+"\t\t"+"Invalid String"+"\n");
                     }
                  }
                   
                  //System.out.println(sCurrent+"\t"+isvariable(sCurrent));
                  
                  
                  
            }
         }  
      }catch (IOException e) {
          e.printStackTrace();
      }finally {
         try {
            if (code != null)code.close();
            {
            }
         }catch (IOException ex) {
            ex.printStackTrace();
         }
      }
      }

   public static int isvariable(String str){
      char[] str1=str.toCharArray();
      
      int i=1;
      if (str1.length>0){
         if ((str1[0]<='Z' && str1[0]>='A') || (str1[0]<='z' && str1[0]>='a')){
            i=1;
         }
         else if (str1[0]!=' ' && str1[0]!='\n' && (str1[0]!='\"')){
            i=2;
            return i;
         }
         else{
            return 0;
         }
         for (int j=1;j<str1.length ;j++ ) {
            if ((str1[j]<='Z' && str1[j]>='A') || (str1[j]<='z' && str1[j]>='a') || (str1[j]<='9' && str1[j]>='0') || str1[j]=='_'){
               i=1;
            }
            else{
               i=2;
               return i;
            }
         }
         return i;
      }
      else{
         return 0;
      }

   }
   public static int isint(String str){
      char[] str1=str.toCharArray();
      int i=1;

      if (str1.length>0) {
         for (int j=0;j<str1.length ;j++ ) {
            if (str1[j]<='9' && str1[j]>='0'){
               i=1;
            }
            else{
               i=0;
               return i;
            }
         }
         return i;
         }
      else{
         return 0;
      }
   }

   public static int isreal(String str){
      char[] str1=str.toCharArray();
      int count=0,i=1;

      if (str1.length>2) {
         for (int j=0;j<str1.length ;j++ ) {
            if ((str1[j]<='9' && str1[j]>='0') || str1[j]=='.'){
               i=1;
               if (str1[j]=='.'){
                  count+=1;
               }
            }
            else{
               i=0;
               return i;
            }
         }
         if (str1[0]=='.' || str1[str1.length-1]=='.'){
            return 2;
         }
         if (count==1) {
            return 1;
         }
         else{
            return 2;
         }
         }
      else{
         return 0;
      }
   }
   public static ArrayList<String> split(String str1){
      ArrayList<String> str2=new ArrayList<String>();
      String word="";
      int count=0;
      int outside=0,inside=1,current,insidereal=2,insidelinecomment=3,insideblockcomment=4,insidevariable=5;
      current=outside;
      Scanner str = new Scanner(str1);
      str.useDelimiter("");
      String c="";
      if (str.hasNext()){
         c=str.next();
      }
      while (str.hasNext()){
         if (current==outside){
            if (c.equals("/") && str.hasNext()){
               String m1=str.next();
               if (m1.equals("/")){
                  str2.add(word);
                  word=c+m1;
                  c=str.next();
                  current=insidelinecomment;
               }
               else if (m1.equals("*")){
                  str2.add(word);
                  word=c+m1;
                  c=str.next();
                  count=1;
                  current=insideblockcomment;
               }
               else{
                  str2.add(word+c);
                  word="";
                  c=m1;
               }
            }   
            /*else if (c.equals("0") || c.equals("1") || c.equals("2") || c.equals("3") || c.equals("4") || c.equals("5") || c.equals("6") || c.equals("7") || c.equals("8") || c.equals("9")) {
               str2.add(word);
               word=c;
               current = insidereal;
            }*/
            else if (c.equals("\"")){
               str2.add(word);
               current=inside;
            }
            else if (c.equals(".")){
               
               if (str.hasNext()){
                  String c3=str.next();
                  char[] t9=c3.toCharArray();
                  if (t9[0]<='9' && t9[0]>='0'){
                     str2.add(word);
                     word=c+c3;
                     current = insidereal;
                  }
                  else{
                  str2.add(word);
                  str2.add(c);
                  word="";
                  c=c3;
                  }
               }
               
               
            }
            else if (c.equals("\n")){
               str2.add(word);
               str2.add(c);
               word="";
               c=str.next();
            }
            else if (c.equals("(")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";

            }

            else if (c.equals(")")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals("{")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals("[")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals("]")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals("}")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals(";")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals(",")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals("+")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals("?")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals("-")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals("/")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals("*")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals("=")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals(" ")){
               str2.add(word);
               str2.add(c);
               c=str.next();
               word="";
            }
            else if (c.equals(":")){
               String c7=str.next();
               if (c7.equals("=")){
                  str2.add(word);
                  str2.add(c+c7);
                  c=str.next();
                  word="";
               }
               else{
                  str2.add(word);
                  str2.add(c);
                  c=c7;
                  word="";
               }
            }
            else if (c.equals(">")){
               String c7=str.next();
               if (c7.equals("=")){
                  str2.add(word);
                  str2.add(c+c7);
                  c=str.next();
                  word="";
               }
               else{
                  str2.add(word);
                  str2.add(c);
                  c=c7;
                  word="";
               }
            }
            else if (c.equals("<")){
               String c7=str.next();
               if (c7.equals("=")){
                  str2.add(word);
                  str2.add(c+c7);
                  c=str.next();
                  word="";
               }
               else{
                  str2.add(word);
                  str2.add(c);
                  c=c7;
                  word="";
               }
            }
            else if (c.equals("!")){
               String c7=str.next();
               if (c7.equals("=")){
                  str2.add(word);
                  str2.add(c+c7);
                  c=str.next();
                  word="";
               }
               else{
                  str2.add(word);
                  str2.add(c);
                  c=c7;
                  word="";
               }
            }

            else{
               word=word+c;
               //c=str.next();
               current=insidereal;
               
            }


         }
         else if (current==inside){
            word=c;
            while (str.hasNext()){
               String c3=str.next();
               if (c3.equals("\\")){
                  String b4=str.next();
                  if (b4.equals("\"")){
                     word=word+c3+b4;
                     if (str.hasNext()){
                        c3=str.next();
                     }
                  }
                  else{
                     word=word+c3+b4;
                     if (str.hasNext()){
                        c3=str.next();
                     }
                  }
               }
               if (c3.equals("\"")){
                  word=word+c3;
                  current=outside;
                  //System.out.println(current);
                  break;
               }
               else if (c3.equals("\n")){
                  current=outside;
                  break;
               }
               else{
                  word=word+c3;
               }
            }
            str2.add(word);
            word="";
            if (str.hasNext()) {
                  c=str.next();
               }
               
         }
         else if (current==insidereal){
            while (str.hasNext()){
               String c3=str.next();
               char[] t2=c3.toCharArray();
               if ((t2[0]<='9' && t2[0]>='0') || t2[0]=='.'){
                  word=word+c3;
               }
               else if (c3.equals("+") || c3.equals("-") || c3.equals("*") || c3.equals("/") || c3.equals("%") || c3.equals("(") || c3.equals(")") || c3.equals("{") || c3.equals("}") || c3.equals(" ") || c3.equals("\n") || c3.equals("=") || c3.equals("!") || c3.equals("<") || c3.equals(">") || c3.equals(",") || c3.equals(";") || c3.equals(":") || c3.equals("?")){
                  current=outside;
                  if (str.hasNext()){
                     c=c3;
                  }
                  str2.add(word);
                  word="";
                  break;
               }
               else{
                  current=insidevariable;
                  word=word+c3;
                  break;
               }
            }
            
            
         }
         else if (current==insidevariable){
            while (str.hasNext()){
               String c3=str.next();
               if (c3.equals("+") || c3.equals(".") || c3.equals("-") || c3.equals("*") || c3.equals("/") || c3.equals("%") || c3.equals("(") || c3.equals(")") || c3.equals("{") || c3.equals("}") || c3.equals(" ") || c3.equals("\n") || c3.equals("=") || c3.equals("!") || c3.equals("<") || c3.equals(">") || c3.equals(",") || c3.equals(";") || c3.equals(":") || c3.equals("?")){
                  current=outside;
                  if (str.hasNext()){
                     c=c3;
                  }
                  break;
               }
               else{
                  word=word+c3;
               }
            }
            str2.add(word);
            word="";
         }
         else if (current==insidelinecomment){
            if (str.hasNext()){
               if (c.equals("\n")){
                  str2.add(word);
                  c=str.next();
                  current=outside;
                  word="";
               }
               else{
                  word=word+c;
                  c=str.next();
               }
            }
         }
         else if (current==insideblockcomment){
            //if (str.hasNext()){
               //int count=1;
               if (c.equals("/")){
                  String m3=str.next();
                  if (m3.equals("*")){
                     count+=1;
                     word=word+c+m3;
                     if (str.hasNext()){
                        c=str.next();
                     }
                  }
               }
               else if (c.equals("*")){
                  String m3=str.next();
                  if (m3.equals("/")){
                     count-=1;
                     word=word+c+m3;
                     //System.out.println(word+"\t"+count);
                     if (count==0){
                        str2.add(word);
                        word="";
                        current=outside;
                        if (str.hasNext()){
                           c=str.next();
                        }
                     }
                     if (str.hasNext()){
                        c=str.next();
                     }
                     else{
                        str2.add(word);
                     }
                  }
                  else{
                     word=word+c+m3;
                     if (str.hasNext()){
                        c=str.next();
                     }
                     else{
                        str2.add(word);
                     }
                  }
               }
               else if (c.equals("\n")) {
                  word=word+c;
                  if (str.hasNext()){
                        c=str.next();
                     }
                  else{
                     str2.add(word);
                  }                  
               }
               else{
                  word+=c;
                  if (str.hasNext()){
                        c=str.next();
                  }
                  else{
                     str2.add(word);
                  }
               }
               if(!str.hasNext() && count != 0){
                  word=word+c;
                  str2.add(word);
               }
            //}
         }
      }
      word=word+c;
      str2.add(word);
      return str2;
   }
}

package com.company.day12;

public class EcmDef {
    public static void main(String[] args) {
//        int k = Integer.valueOf(13);
//        System.out.println(k);
        try {
            int i = Integer.parseInt(args[0]); //被除数
            int j = Integer.parseInt(args[1]);//除数
         /*  Scanner s = new Scanner(System.in);
           int i = s.nextInt();
           int j = s.nextInt();*/

            ecm(i,j);
        } catch (NumberFormatException e) {
            System.out.println("数据类型bu一致");
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e ){
            System.out.println("分母为0");
        }catch (EcDef ecDef){
            System.out.println( ecDef.getMessage());
        }

       /* Scanner s = new Scanner(System.in);
        int [] score = new int[2];
        for (int j = 0; j <2 ; j++) {
            int i = s.nextInt();
            score[j] = i;*/
    }


    public static void ecm(int i, int j)throws EcDef{
        if (i <0 || j<0){
            throw new EcDef("输入的是负数");
        }
        System.out.println( i /j);
    }
}

class EcDef extends Exception{
    static final long serialVersionUID = -70348990745766939L;

    public EcDef(){

    }
    public EcDef(String message) {
        super(message);
    }
}
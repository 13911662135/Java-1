package LX;

public class Test {

   public static void main(String args[]) {

       CPU cpu = new CPU(2200,"Intel",3.8);

       HardDisk HD=new HardDisk(200,240);

       PC pc =new PC(cpu,HD);

       pc.show();

    }

}
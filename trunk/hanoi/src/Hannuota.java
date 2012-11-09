public class Hannuota {

    public Hannuota() {
    }
    public static void main(String args[]){
    int disks=0;
      final int source=1;
      final int desk=3;
      final int spare=2;
      yidong(disks,source,desk,spare);
    }
    public static void yidong(int disks,int source,int desk,int spare){
      if(disks==1){
       System.out.println(source+"=>"+desk);
      
    }
    else {
       yidong(disks-1,source,spare,desk);
      
       System.out.println(source+"=>"+desk);
      
       yidong(disks-1,spare,desk,source);
    
    }
    
    }
    
}
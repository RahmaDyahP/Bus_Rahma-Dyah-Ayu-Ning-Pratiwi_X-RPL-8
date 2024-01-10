/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rahma Dyah
 */
public class Bus {
    private int penumpang,maxpenumpang;
    
    
    //konstruktor 
    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    //method mutator
    public void pluspenumpang (int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang ){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }
    }
        public void getPassword(int password){
            if (password==90){
                System.out.println("Password benar");
            }
            else{
                System.out.println("Password salah");
            }
        }
        
    
         public void cetak (){
             System.out.println("Penumpang sekarang = "+penumpang);
             System.out.println("Penumpang seharusnya adalah ="+maxpenumpang);
          

    
}
}


    

    
    


package methods;

public class Main {

	public static void main(String[] args) {
		 	sayiBulmaca();
	        

	        System.out.println("-------------------------------------");

	        sayiBulmaca();


	    }
	    public static void sayiBulmaca(){
	        int[] sayilar = new int[]{1,3,5,6,8,9};
	        int aranacak = 6;
	        boolean varMi = false;

	        for (int i = 0; i <= sayilar.length; i++) {
	            if (i == aranacak){
	                varMi = true;
	                break;
	            }else{
	                varMi = false;
	            }
	        }
	        if(varMi == true){
	            String mesaj = "Sayı Bulundu" + -aranacak;
	            mesajVer(mesaj);

	        }else{
	            String mesaj = "Sayı Bulunamadı" + -aranacak;
	            mesajVer(mesaj);
	        }

	    }
	    public static void mesajVer(String mesaj){
	        System.out.println(mesaj);
	    }
	}



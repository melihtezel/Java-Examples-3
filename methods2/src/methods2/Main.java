package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();
;       System.out.println(yeniMesaj);
        topla();

    }
    public static void add(){
        System.out.println("Eklendi");

    }
    public static void remove(){
        System.out.println("Silindi");

    }
    public static void update(){
        System.out.println("Güncellendi");

    }
    public static int topla(){
        int sayi1=6;
        int sayi2=5;
        System.out.println("Toplam: "+ (sayi1+sayi2));
        return sayi1 + sayi2;
    }
    public static int topla2(int... sayilar){
        int toplam =0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "Eskişehir";
    }

	}


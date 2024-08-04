public class LabAsistani extends Asistan{

    public LabAsistani(String adSoyad,String telefon,String eposta,String bolum,String unvan){
        super(adSoyad,telefon,eposta,bolum,unvan);
    }
    public void lablaraGir(){
        System.out.println(this.getAdSoyad()+" lablara girdi !");
    }
}

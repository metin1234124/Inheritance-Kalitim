public class Main {

    public static void main(String[] args) {

        Calisan c1= new Calisan("met bar","0588565456","abc@pat.com");
        Akademisyen a1=new Akademisyen("nam man","05964756368","hah@gmail.com","CENG","Docent");

        Memur m1=new Memur("ser der","5686489698","ser@sar.com","CENG","250");

        OgretimGorevlisi o1=new OgretimGorevlisi("ger dar","08967445256","ger@gmail.com","CENG","YARDOÇ","85");
        Asistan as1=new Asistan("her dem","06986332587","her@gmail.com","BIL","PROF");
        LabAsistani l1=new LabAsistani("ker mer","04775663258","ker@hotmail.com","ELK","LABASIS");

        BilgiIslem bi=new BilgiIslem(" lem bar","03556998874","lem@hotmail.com","BIL","60");
       GuvenlikGorevlisi g1=new GuvenlikGorevlisi("guv gov","01569886365","guv@gmail.com","CENG","65");
       g1.nobet();
       System.out.println(a1.getEposta()+ " "+ as1.getTelefon());
    }
}

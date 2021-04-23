class mhidup{
    String nama;
}
class ikan extends mhidup{
}
class burung extends mhidup{
}
public class Mhidup {
    public static void main(String[] args) {
    
    ikan ikan1 = new ikan();
    ikan1.nama="ikan hidup di air";
    System.out.println("binatang"+ikan1.nama);
    
    burung burung1 = new burung();
    burung1.nama="burung hidup di darat";
    System.out.println("binatang"+burung1.nama);
    }
    
}
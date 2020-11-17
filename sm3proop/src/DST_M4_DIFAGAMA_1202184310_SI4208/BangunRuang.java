package DST_M4_DIFAGAMA_1202184310_SI4208;

public abstract class BangunRuang implements rotasi, size{
    protected double tinggi;
    
    protected abstract double keliling();
    protected abstract double volume();
    
    @Override
    public void perbesar(double persen){
        System.out.println("Method untuk memperbesar ukuran Bangun Ruang");
    }
    
    @Override
    public void perkecil(double persen){
        System.out.println("Method untuk memperkecil ukuran Bangun Ruang");
    }
}

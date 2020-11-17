package Bab6;

public class Rumah {
    private float luasTanah;
    private float luasBangunan;
    private int harga;
    
    public Rumah(){
        
    }
    
    public Rumah(float luasTanah, float luasBangunan, int harga){
        this.luasTanah = luasTanah;
        this.luasBangunan = luasBangunan;
        this.harga = harga;
    }
    
    public float getLuasTanah(){
        return luasTanah;
    }
    
    public float getLuasBangunan(){
        return luasBangunan;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setLuasTanah(float luasTanah){
        this.luasTanah = luasTanah;
    }
    
    public void setLuasBangunan(float luasBangunan){
        this.luasBangunan = luasBangunan;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public String infoRumah(){
        return "Rumah dengan Luas Tanah: "+luasTanah+", Luas Bangunan: "+luasBangunan+", Harga: "+harga+"\n";
    }
}

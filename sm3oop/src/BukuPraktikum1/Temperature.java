package BukuPraktikum1;

public class Temperature {
  //Deklarasi Attributes
    private float temperatureFahrenheit;
    private float temperatureCelcius;
    private String jawabanLoop;
  //Constructor  
    public Temperature(){
        
    }
  //Methode Getter
    public float getTemperatureFahrenheit(){
        return temperatureFahrenheit;
    }
    
    public String getJawabanLoop(){
        return jawabanLoop;
    }
  //Methode Setter
    public void setTemperatureFahrenheit(float suhuFahrenheit){
        temperatureFahrenheit = suhuFahrenheit;
    }
    
    public void setJawabanLoop(String jawabanLoop){
        this.jawabanLoop = jawabanLoop;
    }
  //Methode getter untuk mengkonversi Fahreinheit ke Celcius
    public float getTemperatureCelcius(){
        return temperatureCelcius = (temperatureFahrenheit-32)*5/9;
    }
  //Methode untuk menampilkan perintah ke user
    public String ask(){
        return "Masukkan nilai suhu (Fahrenheit): ";
    }
    
    public String judul(){
        return "Hasil konversi ke Celcius: ";
    }
   
    public String askLoop(){
        return "Ingin mengkonversi nilai lain?(y) ";
    }
}

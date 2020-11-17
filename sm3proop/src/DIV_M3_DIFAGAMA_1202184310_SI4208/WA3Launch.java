package DIV_M3_DIFAGAMA_1202184310_SI4208;

public class WA3Launch {

    public static void main(String[] args) {
        Lion ln = new Lion("Vertebrata", "Darat", "Leo-Singa", "Seksual", 4);
        ln.detail();
        ln.subFilum();
        ln.habitat();
        ln.sistemReproduksi();
        System.out.println();
        Worm wm = new Worm("Avertebrata", "Darat", "Aseksual dan Seksual", "Wormy-Cacing");
        wm.detail();
        wm.subFilum();
        wm.habitat();
        wm.sistemReproduksi();
    }
    
}

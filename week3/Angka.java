package week3;

public class Angka 
{
    int angka;
    
    public Angka(int angka)
    {
        this.angka = angka;
    }

    public void statusAngka(int a)
    {
        if(a < this.angka)
        {
            System.out.println("Angka terlalu kecil");
        }
        else
        {
            System.out.println("Angka terlalu besar");
        }

        System.out.println("Coba lagi");
    }

    public boolean cekAngka(int a)
    {
        if(a == this.angka)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

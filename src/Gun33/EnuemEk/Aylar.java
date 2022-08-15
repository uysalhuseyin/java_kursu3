package Gun33.EnuemEk;

public enum Aylar {

    OCAK(1, 31, "Ocak"),
    SUBAT(1, 31, "Ocak"),
    MART(1, 31, "Ocak"),
    NISAN(1, 31, "Ocak"),
    MAYIS(1, 31, "Ocak"),
    HAZIRAN(1, 31, "Ocak"),
    TEMMUZ(1, 31, "Ocak"),
    AGUSTOS(1, 31, "Ocak"),
    EYLUL(1, 31, "Ocak"),
    EKIM(1, 31, "Ocak"),
    KASIM(1, 31, "Ocak"),
    ARALIK(1, 31, "Ocak"),



    ;


    final int ayNo;
    final int gunMiktar;
    final String isim;

    Aylar(int ayNo, int gunMiktar, String isim) {
        this.ayNo = ayNo;
        this.gunMiktar = gunMiktar;
        this.isim = isim;
    }
}

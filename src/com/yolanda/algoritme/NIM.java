package com.yolanda.algoritme;

public class NIM {
    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjangPendidikan() {
        char kodeJP = nim.charAt(0);
        if (kodeJP == '1') {
            return "S1 (SARJANA)";
        } else if (kodeJP == '2') {
            return "S2 (MAGISTER)";
        } else if (kodeJP == '3') {
            return "S3 (DOKTOR)";
        }
        return "UNKNOWN";
    }

    public String getTahunMasuk() {
        char tm1 = nim.charAt(1);
        char tm2 = nim.charAt(2);

        return "20" + tm1 + tm2;
    }

    public String getFakultas() {
        char kodeFK = nim.charAt(3);
        if (kodeFK == '1') {
            return "TARBIYAH DAN KEGURUAN";
        } else if (kodeFK == '2') {
            return "SYARI'AH DAN HUKUM";
        } else if (kodeFK == '3') {
            return "USHULUDDIN";
        } else if (kodeFK == '4') {
            return "DAKWAH & KOMUNIKASI";
        } else if (kodeFK == '5') {
            return "SAINS DAN TEKNOLOGI";
        } else if (kodeFK == '6') {
            return "PSIKOLOGI";
        } else if (kodeFK == '7') {
            return "EKONOMI DAN ILMU SOSIAL";
        } else if (kodeFK == '8') {
            return "PERTANIAN DAN PETERNAKAN";
        }
        return "UNKNOWN";
    }

    public String getJurusan() {
        char kodeJurusan1 = nim.charAt(4);
        char kodeJurusan = nim.charAt(5);
        if (kodeJurusan == '1') {
            return "TEKNIK INFORMATIKA";
        } else if (kodeJurusan == '2') {
            return "TEKNIK INDUSTRI";
        } else if (kodeJurusan == '3') {
            return "SISTEM INFORMASI";
        } else if (kodeJurusan == '4') {
            return "MATEMATIKA";
        } else if (kodeJurusan == '5') {
            return "TEKNIK ELEKTRO";
        }
        return "UNKNOWN";
    }
    public String getJenisKelamin() {
        char kodeJk = nim.charAt(6);
        if (kodeJk == '1') {
            return "LAKI-LAKI";
        } else if (kodeJk == '2') {
            return "PEREMPUAN";
        }
        return "UNKNOWN";

    }
        public String getNoUrutMahasiswa() {
            char kd1 = nim.charAt(7);
            char kd2 = nim.charAt(8);
            char kd3 = nim.charAt(9);
            char kd4 = nim.charAt(10);

            return "" + kd1 + kd2 + kd3 + kd4;

        }
}

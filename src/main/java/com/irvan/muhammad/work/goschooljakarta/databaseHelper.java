package com.irvan.muhammad.work.goschooljakarta;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by Irvan on 03/05/2017.
 */

public class databaseHelper extends SQLiteOpenHelper {
    private static final String database_name   = "sekolah.file";
    private final String tb_name      = "tb_sekolah";
    private final String field_nama      = "nama";
    private final String field_alamat    = "alamat";
    private final String field_wilayah   = "wilayah";
    private final String field_telepon   = "telepon";
    private final String field_jenis     = "jenis";

    public databaseHelper(Context context) {
        super(context, database_name, null, 1);
        try {
            SQLiteDatabase db = this.getWritableDatabase();
        }catch (Exception e){
            Toast.makeText(context, "Error : " + e.getMessage().toString(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String sql_query1 = "CREATE TABLE `" + this.tb_name +"` (" +
                "  `" + this.field_nama +"` varchar(55) NOT NULL," +
                "  `" + this.field_alamat +"` varchar(55) NOT NULL," +
                "  `" + this.field_wilayah +"` varchar(35) NOT NULL," +
                "  `" + this.field_telepon +"` varchar(15) NOT NULL," +
                "  `" + this.field_jenis +"` varchar(10) NOT NULL" +
                ")";
        final String sql_query2 = "INSERT INTO `tb_sekolah` (`nama`, `alamat`, `wilayah`, `telepon`, `jenis`) VALUES" +
                "('SMPN 3', 'JL. MANGGARAI UTARA IV/6 MANGGARAI', 'Jakarta Selatan', '021 8303844', 'SMP')," +
                "('SMPN 11', 'JLN.KERINCI BLOK.E KEB.BARU JAK-SEL', 'Jakarta Selatan', '021 7221665', 'SMP')," +
                "('SMPN 12', 'JLN.WIJAYA IX NO.50 KEB.BARU JAK-SEL', 'Jakarta Selatan', '021 7208095', 'SMP')," +
                "('SMPN 13', 'JL.TIRTAYASA RAYA', 'Jakarta Selatan', '021 7262939', 'SMP')," +
                "('SMPN 15', 'JL. PROF. DR. SOEPOMO, SH MENTENG DALAM', 'Jakarta Selatan', '021 8312669', 'SMP')," +
                "('SMPN 16', 'JL.PALMERAH BARAT NO.59', 'Jakarta Selatan', '021 5483415', 'SMP')," +
                "('SMPN 19', 'JLN.BUMI BLOK.E NO.21 KEB.BARU JAK-SEL', 'Jakarta Selatan', '021 7250219', 'SMP')," +
                "('SMPN 29', 'JLN.BUMI BLOK.E', 'Jakarta Selatan', '021 7247493', 'SMP')," +
                "('SMPN 31', 'JL.PENINGGARAN BARAT III', 'Jakarta Selatan', '021 7239730', 'SMP')," +
                "('SMPN 33', 'JL. MENARA AIR I MANGGARAI, TEBET', 'Jakarta Selatan', '021 8304489', 'SMP')," +
                "('SMPN 37', 'JL. TAMAN WIJAYA KUSUMA RAYA CILANDAK', 'Jakarta Selatan', '021 7695272', 'SMP')," +
                "('SMPN 41', 'JL. HARSONO RM. RAGUNAN PASARMINGGU', 'Jakarta Selatan', '021 7814294', 'SMP')," +
                "('SMPN 43', 'JL. KAPTEN TENDEAN NO. 11 MAMPANG PRAPATAN', 'Jakarta Selatan', '021 7988023', 'SMP')," +
                "('SMPN 46', 'JL. RUKUN PEJATEN TIMUR PASARMINGGU', 'Jakarta Selatan', '021 7988153', 'SMP')," +
                "('SMPN 48', 'JL.KEBAYORAN LAMA 192', 'Jakarta Selatan', '021 7396648', 'SMP')," +
                "('SMPN 56', 'JL. JERUK PURUT RAYA CILANDAK', 'Jakarta Selatan', '021 7803516', 'SMP')," +
                "('SMPN 57', 'JL. HALIMUN NO. 2B SETIABUDI JAK-SEL', 'Jakarta Selatan', '021 8280960', 'SMP')," +
                "('SMPN 58', 'JL. SETIABUDI BARAT NO. 8K', 'Jakarta Selatan', '021 5224233', 'SMP')," +
                "('SMPN 66', 'JL.MASJID AN NUR KEB.LAMA', 'Jakarta Selatan', '021 7262921', 'SMP')," +
                "('SMPN 67', 'JL. MINANGKABAU DALAM NO.3 SETIABUDI JAK-SEL', 'Jakarta Selatan', '021 8291525', 'SMP')," +
                "('SMPN 68', 'JL. CIPETE III/4 CIPETE', 'Jakarta Selatan', '021 7695722', 'SMP')," +
                "('SMPN 73', 'JL. TEBET TIMUR I-F/14, TEBET', 'Jakarta Selatan', '021 8295378', 'SMP')," +
                "('SMPN 85', 'JL. MARGASATWA NO. 8 PONDOK LABU', 'Jakarta Selatan', '021 7657652', 'SMP')," +
                "('SMPN 86', 'JL. RS. FATMAWATI KOMP. BNI 46 CILANDAK', 'Jakarta Selatan', '021 7503160', 'SMP')," +
                "('SMPN 87', 'JL.CIPUTAT RAYA PD.PINANG', 'Jakarta Selatan', '021 7657687', 'SMP')," +
                "('SMPN 96', 'KOMP. TIMAH PONDOK LABU CILANDAK', 'Jakarta Selatan', '021 7658121', 'SMP')," +
                "('SMPN 98', 'JL. RAYA DEPOK, LENTENG AGUNG, JAGAKARSA', 'Jakarta Selatan', '021 7867633', 'SMP')," +
                "('SMPN 104', 'JL. MAMPANG PRAPATAN XIII', 'Jakarta Selatan', '021 7990565', 'SMP')," +
                "('SMPN 107', 'JL. RAYA PEJATEN KOMP. P DAN K', 'Jakarta Selatan', '021 7990977', 'SMP')," +
                "('SMPN 110', 'JL. KEMAJUAN PETUKANGAN SELATAN', 'Jakarta Selatan', '021 7342288', 'SMP')," +
                "('SMPN 115', 'JL. KH.ABDULLAH SYAFEI, TEBET', 'Jakarta Selatan', '021 8297511', 'SMP')," +
                "('SMPN 124', 'JL. KEMANG TIMUR I/5', 'Jakarta Selatan', '021 7988101', 'SMP')," +
                "('SMPN 131', 'JL. RM. KAHFI I, CIPEDAK, JAGAKARSA', 'Jakarta Selatan', '021 7270218', 'SMP')," +
                "('SMPN 141', 'JL. PONDOK JAYA VIII/15B', 'Jakarta Selatan', '021 7192868', 'SMP')," +
                "('SMPN 145', 'JL. MENTENG PULO UJUNG SETIABUDI', 'Jakarta Selatan', '021 70291900', 'SMP')," +
                "('SMPN 153', 'JL.CIDODOL RAYA NO.1', 'Jakarta Selatan', '021 7394260', 'SMP')," +
                "('SMPN 154', 'PENGADEGAN BARAT 13, PANCORAN', 'Jakarta Selatan', '021 7991643', 'SMP')," +
                "('SMPN 155', 'CIKOKO BARAT IV CIKOKO, PANCORAN', 'Jakarta Selatan', '021 7987400', 'SMP')," +
                "('SMPN 161', 'JL.DELMAN UTAMA I TANAH KUSIR', 'Jakarta Selatan', '021 7247127', 'SMP')," +
                "('SMPN 163', 'JL. EMPANG TIGA PEJATEN TIMUR', 'Jakarta Selatan', '021 7994079', 'SMP')," +
                "('SMPN 164', 'JL.DHARMA PUTRA RAYA 10', 'Jakarta Selatan', '021 7260333', 'SMP')," +
                "('SMPN 166', 'JL. KEDONDONG NO. 5, JAGAKARSA, JAGAKARSA', 'Jakarta Selatan', '021 7270219', 'SMP')," +
                "('SMPN 175', 'JL. JATIPADANG, JAGAKARSA, JAGAKARSA', 'Jakarta Selatan', '021 7811978', 'SMP')," +
                "('SMPN 177', 'JL. RAYA KODAM BINTARO PESANGGRAHAN', 'Jakarta Selatan', '021 7355975', 'SMP')," +
                "('SMPN 178', 'JL. MAWAR NO. 6A BINTARO PESANGGRAHAN', 'Jakarta Selatan', '021 73885370', 'SMP')," +
                "('SMPN 182', 'EMPANG TIGA KALIBATA, PANCORAN', 'Jakarta Selatan', '021 7994641', 'SMP')," +
                "('SMPN 185', 'JL.KEMANDONRAN I', 'Jakarta Selatan', '021 5307631', 'SMP')," +
                "('SMPN 211', 'JL. SMP 211, SRENGSENG SAWAH, JAGAKARSA', 'Jakarta Selatan', '021 7270204', 'SMP')," +
                "('SMPN 212', 'JL. BENDA ATAS JERUK PURUT CILANDAK TIMUR', 'Jakarta Selatan', '021 7800417', 'SMP')," +
                "('SMPN 218', 'JL. MENARA JATIPADANG PASARMINGGU', 'Jakarta Selatan', '021 7807305', 'SMP')," +
                "('SMPN 226', 'JL. KAYU KAPUR NO. 2', 'Jakarta Selatan', '021 7501270', 'SMP')," +
                "('SMPN 227', 'JL. MASJID AL FAJRI PEJETEN BARAT PASARMINGGU', 'Jakarta Selatan', '021 7971338', 'SMP')," +
                "('SMPN 235', 'JL. PD. INDAH PESANGGRAHAN', 'Jakarta Selatan', '021 7340973', 'SMP')," +
                "('SMPN 238', 'KALIBATA UTARA VI DUREN TIGA, PANCORAN', 'Jakarta Selatan', '021 7991565', 'SMP')," +
                "('SMPN 239', 'JL. NANGKA, TANJUNG BARAT, JAGAKARSA', 'Jakarta Selatan', '021 7818319', 'SMP')," +
                "('SMPN 240', 'JLN.H.RAYA 16 B', 'Jakarta Selatan', '021 7204711', 'SMP')," +
                "('SMPN 242', 'JL. SUBUR, LENTENG AGUNG, JAGAKARSA', 'Jakarta Selatan', '021 7869935', 'SMP')," +
                "('SMPN 245', 'JL. H. MUCHTAR RAYA PETUKANGAN UTARA', 'Jakarta Selatan', '021 70708245', 'SMP')," +
                "('SMPN 247', 'JL. MAMPANG PRAPATAN XIII', 'Jakarta Selatan', '021 7943835', 'SMP')," +
                "('SMPN 250', 'JLN.KH.H.NAIM III CIPETE', 'Jakarta Selatan', '021 7200396', 'SMP')," +
                "('SMPN 253', 'JL. KP. ALANG-ALANG, CIPEDAK, JAGAKARSA', 'Jakarta Selatan', '021 7864572', 'SMP')," +
                "('SMPN 254', 'JL. GANDARIA V, JAGAKARSA, JAGAKARSA', 'Jakarta Selatan', '021 7270842', 'SMP')," +
                "('SMPN 265', 'JL. ASEMBARIS II NO. 10 KEBON BARU', 'Jakarta Selatan', '021 8302935', 'SMP')," +
                "('SMPN 267', 'JL. MAIRIN SWADARMA RAYA ULUJAMI', 'Jakarta Selatan', '021 5852291', 'SMP')," +
                "('SMPN 276', 'JL. SEROJA, SRENGSENG SAWAH, JAGAKARSA', 'Jakarta Selatan', '021 7866427', 'SMP')," +
                "('SMPN 1', 'JL. CIKINI RAYA NO. 87 JAKARTA PUSAT', 'Jakarta Pusat', '021 31922417', 'SMP')," +
                "('SMPN 2', 'JL.MARADAI RAYA NO 11', 'Jakarta Pusat', '021 4243788', 'SMP')," +
                "('SMPN 4', 'JL.PERWIRA NO.10 JAKARTA PUSAT', 'Jakarta Pusat', '021 3844414', 'SMP')," +
                "('SMPN 5', 'JL.DR SUTOMO NO. 5 JAKARTA PUSAT', 'Jakarta Pusat', '021 3844986', 'SMP')," +
                "('SMPN 8', 'JL. PEGANGSAAN BARAT NO. 1', 'Jakarta Pusat', '021 3145570', 'SMP')," +
                "('SMPN 10', 'JL. SUMUR BATU KEMAYORAN JAK PUS', 'Jakarta Pusat', '021 4241406', 'SMP')," +
                "('SMPN 17', 'JL. KARANG ANYAR NO. 9 - 14 JAKARTA PUSAT', 'Jakarta Pusat', '021 6390329', 'SMP')," +
                "('SMPN 18', 'JL. MENTENG KECIL NO. 3', 'Jakarta Pusat', '021 31935565', 'SMP')," +
                "('SMPN 28', 'JL.MARDANI RAYA NO.17', 'Jakarta Pusat', '021 4246165', 'SMP')," +
                "('SMPN 38', 'JL. KARET PASAR BARU BARAT 1 NO.14', 'Jakarta Pusat', '021 5733602', 'SMP')," +
                "('SMPN 39', 'JALAN GAJAH MADA NO. 3 - 5 JAKARTA PUSAT', 'Jakarta Pusat', '021 63851721', 'SMP')," +
                "('SMPN 40', 'JL. DANAU LIMBOTO PEJOMPONGAN', 'Jakarta Pusat', '021 5737815', 'SMP')," +
                "('SMPN 47', 'RAWASARI TIMUR I', 'Jakarta Pusat', '021 4200349', 'SMP')," +
                "('SMPN 59', 'JLN. BENDUNGAN JAGO RAYA NO. 40 KEMAYORAN JAKPUS', 'Jakarta Pusat', '021 4254310', 'SMP')," +
                "('SMPN 60', 'JL SANGIHE NO 26 JAKARTA PUSAT', 'Jakarta Pusat', '021 63863113', 'SMP')," +
                "('SMPN 64', 'JL. KARANG ANYAR 9-14 JAKARTA PUSAT', 'Jakarta Pusat', '021 6289762', 'SMP')," +
                "('SMPN 70', 'JL. H. AWALUDIN IV KEBON MELATI TANAH ABANG', 'Jakarta Pusat', '021 3102278', 'SMP')," +
                "('SMPN 71', 'JL.KOMPLEK PENDIDIKAN RAWA KERBAU', 'Jakarta Pusat', '021 4213554', 'SMP')," +
                "('SMPN 72', 'JL.PETOJO BINATU NO.2 KEC GAMBIR JAKARTA PUSAT', 'Jakarta Pusat', '021 6327871', 'SMP')," +
                "('SMPN 76', 'JL.PERCETAKAN NEGARA II', 'Jakarta Pusat', '021 4248479', 'SMP')," +
                "('SMPN 77', 'JL.CEMPAKA PUTIH TENGAH 18', 'Jakarta Pusat', '021 4245377', 'SMP')," +
                "('SMPN 78', 'JL. PERUNGGU NO.56 HARAPAN MULIA KEMAYORAN', 'Jakarta Pusat', '021 4240289', 'SMP')," +
                "('SMPN 79', 'JL. DAKOTA RAYA KEMAYORAN JAKARTA PUSAT', 'Jakarta Pusat', '021 4208740', 'SMP')," +
                "('SMPN 93', 'JL. GUNUNG SAHARI RAYA NO.81 JAKARTA PUSAT', 'Jakarta Pusat', '021 4247349', 'SMP')," +
                "('SMPN 94', 'JLN. TANAH ABANG V/29 JAKARTA PUSAT', 'Jakarta Pusat', '021 3805680', 'SMP')," +
                "('SMPN 118', 'JL.PRAMUKASARI I', 'Jakarta Pusat', '021 4245169', 'SMP')," +
                "('SMPN 119', 'JL.HARAPAN JAYA IX NO.5', 'Jakarta Pusat', '021 4245304', 'SMP')," +
                "('SMPN 137', 'JL.CEMPAKA PUTIH BARAT 15', 'Jakarta Pusat', '021 4244612', 'SMP')," +
                "('SMPN 156', 'JL.KRAMAT PULO GUNDUL III', 'Jakarta Pusat', '021 4214306', 'SMP')," +
                "('SMPN 181', 'JL. MESJID I KARET TENGSIN', 'Jakarta Pusat', '021 5738060', 'SMP')," +
                "('SMPN 183', 'JL.CEMPAKA BARU VII/47', 'Jakarta Pusat', '021 4245884', 'SMP')," +
                "('SMPN 216', 'JLN. SALEMBA RAYA NO. 18', 'Jakarta Pusat', '021 31931857', 'SMP')," +
                "('SMPN 228', 'JLN. SUMUR BATU RAYA NO. 6 KEMAYORAN', 'Jakarta Pusat', '021 4202430', 'SMP')," +
                "('SMPN 269', 'JL. HARAPAN MULIA KEMAYORAN JAKARTA PUSAT', 'Jakarta Pusat', '021 4212795', 'SMP')," +
                "('SMPN 273', 'JL. KAMPUNG BALI 24/1 TN. ABANG', 'Jakarta Pusat', '021 3143012', 'SMP')," +
                "('SMP Negeri 216 ', 'JL. Salemba Raya No. 18                                ', 'Jakarta Pusat', '31931857', 'SMPN SSN')," +
                "('SMP Negeri 1 ', 'JL. Raya Cikini No. 87                                 ', 'Jakarta Pusat', '31922417', 'SMPN SSN')," +
                "('SMP Negeri 5 ', 'JL. Dr Sutomo No. 5 Sawah Besar                        ', 'Jakarta Pusat', '3844986', 'SMPN SSN')," +
                "('SMP Negeri 30 ', 'JL. Anggrek No. 4 Koja                                 ', 'Jakarta Utara', '43911051', 'SMPN SSN')," +
                "('SMP Negeri 95 ', 'JL. Warakas VI Papongo Tanjung Priok                   ', 'Jakarta Utara', '43937969', 'SMPN SSN')," +
                "('SMP Negeri 231 ', 'JL. Raya Tugu Semper Cilincing                         ', 'Jakarta Utara', '4400643', 'SMPN SSN')," +
                "('SMP Negeri 244 ', 'JL. Cilincing Bhakti VI No. 28                         ', 'Jakarta Utara', '4400872', 'SMPN SSN')," +
                "('SMP Negeri 75 ', 'JL. Raya Kebon Jeruk                                   ', 'Jakarta Barat', '5483496', 'SMPN SSN')," +
                "('SMP Negeri 45 ', 'JL. Utama Raya No. 45 Cengkareng                       ', 'Jakarta Barat', '6191705', 'SMPN SSN')," +
                "('SMP Negeri 111 ', 'JL. Bhakti VII Kemanggisan                             ', 'Jakarta Barat', '5482423', 'SMPN SSN')," +
                "('SMP Negeri 206 ', 'JL. Meruya Selatan, Kembangan                          ', 'Jakarta Barat', '5850137', 'SMPN SSN')," +
                "('SMP Negeri 115 ', 'Jl. KH Abdullah Syafei, Tebet                          ', 'Jakarta Selatan', '8297511', 'SMPN SSN')," +
                "('SMP Negeri 11 ', 'Jl. Kerinci VII Blok E, Kebayoran Baru                 ', 'Jakarta Selatan', '7221665', 'SMPN SSN')," +
                "('SMP Negeri 19 ', 'Jl. Bumi BLOK E, No 21 Keb.Baru                        ', 'Jakarta Selatan', '7250219', 'SMPN SSN')," +
                "('SMP Negeri 41 ', 'Jl. Harsono RM. Ragunan                                ', 'Jakarta Selatan', '', 'SMPN SSN')," +
                "('SMP Negeri 85 ', 'Jl. Margasatwa No. 8 Pd. Labu, Cilandak                ', 'Jakarta Selatan', '7657652', 'SMPN SSN')," +
                "('SMP Negeri 161 ', 'Jl. Delman Kencana II Tanah Kusir, Kebayoran Lama      ', 'Jakarta Selatan', '7247127', 'SMPN SSN')," +
                "('SMP Negeri 68 ', 'Jl. Cipete III/4                                       ', 'Jakarta Selatan', '7695722', 'SMPN SSN')," +
                "('SMP Negeri 109', 'Jl. Kesehatan Kodam V Makassar                         ', 'Jakarta Timur', '8615289', 'SMPN SSN')," +
                "('SMP Negeri 49 ', 'Jl Raya Bogor , Kramat Jati                            ', 'Jakarta Timur', '8090200', 'SMPN SSN')," +
                "('SMP Negeri 81 ', 'Jl. Monumen Pancasila Sakti Lubang Buaya               ', 'Jakarta Timur', '8408656', 'SMPN SSN')," +
                "('SMP Negeri 103 ', 'Jl. RA Fadillah Komp Kopassus Cijantung                ', 'Jakarta Timur', '8400005', 'SMPN SSN')," +
                "('SMP Negeri 102 ', 'Jl. Sederhana Raya Cijantung                           ', 'Jakarta Timur', '8401794', 'SMPN SSN')," +
                "('SMP Negeri 128 ', 'Jl. Herkules Halim Perdana Kusuma                      ', 'Jakarta Timur', '8009861', 'SMPN SSN')," +
                "('SMP Negeri 172 ', 'Jl. Raya Stasiun Cakung Pulo Gebang                    ', 'Jakarta Timur', '4805079', 'SMPN SSN')," +
                "('SMP Negeri 193 ', 'Jl. Ujung Menteng Cakung                               ', 'Jakarta Timur', '4512775', 'SMPN SSN')," +
                "('SMP Negeri 199 ', 'Jl. Arabica S Blok AC 3 Pondok Kopi                    ', 'Jakarta Timur', '8624937', 'SMPN SSN')," +
                "('SMP Negeri 236 ', 'Jl. Penggilingan Komplek PIK                           ', 'Jakarta Timur', '4604272', 'SMPN SSN')," +
                "('SMP Negeri 252', 'Jl Naman Pondok Kelapa', 'Jakarta Timur', '86905247', 'SMPN SSN')," +
                "('SMP Negeri 255 ', 'Jl. Raden Inten Duren Sawit                            ', 'Jakarta Timur', '8601993', 'SMPN SSN')," +
                "('SMP Negeri 27 ', 'Komp PTB Duren Sawit                                   ', 'Jakarta Timur', '8615189', 'SMPN SSN')," +
                "('SMP Negeri 74 ', 'Jl. Pemuda No 6 P. Gadung                              ', 'Jakarta Timur', '4892521', 'SMPN SSN')," +
                "('SMP Negeri 139 ', 'Jl. Bunga Rampai X Perumnas Klender                    ', 'Jakarta Timur', '86622390', 'SMPN SSN')," +
                "('SMP Negeri 92 ', 'Jl. Perhubungan XII Rawamangun                         ', 'Jakarta Timur', '4713051', 'SMPN SSN')," +
                "('SMP Negeri 9 ', 'Jl. Kelapa Dua Wetan Ciracas                           ', 'Jakarta Timur', '8719966', 'SMPN SSN')," +
                "('SMP Negeri 179 ', 'Jl. Kalisari Pasar Rebo,                               ', 'Jakarta Timur', '8711073', 'SMPN SSN')," +
                "('SMK 1', 'Jl.Budi Utomo No.7 Sawah Besar', 'Jakarta Pusat', '021-3813630', 'SMK')," +
                "('SMK 2', 'Jl.Batu No.3 Gambir ', 'Jakarta Pusat', '021-3846219', 'SMK')," +
                "('SMK 3', 'Jl.Garuda No.63 Kemayoran', 'Jakarta Pusat', '021-4209629', 'SMK')," +
                "('SMK 4', 'Jl.Rorotan Cilincing Tj.Priok', 'Jakarta Utara', '021-4413948', 'SMK')," +
                "('SMK 5', 'Jl.Pisangan Baru Timur No.7 ', 'Jakarta Timur', '021-8507824', 'SMK')," +
                "('SMK 6', 'Jl.Prof.Joko Sutono SH No.2 A', 'Jakarta Selatan', '021-7208718', 'SMK')," +
                "('SMK 7', 'Jl.Tenggiri No.1 Rawamangun', 'Jakarta Timur', '021-4711564', 'SMK')," +
                "('SMK 8', 'Jl.Raya Pejaten pasar Minggu', 'Jakarta Selatan', '021-7996493', 'SMK')," +
                "('SMK 9', 'Jl.Gedong Panjang II/17', 'Jakarta Barat', '021-6925936', 'SMK')," +
                "('SMK 10', 'Jl.Letjen Sutoyo By Pass Cililitan', 'Jakarta Utara', '021-8091773', 'SMK')," +
                "('SMK 11', 'Jl.Pinangsia I/20 Tamansari', 'Jakarta Barat', '021-6241342', 'SMK')," +
                "('SMK 12', 'Jl.Kebon Bawang XIV Tj.Priok', 'Jakarta Utara', '021-492785', 'SMK')," +
                "('SMK 13', 'Jl.Rawa Belong II-E Palmerah', 'Jakarta Barat', '021-5492970', 'SMK')," +
                "('SMK 14', 'Jl.Percetakan Negara IIA', 'Jakarta Pusat', '021-4240543', 'SMK')," +
                "('SMK 15', 'Jl.Mataram I Kebayoran Baru', 'Jakarta Selatan', '021-7243559', 'SMK')," +
                "('SMK 16', 'Jl.Taman Amir Hamzah', 'Jakarta Pusat', '021-3904112', 'SMK')," +
                "('SMK 17', 'Jl.G.Slipi Palmerah', 'Jakarta Barat', '021-5484134', 'SMK')," +
                "('SMK 18', 'Jl.Ciputat Raya Kebayoran Lama', 'Jakarta Selatan', '021-7513729', 'SMK')," +
                "('SMK 19', 'Jl.Danau Limboto II Bendungan Hilir', 'Jakarta Pusat', '021-5734929', 'SMK')," +
                "('SMK 20', 'Jl.Melati 24 Cilandak', 'Jakarta Selatan', '021-7694223', 'SMK')," +
                "('SMK 21', 'Jl.Kemayoran Gempol', 'Jakarta Pusat', '021-4247475', 'SMK')," +
                "('SMK 22', 'Jl.Condet Raya Pasar Rebo', 'Jakarta Timur', '021-8400901', 'SMK')," +
                "('SMK 23', 'Jl.Pademangan III No.19', 'Jakarta Utara', '021-683210', 'SMK')," +
                "('SMK 24', 'Jl.Bambu Wulung Cipayung', 'Jakarta Timur', '021-8441976', 'SMK')," +
                "('SMK 25', 'Jl.Ragunan Pasar Minggu', 'Jakarta Selatan', '021-7805695', 'SMK')," +
                "('SMK 26', 'Jl.Balai Pustaka Baru I Rawamangun', 'Jakarta Timur', '021-4720310', 'SMK')," +
                "('SMK 27', 'Jl.Dr.Sutomo No.1 Pasar Baru', 'Jakarta Pusat', '021-3845739', 'SMK')," +
                "('SMK 28', 'Jl.Maritim Cilandak', 'Jakarta Selatan', '021-7692004', 'SMK')," +
                "('SMK 29', 'Jl.Prof.Joko Sutono SH. No.1 Kebayoran Baru', 'Jakarta Selatan', '021-7222471', 'SMK')," +
                "('SMK 30', 'Jl.Pakubowono VI Kebazoran Baru', 'Jakarta Selatan', '021-72221253', 'SMK')," +
                "('SMK 31', 'Jl.Kramat Jaya Baru Blok D II', 'Jakarta Pusat', '021-4246015', 'SMK')," +
                "('SMK 32', 'Jl.Tebet Dalam IV/I', 'Jakarta Selatan', '021-8290165', 'SMK')," +
                "('SMK 33', 'Jl.Gading Mas Timur II Kelapa Gading', 'Jakarta Utara', '021-9168446', 'SMK')," +
                "('SMK 34', 'Jl.Kramat Raya No.93', 'Jakarta Pusat', '021-3909035', 'SMK')," +
                "('SMK 35', 'Jl.Kerajinan No.42 Taman Sari', 'Jakarta Barat', '021-6343146', 'SMK')," +
                "('SMK 36', 'Jl.Baru Kosambi III Cilincing', 'Jakarta Utara', '021-4401523', 'SMK')," +
                "('SMK 37', 'Jl.Pertanian III Pasar Minggu', 'Jakarta Selatan', '021-7805787', 'SMK')," +
                "('SMK 38', 'Jl.Kebon Sirih No.98', 'Jakarta Pusat', '021-3441788', 'SMK')," +
                "('SMK 39', 'Jl.Cempaka Putih Tengah VI/2', 'Jakarta Pusat', '021-4246845', 'SMK')," +
                "('SMK 40', 'Jl.Nanas II Utan Kayu', 'Jakarta Timur', '021-8563329', 'SMK')," +
                "('SMK 41', 'Jl.Margasatwa Pondok Labu', 'Jakarta Selatan', '021-7512190', 'SMK')," +
                "('SMK 42', 'Jl.Kamal Raya Cengkareng', 'Jakarta Barat', '021-6190365', 'SMK')," +
                "('SMK 43', 'Jl.Cipulir Kebazoran lama', 'Jakarta Selatan', '021-7257532', 'SMK')," +
                "('SMK 44', 'Jl.Harapan Jaya 9/5 A Cempaka Baru', 'Jakarta Pusat', '021-4240912', 'SMK')," +
                "('SMK 45', 'Jl.KPBD Sukabumi Selatan', 'Jakarta Barat', '021-5480075', 'SMK')," +
                "('SMK 46', 'Jl.B7 Cipinang Pulo Jatinegara', 'Jakarta Timur', '021-8195127', 'SMK')," +
                "('SMK 47', 'Jl.Condet Pejaten Pasar Minggu', 'Jakarta Selatan', '021-7995116', 'SMK')," +
                "('SMK 48', 'Jl.Raya Perumnas Klender', 'Jakarta Timur', '021-8617467', 'SMK')," +
                "('SMK 49', 'Jl.Sarang Bango Marunda', 'Jakarta Utara', '021-44851079', 'SMK')," +
                "('SMK 50', 'Jl.Cipinang Muara I Duren Sawit', 'Jakarta Timur', '021-8194466', 'SMK')," +
                "('SMK 51', 'Jl.Swadaya Bambu Apus', 'Jakarta Timur', '021-8444903', 'SMK')," +
                "('SMK 52', 'Jl.Pusdika (Tarunajaya) Cibubur', 'Jakarta Timur', '021-8732519', 'SMK')," +
                "('SMK 53', 'Jl.Manggabesar VI/27 Tamansari', 'Jakarta Barat', '021-6392046', 'SMK')," +
                "('SMK 54', 'Jl.Bendungan Jago 53', 'Jakarta Pusat', '021-4248741', 'SMK')," +
                "('SMK 55', 'Jl.Pademangan VII', 'Jakarta Utara', '021-6412787', 'SMK')," +
                "('SMK 56', 'Jl.Raya Pluit Timur', 'Jakarta Utara', '021-6602880', 'SMK')," +
                "('SMK 57', 'Jl.Taman Margasatwa 38-B', 'Jakarta Selatan', '021-7806249', 'SMK')," +
                "('SMK 58', 'Jl.Swadaya II Bambu Apus Cipayung', 'Jakarta Timur', '021-8446304', 'SMK');";
        final String sql_query3 = "INSERT INTO `tb_sekolah` (`nama`, `alamat`, `wilayah`, `telepon`, `jenis`) VALUES" +
                "('SMA Negeri 7         ', 'JL. Karet Ps. Baru Barat V                       ', 'Jakarta Pusat', '5720934', 'SMAN')," +
                "('SMA Negeri 35       ', 'JL. Mutiara                                            ', 'Jakarta Pusat', '5736914', 'SMAN')," +
                "('SMA Negeri 24       ', 'JL. Lapangan Tembak Senayan             ', 'Jakarta Pusat', '5736984', 'SMAN')," +
                "('SMA Negeri 68       ', 'Jl. Salemba Raya 18                                ', 'Jakarta Pusat', '3142929', 'SMAN')," +
                "('SMA Negeri 27       ', 'Jl. Mardani Raya                                      ', 'Jakarta Pusat', '4245969', 'SMAN')," +
                "('SMA Negeri 30', 'Jl. Jend. A. Yani', 'Jakarta Pusat', '4244015', 'SMAN')," +
                "('SMA Negeri 77', 'Jl. Cempaka Putih Tengah 17', 'Jakarta Pusat', '4252864', 'SMAN')," +
                "('SMA Negeri 5         ', 'Jl. Raya Sumur Batu                                ', 'Jakarta Pusat', '4243869', 'SMAN')," +
                "('SMA Negeri 1         ', 'Jl. Budi Utomo No. 7                                ', 'Jakarta Pusat', '3865001', 'SMAN')," +
                "('SMA Negeri 20       ', 'Jl. Krekot Bunder III/I                                ', 'Jakarta Pusat', '3440021', 'SMAN')," +
                "('SMA Negeri 10       ', 'Jl. Mangga Besar XIII                               ', 'Jakarta Pusat', '6590192', 'SMAN')," +
                "('SMA Negeri 4         ', 'Jl. Batu No. 3 Gambir                               ', 'Jakarta Pusat', '3843937', 'SMAN')," +
                "('SMA Negeri 25       ', 'Jl. Am. Sangaji No. 22-24                         ', 'Jakarta Pusat', '6331921', 'SMAN')," +
                "('SMA Negeri 111    ', 'Jl. Bandengan Utara No. 80                      ', 'Jakarta Utara', '6611703', 'SMAN')," +
                "('SMA Negeri 40     ', 'Jl. Budimulya Raya                                     ', 'Jakarta Utara', '6402464', 'SMAN')," +
                "('SMA Negeri 18     ', 'Jl. Warakas I                                          ', 'Jakarta Utara', '4353561', 'SMAN')," +
                "('SMA Negeri 15     ', 'Jl. Agung Utara STS Blok A                        ', 'Jakarta Utara', '6452717', 'SMAN')," +
                "('SMA Negeri 41     ', 'Jl. Laks. RE. Martadinata                            ', 'Jakarta Utara', '6518840', 'SMAN')," +
                "('SMA Negeri 80     ', 'Jl. Sunter Karya Selatan V                          ', 'Jakarta Utara', '64716130', 'SMAN')," +
                "('SMA Negeri 13     ', 'Jl. Seroja No. 1 Koja                                  ', 'Jakarta Utara', '4303676', 'SMAN')," +
                "('SMA Negeri 110    ', 'Jl. Bendungan Melayu No. 80                     ', 'Jakarta Utara', '4350059', 'SMAN')," +
                "('SMA Negeri 45     ', 'Jl. Perintis Kemerdekaan                             ', 'Jakarta Utara', '4527345', 'SMAN')," +
                "('SMA Negeri 72', 'Jl. Prihatin Komp. TNI AL Kodamar', 'Jakarta Utara', '45850134', 'SMAN')," +
                "('SMA Negeri 114    ', 'Jl. Pedongkelan/Cilincing Bakti No. 35       ', 'Jakarta Utara', '4404611', 'SMAN')," +
                "('SMA Negeri 52     ', 'Jl. Raya Tugu Semper                                  ', 'Jakarta Utara', '4405378', 'SMAN')," +
                "('SMA Negeri 75     ', 'Jl. Tipar Cakung                                       ', 'Jakarta Utara', '4402862', 'SMAN')," +
                "('SMA Negeri 73     ', 'Jl. Raya Cakung Cilincing                            ', 'Jakarta Utara', '4401622', 'SMAN')," +
                "('SMA Negeri 92', 'Jl. Komp. Pemadam Kebakaran', 'Jakarta Utara', '4415615', 'SMAN')," +
                "('SMA Negeri 83     ', 'Jl. Tipar Cakung Sukapura                          ', 'Jakarta Utara', '4403010', 'SMAN')," +
                "('SMA Negeri 115    ', 'Jl. Rorotan X                                          ', 'Jakarta Utara', '44850555', 'SMAN')," +
                "('SMA Negeri 33', 'Jl. Kamal Raya No. 54                          ', 'Jakarta Barat', '6191043', 'SMAN')," +
                "('SMA Negeri 96         ', 'Jl. Jati Raya 40                                    ', 'Jakarta Barat', '5403058', 'SMAN')," +
                "('SMA Negeri 19          ', 'Jl. Perniagaan No. 31                           ', 'Jakarta Barat', '6904454', 'SMAN')," +
                "('SMA Negeri 17          ', 'Jl. Blandongan No. 37                           ', 'Jakarta Barat', '6493216', 'SMAN')," +
                "('SMA Negeri 2            ', 'Jl. Gajah Mada 175                              ', 'Jakarta Barat', '6294318', 'SMAN')," +
                "('36  SMA Negeri 23          ', 'Jl. Mandala Utara                                 ', 'Jakarta Barat', '5672730', 'SMAN')," +
                "('37  SMA Negeri 16', 'Jl. Belibis Terusan, No. 16', 'Jakarta Barat', '5357928', 'SMAN')," +
                "('38  SMA Negeri 78          ', 'Jl. Bhakti V/1, Kemanggisan                 ', 'Jakarta Barat', '5482914', 'SMAN')," +
                "('39  SMA Negeri 56          ', 'Jl.Kamar Raya                                     ', 'Jakarta Barat', '5550938', 'SMAN')," +
                "('40  SMA Negeri 95', 'Jl. Satu Maret No. 49', 'Jakarta Barat', '54380671', 'SMAN')," +
                "('41  SMA Negeri 84          ', 'Jl. Peta Barat No.42                             ', 'Jakarta Barat', '5402584', 'SMAN')," +
                "('42  SMA Negeri 94', 'Jl. Raya Semanan', 'Jakarta Barat', '5417052', 'SMAN')," +
                "('43  SMA Negeri 57          ', 'Jl. Raya Kedoya                                   ', 'Jakarta Barat', '5801665', 'SMAN')," +
                "('44  SMA Negeri 65          ', 'Jl. Raya Kelapa Dua                             ', 'Jakarta Barat', '5492759', 'SMAN')," +
                "('45  SMA Negeri 112         ', 'Jl. Sanggrahan Meruya Utara               ', 'Jakarta Barat', '5850695', 'SMAN')," +
                "('46  SMA Negeri 85          ', 'Jl. Srengseng Raya                              ', 'Jakarta Barat', '5840921', 'SMAN')," +
                "('47  SMA Negeri 101         ', 'Jl. Kompleks Joglo Baru                       ', 'Jakarta Barat', '5847332', 'SMAN')," +
                "('48 SMA Negeri 109', 'Jl. Gardu', 'Jakarta Selatan', '7270125', 'SMAN')," +
                "('49 SMA Negeri 38', 'Jl. Raya Lenteng Agung', 'Jakarta Selatan', '7270960', 'SMAN')," +
                "('50 SMA Negeri 97     ', 'Jl. Brigif 2                                ', 'Jakarta Selatan', '7270960', 'SMAN')," +
                "('51 SMA Negeri 49     ', 'Jl. Pepaya No. 9                            ', 'Jakarta Selatan', '7270167', 'SMAN')," +
                "('52 SMA Negeri 28     ', 'Jl. Ragunan                                   ', 'Jakarta Selatan', '7806293', 'SMAN')," +
                "('53 SMA Negeri 34     ', 'Jl. Margasatwa Raya No. I            ', 'Jakarta Selatan', '7690064', 'SMAN')," +
                "('54 SMA Negeri 66     ', 'Jl. Bango III                                 ', 'Jakarta Selatan', '7691403', 'SMAN')," +
                "('55 SMA Negeri 63     ', 'Jl. Amd V Manunggal V/57            ', 'Jakarta Selatan', '7354473', 'SMAN')," +
                "('56 SMA Negeri 90     ', 'Jl. Sabar Petukangan                    ', 'Jakarta Selatan', '7341866', 'SMAN')," +
                "('57 SMA Negeri 87     ', 'Jl. Mawar II Bintaro                          ', 'Jakarta Selatan', '73881969', 'SMAN')," +
                "('58 SMA Negeri 86', 'Jl. Bintaro Raya Komp. Depsos', 'Jakarta Selatan', '7341362', 'SMAN')," +
                "('59 SMA Negeri 32     ', 'Jl.Panjang Komp.Sekneg Baru Cidodol', 'Jakarta Selatan', '7395532', 'SMAN')," +
                "('60 SMA Negeri 29     ', 'Jl. Kramat No. 6 Kebayoran Lama     ', 'Jakarta Selatan', '7395831', 'SMAN')," +
                "('61 SMA Negeri 47     ', 'Jl. Delman Utama I                          ', 'Jakarta Selatan', '7260904', 'SMAN')," +
                "('62 SMA Negeri 74     ', 'Jl. Darma Putra XI                          ', 'Jakarta Selatan', '7260377', 'SMAN')," +
                "('63 SMA Negeri 108', 'Jl. Peninggaran Barat I', 'Jakarta Selatan', '7376876', 'SMAN')," +
                "('64 SMA Negeri 82     ', 'Jl. Daha II / 15a                            ', 'Jakarta Selatan', '7246413', 'SMAN')," +
                "('65 SMA Negeri 6       ', 'Jl. Mahakam I/2 Blok C             ', 'Jakarta Selatan', '7208762', 'SMAN')," +
                "('66 SMA Negeri 70', 'Jl. Bulungan Blok C', 'Jakarta Selatan', '7245013', 'SMAN')," +
                "('67 SMA Negeri 46     ', 'Jl. Masjid Darussalam                   ', 'Jakarta Selatan', '7246695', 'SMAN')," +
                "('68 SMA Negeri 60     ', 'Jl. Kemang Timur I No. 6         ', 'Jakarta Selatan', '7992054', 'SMAN')," +
                "('69 SMA Negeri 55     ', 'Jl. Minyak Raya Duren Tiga           ', 'Jakarta Selatan', '7996120', 'SMAN')," +
                "('70 SMA Negeri 26     ', 'Jl. Tebet Barat IV                          ', 'Jakarta Selatan', '8294645', 'SMAN')," +
                "('71 SMA Negeri 37', 'Jl. H. Kebon Baru Tebet', 'Jakarta Selatan', '8301916', 'SMAN')," +
                "('72 SMA Negeri 8       ', 'Jl. Bukit Duri                                  ', 'Jakarta Selatan', '8295455', 'SMAN')," +
                "('73 SMA Negeri 3', 'Jl. Setiabudi II', 'Jakarta Selatan', '525921382', 'SMAN')," +
                "('74 SMA Negeri 43     ', 'Jl. Minangkabau Dalam                 ', 'Jakarta Selatan', '8297076', 'SMAN')," +
                "('75 SMA Negeri 79     ', 'Jl. Menteng Pulo Ujung                        ', 'Jakarta Selatan', '8297039', 'SMAN')," +
                "('76   SMA Negeri 106', 'Jl. Gandaria I', 'Jakarta Timur', '87704527', 'SMAN')," +
                "('77   SMA Negeri 104   ', 'Jl. H. Taiman Barat                             ', 'Jakarta Timur', '8408247', 'SMAN')," +
                "('78   SMA Negeri 39     ', 'Jl. Ksatriaan Cijantung                        ', 'Jakarta Timur', '8400278', 'SMAN')," +
                "('79   SMA Negeri 88', 'Jl. Sawo Indah', 'Jakarta Timur', '87704525', 'SMAN')," +
                "('80   SMA Negeri 98     ', 'Jl. Jaha No. 1                                      ', 'Jakarta Timur', '8714579', 'SMAN')," +
                "('81   SMA Negeri 99', 'Jl. Cibubur II', 'Jakarta Timur', '8712007', 'SMAN')," +
                "('82   SMA Negeri 105', 'Jl. Usman Klp.Dua Wetan', 'Jakarta Timur', '8714217', 'SMAN')," +
                "('83   SMA Negeri 58', 'Jl. Raya Ciracas', 'Jakarta Timur', '8440251', 'SMAN')," +
                "('84   SMA Negeri 113   ', 'Jl. Albaido I                                        ', 'Jakarta Timur', '8408034', 'SMAN')," +
                "('85   SMA Negeri 64     ', 'Jl. Raya Cipayung                               ', 'Jakarta Timur', '8444750', 'SMAN')," +
                "('86   SMA Negeri 48', 'Jl. Pinangranti II Taman Mini', 'Jakarta Timur', '8006204', 'SMAN')," +
                "('87   SMA Negeri 9', 'Jl. SMU Negeri 9', 'Jakarta Timur', '80871037', 'SMAN')," +
                "('88   SMA Negeri 42', 'Jl. Rajawali', 'Jakarta Timur', '80887233', 'SMAN')," +
                "('89   SMA Negeri 67', 'Jl. Squadron Halim PK', 'Jakarta Timur', '80880246', 'SMAN')," +
                "('90   SMA Negeri 81', 'Jl. Kompleks KODAM/Kartika Ekapaksi', 'Jakarta Timur', '86612891', 'SMAN')," +
                "('91   SMA Negeri 62', 'Jl. Raya Bogor', 'Jakarta Timur', '80884987', 'SMAN')," +
                "('92   SMA Negeri 51     ', 'Jl. Batu Ampar                                  ', 'Jakarta Timur', '8093125', 'SMAN')," +
                "('93   SMA Negeri 93     ', 'Jl. Kompleks Paspampres                 ', 'Jakarta Timur', '8402939', 'SMAN')," +
                "('94   SMA Negeri 14     ', 'Jl. SMU XIV Cililitan                            ', 'Jakarta Timur', '8090296', 'SMAN')," +
                "('95   SMA Negeri 54     ', 'Jl. Jatinegara Timur IV                         ', 'Jakarta Timur', '8194271', 'SMAN')," +
                "('96   SMA Negeri 53     ', 'Jl. Cipinang Jaya 2 B                        ', 'Jakarta Timur', '8194415', 'SMAN')," +
                "('97   SMA Negeri 100   ', 'Jl. Persatuan 2                          ', 'Jakarta Timur', '8500881', 'SMAN')," +
                "('98   SMA Negeri 50', 'Jl. PLN Cipinang Muara', 'Jakarta Timur', '8195659', 'SMAN')," +
                "('99   SMA Negeri 61     ', 'Jl. Pahlawan Revolusi                       ', 'Jakarta Timur', '8617255', 'SMAN')," +
                "('100 SMA Negeri 71     ', 'Jl. Kav. TNI AL                                ', 'Jakarta Timur', '8614112', 'SMAN')," +
                "('PUSPITA PERSADA', 'Jl.SMU 63 Petukangan Utara Pesanggrahan', 'JAKARTA SELATAN', '', 'SMK')," +
                "('BINA KUSUMA 1', 'Jl. Merpati Raya No.38 Pesanggrahan', 'JAKARTA SELATAN', '', 'SMK')," +
                "('PLUS AL MUSYARROFAH', 'Jl.H.Mukhtar Raya No.95 Pet.Utara Pesanggrahan', 'JAKARTA SELATAN', '', 'SMK')," +
                "('10 NOPEMBER', 'Jl.H.Ilyas No.27 Pet.Utara Pesanggrahan', 'JAKARTA SELATAN', '', 'SMK')," +
                "('PERWIRA', 'Jl.H.Dilun No.4 Ulujami Pesanggrahan', 'JAKARTA SELATAN', '', 'SMK')," +
                "('PUTRA SATRIA', 'Jl.Ciledug Raya 46 Pet. Utara Pesanggrahan', 'JAKARTA SELATAN', '', 'SMK')," +
                "('KARTIKA X-2', 'Jl.Anggrek No.1 Bintaro Kodam Pesanggrahan', 'JAKARTA SELATAN', '', 'SMK')," +
                "('DAARUL ULUUM', 'Jl.Pedurenan Raya No.53 Karet Kuningan Stbudi', 'JAKARTA SELATAN', '', 'SMK')," +
                "('YASPEN', 'Jl.Menteng Wadas Tengah No.30 Ps.Manggis', 'JAKARTA SELATAN', '', 'SMK')," +
                "('BUDI ASIH', 'Jl.Bukit Tinggi No.3 Setiabudi', 'JAKARTA SELATAN', '', 'SMK')," +
                "('RPI', 'Jl.H.R.Rasuna Said Kav. X2-2 Kuningan Tmr.Stbudi', 'JAKARTA SELATAN', '', 'SMK')," +
                "('SUMBER DAYA MANUSIA', 'Jl.Amil Buncit Indah IB RT 002/05 Pancoran', 'JAKARTA SELATAN', '', 'SMK')," +
                "('MITRA PEMBANGUNAN', 'Jl.Benda/Madrasah No.31A Pedurenan Cilandak', 'JAKARTA SELATAN', '', 'SMK')," +
                "('PASAR MINGGU', 'Jl.Asem Pejaten Indah II Pasar Minggu', 'JAKARTA SELATAN', '', 'SMK')," +
                "('YAPERJASA', 'Jl.Belimbing Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('17 AGUSTUS 1945', 'Jl.Tebet Dalam III A Tebet', 'JAKARTA SELATAN', '', 'SMK')," +
                "('YASDA', 'Jl.H.Rasuna Said Patra Kuningan XV Tebet', 'JAKARTA SELATAN', '', 'SMK')," +
                "('ASISI', 'Jl.Haji Ramli Menteng Dalam Tebet', 'JAKARTA SELATAN', '', 'SMK')," +
                "('YPK KESATUAN', 'Jl.Manggarai Utara VII Tebet', 'JAKARTA SELATAN', '', 'SMK')," +
                "('AS-SYAFIIYAH', 'Jl.Bukit Duri Selatan No.29 Tebet', 'JAKARTA SELATAN', '', 'SMK')," +
                "('KARYA TELADAN', 'Jl.Raya Pasar Minggu No.65 Pancoran', 'JAKARTA SELATAN', '', 'SMK')," +
                "('CYBER MEDIA', 'Jl.Duren Tiga No.12 Pancoran', 'JAKARTA SELATAN', '', 'SMK')," +
                "('PGRI 33', 'Jl.Guru Alip Duren Tiga Pancoran', 'JAKARTA SELATAN', '', 'SMK')," +
                "('MAKARYA 1', 'Jl.Pondok Pinang Timur No.4 Keby. Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('FATAHILLAH', 'Jl.Ciputat Raya No.5 Pondok Pinang Keby.Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('AVERUS', 'Jl.Ciputat Raya No.11 Pondok Pinang Keby.Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('MIFTAHUL FALAH', 'Jl.Al Mubarok II No.6 Cipulir Keby. Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('YAY.PEND.UMAT ISLAM', 'Jl.Praja I No.8 Keby. Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('YP MULIA', 'Jl.Ciputat Raya No.1-2 Komp.Perhubungan', 'JAKARTA SELATAN', '', 'SMK')," +
                "('HARNASTO INSTITUT', 'Jl.Cidodol Raya No.40 Keby. Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('AL FAJAR', 'Jl.Iskandar Muda No.32 Keby.Lama Utara', 'JAKARTA SELATAN', '', 'SMK')," +
                "('TIRTAYASA', 'Jl. Bintaro Raya No.11C Tanah Kusir Keby.Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('JAKARTA MANAJEMEN', 'Jl.Praja Dalam E No.3 Keby. Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('YANUSA', 'Jl.H.Saikin No.15 Pondok Pinang', 'JAKARTA SELATAN', '', 'SMK')," +
                "('WALISONGO', 'Jl.Raya Kalibata Timur No.30 Pancoran Jak-Sel', 'JAKARTA SELATAN', '', 'SMK')," +
                "('BINA PUTRA', 'Jl.Kemang Timur Raya No.50 Jak-Sel', 'JAKARTA SELATAN', '', 'SMK')," +
                "('DHARMA KARYA', 'Jl.Melawai XII No.2 Kav.207 A Keby. Baru', 'JAKARTA SELATAN', '', 'SMA')," +
                "('AL KAUTSAR', 'Jl.Jembatan Selatan No.6 Blok A Keby.Baru', 'JAKARTA SELATAN', '', 'SMA')," +
                "('GITA KIRTTI 3', 'Jl.BRI Radio Dalam Keby. Baru', 'JAKARTA SELATAN', '', 'SMA')," +
                "('HANG TUAH 1', 'Jl.Ciledug Raya Komp.Seskoal Cipulir Keby.Lama', 'JAKARTA SELATAN', '', 'SMA')," +
                "('YAPERJASA', 'Jl.Belimbing Jagakarsa', 'JAKARTA SELATAN', '', 'SMA')," +
                "('PLUS KHADIJAH ISLAMIC SCH', 'Jl.Batan No.12 Ps.Jum''at Lebak Bulus Cilandak', 'JAKARTA SELATAN', '', 'SMA')," +
                "('PGRI 3', 'Jl.Pondok Labu I B No.29 A Pd.Labu Cilandak', 'JAKARTA SELATAN', '', 'SMA')," +
                "('KEMALA BHAYANGKARI 1', 'Komplek POLRI Ragunan Pasar Minggu', 'JAKARTA SELATAN', '', 'SMA')," +
                "('KHARISMAWITA', 'Jl.Swadaya II No.30 Tanjung Barat Ps.Minggu', 'JAKARTA SELATAN', '', 'SMA')," +
                "('PATIMURA', 'Jl.Jagakarsa Raya No.88 Jagakarsa', 'JAKARTA SELATAN', '', 'SMA')," +
                "('TELADAN', 'Jl.Raya Srengseng Sawah No.74 Jagakarsa', 'JAKARTA SELATAN', '', 'SMA')," +
                "('PERGURUAN RAKYAT 1', 'Jl.Yon Zikon 14 Srengseng Sawah Jagakarsa', 'JAKARTA SELATAN', '', 'SMA')," +
                "('KARTIKA X-1', 'Jl.Raya Kodam Bintaro No.53 Pesanggrahan', 'JAKARTA SELATAN', '', 'SMA')," +
                "('SULUH', 'Jl.Palapa Raya No.1 Pasar Minggu', 'JAKARTA SELATAN', '', 'SMA')," +
                "('BOROBUDUR', 'Jl.Raya Cilandak KKO Pasar Minggu', 'JAKARTA SELATAN', '', 'SMA')," +
                "('MUHAMMADIYAH 5', 'Jl.Tebet Timur Raya No.565 Tebet', 'JAKARTA SELATAN', '', 'SMA')," +
                "('DEWI SARTIKA', 'Jl.Tebet Barat Dalam No.39-41 Tebet', 'JAKARTA SELATAN', '', 'SMA')," +
                "('17 AGUSTUS 1945', 'Jl.Tebet Dalam III A Tebet', 'JAKARTA SELATAN', '', 'SMA')," +
                "('ASISI', 'Jl.H.Ramli Rt 005/03 Menteng Dalam Tebet', 'JAKARTA SELATAN', '', 'SMA')," +
                "('YMIK 2', 'Jl.Manggarai Utara VII Tebet ', 'JAKARTA SELATAN', '', 'SMA')," +
                "('YMIK 1', 'Jl.Manggarai Utara VII Manggarai Tebet', 'JAKARTA SELATAN', '', 'SMA')," +
                "('MUTTAQIEN', 'Jl.Asem Baris Raya No.5 Kebon Baru Tebet', 'JAKARTA SELATAN', '', 'SMA')," +
                "('AS-SYAFIIYAH 01', 'Jl.Bukit Duri Selatan No.29 Tebet', 'JAKARTA SELATAN', '', 'SMA')," +
                "('MUHAMMADIYAH 18', 'Jl. Panjang Cipulir Keby.Lama', 'JAKARTA SELATAN', '', 'SMA')," +
                "('FATAHILLAH', 'Jl.Raya Buncit No.67 Kalibata Pancoran ', 'JAKARTA SELATAN', '', 'SMA')," +
                "('SMK MUSIK CIKINI', 'Jl. Cikini Raya No. 74-76 Cikini', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK SANTA MARIA', 'Jl. Ir. H. Juanda No. 29 Kebon Kelapa ', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK PARAMITHA 2', 'Jl. Suryo Pranoto No 20 Petojo Utara ', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK KARTINI', 'Jl. Kartini Raya No. 26', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK JAYAWISATA 1', 'Jl. Taman Sunda Kelapa 16 A Manteng', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK BINA DHARMA DKI', 'Jl. Let. Jend Suprapto Kav. 3 ', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK REX MUNDI', 'Jl. Alaydrus  No. 42 Petojo Utara', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK BUNDA MULIA 2', 'Jl. Am. Sangaji No. 20 Petojo Utara ', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK YP IPPI ', 'Jl. Petojo Barat III/2 Petojo Utara ', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK YAPERMAS', 'Jl. Anyer No. 7 Manteng', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK TUNAS HARAPAN', 'Jl. Cempaka Putih Barat 14', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK TAMAN SISWA 3', 'Jl. Matraman Dalm Dua Pegangsaan', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK TAMAN SISWA 1', 'Jl. Garuda No 25 Gunung Shari Selatan', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK SANTO PAULUS', 'Jl. Setia Kawan Raya 39 Duri Pulo', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK STRADA 1', 'Jl. Gunung Sahari 88', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK SAID NAUM', 'Jl. KH. Mas Mansyur  No. 65', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK PSKD 1', 'Jl. Kramat IV No. 29 Kenari', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK PGRI 34', 'Jl. Sangihe 26 Cideng', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK PGRI 31', 'Jl. Sabeni No. 12 Kebon Melati', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK PGRI 25', 'Jl. Masjid 1 Karet Tengsin', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK PGRI 4', 'Jl. Cempaka Putih Barat  XI A', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK MUHAMMADIYAH 11', 'Jl. Cempaka Wangi 2 No. 12', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK MUHAMMADIYAH 5', 'Jl. Taman Bend. Jatiluhur 18', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK MUHAMMADIYAH 2', 'Jl. KH. Mas Mansyur  No. 65', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK KSATRYA', 'Jl. Percetakan Negera D 232', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK Cempaka ', 'Jl. Cempaka Putih Barat XXI', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK BETHEL', 'Jl. Ks. Tuban 253 Petamburan ', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK JAKARTA PUSAT 1', 'Jl. Abdul Muis 44 Petojo Selatan ', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK JAKARTA DUA', 'Jl. Cempaka Baru Tengah 1-3', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK FRANSISKUS 2', 'Jl. Kramat Raya No. 67 Kramat', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK DHARMA BAKTI 1', 'Jl. Mardani Raya No. 7', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK AL IHSAN', 'Jl. Kebon Kacang IX / 57', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK AL MAKMUR ', 'Jl. Raden Saleh Raya No. 30 Cikini', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK AL IRSYAD', 'Jl. KH. Hasim Ashari 27 Petojo Utara', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK BUNDA MULIA 1', 'Jl. Am. Sangaji No. 20 Petojo Utara ', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK AT TAQWA', 'Jl. Rajawali Selatan VI / 18', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK PRG SEKESAL', 'Jl. Taman Bend. Jatiluhur 18', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK KESDAM JAYA', 'Jl. Kramat Raya No. 174 Kenari', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK FARMASI TUNAS BANGSA', 'Jl. Salemba Tengah II No. 1 Paseban', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK FARMASI DITKESAD', 'Jl. ABD Rahman  Saleh  No. 18 Senin', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK TAMAN SISWA 2', 'Jl. Garuda No 44 Gunung Sahari Selatan', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK SINT JOSEPH', 'Jl. Kramat Raya No.134 Paseban ', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK PONCOL', 'Jl. Mutiara Raya Sumur Batu', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK MUHAMMADIYAH 1', 'Jl. Garuda No 33 Kemayoran', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK KATOLIK STRADA', 'Jl. Rajawali Selatan II No. 1', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMK KAMPUNG JAWA ', 'Jl. Percetakan Negera 2 A Johar Baru', 'JAKARTA PUSAT', '', 'SMK')," +
                "('SMA DWI SAKA', 'JL. TAMBAK NO. 32, PEGANGSAAN, MENTENG', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA 3 PSKD', 'Jl. Kwini I No 1', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA YPK KETAPANG', 'Jl. K.H. Zainul Arifin No 35', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA PEMBANGUNAN 2', 'JL. PEMBANGUNAN II/18', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA SAID NAUM', 'Jl.  K.H. Mas Mansyur No. 25', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA SANTO PAULUS', 'JL. SETIA KAWAN RAYA NO. 39-41 ', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA MUHAMMADIYAH 2', 'JL. GARUDA NO. 33 KEMAYORAN', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA KRISTEN KANAAN', 'JL. KRAN RAYA NO.7 KEMAYORAN', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA SUNDA KELAPA', 'JL. TAMAN SUNDA KELAPA NO.16A MENTENG ', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA 1 PSKD', 'JL. DIPONEGORO NO.80', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA MUHAMMADIYAH 1', 'JL. KRAMAT RAYA 49', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA AT-TAQWA', 'JL. RAJAWALI SELATAN VI NO.18', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA KARTINI 1', 'JL. KALIBARU TIMUR V NO.1 KEMAYORAN', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA PER. KSATRYA', 'JL. PERCETAKAN NEGARA D 232', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA ADVENT SALEMBA', 'JL. SALEMBA RAYA NO.47', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA MUHAMMADIYAH 16', 'JL. KALIBARU BARAT NO.52 D, BUNGUR', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA PERG. NASIONAL', 'JL. CEMPAKA BARU TIMUR RAYA 1 NO.1 ', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA PER. ADVENT 1', 'JL. KRAMAT PULO NO.16 JAKARTA PUSAT', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA TAMAN MADYA 1', 'JL. SUNTER BENDUNGAN JAGO II', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA TRIWIBAWA', 'JL. RAJAWALI SELATAN 1 NO.30', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA TAMAN MADYA 5', 'JL. PERCETAKAN NEGARA VIII NO.16', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA FRANSISKUS 1', 'JL. KRAMAT RAYA NO.67', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA YP IPPI PETOJO', 'JL. PETOJO BARAT III NO.2 ', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMA YAPERMAS JAKARTA', 'JL. ANYER NO.7 MENTENG', 'JAKARTA PUSAT', '', 'SMA')," +
                "('SMK Santo Leo', 'Jl.Mangga  Besar Raya No.43', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Kristen Rahmani', 'Jl.Mangga Besar XI No.8-10', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Tri Ratna', 'Jl.Talip I No.35-37 Krukut', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Islam Fatahilah', 'Jl.Keutamaan  No. 89 Krukut', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Sentosa', 'Jl.Madu No.276 Mangga Besar', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Pertiwi', 'Jl.Letjen S.Parman No.69', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Teladan', 'Jl, Anggrek Cendrawasih XI No.28', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Muhamadiyah 4', 'Jl.Anggrek Neli Murni Blok B/C Slipi', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Muhamadiyah 4', 'Jl.Anggrek Neli Murni Blok B/C Slipi', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Tomang Raya', 'Jl Kemuning No. 14A Jati Pulo', 'Jakarta Barat', '', 'SMK')," +
                "('SMK PGRI 29', 'Jl.Z Slipi Palmerah', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Ibu Pertiwi 2', 'Jl.Letjen. S.Parman No.69 Slipi', 'Jakarta Barat', '', 'SMK')," +
                "('SMK AL Mafatih', 'Jl Junaedi No. 79 Rt.001/017 Palmerah', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Wiyata Satya', 'Jl Anggrek Garuda No. 17 Palmerah', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Josua', 'Jl Kota Banbu Utara II No.8 Palmerah', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Barunawati', 'Jl.KS Tubun II / III no.7 Slipi', 'Jakarta Barat', '', 'SMK')," +
                "('SMK PGRI 5', 'Jl.Peta Barat No.40 Pegadungan', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Insan Global', 'Jl.Tanjung Pura V Pegadungan ', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Era Pembangunan', 'Jl.Gaga Alas Tua Semanan', 'Jakarta Barat', '', 'SMK')," +
                "('SMK PGRI 36', 'Jl.Peta Utara No.46', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Yadika I', 'Jl.Kamal Raya', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Setia Gama', 'Jl.Semanan Raya No.90 Semanan', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Jakarta 1', 'Jl.Peta Selatan No.24 Kelideres', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Cengkareng', 'Jl.Kembang No.30 Peta Barat', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Yadika III', 'JL''kamal Raya', 'Jakarta Barat', '', 'SMK')," +
                "('SMK PGRI 24', 'Jl Peta Utara No.70', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Setia Gama', 'Jl.Semanan Raya No.90 Semanan', 'Jakarta Barat', '', 'SMK')," +
                "('SMK PRIMA WISATA', 'Jl. Raya Bugis no 109', 'Jakarta Barat', '', 'SMK')," +
                "('SMK AL WASILAH 1', 'Jl. Kampung Baru No 20 4/10 Kembangan utara', 'Jakarta Barat', '', 'SMK')," +
                "('SMK AL IHSAN', 'Jl. Masjid Al ihsan Kav. DKI blok B2 Meruya Utara', 'Jakarta Barat', '', 'SMK')," +
                "('SMK REFORMASI', 'Jl. Raya Sanggrahan RT 10/05 komplek SMA 112 Meruya Uta', 'Jakarta Barat', '', 'SMK')," +
                "('SMK SUMPAH PEMUDA', 'Jl. Raya Joglo No 36', 'Jakarta Barat', '', 'SMK')," +
                "('SMK BINA INSAN MANDIRI', 'Jl. Meruya Ilir Komplek perumahan qoriyah Thayibah blok', 'Jakarta Barat', '', 'SMK')," +
                "('SMK SATRIA', 'Jl. Raya Srengseng Kembangan', 'Jakarta Barat', '', 'SMK')," +
                "('SMK YMIK JOGLO', 'Jl. Komplek DPRRI Joglo', 'Jakarta Barat', '', 'SMK')," +
                "('SMK PGRI 2', 'Jl. Raya Kembangan Perumahan Taman Permata Buana', 'Jakarta Barat', '', 'SMK')," +
                "('SMK GLOBAL PERSADA', 'Jl Raya Kembangan No 14 ', 'Jakarta Barat', '', 'SMK')," +
                "('SMK BINA INSAN MANDIRI', 'Jl. Meruya Ilir Komplek perumahan qoriyah Thayibah blok', 'Jakarta Barat', '', 'SMK')," +
                "('SMK SATRIA', 'Jl. Raya Srengseng Kembangan', 'Jakarta Barat', '', 'SMK')," +
                "('SMK HARAPAN RAYA', 'Jl. Kapuk Raya Gang sinar No 5', 'Jakarta Barat', '', 'SMK')," +
                "('SMK 2 CITRA ADHI PRATAMA', 'Jl. Bojong Raya No 78', 'Jakarta Barat', '', 'SMK')," +
                "('SMK SACENG 1', 'Jl. Bambu Larangan No 67', 'Jakarta Barat', '', 'SMK')," +
                "('SMK KESATUAN', 'Jl. Kesatuan no 1 Klingkit', 'Jakarta Barat', '', 'SMK')," +
                "('SMK IP YAKIN', 'Jl. Bangun Nusa Raya No 10', 'Jakarta Barat', '', 'SMK')," +
                "('SMK LAMAHOLOT', 'Jl. Manggis raya Bojong', 'Jakarta Barat', '', 'SMK')," +
                "('SMK BUNGA NUSA 1', 'Jl. Rawa Bengkel SDN 19 Pagi', 'Jakarta Barat', '', 'SMK')," +
                "('SMK 1 CITRA ADHI PRATAMA', 'Jl. Outer ring road No 21', 'Jakarta Barat', '', 'SMK')," +
                "('SMK YANDIKA', 'Jl. Masjid Nurul Huda RT 02/01 No 25', 'Jakarta Barat', '', 'SMK')," +
                "('SMK DUTA BANGSA', 'Jl. Kapuk Raya gang masjid', 'Jakarta Barat', '', 'SMK')," +
                "('SMK AD-DA''WAH', 'Jl. Raya duri kosambi RT 03 Rw 01 ', 'Jakarta Barat', '', 'SMK')," +
                "('SMK EKA SAKTI', 'Jl. Ukir no 30.  Cengkareng timur', 'Jakarta Barat', '', 'SMK')," +
                "('SMK DIDAKTIKA', 'Jl. Pulo Harapan Indah RT 11 Rw 10 ', 'Jakarta Barat', '', 'SMK')," +
                "('SMK DIAN', 'Jl. Pedongkelan Belakang Kapuk', 'Jakarta Barat', '', 'SMK')," +
                "('SMK SACENG 1', 'Jl. Bambu Larangan No 67', 'Jakarta Barat', '', 'SMK')," +
                "('SMK AD-DA''WAH', 'Jl. Raya duri kosambi RT 03 Rw 01 ', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Harvard', 'Jl. Pangeran Tubagus Angke no.33', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Cindera Mata Indah', 'Jl. Duri Raya TSS No. 86', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Binneka Tunggal Ika', 'Jl. K.H. Moh Mansyur No. 222.A', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Islam Bahagia', 'Jl. Parsima Raya No. 15 Kalianyar ', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Bina Karya', 'Jl. K.H. Moh Mansyur No. 19/25', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Candra Naya', 'Jl. Jembatan Besi II No. 26', 'Jakarta Barat', '', 'SMK')," +
                "('SMK WIDYA PATRIA 1', 'Jl. Tanjung Duren Barat I/1 Greenvile Blok A', 'Jakarta Barat', '', 'SMK')," +
                "('SMK PGRI 15', 'Jl. Duri Raya No.1 RT.001/02 Duri Kepa', 'Jakarta Barat', '', 'SMK')," +
                "('SMK WIDYA PATRIA 2', 'Jl. Anggrek Cakra No.70', 'Jakarta Barat', '', 'SMK')," +
                "('SMK AL HUDA', 'Jl. H. Alimun No.48 Kelapa Dua', 'Jakarta Barat', '', 'SMK')," +
                "('SMK JAKARTA IV', 'Jl. Kedoya Raya No.200', 'Jakarta Barat', '', 'SMK')," +
                "('SMK BUDI MURNI 2', 'Jl. Puri Kembangan No.2', 'Jakarta Barat', '', 'SMK')," +
                "('SMK NUSANTARA', 'Jl. SMU 57 RT.003/02 Kedoya', 'Jakarta Barat', '', 'SMK')," +
                "('SMK KEBON JERUK', 'Jl.Ayub Dalam No.26 B Sukabumi Utara', 'Jakarta Barat', '', 'SMK')," +
                "('SMK Al Hamidiyah', 'Jl. Kedoya Raya No. 50 ', 'Jakarta Barat', '', 'SMK')," +
                "('SMK DEWI SARTIKA', 'Jl. Tanjung Duren Barat, Komp.Greenville Blok A1/1', 'Jakarta Barat', '', 'SMK')," +
                "('SMK MULTIMEDIA MANDIRI', 'Jl. Raya Kedoya No.2', 'Jakarta Barat', '', 'SMK')," +
                "('SMK AL HUDA', 'Jl. H. Alimun No.48 Kelapa Dua', 'Jakarta Barat', '', 'SMK')," +
                "('SMK JAKARTA III', 'Jl. Kedoya Raya No.200', 'Jakarta Barat', '', 'SMK')," +
                "('SMK BUDI MURNI 2', 'Jl. Puri Kembangan No.2', 'Jakarta Barat', '', 'SMK')," +
                "('SMK TRIARGA 1', 'Jl.HH No.63 Kebon Jeruk', 'Jakarta Barat', '', 'SMK')," +
                "('SMK KEBON JERUK', 'Jl.Ayub Dalam No.26 B Sukabumi Utara', 'Jakarta Barat', '', 'SMK')," +
                "('SMK TRIARGA 2', 'Jl. HH No.63 Kebon Jeruk', 'Jakarta Barat', '', 'SMK')," +
                "('SMK DEWI SARTIKA', 'Jl. Tanjung Duren Barat, Komp.Greenville Blok A1/1', 'Jakarta Barat', '', 'SMK')," +
                "('SMK BHARA TRIKORA I', 'Komp. Polri Blok F Jelambar', 'Jakarta Barat', '', 'SMK')," +
                "('SMK TUNAS HARAPAN', 'Komp. BDN 46 Pesing Wijaya Kusuma', 'Jakarta Barat', '', 'SMK')," +
                "('SMK YADIKA 2', 'Jl. Tanjung Duren Barat IV/8 Grogol', 'Jakarta Barat', '', 'SMK')," +
                "('SMK AA', 'Jl. Tanjung Duren Dalam IV/25', 'Jakarta Barat', '', 'SMK')," +
                "('SMK PANCARAN BERKAT', 'Jl. Setia Jaya Raya No.100 Jelambar Grogol', 'Jakarta Barat', '', 'SMK')," +
                "('SMK DUTA MAS', 'JL. Wijaya VIII/9 Komp. Duta Mas Grogol', 'Jakarta Barat', '', 'SMK')," +
                "('SMK AL-HASANAH', 'Jl. Tanjung Duren Barat III No.1 Grogol', 'Jakarta Barat', '', 'SMK')," +
                "('SMK MUHAMMADIYAH 3', 'Jl. Gelong Baru No.23A Tomang', 'Jakarta Barat', '', 'SMK')," +
                "('SMK MA''ARIF', 'Jl. Dr.Mawardi Raya No.19', 'Jakarta Barat', '', 'SMK')," +
                "('SMK TANJUNG', 'Jl.Dr.Nurdin IV No.1 ', 'Jakarta Barat', '', 'SMK')," +
                "('SMK ISLAM PERTI', 'Jl. Tawakal Raya No.99 Tomang', 'Jakarta Barat', '', 'SMK')," +
                "('SMK AA', 'Jl. Tanjung Duren Dalam IV/25', 'Jakarta Barat', '', 'SMK')," +
                "('SMK BHARA TRIKORA I', 'Komp. Polri Blok F Jelambar', 'Jakarta Barat', '', 'SMK')," +
                "('SMK YADIKA 2', 'Jl. Tanjung Duren Barat IV/8 Grogol', 'Jakarta Barat', '', 'SMK')," +
                "('SMK TUNAS HARAPAN', 'Komp. BDN 46 Pesing Wijaya Kusuma', 'Jakarta Barat', '', 'SMK')," +
                "('SMA Tri Ratna', 'Jl. Tolip I No. 35-37 Krukut', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Yadika 2', 'Kamal Raya No. 42', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Padindi', 'Prepedan dalam No. 38 RT. 12/9 Kamal', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Fajrul Islam', 'Tj. Pura V Pegadungan', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Josua', 'Kota Bambu Utara No. 8 Palmerah', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Barunawati', 'Jl. X-III Aipda K.S. Tubun', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Muhammadiyah 15', 'Jl. Anggrek Neli Murni Blok B - C Komplek Slipi', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Yadika 5', 'Joglo Raya No. 190', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Sumpah Pemuda', 'Jl. Raya Joglo No. 36', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Cengkareng 1', 'Jl. Bambu Larangan No. 67', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Al Huda', 'Jl. Utama Raya No. 30 A', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Santo Kristoforus II', 'Jl. Perumahan Taman Palem Lestari Blok A-18', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Duta Bangsa', 'Jl. Kapuk Gg. Masjid No. 71', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Cahaya Fadilah', 'Jl. Lingkar Luar Barat No. 7', 'Jakarta Barat', '', 'SMA')," +
                "('SMA IP Yakin', 'Jl. Bangun Nusa No. 10', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Islam Bahagia', 'Jl. Persima Raya No. 15 Kalianyar', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Candra Naya', 'Jl. Jembatan Besi II No. 26 Telp. 63860752', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Islam Tambora', 'Jl. Tambora Masjid No.11 Telp. 6328948', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Bhinneka Tunggal Ika', 'Jl. Moh. Mansyur. No. 222 A Telp.6310079', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Al Kamal', 'Jl. Raya Kedoya Al -Kamal No.2 Kedoya Selatan', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Santo Andreas', 'Green Garden Blok Y 5 No.1 Kedoya Utara', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Budi Murni 2', 'Jl. Raya Kedoya Al Kamal No. 2 Kedoya Selatan', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Sang Timur', 'Jl. Karmel Raya No. 2', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Pelita II', 'Jl.Macan No.22-29 Daan Mogot', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Muhammadiyah 13', 'Jl. Gelong Baru No. 23 A', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Al Chasanah', 'Tanjung Duren Barat III No. 1', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Tunas Harapan', 'Komplek BNI Pesing ', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Yadika I', 'Jl. Tajung Duren Barat IV No. 8', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Dharma Jaya', 'Kav. POLRI Blok D XV/I Jelambar', 'Jakarta Barat', '', 'SMA')," +
                "('SMA YP-BDN', 'Jl Daan Mogot', 'Jakarta Barat', '', 'SMA')," +
                "('SMA Fatahillah', 'Jl. DR. Semeru Raya ', 'Jakarta Barat', '', 'SMA')," +
                "('ISLAM AL IHSAN', 'Jl.Raya Pesanggrahan No.1 Komp. Kodam Bintaro', 'JAKARTA SELATAN', '', 'SMK')," +
                "('BORONUDUR 2', 'Jl.Cilandak KKO Pasar Minggu', 'JAKARTA SELATAN', '', 'SMK')," +
                "('AL HIDAYAH II', 'Jl.Kesatuan No.47 Srengseng Sawah Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('KHARISMAWITA 1', 'Jl.Swadaya II/30 Tanjung Barat Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('AMALIYAH', 'Jl.Akses Univ.Indonesia No.3 Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('AL MAKMUR', 'Jl.RM.Kahfi I Ciganjur, Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('ISLAM YPS', 'Jl.Raya Lenteng Agung Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('PERGURUAN RAKYAT', 'Jl.Yon Zikon 14 Srengseng Sawah Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('DAARUSSALAAM', 'Jl.M.Kahfi II/28 Srengseng Sawah Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('YANUBA', 'Jl.Timbul No.60 Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('LEBAK BULUS', 'Jl.Pasar Jum''at Lebak Bulus Cilandak', 'JAKARTA SELATAN', '', 'SMK');" +
                "INSERT INTO `tb_sekolah` (`nama`, `alamat`, `wilayah`, `telepon`, `jenis`) VALUES" +
                "('YAPRI', 'Jl.KH.Muhasyim IV/71 Terogong Cilndak Barat', 'JAKARTA SELATAN', '', 'SMK')," +
                "('PGRI 14', 'Jl.Intan Ujung No.19/20 Cilandak Barat', 'JAKARTA SELATAN', '', 'SMK')," +
                "('TANJUNG BARAT', 'Jl.Melati No.100 Tanjung Barat Jagakarsa ', 'JAKARTA SELATAN', '', 'SMK')," +
                "('TARAKANITA', 'Jl.TB Simatupang Cilandak KKO No.1', 'JAKARTA SELATAN', '', 'SMK')," +
                "('TUNAS PEMBANGUNAN', 'Jl.H.Abdul Majid Gg.KH.Moch.Naim I No.68 Cipete', 'JAKARTA SELATAN', '', 'SMK')," +
                "('AL KAUTSAR', 'Jl.Jembatan Selatan No.6 Pulo Keby. Baru', 'JAKARTA SELATAN', '', 'SMK')," +
                "('SELAGAN JAYA', 'Jl.H.Ipin No.10 Pd Labu, Cilandak', 'JAKARTA SELATAN', '', 'SMK')," +
                "('ISLAM WIJAYA KUSUMA', 'Jl.Raya Depok No.16 Lt Agng Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('MUHAMMADIYAH 7', 'Jl.Tebet Timur Raya 565 Tebet', 'JAKARTA SELATAN', '', 'SMK')," +
                "('MUHAMMADIYAH 9', 'Jl.Panjang Cipulir Keby.Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('MARGO UTOMO', 'Jl.Cidodol Raya No.16 Keby.Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('KHARISMAWITA 2', 'Jl.Swadaya II/30 Tanjung Barat Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('PANDAWA BUDI LUHUR', 'Jl.Komp.HANKAM Cidodol No.3 Keby. Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('JAKARTA WISATA 1', 'Jl.Praja Dalam E No.3 Keby. Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('MAKARYA 2', 'Jl.Harun Ciputat Raya Tanah Kusir Keby. Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('PONDOK INDAH', 'Jl.Ciputat Raya No.11 Pondok Pinang Keby.Lama', 'JAKARTA SELATAN', '', 'SMK')," +
                "('KRISANTI', 'Jl.Kampung Melayu Kecil V/22 Bukit Tebet', 'JAKARTA SELATAN', '', 'SMK')," +
                "('YASPIA', 'Jl.Benda Dalam Gg.H.Saenan II No.12 Ciganjur', 'JAKARTA SELATAN', '', 'SMK')," +
                "('LP3 ISTANA', 'Jl.Margasatwa No.12 Pd Labu Cilandak', 'JAKARTA SELATAN', '', 'SMK')," +
                "('FARMASI LPK', 'Jl.Raya Lenteng Agung No.33 Rt 01/08 Ps Minggu', 'JAKARTA SELATAN', '', 'SMK')," +
                "('FARMASI BHUMI HUSADA', 'Jl.Fatmawati Raya No.7 Cilandak', 'JAKARTA SELATAN', '', 'SMK')," +
                "('ISLAM AL HIKMAH', 'Jl.Kemajuan No.48-55 Pet.Sltn Pesanggrahan', 'JAKARTA SELATAN', '', 'SMK')," +
                "('MUHAMMADIYAH 15', 'Jl.Karet Belakang Raya No.4 Setiabudi', 'JAKARTA SELATAN', '', 'SMK')," +
                "('BOROBUDUR 1', 'Jl.Raya Cilandak KKO Ps.Minggu', 'JAKARTA SELATAN', '', 'SMK')," +
                "('KAHURIPAN 1', 'Jl.Nangka No.17 Tanjung Barat Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('PGRI 23', 'Jl.Srengseng Sawah Rt 05/07 No.108 Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('BINA KUSUMA 3', 'Jl.Merpati Raya No.38 Pesanggrahan', 'JAKARTA SELATAN', '', 'SMK')," +
                "('TELADAN', 'Jl.Raya Srengseng Sawah No.74 Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('BHAKTI 17', 'Jl.Persahabatan No.23 Kel.Cipedak Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('AL HIDAYAH I', 'Jl.Bhakti Rt 003/07 No.25 Cilandak Timur ', 'JAKARTA SELATAN', '', 'SMK')," +
                "('PEMBANGUNAN JAYA YAKAPI', 'Jl.Palapa Raya No.2 Pasar Minggu', 'JAKARTA SELATAN', '', 'SMK')," +
                "('GRAFIKA YAYASAN. LEKTUR', 'Jl.Pasar Jum''at Lebak Bulus Cilandak', 'JAKARTA SELATAN', '', 'SMK')," +
                "('KARYA GUNA', 'Jl.Manggarai Utara I No.1A Tebet', 'JAKARTA SELATAN', '', 'SMK')," +
                "('KAHURIPAN 2', 'Jl.Nangka No.17 Tanjung Barat Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('DESA PUTRA', 'Jl.Desa Putera Srengseng Sawah Jagakarsa', 'JAKARTA SELATAN', '', 'SMK')," +
                "('BUNDA KANDUNG', 'Jl.Palapa Raya No.3 Pasar Minggu', 'JAKARTA SELATAN', '', 'SMK')," +
                "('SMK Satya Bakti II', 'Matraman', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Nurul Iman ', 'Matraman', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Pembangunan ', 'Matraman', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Tirta Sari Surya', 'Matraman', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Muhammadiyah 6', 'Matraman', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Bina Pangudi Luhur', 'Matraman', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Cipta Karya', 'Matraman', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Pemuda', 'Matraman', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Pelita Tiga', 'Pulogadung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Cikra I', 'Pulogadung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Garuda ', 'Pulogadung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Al-Washliyah ', 'Pulogadung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Nusantara Wisata', 'Pulogadung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Tunas Markatin', 'Pulogadung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Budhaya I', 'Pulogadung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Fransiskus I', 'Pulogadung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Diponegoro I', 'Pulogadung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Pancasila', 'Jatinegara', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK YP Darul Mukminin', 'Jatinegara', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Pandawa', 'Jatinegara', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Muara Indonesia', 'Jatinegara', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Cawang', 'Jatinegara', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Pel.Bima Sakti', 'Jatinegara', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK berlian', 'Jatinegara', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Cahaya Sakti', 'Jatinegara', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Hatawana', 'Jatinegara', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMk Bhakti Pertiwi', 'Jatinegara', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Jakarta Timur I', 'Jatinegara', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK BPS&k 2', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Budi Murni 1', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Corpatarin 1', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Kapin', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Malaka', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK PGRI 8', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Jakarta 1', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Tadika Puri', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK IKIFA', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Jayakarta', '', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK As- Saadah', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('BPS&K 1', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('Budaya ', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('Budi Murni 3', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('Corpatarin 2', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('Kapin 2', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('Pami Jaya', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('Kawula Indonesia', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Nuris', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Pusaka', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Bakti 3', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Bonaventura', 'Duren sawit', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Mardhika', 'Kramatjati', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Teknik 10 Nopember', 'Kramatjati', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Mahadhika 2', 'Kramatjati', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Respati I', 'Kramatjati', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Pelayaran Santa Lusiana', 'Kramatjati', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Parawisata Adi Luhur', 'Kramatjati', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Bina Prestasi', 'Kramatjati', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Budhi Warman I', 'Kramatjati', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Trampil', 'Kramatjati', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Adi Luhur 2', 'Kramatjati', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Alfathiyah ', 'Kramatjati', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Rahayumulyo', 'Kramatjati', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Gutama ', 'Makasar', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Angkasa 1', 'Makasar', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Angkasa 2', 'Makasar', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Uswatun Hasanah', 'Makasar', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMk Jaya Wisata 2', 'Makasar', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Tridaya ', 'Makasar', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Dharma Surya', 'Makasar', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Perdana Kusuma', 'Makasar', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Bhakti 1', 'Makasar', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Bhakti 2', 'Makasar', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK PGRI 1', 'Makasar', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK YAMAS', 'Makasar', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Analisis Kesehatan', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Budhi Warman', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Malahayati', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK PB Islam Sudirman I', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK PB Islam Sudirman II', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Analisis Kimia Tunas Harapan', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Mardi Bakti', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Pangudi Rahayu I', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Pangudi Rahayu II', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Paskita Global', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Pertiwi', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK PGRI 28', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Karya Darma I', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Karya Darma II', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Mahadhika 4', 'Pasar Rebo', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK AL -Wahyu Jakarta', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Bina Dharma', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Eka Paksi Jakarta', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Era Pembangunan Umat', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Insan Teknologi Jakarta', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Karya Wijaya Kusuma', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Kawula Jakarta', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Mahadika I', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Mahadika 2', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Otomindo', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Pelayaran Pembangunan', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK PGRI 20', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK PKP I', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK PKP 2', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Sahid Jakarta', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Widya Manggala Jakarta', 'Ciracas', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK PGRI 16', 'Cipayung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Jakarta Raya I', 'Cipayung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Jakarta Raya 2', 'Cipayung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Trisastra I', 'Cipayung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Trisastra 2', 'Cipayung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Cagar Budaya', 'Cipayung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Budi Murni 4', 'Cipayung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Budi Murni 5', 'Cipayung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Diskes AD', 'Cipayung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Mitra Wisata', 'Cipayung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Bina Medika', 'Cipayung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK As_syafiyah', 'Cipayung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Tunas Medika', 'Cipayung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Sriwijaya', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK IPTEK ', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Ristek Kikin', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Dewa Ruci', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Al-Akhyar I', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Farmasi Caraka Nusantara', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Dinamika Pembangunan I', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Mercuarsuar', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Ristek Jaya', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Gita Wisata', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Tri Tunggal Nusantara', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Dharma Paramitha', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Bisnis Indonesia', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Bina Manejemen', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SM Karya Ekopin', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Al Wathoniyah Pusat', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK YAPIA', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Imtaq Darul Rahim', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Jakarta Timur 2', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Akhyar 2', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Dinamika Pembangunan 2', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Bina Karya Utama', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Diponegoro 2', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Nurul Huda', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Perbankan Nasional ', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Kalpataru', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Citra Mandiri', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK Wawasan Nusantara', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK YPI IPPI', 'Cakung', 'JAKARTA TIMUR', '', 'SMK')," +
                "('SMK PGRI 3', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK 11 MARET', 'KELAPA GADING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK AL-IRSAD ISLAMIAH', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK AL-JIHAD', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK AL-KAHRIYAH BAHARI', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK AL-KHAIRIYAH 2 JKT', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK AL-MIFTAHIYAH', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK AR-RAUDHAH', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK BINTANG NUSANTARA ', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK DARUL MA''RIF', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK DHARMA PUTRA 1', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK FAJAR INDAH', 'PADEMANGAN', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK GITA KIRTTI 2', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK GLOBAL 21', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK GUNUNG JATI', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK HANGTUAH 1', 'KELAPA GADING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK HASANUDIN', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK K. HARAPAN MULIA', 'PADEMANGAN', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK KARYA BAHARI', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK KASIH IMANUEL', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK KENCANA 2', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK KRISTEN NAZARET', 'PENJARINGAN', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK LAGOA', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK MUHAMMADIYAH 12', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK MUTIARA 1', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK NUSANTARA 1', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK NUSANTARA 2', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK NUSANTARA 2', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PANGERAN WIJAYA KUSUMA', 'PENJARINGAN', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PELITA PERBANKAN', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PERMATA INDAH', 'PENJARINGAN', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PERNAS', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PLUIT RAYA', 'PENJARINGAN', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PSKD III', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK RAUDHATUL JANNATINNAIM', 'PADEMANGAN', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK SARI PUTRA', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK SEJAHTERA', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK SILIWANGI', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK SISMADI', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK SPES PATRIAE', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK STRADA III', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK SYAHID', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK TANJUNG PRIOK 2', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK TRI DHARMA BUDI DAYA', 'PENJARINGAN', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK WIJAYA KUSUMA', 'PENJARINGAN', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK WIYATA MANDALA', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK WIYATAMANDALA BAKTI', 'PADEMANGAN', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK YANINDO', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK YASPI JAYA', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK YUSHA 1', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK KASIH ANANDA', 'KELAPA GADING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PARIWISATA SISMADI', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK AL-KHAIRIYAH 1 JKT', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK BARUNAWATI', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK CILINCING 1', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK CILINCING 3', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK DARMA BUDHI BAKTI \"PLUS\"\"\"', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK DHARMA PUTRA 2', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK HANGTUAH 2', 'KELAPA GADING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK JALESANA', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK JAYA', 'KELAPA GADING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK KENCANA 1', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PELAYARAN DJADJAT', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PELAYARAN JAKARTA', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PELAYARAN JAKARTA RAYA', 'KELAPA GADING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PELAYARAN MALAHAYATI', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PERGURUAN CIKINI', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PGRI 11 JAKARTA', 'CILINCING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK PGRI 38', 'KELAPA GADING', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK TANJUNG PRIOK 1', 'KOJA', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK TARAKANITA 2', 'PENJARINGAN', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK YAPPENDA', 'TANJUNG PRIOK', 'JAKARTA UTARA', '', 'SMK')," +
                "('SMK YUSHA 2', 'KOJA', 'JAKARTA UTARA', '', 'SMK');";
        db.execSQL(sql_query1);
        db.execSQL(sql_query2);
        db.execSQL(sql_query3);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + tb_name);

        onCreate(db);
    }
    public Cursor get_sekolah(){
        SQLiteDatabase db = this.getWritableDatabase();
        final String sql = "SELECT * FROM " + tb_name;
        Cursor intruksi = db.rawQuery(sql, null);

        return intruksi;
    }
    public Cursor get_sekolah(String search){
        SQLiteDatabase db = this.getWritableDatabase();
        final String sql = "SELECT * FROM `" + tb_name +"` WHERE `wilayah` LIKE '%"+ search +"%' OR `nama` LIKE '%"+ search +"%' OR `alamat` LIKE '%"+ search +"%' OR `telepon` LIKE '%"+ search +"%' OR `jenis` LIKE '%"+ search +"%' ";
        Cursor intruksi = db.rawQuery(sql, null);

        return intruksi;
    }
}

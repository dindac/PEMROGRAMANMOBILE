package com.dindac.uts_33418109;

import java.util.ArrayList;

public class WisataData {
    private static String[] wisataname = {
            "Tawangmangu",
            "Keraton Surakarta",
            "Taman Sriwedari",
            "Museum Sangiran",
            "Taman Balekambang",
            "Kampung Batik Kauman",
            "Pasar Klewer",
            "Pura Mangkunegaran",
            "Galabo Solo",
            "Ngarsopuro Night Market",
            "Pasar Triwindu Solo",
            "Pandawa Water World "
    };
    private static String[] wisatabiodata = new String[]{
            "Salah satu tempat wisata di Solo yang paling terkenal dan banyak dibicarakan wisatawan adalah Grojogan Sewu Tawangmangu. Destinasi pelesiran berupa air terjun setinggi 80 meter ini berlokasi di sisi barat Gunung Lawu, atau sekitar 37 kilometer dari pusat Kota Solo. Air terjun ini merupakan yang tertinggi di wilayah Jawa Tengah. Untuk menuju ke lokasi, wisatawan harus mendaki setidaknya 1.000 anak tangga. Dengan pemandangan kanan-kiri yang indah, perjalanan akan terasa lebih menyenangkan."
            ,
            "Bangunan ini didirikan oleh Susuhunan Pakubuwana II pada tahun 1744 untuk menggantikan Keraton Kartasura yang hancur lebur akibat peristiwa Geger Pecinan tahun 1743 silam.\n" +
            "Sampai sekarang, bangunan ini masih difungsikan sebagai tempat tinggal Sri Sunan sekaligus menjadi tempat wisata yang paling banyak dikunjungi di Solo. Adapun kompleks di Keraton Surakarta dibagi menjadi: Alun-Alun Lor, Alun-Alun Kidul, Sasana Sumewa, Siti Hinggil Lor dan Kidul, Kemandungan Lor dan Kidul, Sri Manganti Lor dan Kidul, Kedaton, serta Kamagangan, yang masing-masing memiliki fungsi berbeda, salah satunya dipakai sebagai museum. Di tempat wisata di Solo ini, berbagai koleksi peninggalan kasunanan disimpan, seperti misalnya gamelan, replika pusaka keraton, dan benda-benda lain yang merupakan pemberian dari raja-raja Eropa."
            ,
            "Tempat wisata di Solo ini merupakan kompleks pertamanan yang berlokasi di daerah Laweyan, Solo, dan sudah ada sejak era kepemimpinan Pakubuwana X. Selain dipakai sebagai lokasi diselenggarakannya hiburan rutin Malam Selikuran, Taman Sriwedari juga pernah dipakai sebagai lokasi penyelenggaraan PON pada tahun 1948.\n" +
            "Di area ini terdapat Gedung Wayang Orang Sriwedari (GWO) yang menjadi tempat pertunjukan wayang orang. Pada bagian dinding atas bagian kanan dan kiri bangunan ada lukisan besar yang menceritakan epos Mahabharata bertajuk “Kresno Duto”."
            ,
            "Objek wisata sejarah-edukasi ini letaknya tidak jauh dari situs fosil purbakala Sangiran, yang sudah ditetapkan oleh UNESCO sebagai salah satu warisan dunia. Dengan luas sekitar 56 km persegi, tempat ini tidak hanya difungsikan sebagai destinasi wisata, tapi juga pusat penelitian oleh arkeolog dari dalam dan luar negeri yang ingin mengetahui kehidupan manusia pada zaman prasejarah."
            ,
            "Taman Balekambang yang terletak di Jalan Ahmad Yani, Solo. Taman seluas 10 hektare ini dibangun oleh KGPAA Mangkunegara VII pada tahun 1921 silam untuk kedua putrinya, GRAy Partini dan GRAy Partinah.\n" +
            "Tempat wisata di Solo ini dibagi menjadi dua. Kompleks pertama adalah Partinah Bosch yang merupakan rumah dari berbagai tanaman langka, seperti kenari, beringin putih, beringin sungsang, serta apel cokelat. Sedangkan kompleks satunya bernama Partini Tuin (Taman Air Partini). Tempat ini berupa kolam dengan perahu-perahu hias yang bisa dinaiki wisatawan."
            ,
            "Di objek wisata belanja yang letaknya tidak jauh dari Keraton Kasunanan Surakarta ini, wisatawan bisa mendapat aneka batik dengan motif dan corak yang beragam. Umumnya batik yang diproduksi pengrajin di sini berupa batik tulis, batik cap, atau batik kombinasi, dengan motif modern dengan warna gelap. "
            ,
            "Pasar tekstil terbesar di Solo ini menjual beragam kain batik, baik buatan pengrajin lokal maupun mancanegara. Di Pasar Klewer, Anda bisa memuaskan hasrat belanja batik tanpa takut kantong jebol. Ya, tempat wisata di Solo ini memang surganya batik khas Solo yang murah dan berkualitas. "
            ,
            "Istana yang dibangun dengan sangat indah dan megah ini merupakan tempat kediaman resmi pemimpin Kadipaten Praja Mangkunegaran. Bangunan yang terletak di Jalan Ronngowarsito ini telah berhasil menjadi pusat budaya dan seni Kota Solo. Beragam koleksi di dalam istana merupakan peninggalan Kerajaan Mataram dan Majapahit."
            ,
            "Terletak di Jalan Mayor Sunaryo, atau tepatnya di depan Pusat Grosir Solo, Galabo menyediakan aneka kuliner khas Solo yang nikmat dan murah meriah. Di sini, wisatawan bisa dengan mudah menemukan aneka makanan sedap yang dijajakan sampai tengah malam, seperti . Nasi liwet, gudeg ceker, sate kere, tengkleng, mie thoprak, wedang ronde, wedang dongo, tahu kupat, serta nasi tumpang"
            ,
            "Sesuai namanya, tempat wisata di Solo ini merupakan obyek wisata belanja murah yang berlokasi di Jalan Diponegoro, atau tepatnya di wilayah selatan Pura Mangkunegaran. Selain baju, aksesori, dan barang-barang kerajinan, di tempat wisata di Solo ini Anda juga bisa menemukan aneka makanan lezat dengan harga murah, mulai dari makanan tradisional sampai makanan modern."
            ,
            "Tidak jauh dari Ngarsopuro Night Market terdapat sebuah pasar yang menjual aneka barang seni. Ialah Pasar Triwindu, atau biasa disebut dengan Pasar Antik Triwindu. Pasar ini dibangun pada tahun 1939 sebagai bentuk peringatan 24 tahun pemerintahan Mangkunegaran VII. Aneka benda seni yang bisa didapat di Pasar Triwindu antara lain patung batu dan kayu, uang kuno, radio lawas, senjata kuno, perabot rumah tangga, wayang, jam dinding, cangkir, mesin ketik, telepon tua, dan masih banyak lagi yang lainnya."
            ,
            "Tempat wisata di Solo ini menawarkan sensasi wisata seru berupa wahana atau permainan air yang cocok dikunjungi oleh seluruh anggota keluarga, terutama anak-anak. Selain kolam renang luas, seluncuran, aneka permainan anak, dan ombak buatan, satu hal yang membuat objek wisata ini unik dan begitu disukai wisatawan adalah tema dan konsep epos Mahabarata yang dipakainya. Di Pandawa Water World terdapat patung-patung besar Pandawa lima."

    };

private static String[] wisataimages = {
        "https://i.postimg.cc/BbGvP3Fw/Tawangmangu.jpg",
        "https://i.postimg.cc/3NrPcbQx/Keraton.jpg",
        "https://i.postimg.cc/2jKDtr3p/Sriwedari.jpg",
        "https://i.postimg.cc/0jqHTXgw/Sangiran.jpg",
        "https://i.postimg.cc/Pqyxp9yt/Balekambang.jpg}",
        "https://i.postimg.cc/FzkDqMfb/Batik-Kauman.jpg",
        "https://i.postimg.cc/7PSB3kkD/Pasar-Klewer.jpg",
        "https://i.postimg.cc/7PSB3kkD/Pasar-Klewer.jpg",
        "https://i.postimg.cc/fRYTZk4p/Mangkunegaran.jpg",
        "https://i.postimg.cc/VkHyx8vp/Galabo-Solo.jpg",
        "https://i.postimg.cc/15kwJgcj/Ngarsopuro.jpg",
        "https://i.postimg.cc/CLGkrhPM/Pasar-Triwindu.jpg",
        "https://i.postimg.cc/CKzZ0SNq/Pandawa.jpg"
        };

    static ArrayList<Wisata> getListData() {
        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position < wisataname.length; position++){
            Wisata wisata = new Wisata();
            wisata.setName(wisataname[position]);
            wisata.setDetail(wisatabiodata[position]);
            wisata.setPhoto(wisataimages[position]);
            list.add(wisata);
        }
        return list;
    }
}

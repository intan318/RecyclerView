package com.example.recyclerviewlatihan;

import com.example.recyclerviewlatihan.Model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class DataDummy {
    public static List<ItemModel> generateDummy(){

        List<ItemModel> itemModels = new ArrayList<>();
        itemModels.add(new ItemModel(
                "Soekarno",
                "Dr. Ir. H. Soekarno adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967. Ia\n" +
                        "memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda. Ia adalah Proklamator\n" +
                        "Kemerdekaan Indonesia yang terjadi pada tanggal 17 Agustus 1945.",
                R.drawable.sukar));
        itemModels.add(new ItemModel(
               "Mohammad Hatta",
                "Dr. Drs. H. Mohammad Hatta adalah tokoh pejuang, negarawan, ekonom, dan juga Wakil Presiden Indonesia yang\n" +
                        "pertama. Ia bersama Soekarno memainkan peranan penting untuk memerdekakan bangsa Indonesia dari penjajahan\n" +
                        "Belanda sekaligus memproklamirkannya pada 17 Agustus 1945",
                R.drawable.hatta));
        itemModels.add(new ItemModel(
                "Sutomo",
                ">Sutomo lebih dikenal dengan sapaan akrab oleh rakyat sebagai Bung Tomo, adalah pahlawan yang terkenal\n" +
                        "karena peranannya dalam membangkitkan semangat rakyat untuk melawan kembalinya penjajah Belanda",
                R.drawable.sutomo));
        itemModels.add(new ItemModel(
                "Pattimura",
                "Pattimura lahir di Haria, pulau Saparua, Maluku, 8 Juni 1783 – meninggal di Ambon, Maluku, 16 Desember\n" +
                        "1817 pada umur 34 tahun, juga dikenal dengan nama Kapitan Pattimura adalah Pahlawan nasional Indonesia dari\n" +
                        "Maluku.",
                R.drawable.patimura));
        itemModels.add(new ItemModel(
                "Soedirman",
                "Jenderal Besar Raden Soedirman adalah seorang perwira tinggi Indonesia pada masa Revolusi Nasional\n" +
                        "Indonesia. Sebagai panglima besar Tentara Nasional Indonesia pertama, ia adalah sosok yang dihormati di\n" +
                        "Indonesia.",
                R.drawable.sudirman));
        itemModels.add(new ItemModel(
                "Diponegoro",
                "Bendara Pangeran Harya Dipanegara adalah salah seorang pahlawan nasional Republik Indonesia. Pangeran\n" +
                        "Diponegoro terkenal karena memimpin Perang Diponegoro/Perang Jawa melawan pemerintah Hindia Belanda. Perang\n" +
                        "tersebut tercatat sebagai perang dengan korban paling besar dalam sejarah Indonesia.",
                R.drawable.diponegoro));
        itemModels.add(new ItemModel(
                "Teuku Umar",
                "Teuku Umar adalah pahlawan asal Aceh yang berjuang dengan cara berpura-pura bekerjasama dengan Belanda dan\n" +
                        "terkenal akan strategi perang gerilyanya. Ia melawan Belanda ketika telah mengumpulkan senjata dan uang yang\n" +
                        "cukup banyak",
                R.drawable.umar));
        itemModels.add(new ItemModel(
                "Ki Hajar Dewantara",
                "Raden Mas Soewardi Soerjaningrat adalah aktivis pergerakan kemerdekaan Indonesia, kolumnis, politisi, dan\n" +
                        "pelopor pendidikan bagi kaum pribumi Indonesia dari zaman penjajahan Belanda.",
                R.drawable.dewantara));
        itemModels.add(new ItemModel(
                "Cut Nyak Dien",
                "Cut Nyak Dhien adalah seorang Pahlawan Nasional Indonesia dari Aceh yang berjuang melawan Belanda pada\n" +
                        "masa Perang Aceh. Setelah wilaya",
                R.drawable.dhien));
        itemModels.add(new ItemModel(
                "Cut Nyak Meutia",
                "Tjoet Nyak Meutia adalah pahlawan nasional Indonesia dari daerah Aceh. Ia dimakamkan di Alue Kurieng,\n" +
                        "Aceh. Ia menjadi pahlawan nasional Indonesia berdasarkan Surat Keputusan Presiden Nomor 107/1964 pada tahun\n" +
                        "1964",
                R.drawable.mutia));
        return itemModels;
    }
}

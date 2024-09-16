# **TUGAS TM 3 PBO (ABSTRACT, OVERRIDE, OVERLOAD)**
___
##  **_Deskripsi:_**
Proyek ini adalah tugas dari mata kuliah Pemrograman Berorientasi Objek (PBO) yang membahas konsep kelas abstrak, metode override, dan metode overload. Proyek ini mengimplementasikan studi kasus sistem manajemen `tenaga medis` yang mencakup kelas `Dokter` dan `Perawat`, serta interaksi antara keduanya.
___
## **Informasi Tambahan**

**Kelas Abstract**

Kelas abstract adalah kelas yang tidak dapat diinstansiasi secara langsung dan biasanya digunakan sebagai template untuk kelas-kelas lain. Kelas ini dapat memiliki metode abstract (tanpa implementasi) yang harus diimplementasikan oleh subclass. Kelas abstract berguna untuk mendefinisikan kontrak dan perilaku dasar yang harus diikuti oleh kelas turunannya.

**Override**

Override adalah proses di mana sebuah metode dalam kelas anak (subclass) menggantikan implementasi metode yang sama dalam kelas induk (superclass). Dengan overriding, kelas anak dapat memberikan perilaku khusus untuk metode yang diwarisi. 

**Overload**

Overload adalah kemampuan untuk mendefinisikan beberapa metode dengan nama yang sama tetapi dengan parameter yang berbeda (baik jenis, jumlah, atau urutan). Ini memungkinkan fleksibilitas dalam penggunaan metode yang sama untuk berbagai keperluan, tanpa mengubah nama metode tersebut. Overloading meningkatkan keterbacaan dan kemudahan penggunaan kode.
___
## **Tujuan Pembelajaran**
- Memahami dan menerapkan konsep kelas abstrak dalam pemrograman.
- Menggunakan metode override untuk mengubah implementasi metode dari kelas induk.
- Mengimplementasikan metode overload untuk memberikan variasi dalam parameter yang diterima oleh metode yang sama.

## **Spesifikasi project**
- **Menampilkan tugas dan pengalaman kerja** tenaga medis menggunakan metode yang di-override.
- **Menampilkan detail tugas** tenaga medis dengan menggunakan metode yang di-overload, baik tanpa parameter maupun dengan parameter.

## **Struktur Kelas**
- **Utama**: Kelas utama yang menjalankan aplikasi dan menampilkan informasi tenaga medis.
- **TenagaMedis**: Kelas abstrak yang mendefinisikan metode abstrak untuk tugas dan pengalaman kerja, serta menyediakan metode overload untuk menampilkan detail tugas.
- **Dokter**: Kelas yang mewarisi dari `TenagaMedis` dan mengimplementasikan metode untuk menampilkan tugas dan pengalaman kerja dokter.
- **Perawat**: Kelas yang mewarisi dari `TenagaMedis` dan mengimplementasikan metode untuk menampilkan tugas dan pengalaman kerja perawat.

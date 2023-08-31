## Proyek CRUD Transaksi Tiket Kereta Api: Panduan Instalasi

Selamat datang di panduan instalasi proyek CRUD Transaksi Tiket Kereta Api! Panduan ini akan membantu Anda mengatur lingkungan yang diperlukan dan menjalankan aplikasi ini dengan lancar.

### Prasyarat

Sebelum Anda mulai menginstal proyek ini, pastikan Anda memiliki hal-hal berikut:

1. **Java Development Kit (JDK)**: Pastikan JDK terinstal di komputer Anda. Anda dapat mengunduhnya dari [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) atau [OpenJDK](https://openjdk.java.net/).

2. **NetBeans IDE**: Anda perlu mengunduh dan menginstal [NetBeans IDE](https://netbeans.apache.org/download/index.html).

3. **Database**: Pastikan Anda memiliki database yang mendukung JDBC (misalnya MySQL, PostgreSQL). Anda harus menyiapkan tabel untuk menyimpan informasi tiket dan transaksi.

### Langkah-langkah Instalasi

Berikut adalah langkah-langkah untuk menginstal dan menjalankan proyek ini:

1. **Unduh Proyek**:
   - Klik tombol "Clone or download" di repositori proyek di GitHub.
   - Pilih opsi "Download ZIP" untuk mengunduh proyek dalam bentuk arsip ZIP.
   - Ekstrak arsip ZIP ke direktori kerja Anda.

2. **Menghubungkan Database**:
   - Buka aplikasi database Anda dan buat database baru untuk proyek ini.
   - Buat tabel "tiket" dan "transaksi" dengan kolom yang sesuai.
   - Catat informasi koneksi database Anda (URL, username, password).

3. **Buka Proyek di NetBeans**:
   - Buka NetBeans IDE yang telah Anda instal.
   - Pilih "File" > "Open Project" dan pilih direktori proyek yang telah diekstrak.

4. **Konfigurasi Koneksi Database**:
   - Buka file konfigurasi yang mungkin berada di direktori "src" atau "src/main" (misalnya `DatabaseConfig.java`).
   - Ganti informasi koneksi database sesuai dengan yang Anda catat sebelumnya.

5. **Build dan Jalankan Aplikasi**:
   - Pilih proyek di jendela Proyek NetBeans.
   - Klik kanan dan pilih "Build" untuk mengompilasi proyek.
   - Klik kanan lagi dan pilih "Run" untuk menjalankan aplikasi.

6. **Gunakan Aplikasi**:
   - Aplikasi akan membuka antarmuka pengguna.
   - Anda dapat menambah, mengedit, atau menghapus tiket serta melihat daftar tiket.

### Kontribusi

Kami mengundang kontribusi pada proyek ini. Jika Anda ingin berkontribusi, silakan ikuti langkah-langkah berikut:

1. Fork repositori ini ke akun GitHub Anda.
2. Lakukan perubahan atau penambahan sesuai kebutuhan.
3. Ajukan pull request untuk menggabungkan perubahan Anda ke repositori utama.

### Kontak

Jika Anda mengalami kesulitan dalam instalasi atau memiliki pertanyaan tentang proyek ini, jangan ragu untuk menghubungi kami melalui email atau platform komunikasi lainnya.

**Selamat Mencoba dan Berkontribusi!**

## Tampilan Aplikasi

Berikut adalah beberapa tampilan dari aplikasi RisolMart:


| <img src="https://github.com/Skrnagrh/crud_java_netbeans/raw/main/1.tampilan/1.PNG" alt="Tampilan 1" width="50%"> | <img src="https://github.com/Skrnagrh/crud_java_netbeans/raw/main/1.tampilan/2.PNG" alt="Tampilan 2" width="50%"> |
|:---:|:---:|
| Halaman Login. | Halaman Register. |

| <img src="https://github.com/Skrnagrh/crud_java_netbeans/raw/main/1.tampilan/3.PNG" alt="Tampilan 3" width="50%"> | <img src="https://github.com/Skrnagrh/crud_java_netbeans/raw/main/1.tampilan/4.PNG" alt="Tampilan 4" width="50%"> |
|:---:|:---:|
| Halaman Menu Utama. | Halaman Data kereta dan Tujuan. |

| <img src="https://github.com/Skrnagrh/crud_java_netbeans/raw/main/1.tampilan/5.PNG" alt="Tampilan 5" width="50%"> | <img src="https://github.com/Skrnagrh/crud_java_netbeans/raw/main/1.tampilan/6.PNG" alt="Tampilan 6" width="50%"> |
|:---:|:---:|
| Halaman Data Penumpang. | Halaman Pilih Tiket Kereta. |

| <img src="https://github.com/Skrnagrh/crud_java_netbeans/raw/main/1.tampilan/7.PNG" alt="Tampilan 5" width="50%"> | <img src="https://github.com/Skrnagrh/crud_java_netbeans/raw/main/1.tampilan/8.PNG" alt="Tampilan 6" width="50%"> |
|:---:|:---:|
| Halaman Transaksi. | Halaman Tiket Kereta. |


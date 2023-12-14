[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/btdal3PA)
# Nama Aplikasi/Sistem
TodoList Application

## Anggota Kelompok dan Pembagian Tugas
> *tuliskan nama dan NIM anggota serta tugas dan tanggung jawabnya masing-masing*
> - Reynald Abner Tananda   ( D121221072 ) - Dokumentasi, manage package button
> - Dean Gery Pasamba       ( D121221080 ) - Dokumentasi, manage class subTodo
> - Muh. Adhim Rahman Rusdi ( D121221095 ) - Dokumentasi, koordinator, manage package main, package button and package todo

## Deskripsi Aplikasi/Sistem
> Aplikasi yang kami kembangkan adalah solusi manajemen tugas (To-Do List) yang mempermudah pengguna dalam mengelola beragam tugas atau kegiatan yang telah direncanakan. Dengan fungsionalitasnya, aplikasi ini memungkinkan pengguna membuat daftar tugas yang perlu dikerjakan, menandai tugas yang sudah selesai, menghapus tugas yang telah diselesaikan dan dapat menghapus semua tugas yang ada. Antarmuka aplikasi didesain dengan tampilan yang interaktif dan menarik menggunakan Graphic User Interface (GUI) dari Java Swing. Setiap tugas yang dimasukkan oleh pengguna akan memiliki informasi seperti Id, judul, deskripsi, batas waktu, dan status (selesai/belum selesai). Melalui aplikasi ini, pengguna dapat dengan efektif mengatur, mengelola, dan menangani semua tugas mereka dalam satu wadah yang praktis.

## Desain Aplikasi/Sistem
> ![TodoList App (2)](https://github.com/Teknik-Informatika-Unhas/project-akhir-pbo-semoga-dapat-a/assets/96617194/2ba7c8c3-f762-4ea2-8fd0-19d71b7dd939)
> Link UML : https://lucid.app/lucidchart/ebe7441d-9faf-47c8-9952-91707bdd8457/edit?viewport_loc=-425%2C669%2C3694%2C1643%2CHWEp-vi-RSFO&invitationId=inv_c5d1337c-0a8c-43e6-b4e2-0d9d2f82f157

## Manual Aplikasi/Sistem
> *Fitur yang dimiliki aplikasi:*
> - Menambahkan tugas, pengguna wajib menambahkan judul dan pengguna dapat menambahkan deskripsi dan tenggat pada tugas.
> - Menampilkan daftar tugas yang belum selesai, bersama dengan detailnya seperti id, judul, deskripsi, time stamp, deadline dan status.
> - Menandai tugas selesai, pengguna dapat menandai tugas sebagai selesai kemudian status pada tugas akan berubah menjadi selesai dan dapat dihapus.
> - Menghapus tugas, pengguna dapat menghapus tugas yang tidak diperlukan lagi, dimana tugas tersebut harus dinyatakan sebagai sudah selesai terlebih dahulu.
> - Melakukan undo, dimana pengguna dapat memilih tugas yang sudah selesai kemudian status tugas dikembalikan menjadi belum selesai.

> *Fitur yang baru ditambahkan:*
> - Menambahkan **deadline** tugas, pengguna dapat menambahkan deadline atau waktu tenggat tugas. Pengguna tidak dapat memilih tanggal hari ini dan sebelumnya.
> - Menambahkan **Remove All Task**, dengan menekan tombol tersebut pengguna dapat menghapus semua daftar tugas tanpa terkecuali.
> - Menambahkan fitur dimana pengguna wajib mengisi judul tugas.
> - Menambahkan fitur **confirm deletion** berupa modal box untuk mengantisipasi terjadinya penghapusan data secara tidak disengaja oleh user.
> - Menambahkan fitur **shortcut button** pada semua tombol untuk memudahkan mobilitas pengguna.

> *Fitur yang akan ditambahkan:*
> - onEdit & onChange, dimana pengguna dapat mengedit tugas yang sudah ditambahkan.
> - pembatasan karakter pada title input dan description input.
> - database connection
> - penambahan log penambahan dan penghapusan

> *Tata Cara Penggunaan Aplikasi:*
> Menambahkan Tugas (Add Todo)
> - Klik tombol **Add Todo** untuk menambahkan tugas baru.
> - Isi judul dan deskripsi tugas melalui dialog input.
> - Klik **OK** untuk menyimpan tugas atau **Cancel** untuk membatalkan.

> *Menandai Tugas sebagai Selesai (Mark as Complete):*
> - Pilih tugas yang ingin ditandai sebagai selesai dari daftar.
> - Klik tombol **Mark as Complete** untuk menyelesaikan tugas yang dipilih.

> *Menandai Tugas sebagai Belum Selesai (Mark as Uncomplete):*
> - Pilih tugas yang ingin ditandai sebagai belum selesai dari daftar.
> - Klik tombol **Mark as Uncomplete** utk mengubah status tugas yg dipilih menjadi belum selesai.

> *Menghapus Tugas yang Telah Selesai (Remove Completed):*
> - Klik tombol **Remove Completed** untuk menghapus semua tugas yang telah selesai.
> - Pada menu dialog *Confirm Deletion*, Klik **Yes** untuk menghapus tugas atau **No** untuk membatalkan.

> *Menghapus Semua Tugas (Remove All Task)*
> - Klik tombol **Remove All Task** untuk menghapus semua tugas tanpa terkecuali.
> - Pada menu dialog *Confirm Deletion*, Klik **Yes** untuk menghapus tugas atau **No** untuk membatalkan.

> *Tampilan Daftar Tugas:*
> - Daftar tugas ditampilkan di tengah aplikasi dengan warna latar belakang yang berbeda untuk tugas yang selesai dan yang belum selesai.


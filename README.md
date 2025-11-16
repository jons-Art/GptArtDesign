# GPT Art Design - Android (source)

Ini adalah source minimal untuk aplikasi *GPT Art Design* (nama sesuai permintaan).
Aplikasi ini adalah starter project: efek flip page (ViewPager2 + PageTransformer), model Page, dan placeholder untuk editor.

**Penting:** Saya tidak dapat membangun atau menandatangani APK di lingkungan ini. Kamu bisa membuild sendiri di Android Studio dengan langkah berikut:

1. Install Android Studio (menggunakan JDK 17).
2. Buka Android Studio -> Open -> pilih folder `GPT_Art_Design_source` yang ada di zip.
3. Biarkan Gradle sync. Jika diminta, install Android SDK/Build Tools versi yang cocok.
4. Klik `Build -> Build Bundle(s) / APK(s) -> Build APK(s)`.
5. Setelah selesai, temukan APK di `app/build/outputs/apk/`.

Untuk membuat APK yang benar-benar lengkap (fitur edit gambar, export MP4), kamu perlu mengisi implementasi `PageEditorActivity` dan fungsional export. Aku bisa bantu lengkapi file jika mau.

---
Credits: project skeleton dibuat oleh ChatGPT (GPT Art Design).

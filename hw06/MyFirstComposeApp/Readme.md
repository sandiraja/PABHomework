# Homework 6 — My First Compose App

## Task 3: Colour and Spacing
Colour used: Gray
Padding kept: 24dp
What changed / what stayed the same: Saat ubah padding dari 24dp ke 8dp dan 48dp, ruang kosong di sekitar elemen berubah

## Task 4: Build Error
First error message:
'M' is not a valid file-based resource name character: File-based resource names must contain only lowercase a-z, 0-9, or underscore
Cause: nama file .png tidak bisa kapital
Why other errors appear: unresolved reference
Fix: mengganti nama My_Picture.png menjadi my_picture.png

## Task 5: Explore the Project
(a) MainActivity: path app/src/main/java/com/example/myfirstcomposeapp/MainActivity.kt
(b) Gradle file: path app/build.gradle.kts
(c) Launcher image line: painter = painterResource(id = R.drawable.ic_launcher_foreground)

## Task 6: Preview vs Run
Saat saya running tidak bisa preview di android studio, namun langsung muncul di device pribadi saya

## Task 7: Views vs Compose
1. ...
2.
| Composable | Package | Library layer    |
|---|---|------------------|
| Column | androidx.compose.foundation.layout | foundation layer |
| Text | androidx.compose.material3 | material layer   |
| Image | androidx.compose.foundation | foundation layer |

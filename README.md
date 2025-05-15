# API Test Projesi (REST Assured + JUnit)

Bu proje, Yazılım Test Mühendisliği dersi kapsamında hazırlanmış bir otomasyon test projesidir.  
Amaç, RESTful bir API'ye GET ve POST istekleri göndererek, gelen yanıtları JUnit kullanarak test etmektir.

## Kullanılan Teknolojiler
- Java
- Maven
- JUnit 4
- REST Assured
- IntelliJ IDEA

## Gerçekleştirilen Testler
- GET isteği ile kullanıcı bilgisi testi (`reqres.in`)
- GET isteği ile pet bilgisi testi (`petstore.swagger.io`)
- POST isteği ile yeni post oluşturma testi (`jsonplaceholder.typicode.com`)
- Her testte status code, body verisi ve yanıt süresi kontrol edilmiştir

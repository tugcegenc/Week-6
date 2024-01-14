1.City tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.

SELECT country.country_id,city.city_id,city,country FROM country 
LEFT JOIN city ON city.country_id = country.country_id
WHERE (city.country_id IS NOT NULL AND country.country_id IS NOT NULL)
ORDER BY country_id ASC;

--2.Customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.
--3.Customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.
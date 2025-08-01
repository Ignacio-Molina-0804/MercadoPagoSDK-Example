# MercadoPagoSDK-example 🚀

Bienvenido a **MercadoPagoSDK-example**, un proyecto pensado para que puedas integrar Mercado Pago en tus aplicaciones Java de forma rápida, sencilla y segura.  
Ideal para quienes quieren probar el flujo de pagos sin complicaciones, usando lo último de Java y Spring Boot.

---

## 🌟 ¿Qué hace esta aplicación?

Esta app expone un endpoint REST (`/api/mercado`) que, al ser invocado, crea una preferencia de pago en Mercado Pago y te devuelve un enlace listo para probar en modo sandbox.  
Perfecto para simular compras y validar tu integración antes de salir a producción.

---

## 🗂️ Estructura del proyecto

- **PostControllers.java**  
  Controlador principal donde se configura la preferencia de pago, el token de acceso, los ítems y las URLs de retorno.
- **application.properties**  
  Configuración de la base de datos (H2 en memoria) y parámetros generales de la app.
- **pom.xml**  
  Todas las dependencias y configuración de Maven para que todo funcione sin problemas.

---

## 🔄 URLs de retorno: ¿cómo funcionan?

Mercado Pago te permite definir a dónde redirigir al usuario según el resultado del pago:

- **success**: El pago fue aprobado exitosamente.
- **failure**: El pago fue rechazado o falló.
- **pending**: El pago quedó pendiente de aprobación.

Estas URLs se pueden personalizar en el controlador para que apunten a tu frontend, una página de agradecimiento, o cualquier endpoint propio. Así, podés controlar la experiencia del usuario en cada caso y mostrarle el mensaje adecuado.

---

## ⚙️ Requisitos

- Java 17
- Maven (no hace falta instalarlo, podés usar el wrapper incluido)

---

## 🚀 ¿Cómo ejecutar la aplicación?

1. **Instalá las dependencias:**
   ```sh
   ./mvnw clean install
   ```
2. **Levantá el servidor:**
   ```sh
   ./mvnw spring-boot:run
   ```
3. **Probá el endpoint:**  
   Abrí tu navegador y andá a [http://localhost:8080/api/mercado](http://localhost:8080/api/mercado)  
   ¡Listo! Vas a recibir un link de pago para testear.

---

## 💡 Consejos útiles

- No olvides reemplazar `"PROD_ACCESS_TOKEN"` en el controlador por tu token real de Mercado Pago para hacer pruebas con tu cuenta.
- La base de datos es H2 en memoria, ideal para desarrollo y pruebas rápidas.
- Si querés sumar más funcionalidades, podés crear nuevos endpoints agregando controladores en el paquete `controller`.

---

## 📚 Documentación oficial

¿Querés profundizar más?  
Encontrá toda la info sobre cómo crear aplicaciones y preferencias de pago en la documentación oficial de Mercado Pago:

👉 [Mercado Pago - Crear aplicación (Checkout Pro)](https://www.mercadopago.com.ar/developers/es/docs/checkout-pro/create-application)

---

¡Esperamos que este proyecto te ayude a integrar Mercado Pago de manera simple y efectiva!  
Si tenés dudas o sugerencias, no dudes en mejorar este ejemplo.  
¡A cobrar se ha dicho! 💸
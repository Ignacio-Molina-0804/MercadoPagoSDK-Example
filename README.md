# MercadoPagoSDK 🚀

¡Bienvenido al ejemplo más fachero para cobrar con Mercado Pago usando Spring Boot!  
Acá tenés todo lo que necesitás para armar tu propio link de pago y testearlo en sandbox, sin vueltas y sin dramas.

---

## ✨ ¿Qué hace esta app?

- Levantás el server y le pegás a [`/api/mercado`](http://localhost:8080/api/mercado)
- Te devuelve un link de pago de Mercado Pago (modo sandbox, así que podés probar tranqui)
- Todo hecho en Java 17, con Spring Boot y el SDK oficial de Mercado Pago

---

## 🛠️ ¿Cómo está armado?

- **PostControllers.java**  
  Acá está la magia: se arma la preferencia, se pone el token, los ítems, las URLs de retorno y te devuelve el link.
- **application.properties**  
  Configuración de la base de datos (H2, para no complicarse) y el nombre de la app.
- **pom.xml**  
  Todas las dependencias que hacen que esto funcione.

---

## 🚦 ¿Cómo funcionan las URLs de retorno?

Cuando el usuario paga (o cancela), Mercado Pago lo redirige a una URL según el resultado:

- **success**: Si el pago fue exitoso, te manda a la URL que pusiste como `success`.
- **failure**: Si el pago falló, te manda a la URL de `failure`.
- **pending**: Si el pago quedó pendiente, te manda a la URL de `pending`.

En el controlador, podés cambiar estas URLs para que apunten a donde quieras (tu frontend, una página de gracias, etc).  
¡Así sabés siempre cómo terminó la compra y podés mostrarle al usuario el mensaje que quieras!

---

## ⚡ ¿Qué necesitás para correrlo?

- Java 17 (sí o sí)
- Maven (ya viene el wrapper, así que ni lo instalás)

---

## 🚀 ¿Cómo lo corrés?

1. Instalá las dependencias:
   ```sh
   ./mvnw clean install
   ```
2. Levantá el server:
   ```sh
   ./mvnw spring-boot:run
   ```
3. Abrí el navegador y andá a [http://localhost:8080/api/mercado](http://localhost:8080/api/mercado)  
   ¡Listo! Te sale el link para pagar.

---

## 💡 Tips facheros

- Cambiá `"PROD_ACCESS_TOKEN"` por tu token posta de Mercado Pago en el controlador.
- Si querés agregar más endpoints, meté más controladores en el package `controller`.
- La base de datos es H2, así que no tenés que instalar nada raro.
- Las URLs de retorno podés tunearlas para que apunten a tu web, a un endpoint propio, o a donde quieras.

---

Hecho para que lo entiendas al toque y lo uses sin vueltas.  
¡A cobrar se
# 🍽️ JavaEats — Simulador de Gestión de Restaurantes (Java)

Proyecto académico desarrollado en **Java** que simula la gestión de un sistema de restauración rápida.  
La aplicación permite que **administradores** y **clientes** interactúen con restaurantes, comidas, pedidos y servicios de catering, incorporando una interfaz gráfica sencilla.

---

## ✨ Funcionalidades principales

### 👨‍💼 Administrador
- Alta, baja y modificación de **restaurantes**.  
- Gestión de **comidas** con sus ingredientes, precios e imágenes.  
- Creación y edición de **servicios de catering** asociados a restaurantes.  
- Consulta de información detallada sobre restaurantes y comidas.  
- Acceso al historial de **ventas**, con posibilidad de filtrar por fecha y exportar pedidos a ficheros de texto.  

### 👤 Cliente
- Registro o inicio de sesión con **perfil personal o de empresa**.  
- Búsqueda de restaurantes por nombre, cercanía o tipo (ej. catering).  
- Realización de **pedidos** de comidas con cantidades personalizadas.  
- Opción de contratar **catering** si es cliente empresa.  
- Pago de pedidos, calificación de restaurantes y generación de **facturas en texto**.  
- Edición de perfil (dirección, tarjeta de crédito, contraseña, etc.).  

---

## 🛠️ Tecnologías utilizadas
- **Lenguaje:** Java  
- **Paradigma:** Programación Orientada a Objetos (POO)  
- **Entorno de desarrollo:** NetBeans  
- **Interfaz gráfica:** Swing  
- **Gestión de datos:** ficheros de texto para almacenamiento y facturación  

---

## 🎯 Objetivos del proyecto
- Practicar conceptos de **POO**: herencia, polimorfismo y encapsulación.  
- Implementar un sistema modular de gestión de entidades (clientes, pedidos, restaurantes).  
- Desarrollar una interfaz gráfica funcional conectada a la lógica de negocio.  
- Simular un escenario real de gestión de pedidos y servicios de restauración.  

---

## 📂 Estructura de directorios
- `src/main/java/Logica/` → Clases principales del modelo (Clientes, Pedidos, Restaurantes…).  
- `src/main/java/Interfaz/` → Ventanas y formularios de Swing.  
- `src/main/java/Imagenes/` → Recursos gráficos para la interfaz.  

---

## ▶️ Ejecución
Compilar y ejecutar desde NetBeans o con terminal:  

```bash
javac src/main/java/**/*.java
java Logica.Sistema

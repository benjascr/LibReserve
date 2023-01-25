# Práctica obligatoria Desarrollo de Aplicaciones Distribuidas.
### Nombre.
LibReserve

### Descripción. 
LibReserve es una página web de reserva de salas y puestos de estudio para la biblioteca de la Universidad Rey Juan Carlos.

### Funcionalidades.
- Funcionalidades públicas: El usuario al acceder a la página sin registrarse podrá ver todas las salas y puestos disponibles, la tasa de ocupación de la biblioteca e información sobre la misma, como su horario de uso, su ubicación y demás datos de utilidad. 

- Funcionalidades privadas: El usuario una vez registrado podrá reservar salas y/o puestos de lectura, consultar sus últimas reservas, hacer comentarios sobre su experiencia como usuario y hablar por un chat compartido con otros usuarios de la biblioteca.

### Entidades.
- Administrador: Representa al administrador del sistema; en este caso, será la propia biblioteca. Realizarán la gestión de las salas y puestos disponibles en la biblioteca.

- Usuario: Representa a las personas interesadas del sistema.

- Producto: Representa las salas y puerstos del sistema.

- Reserva: Representa la reserva de sala y/o puesto de lectura del usuario.

- Comentario: Representa el comnetario que un usuario deja sobre la biblioteca.

- Información: Representa toda la información útil ofrecida por el sistema.

### Funcionalidades del servicio interno.
- Envío de correo electrónico al usuario tras registrarse y al realizar una reserva.

- Generación de un código QR que representa cada reserva en formato pdf.

- Chat entre todos los usuarios del sistema.

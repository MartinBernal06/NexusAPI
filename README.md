# NexusAPI

# DB INSERTS

-- ================================================
-- USUARIOS
-- ================================================
INSERT INTO users (username, email, password) VALUES
('carlos_dev', 'carlos@nexus.com', '1234'),
('maria_ux', 'maria@nexus.com', '1234'),
('juan_backend', 'juan@nexus.com', '1234'),
('laura_design', 'laura@nexus.com', '1234'),
('pedro_qa', 'pedro@nexus.com', '1234');

-- ================================================
-- POSTS (user_id referencia a la tabla users)
-- ================================================
INSERT INTO posts (title, content, created_at, user_id) VALUES
('Bienvenidos a Nexus', 'Esta es la primera publicación de la plataforma. ¡Esperamos que disfruten la experiencia!', NOW(), 1),
('Tips de UI/UX para principiantes', 'Hoy les comparto 5 tips esenciales para mejorar la experiencia de usuario en sus aplicaciones...', NOW(), 2),
('Spring Boot con MySQL paso a paso', 'En este post explico cómo configurar Spring Boot con una base de datos MySQL correctamente.', NOW(), 3),
('¿Qué es el diseño minimalista?', 'El diseño minimalista se basa en la simplicidad, eliminando lo innecesario para destacar lo esencial.', NOW(), 4),
('Cómo hacer pruebas unitarias en Java', 'Las pruebas unitarias son fundamentales para garantizar la calidad del software. Aquí un ejemplo con JUnit...', NOW(), 5),
('React vs Angular en 2025', 'Comparativa detallada de dos de los frameworks más populares del frontend actual.', NOW(), 1),
('Bases de datos NoSQL: ¿cuándo usarlas?', 'MongoDB, Redis, Cassandra... ¿cuál elegir y cuándo? Guía práctica para developers.', NOW(), 3);

-- ================================================
-- COMENTARIOS (post_id y user_id referencian sus tablas)
-- ================================================
INSERT INTO comments (text, created_at, post_id, user_id) VALUES
('¡Excelente iniciativa! Esperando más contenido.', NOW(), 1, 2),
('Muy buena bienvenida, el equipo se ve muy profesional.', NOW(), 1, 3),
('Justo lo que necesitaba, gracias por los tips!', NOW(), 2, 1),
('El tip #3 me pareció el más útil, lo aplicaré en mi proyecto.', NOW(), 2, 5),
('Muy claro el tutorial, me ayudó a resolver mi error de conexión.', NOW(), 3, 2),
('¿Podrías hacer uno también con PostgreSQL?', NOW(), 3, 4),
('Me encanta el enfoque minimalista, menos es más!', NOW(), 4, 1),
('Muy interesante, ¿tienes algún recurso extra recomendado?', NOW(), 4, 3),
('JUnit es genial, ¿conoces Mockito también?', NOW(), 5, 1),
('Muy completo el post, gracias por compartirlo.', NOW(), 5, 2),
('Yo sigo prefiriendo React por su ecosistema.', NOW(), 6, 4),
('Angular tiene ventajas en proyectos empresariales grandes.', NOW(), 6, 5),
('MongoDB para datos no estructurados es una maravilla.', NOW(), 7, 2),
('Redis para caché es insuperable, muy buen punto.', NOW(), 7, 1);

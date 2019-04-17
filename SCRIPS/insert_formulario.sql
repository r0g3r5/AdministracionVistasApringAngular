INSERT INTO va_menus
(id_menu, estado, etiqueta, orden)
VALUES(1, true, 'Configuracion', 1);
INSERT INTO va_menus
(id_menu, estado, etiqueta, orden)
VALUES(2, true, 'Menu 1', 2);
INSERT INTO va_formularios
(id_formulario, estado, etiqueta, nivel, url, menu)
VALUES(1, true, 'Config Usuarios', 1, '/usuarios', 1);
INSERT INTO va_formularios
(id_formulario, estado, etiqueta, nivel, url, menu)
VALUES(2, true, 'Config Roles', 2, '/roles', 1);
INSERT INTO va_formularios
(id_formulario, estado, etiqueta, nivel, url, menu)
VALUES(3, true, 'Menu11', 1, '/menu11', 2);

INSERT INTO va_roles
(id_rol, descripcion, estado, nombre, valida_ip)
VALUES(nextval('seq_va_roles'), 'Administradores', true, 'ADMIN', false);
INSERT INTO va_roles
(id_rol, descripcion, estado, nombre, valida_ip)
VALUES(nextval('seq_va_roles'), 'Usuarios', true, 'USER', false);

INSERT INTO public.va_accesos
(id_acceso, formulario, rol)
VALUES(nextval('seq_va_accesos'), 1, 1);
INSERT INTO public.va_accesos
(id_acceso, formulario, rol)
VALUES(nextval('seq_va_accesos'), 2, 1);
INSERT INTO public.va_accesos
(id_acceso, formulario, rol)
VALUES(nextval('seq_va_accesos'), 3, 1);

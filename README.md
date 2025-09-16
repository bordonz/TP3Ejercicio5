Integrantes:
 Claudio Mariano Mathot
 Cristian Rene Benegas Gonzalez
 Julian Martin ESQUIAGA
 Rodrigo Bordon
 Santiago González
 Milagros Gilda Alfaro
 José María Urbani
 Aguero Ayelen Guadalupe
Trabajo practico n°5

✓ Resolver, y subir el proyecto a un repositorio GitHub. Los integrantes deben estar como colaboradores,
uno ó más commit cada uno. En la tarea detalle: apellido, nombre de todos los integrantes del equipo.
Una clase Directorio telefónico posee una lista de Contactos de los que interesa conocer
su DNI, nombre, apellido, Ciudad y dirección. El Directorio, cuenta con un TreeMap de un teléfono
tipo Long(Key),se empareja con un Contacto(valor). Además, posee las siguientes funcionalidades:
A. agregarContacto() que permite registrar un nuevo contacto con su respectivo nro. de
teléfono. Siendo el nro. del teléfono la clave del mismo.
B. buscarContacto() que en base al nro. de teléfono retorna el Contacto asociado al mismo.
C. buscarTeléfono() que en base a un apellido nos devuelve un Set<Long> con los números
de teléfono asociados a dicho apellido.
D. buscarContactos() que en base a una ciudad nos devuelve un ArrayList con los
Contactos asociados a dicha ciudad.
E. borrarContacto() que en base al número de teléfono elimina el contacto del directorio.
❖ Importante: Armar el modelo de clases UML representado las clases necesarias.
❖ Implementar en java con TreeMap<Long, Cliente>, TreeSet, e Iterator. Recuerde el uso de:
keySet, entrySet, en los if se sugiere containsKey, containsValue.
❖ Probar en el main, agregar 4~5 Contactos, y probar todo métodos entre A y E.
❖ El JFrame frmMenuPrincipal contiene un Directorio/ciudades (static).
❖ El frmAgregar, debe luego de initComponents, llenarComboCiudad(addItem).
❖ Recuerda validarCampos vacíos, y parseInt (teléfono y Dni). Limpiar campos.
❖ Se deben poder agregar nuevas Ciudades al listado (List o Set) existente.

/*
 * Copyright 2024 fedec.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {

    private List<Email> emails;
    private String nombre;

    public Carpeta(String nombre) {
        emails = new ArrayList<>();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void mover(Email email, Carpeta carpeta) {
        emails.remove(email);
        carpeta.agregar(email);
    }

    public void agregar(Email email) {
        emails.add(email);
    }

    public int getEspacioOcupado() {
        return emails.stream().mapToInt(email -> email.getTamanio()).sum();
    }

    public Email buscar(String texto) {
        return emails.stream().filter(email -> email.getTitulo().contains(texto) || email.getCuerpo().contains(texto))
                .findFirst().orElse(null);
    }

}

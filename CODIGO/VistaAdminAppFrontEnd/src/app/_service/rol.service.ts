import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Rol } from "../_model/rol";
import { URL_SERVIDOR_BACKEND } from "../_commons/constantes";

@Injectable({
  providedIn: "root"
})
export class RolService {
  url: string = `${URL_SERVIDOR_BACKEND}/roles`;

  constructor(private http: HttpClient) {}
  searchByEstadoActived() {
    return this.http.get<Rol[]>(`${this.url}/searchByEstadoActived`);
  }

  guardar(rol: Rol) {
    return this.http.post(`${this.url}/guardar`, rol);
  }
}

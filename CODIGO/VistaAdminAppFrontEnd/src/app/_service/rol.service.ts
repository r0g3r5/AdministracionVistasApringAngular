import { Injectable } from "@angular/core";
import { HttpClient, HttpParams } from "@angular/common/http";
import { Rol } from "../_model/rol";
import { URL_SERVIDOR_BACKEND } from "../_commons/constantes";

@Injectable({
  providedIn: "root"
})
export class RolService {
  url: string = `${URL_SERVIDOR_BACKEND}/roles`;

  searchById(idRol: number) {
    let params = new HttpParams();
    params = params.set("idRol", `${idRol}`);
    return this.http.get<Rol>(`${this.url}/searchById`, {
      params: this.generarRequestParamDeID(idRol)
    });
  }

  constructor(private http: HttpClient) {}
  searchByEstadoActived() {
    return this.http.get<Rol[]>(`${this.url}/searchByEstadoActived`);
  }

  guardar(rol: Rol) {
    return this.http.post(`${this.url}/guardar`, rol);
  }

  borrar(idRol: number) {
    return this.http.delete(`${this.url}/borrar`, {
      params: this.generarRequestParamDeID(idRol)
    });
  }

  generarRequestParamDeID(idRol: number): HttpParams {
    let params = new HttpParams();
    params = params.set("idRol", `${idRol}`);
    return params;
  }
}

import { Injectable } from "@angular/core";
import { HttpClient, HttpParams } from "@angular/common/http";
import { Menu } from "../_model/menu";
import { URL_SERVIDOR_BACKEND } from "../_commons/constantes";
import { Rol } from "../_model/rol";

@Injectable({
  providedIn: "root"
})
export class MenuService {
  url: string = `${URL_SERVIDOR_BACKEND}/menus`;

  constructor(private http: HttpClient) {}

  listarPorRol(rol: string) {
    let param = new HttpParams();
    param = param.set("rol", rol);
    return this.http.get<Menu[]>(`${this.url}/listByRol`, { params: param });
  }

}

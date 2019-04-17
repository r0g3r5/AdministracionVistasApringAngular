import { Injectable } from "@angular/core";
import { HttpClient, HttpParams } from "@angular/common/http";
import { Formulario } from "../_model/formulario";
import { Menu } from "../_model/menu";

@Injectable({
  providedIn: "root"
})
export class MenuService {
  url: string = "http://localhost:8087/menus/listByRol";

  constructor(private http: HttpClient) {}

  listarPorRol(rol: string) {
    let param = new HttpParams();
    param = param.set("rol", rol);
    return this.http.get<Menu[]>(this.url, { params: param });
  }
}

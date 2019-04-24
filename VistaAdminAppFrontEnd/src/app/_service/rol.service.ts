import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Rol } from "../_model/rol";

@Injectable({
  providedIn: "root"
})
export class RolService {
  url: string = "http://localhost:8087/roles/searchByEstadoActived";

  constructor(private http: HttpClient) {}
  searchByEstadoActived() {
    return this.http.get<Rol[]>(`${this.url}`);
  }
}

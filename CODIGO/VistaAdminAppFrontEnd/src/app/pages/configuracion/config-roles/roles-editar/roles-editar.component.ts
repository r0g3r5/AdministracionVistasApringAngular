import { Component, OnInit } from "@angular/core";
import { Rol } from "src/app/_model/rol";
import { RolService } from "src/app/_service/rol.service";
import { MessageService } from "primeng/api";
import { ActivatedRoute, Params } from "@angular/router";

@Component({
  selector: "app-roles-editar",
  templateUrl: "./roles-editar.component.html",
  styleUrls: ["./roles-editar.component.css"]
})
export class RolesEditarComponent implements OnInit {
  nombre: string;
  descripcion: string;
  estado: boolean = true;
  edicion: boolean;
  idRol: number;

  constructor(
    private route: ActivatedRoute,
    private rolService: RolService,
    private messageService: MessageService
  ) {}

  ngOnInit() {
    this.route.params.subscribe((params: Params) => {
      this.edicion = params["idRol"] != null && params["idRol"] != undefined;
      this.idRol =
        params["idRol"] != null && params["idRol"] != undefined
          ? params["idRol"]
          : 0;
      this.initEdicion(this.edicion, this.idRol);
    });
  }
  accion() {
    if (
      this.nombre != null &&
      this.nombre != undefined &&
      this.nombre.length > 0
    ) {
      let rol: Rol = new Rol();
      rol.idRol = this.idRol;
      rol.nombre = this.nombre;
      rol.descripcion = this.descripcion;
      rol.estado = this.estado;
      this.rolService.guardar(rol).subscribe(data => {
        console.log("respuesta " + data);
        this.messageService.add({
          severity: "success",
          summary: "Success Message",
          detail: "Order submitted"
        });
      });
    } else {
      this.messageService.add({
        severity: "error",
        summary: "Campo obligatorio",
        detail: "El campo nombre no debe estar vacio...!"
      });
    }
  }

  initEdicion(edicion: boolean, idRol: number) {
    if (edicion) {
      this.rolService.searchById(idRol).subscribe(data => {
        this.idRol = data.idRol;
        this.nombre = data.nombre;
        this.descripcion = data.descripcion;
        this.estado=data.estado;
      });
    }
  }
}

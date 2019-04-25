import { Component, OnInit } from "@angular/core";
import { Rol } from "src/app/_model/rol";
import { RolService } from "src/app/_service/rol.service";
import { MessageService } from "primeng/api";

@Component({
  selector: "app-roles-editar",
  templateUrl: "./roles-editar.component.html",
  styleUrls: ["./roles-editar.component.css"]
})
export class RolesEditarComponent implements OnInit {
  nombre: string;
  descripcion: string;
  estado: boolean = true;

  constructor(
    private rolService: RolService,
    private messageService: MessageService
  ) {}

  ngOnInit() {}
  accion() {
    if (
      this.nombre != null &&
      this.nombre != undefined &&
      this.nombre.length > 0
    ) {
      let rol: Rol = new Rol();
      rol.idRol = 0;
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
      this.messageService.add({severity:"error",summary:"Campo obligatorio",detail:"El campo nombre no debe estar vacio...!"})
    }
  }
}

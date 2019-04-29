import { Component, OnInit } from "@angular/core";
import { RolService } from "src/app/_service/rol.service";
import { Rol } from "src/app/_model/rol";
import { Router, ActivatedRoute } from "@angular/router";
import { MessageService } from "primeng/api";

@Component({
  selector: "app-roles-listar",
  templateUrl: "./roles-listar.component.html",
  styleUrls: ["./roles-listar.component.css"]
})
export class RolesListarComponent implements OnInit {
  roles: Rol[];
  constructor(
    private rolService: RolService,
    private router: Router,
    private route: ActivatedRoute,
    private messageService: MessageService
  ) {}

  ngOnInit() {
    this.rolService.searchByEstadoActived().subscribe(data => {
      this.roles = data;
    });
  }
  nuevo() {
    this.router.navigate(["nuevo"], { relativeTo: this.route });
  }
  modificar(rol: Rol) {
    this.router.navigate([`${rol.idRol}/editar`], { relativeTo: this.route });
  }

  borrar(rol: Rol) {
    rol.eliminar = true;
    console.log("eliminar " + JSON.stringify(rol));
    this.rolService.borrar(rol).subscribe(data => {
      this.router.navigate(["/adminvista/configuracion/roles"]);
      this.rolService.guardar(rol).subscribe(data => {
        console.log("respuesta " + data);
        this.messageService.add({
          severity: "success",
          summary: "Exito",
          detail: `Rol ${rol.nombre} borrado correctamente.`
        });
      });
    });
  }

  modificarAcceso() {
    this.router.navigate(["/adminvista/configuracion/ADMIN/acceso"], {
      relativeTo: this.route
    });
  }
}

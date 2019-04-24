import { Component, OnInit } from "@angular/core";
import { RolService } from "src/app/_service/rol.service";
import { Rol } from "src/app/_model/rol";

@Component({
  selector: "app-roles-listar",
  templateUrl: "./roles-listar.component.html",
  styleUrls: ["./roles-listar.component.css"]
})
export class RolesListarComponent implements OnInit {
  roles: Rol[];
  constructor(private rolService: RolService) {}

  ngOnInit() {
    console.log("listando roles.....");
    this.rolService.searchByEstadoActived().subscribe(data => {
      this.roles = data;
      console.log(JSON.stringify(this.roles))
    });
  }
}

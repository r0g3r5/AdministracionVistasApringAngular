import { Component, OnInit } from "@angular/core";
import { RolService } from "src/app/_service/rol.service";
import { Rol } from "src/app/_model/rol";
import { Router, ActivatedRoute } from "@angular/router";

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
    private route: ActivatedRoute
  ) {}

  ngOnInit() {
    console.log("listando roles.....");
    this.rolService.searchByEstadoActived().subscribe(data => {
      this.roles = data;
      console.log(JSON.stringify(this.roles));
    });
  }
  navegarRolNuevo() {
    this.router.navigate(["nuevo"], { relativeTo: this.route });
  }
}

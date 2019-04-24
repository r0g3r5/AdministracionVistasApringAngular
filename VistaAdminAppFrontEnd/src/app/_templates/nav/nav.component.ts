import { Component, OnInit } from "@angular/core";
import { MenuItem } from "primeng/api";
import { MenuService } from "src/app/_service/menu.service";

@Component({
  selector: "app-nav",
  templateUrl: "./nav.component.html",
  styleUrls: ["./nav.component.css"]
})
export class NavComponent implements OnInit {
  items: MenuItem[] = [];

  constructor(private menuService: MenuService) {}

  ngOnInit() {
    this.menuService.listarPorRol("ADMIN").subscribe(responseMenu => {
      responseMenu.forEach(menu => {
        let itemsHijos: MenuItem[] = [];
        menu.formularios.forEach(form => {
          itemsHijos.push({ label: form.etiqueta, icon: form.icono });
        });
        this.items.push({
          label: menu.etiqueta,
          icon: menu.icono,
          items: itemsHijos
        });
      });
      // this.items = responseMenu;
    });
  }
}

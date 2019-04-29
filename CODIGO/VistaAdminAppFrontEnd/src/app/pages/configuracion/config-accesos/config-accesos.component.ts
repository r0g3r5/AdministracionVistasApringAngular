import { Component, OnInit } from "@angular/core";
import { TreeNode, MessageService } from "primeng/api";
import { MenuService } from "src/app/_service/menu.service";

@Component({
  selector: "app-config-accesos",
  templateUrl: "./config-accesos.component.html",
  styleUrls: ["./config-accesos.component.css"]
})
export class ConfigAccesosComponent implements OnInit {
  menu: TreeNode[] = [];
  selectedFile: TreeNode;

  constructor(
    private menuService: MenuService,
    private messageService: MessageService
  ) {}

  ngOnInit() {
    this.menuService.listByRolAndAcces("ADMIN").subscribe(data => {
      console.log("menus " + JSON.stringify(data));
      data.forEach(m => {
        let menuPadre: TreeNode;
        let menuHijo: TreeNode[] = [];
        m.formularios.forEach(f => {
          menuHijo.push({
            label: f.etiqueta,
            parent: menuPadre
          });
        });
        menuPadre = { label: m.etiqueta, children: menuHijo };
        this.menu.push(menuPadre);
      });
    });
  }
}

import { Component, OnInit } from "@angular/core";
import { MenuItem } from "primeng/api";
import { MenuService } from "src/app/_service/menu.service";

@Component({
  selector: "app-nav",
  templateUrl: "./nav.component.html",
  styleUrls: ["./nav.component.css"]
})
export class NavComponent implements OnInit {
  items: MenuItem[]=[];

  constructor(private menuService: MenuService) {}

  ngOnInit() {
    this.menuService.listarPorRol("ADMIN").subscribe(responseMenu => {
      responseMenu.forEach(menu => {
        let itemsHijos: MenuItem[]=[]; 
        menu.formularios.forEach(form=>{itemsHijos.push({label:form.etiqueta})})
        this.items.push({label:menu.etiqueta,items:itemsHijos});
      });
      // this.items = responseMenu;
    });
    this.items = this.items = [
      {
        label: "File",
        icon: "pi pi-pw pi-file",
        items: [
          {
            label: "New",
            icon: "pi pi-fw pi-plus",
            items: [
              { label: "User", icon: "pi pi-fw pi-user-plus" },
              { label: "Filter", icon: "pi pi-fw pi-filter" }
            ]
          },
          { label: "Open", icon: "pi pi-fw pi-external-link" },
          { separator: true },
          { label: "Quit", icon: "pi pi-fw pi-times" }
        ]
      },
      {
        label: "Edit",
        icon: "pi pi-fw pi-pencil",
        items: [
          { label: "Delete", icon: "pi pi-fw pi-trash" },
          { label: "Refresh", icon: "pi pi-fw pi-refresh" }
        ]
      },
      {
        label: "Help",
        icon: "pi pi-fw pi-question",
        items: [
          {
            label: "Contents",
            icon: "pi pi-pi pi-bars"
          },
          {
            label: "Search",
            icon: "pi pi-pi pi-search",
            items: [
              {
                label: "Text",
                items: [
                  {
                    label: "Workspace"
                  }
                ]
              },
              {
                label: "User",
                icon: "pi pi-fw pi-file"
              }
            ]
          }
        ]
      },
      {
        label: "Actions",
        icon: "pi pi-fw pi-cog",
        items: [
          {
            label: "Edit",
            icon: "pi pi-fw pi-pencil",
            items: [
              { label: "Save", icon: "pi pi-fw pi-save" },
              { label: "Update", icon: "pi pi-fw pi-save" }
            ]
          },
          {
            label: "Other",
            icon: "pi pi-fw pi-tags",
            items: [{ label: "Delete", icon: "pi pi-fw pi-minus" }]
          }
        ]
      }
    ];
  }
}

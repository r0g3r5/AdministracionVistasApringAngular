import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { LoginComponent } from "./pages/seguridad/login/login.component";
import { InicioComponent } from "./pages/inicio/inicio.component";
import { ConfigRolesComponent } from "./pages/configuracion/config-roles/config-roles.component";
import { RolesEditarComponent } from "./pages/configuracion/config-roles/roles-editar/roles-editar.component";
import { RolesListarComponent } from "./pages/configuracion/config-roles/roles-listar/roles-listar.component";
import { ContenedorComponent } from "./_templates/contenedor/contenedor.component";

const routes: Routes = [
  { path: "", redirectTo: "adminvista/seguridad/login", pathMatch: "full" },

  { path: "adminvista/seguridad/login", component: LoginComponent },
  {
    path: "adminvista",
    component: ContenedorComponent,
    children: [
      { path: "", component: InicioComponent },
      {
        path: "configuracion/roles",
        component: ConfigRolesComponent,
        children: [
          { path: "", component: RolesListarComponent },
          { path: "nuevo", component: RolesEditarComponent },
          { path: ":idRol/editar", component: RolesEditarComponent }
        ]
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}

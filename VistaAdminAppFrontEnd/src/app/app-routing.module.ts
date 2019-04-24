import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { LoginComponent } from "./pages/seguridad/login/login.component";
import { InicioComponent } from "./pages/inicio/inicio.component";

const routes: Routes = [
  { path: "seguridad/login", component: LoginComponent },
  { path: "inicio", component: InicioComponent },
  { path: "", redirectTo: "seguridad/login", pathMatch: "full" }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}

import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { LoginComponent } from "./pages/seguridad/login/login.component";
import { InicioComponent } from "./pages/inicio/inicio.component";
import { NavComponent } from "./_templates/nav/nav.component";
import { HeaderComponent } from "./_templates/header/header.component";
import { SeguridadComponent } from "./pages/seguridad/seguridad.component";
import { PanelMenuModule } from "primeng/panelmenu";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { MenuItem, MessageService } from "primeng/api";
import { HttpClientModule } from "@angular/common/http";
import { InputTextModule } from "primeng/inputtext";
import { PasswordModule } from "primeng/password";
import { ButtonModule } from "primeng/button";
import { FieldsetModule } from "primeng/fieldset";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { MessageModule } from "primeng/message";
import { ConfigRolesComponent } from "./pages/configuracion/config-roles/config-roles.component";
import { ConfigUsuariosComponent } from "./pages/configuracion/config-usuarios/config-usuarios.component";
import { RolesEditarComponent } from "./pages/configuracion/config-roles/roles-editar/roles-editar.component";
import { RolesListarComponent } from "./pages/configuracion/config-roles/roles-listar/roles-listar.component";
import { ContenedorComponent } from "./_templates/contenedor/contenedor.component";
import { TableModule } from "primeng/table";
import { InputSwitchModule } from "primeng/inputswitch";
import { ToastModule } from "primeng/toast";
import { TreeModule } from "primeng/tree";
import { ConfigAccesosComponent } from "./pages/configuracion/config-accesos/config-accesos.component";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    InicioComponent,
    NavComponent,
    HeaderComponent,
    SeguridadComponent,
    ConfigRolesComponent,
    ConfigUsuariosComponent,
    RolesEditarComponent,
    RolesListarComponent,
    ContenedorComponent,
    ConfigAccesosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    PanelMenuModule,
    InputTextModule,
    PasswordModule,
    ButtonModule,
    FieldsetModule,
    FormsModule,
    ReactiveFormsModule,
    MessageModule,
    TableModule,
    InputSwitchModule,
    ToastModule,
    TreeModule,
  ],
  providers: [MessageService],
  bootstrap: [AppComponent]
})
export class AppModule {}

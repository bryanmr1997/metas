import {Tareas} from "./tareas"

export class Usuario{
    id_usuario!:Number;
    nombre!:String;
    edad!:Number;
    password!:String;
    tareas!: Tareas [];
}
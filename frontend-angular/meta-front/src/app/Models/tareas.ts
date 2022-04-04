import { Usuario } from "./usuario";


export class Tareas{
    id_tarea!:Number;
    nombre!:String;
    meta!:String;
    fecha_meta!:Date;
    usuario!: Usuario [];
}
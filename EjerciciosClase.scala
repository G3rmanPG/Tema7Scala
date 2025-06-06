package monitores
/*
 Explicación temario tema 7 y 8
 El tema se basa en implementar problemas de semáforos pero usando monitores y locks
 Para monitores HAY QUE CREAR LA CLASE Condition
 Synchronized bloquea y desbloquea el lock automáticamente, esqueleto general:
 def lo que sea() = synchronized{
  // lock

  // lo que sea

  // unlock

 }

 Para locks:

 Declarar vbles de tipo val, una l.newCondition() -> cx y otra  ReentrantLock(true) -> l
 val coche = 0;
 val bajando = false;
 **¡¡IMPORTANTE EN LOCKS DECLARAMOS !!
 def clase(id)={
  try{
   l.lock // Se desbloquea
  } finally{
    l.unlock
  }
 }
// signalAll() -> liberar a todos los procesos bloqueados
// signal() -> solo desbloquea un proceso
*/
object EjerciciosClase {

}

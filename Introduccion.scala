package monitores

// lock (cerrojo) -> asociado a cada objeto al que no se puede acceder directamente
// afecta a métodos synchronized y métodos sincronizados
// **ASEGURAN EXCLUSIÓN MUTUA**
// Métodos no sincronizados -> no necesitan adquirick lock -> ejecutados en cualquier momento

class VarComp(inicial: Int) {
  private var dato = inicial
  def leer() = synchronized {
    dato
  }
  def escribir(nValor: Int) = synchronized {
    dato = nValor
  }
  def incrementar(inc: Int) = synchronized {
    dato += inc
  }
}
val miDato1 = VarComp(42)
val miDato2 = VarComp(23)
object Introduccion {

}

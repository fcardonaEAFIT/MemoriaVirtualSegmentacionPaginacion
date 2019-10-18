public class ProcessMMU {
   private Segmento tablaSegmentos[];
   
   private int ProcessMMU() {
       tablaSegmentos = new Segmento[4];
   }

   public int obtDirFisica(int dirLogica) {
       return tablaSegmentos[dirLogica >> 30].obtdirSeg(dirLogica & 0x3FFFFFFF);
   }
}

public class ProcessMMU {
   private Segmento tablaSegmentos[];
   
   private int ProcessMMU() {
      // this.tablaSegmentos es calculada de alguna manera
   }

   public int obtDirFisica(int dirLogica) {
      return tablaSegmentos[Segmento.obtNroSeg(dirLogica)]
         .obtDirSeg(Segmento.obtDesSeg(dirLogica));
   }
}

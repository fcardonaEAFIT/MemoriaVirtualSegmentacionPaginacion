public class ProcessMMU {
   private Segmento tablaSegmentos[];
   
   private ProcessMMU() {
      // this.tablaSegmentos es calculada de alguna manera
   }

   public int obtDirFisica(int dirLogica)
      throws SegmentationFault
   {
      return tablaSegmentos[Segmento.obtNroSeg(dirLogica)]
         .obtDirSeg(Segmento.obtDesSeg(dirLogica));
   }
}

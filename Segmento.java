public class Segmento {
   private int inicio;
   private int limite;
   private static int tamSegmento;
   private Pagina tablaPaginas[];
   
   public Segmento(int inicio, int limite) {
      this.inicio = inicio;
      this.limite = limite;
      // this.tablaPagina = se calcula de alguna manera
   }

   public int obtDirSeg(int dirSeg)
      throws SegmentationFault 
   {
      if (dirSeg >= limite)
         throw new SegmentationFault("dir: " + dirSeg + "not found");

      return tablaPaginas[Pagina.obtNroPag(dirSeg)].obtDirPag(dirSeg)
         + inicio;
   }

   public static int obtNroSeg(int dirLogica) {
      return dirLogica / tamSegmento;
   }

   public static int obtDesSeg(int dirLogica) {
      return dirLogica % tamSegmento;
   }
}
   

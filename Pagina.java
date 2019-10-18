public class Pagina {

    private int nroMarco;
    public static int tamPagina = 1024;
   
    public Pagina(int nroMarco) {
	this.nroMarco = nroMarco;
    }

    public int obtDirPag(int dirSeg) {
	return nroMarco * tamPagina + obtDesPag(dirPagina);
    }

    public static int obtNroPag(int dirSeg) {
	return dirSeg / tamPagina;
    }

    public static int obtDesPag(int dirSeg) {
	return dirSeg % tamPagina;
    }
   
}

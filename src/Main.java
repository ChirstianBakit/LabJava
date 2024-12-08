public class Main {
    public static void main(String[] args) {
        PantallaPanel pantallaPanel = new PantallaPanel();
        pantallaPanel.mostrar(); // Llamada al método mostrar() del MenuPrincipal

        FormularioPagoPanel formularioPagoPanel = new FormularioPagoPanel();
        formularioPagoPanel.mostrar(); // Llamada al método mostrar() del FormularioPagoPanel

        GestionPrestamosPanel gestionPrestamosPanel = new GestionPrestamosPanel();
        gestionPrestamosPanel.mostrar(); // Llamada al método mostrar() del GestionPrestamosPanel

        GestionUsuarioPanel gestionUsuarioPanel = new GestionUsuarioPanel();
        gestionUsuarioPanel.mostrar(); // Llamada al método mostrar() del GestionUsusarioPanel

        ResumenInformativoPanel resumenInformativoPanel = new ResumenInformativoPanel();
        resumenInformativoPanel.mostrar(); // Llamada al método mostrar() del ResumenInformativoPanel

        SolicitudPrestamoPanel solicitudPrestamoPanel = new SolicitudPrestamoPanel();
        solicitudPrestamoPanel.mostrar(); // Llamada al método mostrar() del SolicitudPrestamoPanel

        AdministradorPanel administradorPanel = new AdministradorPanel();
        administradorPanel.mostrar(); // Llamada al método mostrar() del AdministradorPanel

        ExitoPanel exitoPanel = new ExitoPanel();
        exitoPanel.mostrar(); // Llamada al método mostrar() del ExitoPanel

        FalloPanel falloPanel = new FalloPanel();
        falloPanel.mostrar(); // Llamada al método mostrar() del FalloPanel

        GestionPagosPanel pagosPanel = new GestionPagosPanel();
        pagosPanel.mostrar(); // Llamada al método mostrar() del PagosPanel
    }
}
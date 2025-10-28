package ejercicio6;

public class Videojuego {
    private String titulo;
    private String genero;
    private String plataforma;
    private int horasJugadas = 0;
    private boolean completado = false;

    public Videojuego(String titulo, String genero, String plataforma) {
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
    }

    public Videojuego(String titulo, String genero, String plataforma, int horasJugadas, boolean completado) {
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
        this.completado = completado;
    }

    public void jugar(int horas) {
        this.horasJugadas += horas;
        if (this.horasJugadas > 100) {
            marcarComoCompletado();
        }
    }

    public void marcarComoCompletado() {
        this.completado = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getHorasJugadas() {
        return horasJugadas;
    }

    public void setHorasJugadas(int horasJugadas) {
        this.horasJugadas = horasJugadas;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    @Override
    public String toString() {
        return "\nTitulo : " + titulo + "\nGenero : " + genero + "\nPlataforma : " + plataforma + "\nHoras Jugadas : "
                + horasJugadas + "\nCompletado : " + completado;
    }

}

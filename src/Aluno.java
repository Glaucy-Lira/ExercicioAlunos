/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class Aluno {

    private long matricula;
    private String nome;
    private String disciplina;
    private int numeroAulas;
    private int numeroFaltas;
    private double notaAv1;
    private double notaAv2;
    private double notaAv3;
    private double media;

    public Aluno(long matricula, String nome, String disciplina,
            int numeroAulas, int numeroFaltas, double notaAv1, double notaAv2,
            double notaAv3, double media) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplina = disciplina;
        this.numeroAulas = numeroAulas;
        this.numeroFaltas = numeroFaltas;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
        this.notaAv3 = notaAv3;
        this.media = media;

    }

    public Aluno() {

    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public int getNumeroAulas() {
        return numeroAulas;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public double getNotaAv1() {
        return notaAv1;
    }

    public double getNotaAv2() {
        return notaAv2;
    }

    public double getNotaAv3() {
        return notaAv3;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setNumeroAulas(int numeroAulas) {
        this.numeroAulas = numeroAulas;
    }

    public void setNumeroFaltas(int numeroFaltas) {
        this.numeroFaltas = numeroFaltas;
    }

    public void setNotaAv1(double notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public void setNotaAv2(double notaAv2) {
        this.notaAv2 = notaAv2;
    }

    public void setNotaAv3(double notaAv3) {
        this.notaAv3 = notaAv3;
    }

    public void setMedia(double media) {
        this.media = media;

    }

    public double getMedia() {
        return media;

    }

    public Double calcularMedia() {
        if (this.notaAv1 < this.notaAv2 && this.notaAv1 < this.notaAv3) {
            this.media = (this.notaAv2 + this.notaAv3) / 2;
        } else if (this.notaAv2 < notaAv1 && notaAv2 < notaAv3) {
            this.media = (this.notaAv1 + this.notaAv3) / 2;

        } else {
            this.media = (this.notaAv1 + this.notaAv2) / 2;

        }
        return this.media;
    }

    public void calcularLimiteFaltas() {
        this.numeroFaltas = (this.numeroAulas * 100) / 25;

    }

    public String verificarStatus() {
        return (
          (this.media > 6 && this.numeroFaltas <= 25)? 
               " Aluno aprovado" : 
               " Aluno reprovado"
        );
    }
}

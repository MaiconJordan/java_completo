package br.com.daily.entities;

public class Game {
    private String task;
    private Integer lvl;
    private String dados;

    public Game() {
    }

    public Game(String task, Integer lvl, String dados) {
        this.task = task;
        this.lvl = lvl;
        this.dados = dados;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Integer getLvl() {
        return lvl;
    }

    public void setLvl(Integer lvl) {
        this.lvl = lvl;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
}

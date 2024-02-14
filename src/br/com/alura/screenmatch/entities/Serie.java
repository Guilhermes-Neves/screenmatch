package br.com.alura.screenmatch.entities;

public class Serie extends Title {
    private Integer seasons;
    private Integer episodesPerSeason;
    private Boolean active;
    private Integer minutesPorEpisodes;

    public Serie() {

    }

    public Serie(String name, Integer releaseYear) {
        super(name, releaseYear);
    }

    public Integer getSeasons() {
        return seasons;
    }

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    public Integer getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(Integer episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getMinutesPorEpisodes() {
        return minutesPorEpisodes;
    }

    public void setMinutesPorEpisodes(Integer minutesPorEpisodes) {
        this.minutesPorEpisodes = minutesPorEpisodes;
    }

    @Override
    public void setDurationInMinutes(Integer durationInMinutes) {
        durationInMinutes = this.minutesPorEpisodes * this.episodesPerSeason * this.seasons;
    }
}

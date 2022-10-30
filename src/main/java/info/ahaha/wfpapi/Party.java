package info.ahaha.wfpapi;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

public interface Party {
    Set<? extends WFPPlayer> getPlayers();

    void addPlayer(String name);
    void addPlayer(UUID uuid);
    void addPlayer(WFPPlayer player);

    void removePlayer(String name);
    void removePlayer(UUID uuid);
    void removePlayer(WFPPlayer player);

    boolean contains(String name);
    boolean contains(UUID uuid);
    boolean contains(WFPPlayer player);

    boolean containsModerator(String name);
    boolean containsModerator(UUID uuid);
    boolean containsModerator(WFPPlayer player);

    WFPPlayer get(String name);
    WFPPlayer get(UUID uuid);

    WFPPlayer getLeader();
    Set<? extends WFPPlayer> getModerators();

    void promote(String name);
    void promote(UUID uuid);
    void promote(WFPPlayer player);

    void demote(String name);
    void demote(UUID uuid);
    void demote(WFPPlayer player);

    PartySettings getSettings();
    void changeSetting(PartyData data);
    UUID getID();

    void sendMessage(String name, String s);

    class PartySettings implements Serializable {
        public final int limit;
        public final boolean open;

        public PartySettings(int limit, boolean open) {
            this.limit = limit;
            this.open = open;
        }
    }

    class PartyData implements Serializable{
        public UUID uuid;
        public PartySettings settings;
    }
}

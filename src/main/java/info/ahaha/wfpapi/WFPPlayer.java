package info.ahaha.wfpapi;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

public interface WFPPlayer {
    UUID getUUID();
    String getName();

    boolean isOnline();
    String getWhere();

    Set<? extends WFPPlayer> getFriends();
    void addFriend(WFPPlayer friend);
    void addFriend(UUID uuid);
    void sendMessage(String name, String message);

    class WFPPlayerData implements Serializable {
        public UUID uuid;
        public String name;
        public boolean online;
        public String server;
        public String addition;
    }
}
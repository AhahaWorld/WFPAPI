package info.ahaha.wfpapi;

import java.util.Set;
import java.util.UUID;

public interface WeAreFriendsPartyAPI {

    Set<? extends WFPPlayer> getFriends(String name);
    Set<? extends WFPPlayer> getFriends(UUID uuid);

    Set<? extends Party> getParties();

    Party getParty(String name);
    Party getParty(UUID uuid);
}

package main.java.server.profiles;

import java.util.UUID;

public interface IProfile {
    UUID profileId();
    String name();
    ProfilePriority priority();
}

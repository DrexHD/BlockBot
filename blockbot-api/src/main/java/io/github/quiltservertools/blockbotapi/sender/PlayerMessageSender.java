package io.github.quiltservertools.blockbotapi.sender;

import com.mojang.authlib.GameProfile;
import net.minecraft.server.network.ServerPlayerEntity;

public class PlayerMessageSender extends MessageSender {
    private final GameProfile profile;
    private final ServerPlayerEntity player;

    public PlayerMessageSender(ServerPlayerEntity player) {
        super(player.getName(), player.getDisplayName());
        this.profile = player.getGameProfile();
        this.player = player;
    }

    public GameProfile getProfile() {
        return profile;
    }

    public ServerPlayerEntity getPlayer() {
        return player;
    }
}

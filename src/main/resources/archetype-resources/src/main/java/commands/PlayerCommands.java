package ${package}.commands;

import com.thedemgel.regions.component.PlayerRegionComponent;
import org.spout.api.entity.Player;
import org.spout.api.command.annotated.CommandPermissions;
import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandSource;
import org.spout.api.command.annotated.Command;
import org.spout.api.exception.CommandException;
import ${package}.features.${artifactId}Feature;
import ${package}.${artifactId};

public class PlayerCommands {
	private final ${artifactId} plugin;

	public PlayerCommands(${artifactId} instance) {
		this.plugin = instance;
	}

	@Command(aliases = {"command", "cmd"}, usage = "No Usage, replace this command", desc = "Add example feature to raz", min = 0, max = 0)
	@CommandPermissions("${artifactId}.some.permission")
	public void aCommand(CommandContext args, CommandSource source) throws CommandException {
		((Player)source).get(PlayerRegionComponent.class).getSelectedRegion().add(plugin, ${artifactId}Feature.class);
	}
}

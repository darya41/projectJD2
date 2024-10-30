package controller.concrete;

import java.util.HashMap;
import java.util.Map;

import controller.concrete.impl.DoAuth;
import controller.concrete.impl.DoRegistration;
import controller.concrete.impl.GoToIndexMain;
import controller.concrete.impl.GoToRegistration;


public class CommandProvider {
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put(CommandName.DO_AUTH, new DoAuth());
		commands.put(CommandName.DO_REGISTRATION, new DoRegistration());
		commands.put(CommandName.GO_TO_INDEX_MAIN, new GoToIndexMain());
		commands.put(CommandName.GO_TO_REGISTRATION,new GoToRegistration());
		commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
	}
	public Command takeCommand(String userCommand) {
		CommandName commandName = null;
		Command command;
		
		try {
			commandName=CommandName.valueOf(userCommand.toUpperCase());
			command = commands.get(commandName);
		}
		catch(IllegalArgumentException | NullPointerException e){
			command = commands.get(CommandName.NO_SUCH_COMMAND);
		}
		return command;
	}

}

/*
 * Copyright (c) 2021 Several Circles.
 */

package com.severalcircles.flames.frontend.data.user;

import com.severalcircles.flames.frontend.FlamesCommand;
import com.severalcircles.flames.data.user.FlamesUser;
import com.severalcircles.flames.frontend.data.user.embed.UserDataEmbed;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
//import net.dv8tion.jda.api.interactions.components.Button;

public class MyDataCommand implements FlamesCommand {
    @Override
    public void execute(SlashCommandInteractionEvent event, FlamesUser sender) {
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("features/UserDataEmbed", flamesUser.getConfig().getLocale()));
        MessageEmbed embed = new UserDataEmbed(event.getUser(), sender).get();
        event.replyEmbeds(embed).addActionRow(new UserDataDropdown().getDropdown(sender)).queue();

}}

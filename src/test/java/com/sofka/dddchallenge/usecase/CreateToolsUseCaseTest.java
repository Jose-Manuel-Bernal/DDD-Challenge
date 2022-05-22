package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.dddchallenge.domain.tattooSession.commands.CreateTattooSession;
import com.sofka.dddchallenge.domain.tattooSession.events.TattooSessionCreated;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.NumberOfSession;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;
import com.sofka.dddchallenge.domain.tools.commands.CreateTools;
import com.sofka.dddchallenge.domain.tools.events.ToolsCreated;
import com.sofka.dddchallenge.domain.tools.values.Stretcher;
import com.sofka.dddchallenge.domain.tools.values.Table;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CreateToolsUseCaseTest {
    @Test
    void CreateToolsTest() {
        var command = new CreateTools(ToolsID.of("xxxx"), new Table(true), new Stretcher(true));
        var useCase = new CreateToolsUseCase();
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("xxxx")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(() -> new IllegalArgumentException("Something went bad!"))
                .getDomainEvents();
        var event = (ToolsCreated) events.get(0);
        Assertions.assertEquals(command.getTable().value(), event.getTable().value());
        Assertions.assertEquals(command.getStretcher().value(), event.getStretcher().value());
    }
}

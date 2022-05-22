package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.dddchallenge.domain.tattooSession.commands.CreateTattooSession;
import com.sofka.dddchallenge.domain.tattooSession.events.TattooSessionCreated;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.NumberOfSession;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CreateTattooSessionUseCaseTest {
    @Test
    void CreateTattoSessionTest() {
        var command = new CreateTattooSession (TattooSessionID.of("xxxx"), new Name("sleeve"), new NumberOfSession(1));
        var useCase = new CreateTattooSessionUseCase();
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("xxxx")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(() -> new IllegalArgumentException("Something went bad!"))
                .getDomainEvents();
        var event = (TattooSessionCreated) events.get(0);
        Assertions.assertEquals(command.getProjectName().value(), event.getProjectName().value());
        Assertions.assertEquals(command.getNumberOfSession().value(), event.getNumberOfSession().value());
    }
}
